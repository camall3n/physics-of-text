"""Summarise a map_world.txt or relation_triggers.txt written by the sampler.

usage: summarize_relations.py <file> [top_relations=20] [paths_per_relation=6] [facts_per_relation=5]

Prints the relations with the most sentences, their dependency paths with counts,
and a few of their facts (argument pairs), in the form used for the paper's Table
of relation 46 and for manual precision checks.
"""
import re
import sys
from collections import Counter, defaultdict

path = sys.argv[1]
top = int(sys.argv[2]) if len(sys.argv) > 2 else 20
paths_per = int(sys.argv[3]) if len(sys.argv) > 3 else 6
facts_per = int(sys.argv[4]) if len(sys.argv) > 4 else 5

sent_re = re.compile(r"Sentence \[origin=Fact\[Ent\[(\w+)\], Ent\[(\w+)\], Rel\[(\w+)\]\], arg1=(.*?), arg2=(.*?), trig=Trig\[(.*)\]\]$")
paths = defaultdict(Counter)
facts = defaultdict(Counter)
seen = set()
for line in open(path):
    m = sent_re.search(line.strip())
    if not m:
        continue
    key = line.strip()
    if key in seen:          # the listing repeats sentences under each path block
        continue
    seen.add(key)
    e1, e2, rel, a1, a2, trig = m.groups()
    paths[rel][trig] += 1
    facts[rel][(a1, a2)] += 1

rels = sorted(paths, key=lambda r: -sum(paths[r].values()))
print(f"{len(rels)} relations with sentences, {len(seen)} sentences listed\n")
for r in rels[:top]:
    n = sum(paths[r].values())
    print(f"{r}: {n} sentences, {len(facts[r])} argument pairs")
    for p, c in paths[r].most_common(paths_per):
        print(f"    {c:4d}  {p}")
    for (a1, a2), c in facts[r].most_common(facts_per):
        print(f"          ({a1}, {a2})" + (f" x{c}" if c > 1 else ""))
    print()
