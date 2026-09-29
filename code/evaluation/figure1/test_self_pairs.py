"""Regression checks for the evaluation-only Figure 1 self-pair variant."""
import copy
import contextlib
import io
import hashlib
import json
import subprocess
import sys
import tempfile
from pathlib import Path
import unittest

import numpy as np

if __package__ in (None, ""):
    sys.path.insert(0, str(Path(__file__).resolve().parent.parent))
from figure1.self_pairs import add_self_pairs, interpolate, recover_counts
from figure1.self_pairs import generate as _generate_self
from figure1.distinct_pairs import generate as _generate_distinct
SAMPLER = Path(__file__).resolve().parents[3] / "resources/sampler-140626"
_RETIRED = (SAMPLER / "results/figure1-2026/prec_recall.out",)


def generate(source, output):
    return _generate_self(source, output, retired_inputs=_RETIRED)


def generate_distinct(source, output):
    return _generate_distinct(source, output, retired_inputs=_RETIRED)



def curve_from_ranked_truths(truths):
    """Independent direct counting oracle from explicit binary truth labels."""
    denominator = sum(truths)
    tp, precision, recall = 0, [], []
    for rank, truth in enumerate(truths, start=1):
        tp += bool(truth)
        precision.append(tp / rank)
        recall.append(tp / denominator)
    return {"entropy": 0.1, "precisions": precision, "recalls": recall}


