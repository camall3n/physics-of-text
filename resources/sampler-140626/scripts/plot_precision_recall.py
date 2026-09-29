"""Compatibility caller; maintained renderer is code/evaluation/figure1/plot_precision_recall.py."""
from pathlib import Path
import sys
sys.path.insert(0, str(Path(__file__).resolve().parents[3] / "code/evaluation"))
from figure1.plot_precision_recall import generate
from figure1.cli import plot_main

if __name__ == "__main__":
    plot_main()
