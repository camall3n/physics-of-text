import matplotlib.pyplot as plt
import numpy as np
import json
import sys
from scipy import interpolate

with open(sys.argv[1]) as f:
    data = json.load(f)


colors = ['r', 'g', 'b', 'c', 'y']

recall_samples = np.linspace(0.1, 0.99, 30)

print data.keys()

for entropy, color in zip(sorted(data.keys()), colors):
    average = []

    print len(data[entropy])

    for single_run in data[entropy]:
        f = interpolate.interp1d(single_run['recalls'], single_run['precisions'])
        #plt.plot(recall_samples, f(recall_samples))
        average.append(f(recall_samples))

    averaged_precision = np.average(np.vstack(average), axis=0)

    plt.plot(recall_samples, averaged_precision, color=color, label='Entropy = {0}'.format(entropy))

plt.xlabel('recall')
plt.ylabel('precision')
plt.xlim(0, 1)
plt.ylim(0, 1)
plt.legend(loc='lower right')
plt.title("Precision/Recall vs Lexical Entropy (averaged over 8 runs)")
plt.savefig("pr_polysemy.pdf", format='pdf')
plt.show()