class SelfPairTransformTest(unittest.TestCase):
    def test_explicit_scores_with_score_one_ties_use_self_first(self):
        # One false distinct pair ties at score 1. It stays before the other
        # distinct pair, but all self-pairs precede both under our convention.
        distinct = [(1.0, False), (1.0, True), (0.2, True)]
        ranked = sorted(enumerate(distinct), key=lambda x: (-x[1][0], x[0]))
        original = curve_from_ranked_truths([pair[1] for _, pair in ranked])
        all_predictions = [(1.0, True, True, i) for i in range(3)]
        all_predictions += [(score, truth, False, i) for i, (score, truth) in enumerate(distinct)]
        all_predictions.sort(key=lambda x: (-x[0], not x[2], x[3]))
        expected = curve_from_ranked_truths([p[1] for p in all_predictions])
        actual, counts = add_self_pairs(original, 3)
        np.testing.assert_allclose(actual["precisions"], expected["precisions"])
        np.testing.assert_allclose(actual["recalls"], expected["recalls"])
        self.assertEqual(counts["distinct_true_pairs"], 2)
        self.assertEqual(actual["precisions"][3], 0.75)
        self.assertEqual(actual["recalls"][3], 0.6)

    def test_minimum_world_all_true(self):
        actual, counts = add_self_pairs(curve_from_ranked_truths([True]), 2)
        self.assertEqual(actual["precisions"], [1.0, 1.0, 1.0])
        np.testing.assert_allclose(actual["recalls"], [1/3, 2/3, 1])
        self.assertEqual(counts["false_pairs_unchanged"], 0)

    def test_fp_fn_conservation_and_round_trip(self):
        truths = [False, True, False, True, True, False]
        original = curve_from_ranked_truths(truths)
        actual, counts = add_self_pairs(original, 4)
        old_tp = np.cumsum(truths)
        new_tp = np.rint(np.arange(1, 11) * actual["precisions"]).astype(int)
        new_tp_tail = new_tp[4:]
        np.testing.assert_array_equal(np.arange(1, 7) - old_tp, np.arange(5, 11) - new_tp_tail)
        np.testing.assert_array_equal(sum(truths) - old_tp, counts["all_true_pairs"] - new_tp_tail)
        np.testing.assert_array_equal(new_tp_tail - 4, old_tp)
        np.testing.assert_allclose((new_tp_tail - 4) / np.arange(1, 7), original["precisions"])
        np.testing.assert_allclose((new_tp_tail - 4) / (counts["all_true_pairs"] - 4), original["recalls"])
        self.assertTrue(np.all(np.diff(actual["recalls"]) >= 0))

    def test_input_and_nested_metadata_are_not_mutated(self):
        original = curve_from_ranked_truths([True, False, True])
        original["extra"] = {"nested": [1, 2]}
        before = copy.deepcopy(original)
        transformed, _ = add_self_pairs(original, 3)
        transformed["extra"]["nested"].append(3)
        self.assertEqual(original, before)

    def test_invalid_sentence_counts_and_dimensions(self):
        good = curve_from_ranked_truths([True, False, True])
        for n in (-3, 0, 1, 2.5, True):
            with self.subTest(n=n), self.assertRaises(ValueError):
                add_self_pairs(good, n)
        with self.assertRaises(ValueError):
            add_self_pairs(good, 4)
        with self.assertRaises(ValueError):
            add_self_pairs({"precisions": [[1, 1, 1]], "recalls": [1, 1, 1]}, 3)

    def test_invalid_counts_and_recall_are_rejected(self):
        bad = [
            {"precisions": [-1, .5, 2/3], "recalls": [0, .5, 1]},
            {"precisions": [1.1, .5, 2/3], "recalls": [.5, .5, 1]},
            {"precisions": [.5, .5, 2/3], "recalls": [0, .5, 1]},  # noninteger TP
            {"precisions": [1, 0, 1/3], "recalls": [1, 0, 1]},  # TP decreases
            {"precisions": [0, 1, 2/3], "recalls": [0, 1, 1]},  # TP jumps by two
            {"precisions": [0, 0, 0], "recalls": [0, 0, 0]},  # no denominator
            {"precisions": [1, .5, 2/3], "recalls": [.5, .5, .9]},
            {"precisions": [1, .5, 2/3], "recalls": [.5, -.1, 1]},
            {"precisions": [float("nan"), .5, 2/3], "recalls": [.5, .5, 1]},
            {"precisions": [1, .5, 2/3], "recalls": [.5, float("inf"), 1]},
        ]
        for i, run in enumerate(bad):
            with self.subTest(case=i), self.assertRaises(ValueError):
                add_self_pairs(run, 3)

    def test_serialization_roundoff_is_tolerated(self):
        run = curve_from_ranked_truths([True, False, True])
        run["precisions"][-1] += 1e-12
        tp, total = recover_counts(run, 3)
        np.testing.assert_array_equal(tp, [1, 1, 2])
        self.assertEqual(total, 2)

    def test_all_80_saved_worlds_counts_conservation_and_input_hashes(self):
        checked = 0
        for folder in ("figure1-2026", "figure1-2026-fixed"):
            file = SAMPLER / "results" / folder / "prec_recall.out"
            before_bytes = file.read_bytes()
            data = json.loads(before_bytes)
            for entropy, runs in data.items():
                self.assertEqual(len(runs), 8)
                for run in runs:
                    tp, total = recover_counts(run, 60)
                    transformed, counts = add_self_pairs(run, 60)
                    self.assertEqual(len(tp), 1770)
                    self.assertEqual(len(transformed["precisions"]), 1830)
                    self.assertEqual(counts["all_true_pairs"], total + 60)
                    self.assertTrue(all(x == 1 for x in transformed["precisions"][:60]))
                    restored = np.rint(np.arange(61, 1831) * transformed["precisions"][60:]).astype(int) - 60
                    np.testing.assert_array_equal(restored, tp)
                    np.testing.assert_allclose(np.asarray(transformed["recalls"])[60:] * (total + 60) - 60, tp, atol=1e-8)
                    self.assertEqual(transformed["recalls"][-1], 1)
                    self.assertTrue(np.all(np.diff(transformed["recalls"]) >= 0))
                    checked += 1
            self.assertEqual(hashlib.sha256(file.read_bytes()).digest(), hashlib.sha256(before_bytes).digest())
        self.assertEqual(checked, 80)

    def test_high_entropy_reference_checkpoints(self):
        expected = {"figure1-2026-fixed": [0.832253, 0.582669]}
        for folder, values in expected.items():
            data = json.loads((SAMPLER / "results" / folder / "prec_recall.out").read_text())
            changed = [add_self_pairs(run, 60)[0] for run in data["0.9"]]
            means = interpolate(changed, [0.1, 0.7]).mean(axis=0)
            np.testing.assert_allclose(means, values, atol=5e-7, rtol=0)


