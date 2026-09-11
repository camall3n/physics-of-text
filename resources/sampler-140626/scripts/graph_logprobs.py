import matplotlib.pyplot as plt
import numpy as np
import sys
import json

path = sys.argv[1]

with open(path) as f:
    data = json.load(f)

for prob_type, series in data.iteritems():
    plt.plot(np.array(series)[::], label=prob_type)

plt.legend(loc='lower right')
plt.show()
