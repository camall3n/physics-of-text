"""Compatibility caller; maintained implementation: code/evaluation/figure1/distinct_pairs.py."""
from pathlib import Path
import sys
sys.path.insert(0, str(Path(__file__).resolve().parents[3] / "code/evaluation"))
from figure1.distinct_pairs import *
from figure1 import distinct_pairs as _implementation
from figure1.cli import report_main

SAMPLER = Path(__file__).resolve().parents[1]
_RETIRED = (SAMPLER / "results/figure1-2026/prec_recall.out",)


def generate(after_path, output):
    return _implementation.generate(after_path, output, retired_inputs=_RETIRED)


def main(argv=None):
    return report_main("distinct", argv,
                       default_input=SAMPLER / "results/figure1-2026-fixed/prec_recall.out",
                       default_output=SAMPLER / "results/figure1-2026-fixed",
                       retired_inputs=_RETIRED)


if __name__ == "__main__":
    main()