class CorrectedOnlyReportingTest(unittest.TestCase):
    def test_self_pair_report_contains_only_corrected_worlds(self):
        source = SAMPLER / "results/figure1-2026-fixed/prec_recall.out"
        saved = SAMPLER / "results/figure1-2026-self-pairs-included"
        with tempfile.TemporaryDirectory() as tmp:
            output = Path(tmp)
            with contextlib.redirect_stdout(io.StringIO()):
                generate(source, output)
            data = json.loads((output / "comparison_details.json").read_text())
            self.assertEqual(set(data["versions"]), {"after-fixes"})
            self.assertEqual(data, json.loads((saved / "comparison_details.json").read_text()))
            self.assertEqual((output / "after-fixes/prec_recall.out").read_bytes(),
                             (saved / "after-fixes/prec_recall.out").read_bytes())
            metadata = json.loads((output / "metadata.json").read_text())
            self.assertEqual(metadata["worlds_checked"], 40)
            self.assertEqual(set(metadata["input_files"]), {"after-fixes"})
            self.assertEqual({row["sampler_version"] for row in metadata["per_world_counts"]}, {"after-fixes"})
            self.assertFalse((output / "before-fixes").exists())
            self.assertFalse(any("before_after" in p.name for p in output.iterdir()))

    def test_distinct_pair_report_preserves_corrected_checkpoints(self):
        saved = SAMPLER / "results/figure1-2026-fixed"
        with tempfile.TemporaryDirectory() as tmp:
            output = Path(tmp)
            with contextlib.redirect_stdout(io.StringIO()):
                generate_distinct(saved / "prec_recall.out", output)
            actual = json.loads((output / "evaluation_details.json").read_text())
            self.assertEqual(actual, json.loads((saved / "evaluation_details.json").read_text()))
            raw = json.loads((saved / "prec_recall.out").read_text())
            for entropy, summary in actual.items():
                self.assertEqual(summary["worlds"], 8)
                for row in summary["checkpoints"]:
                    # Independently use the self-pair module's existing interpolator
                    # on the untransformed input, including duplicate recall ranks.
                    expected = interpolate(raw[entropy], [row["recall"]])[:, 0]
                    np.testing.assert_array_equal(row["per_world"], expected)
            self.assertFalse(any("comparison" in p.name for p in output.iterdir()))

    def test_retired_cli_and_known_before_input_are_rejected(self):
        before = SAMPLER / "results/figure1-2026/prec_recall.out"
        after = SAMPLER / "results/figure1-2026-fixed/prec_recall.out"
        with tempfile.TemporaryDirectory() as tmp:
            output = Path(tmp) / "must-not-exist"
            for generator in (generate, generate_distinct):
                with self.assertRaisesRegex(ValueError, "Before-fix evaluation is retired"):
                    generator(before, output)
                self.assertFalse(output.exists())
            commands = [
                [str(SAMPLER / "scripts/figure1_self_pairs.py"), "--before", str(before)],
                [str(SAMPLER / "scripts/compare_figure1_runs.py"), str(before), str(after), str(output)],
            ]
            for args in commands:
                result = subprocess.run([sys.executable, *args], capture_output=True, text=True)
                self.assertEqual(result.returncode, 2)
                self.assertIn("unrecognized arguments", result.stderr)
            self.assertFalse(output.exists())


if __name__ == "__main__":
    unittest.main(verbosity=2)
