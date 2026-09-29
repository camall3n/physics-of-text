"""Compatibility test entry point; maintained tests are code/evaluation/figure1/test_self_pairs.py."""
from pathlib import Path
import sys
import unittest
sys.path.insert(0, str(Path(__file__).resolve().parents[3] / "code/evaluation"))
from figure1.test_self_pairs import *

if __name__ == "__main__":
    unittest.main(verbosity=2)
