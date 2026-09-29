"""Explicit Figure 1 report calls, separate from reusable mathematical evaluators."""
import argparse
from pathlib import Path
import sys
if __package__ in (None, ""):
    sys.path.insert(0, str(Path(__file__).resolve().parent.parent))
from figure1 import distinct_pairs, self_pairs, plot_precision_recall


def report_main(mode, argv=None, *, default_input=None, default_output=None, retired_inputs=()):
    parser = argparse.ArgumentParser(description=f"Figure 1 {mode} evaluation")
    parser.add_argument("--after", type=Path, default=default_input, required=default_input is None)
    parser.add_argument("--output", type=Path, default=default_output, required=default_output is None)
    args = parser.parse_args(argv)
    module = {"distinct": distinct_pairs, "self-pairs": self_pairs}[mode]
    return module.generate(args.after, args.output, retired_inputs=retired_inputs)


def plot_main(argv=None):
    parser = argparse.ArgumentParser(description="Original Python 3 Figure 1 plot style")
    parser.add_argument("input", type=Path)
    parser.add_argument("output", nargs="?", default="pr_polysemy.png", type=Path)
    args = parser.parse_args(argv)
    return plot_precision_recall.generate(args.input, args.output)


def main(argv=None):
    args = list(sys.argv[1:] if argv is None else argv)
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("mode", choices=("distinct", "self-pairs", "plot"))
    mode = parser.parse_args(args[:1]).mode
    # Retirement is a repository calling policy; numerical generators do not know campaigns.
    sampler = Path(__file__).resolve().parents[3] / "resources/sampler-140626"
    if mode == "plot":
        return plot_main(args[1:])
    return report_main(mode, args[1:], retired_inputs=(sampler / "results/figure1-2026/prec_recall.out",))


if __name__ == "__main__":
    main()
