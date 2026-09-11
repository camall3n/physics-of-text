import matplotlib.pyplot as plt
import numpy as np
import json
import sys

with open(sys.argv[1]) as f:
    data = json.load(f)

plt.hist(data, bins=8)
plt.show()
