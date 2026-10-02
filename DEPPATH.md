# The `depPath` notation

Every corpus record is `{"source", "dest", "depPath"}`. `depPath` is the lexicalised
dependency path from the source entity mention to the destination entity mention, as
produced by the UMass relation-extraction pipeline (Yao, Riedel, McCallum) that the 2013
code took its NYT data from. The Java code never parses it: `CorpusParser` uses the whole
string as an opaque lexicon key. This file says how to read it.

## Grammar

```
depPath  := label "|" edge (word edge)* "|" label
edge     := "<-" label "<-"          up:   the current node is the `label` dependent of the next node
          | "->" label "->"          down: the next node is the `label` dependent of the current node
word     := lemma of the token at that node (lower case)
label    := dependency relation (nsubj, dobj, appos, rcmod, prep, pobj, nn, poss, ...)
```

- Read left to right, starting at the source entity and ending at the destination
  entity. The entities themselves are not in the string.
- The label before the first `|` is the first edge's label, i.e. the source entity's
  syntactic role. The label after the last `|` is the last edge's label, i.e. the
  destination entity's role.
- The path runs up from the source to the two entities' lowest common ancestor, then
  down to the destination: zero or more `<-` edges followed by zero or more `->` edges.

## Where this comes from

No single paper defines the full string. These do it together (all in `resources/`):

| Part | Source |
|---|---|
| A path is "a concatenation of dependency relations (edges) and words (nodes) along a path in a dependency tree", source to destination, with ↑/↓ directions: `(Lennon, [↑nsubjpass, born, ↓in], Liverpool)` | Yao et al. 2011 §2 |
| A path is "a series of dependencies, directions and words/chunks representing a traversal of the parse" | Mintz et al. 2009 §5.2 |
| String form of the arrows: `<-subj<-head->obj->` for "M1 heads M2" | Riedel et al. 2013 §4 |
| Words on the path are lemmas | Yao et al. 2012 (ACL) §3 |
| Parser is MaltParser; NER is Stanford; NYT 2000–2007 | Yao et al. 2011 §4 |
| The `label\|…\|label` fields are the "syntactic pair" feature: `partmod-pobj` for "Gamma Knife, made by … Elekta" | Yao et al. 2011 Table 1; Russell 2016 §5 prints `[partmod\|->own->prep->by->\|pobj]` |

The papers don't name the label set. The labels are Stanford Dependencies labels
(de Marneffe & Manning, *Stanford typed dependencies manual*).

The last row is a match, not a stated definition. It is supported by the data: in all
39,449 well-formed paths across the corpus files, the outer fields equal the first and
last edge labels.

## Checked against the data

Some corrupted records (below) still hold the original UMass feature line, with the
sentence text. These pair real NYT sentences with their paths and confirm the reading:

| Sentence (excerpt) | source → dest | depPath |
|---|---|---|
| Caryn James wrote in The Times | Caryn James → The Times | `nsubj\|<-nsubj<-write->prep->in->pobj->\|pobj` |
| Faure Gnassingbé, who just succeeded his father as president of Togo | Faure Gnassingbé → Togo | `rcmod\|->rcmod->succeed->prep->as->pobj->president->prep->of->pobj->\|pobj` |
| Robert J. Eaton, who ran Chrysler | Robert J. Eaton → Chrysler | `rcmod\|->rcmod->run->dobj->\|dobj` |
| Kellogg Brown & Root, the Halliburton subsidiary | Kellogg Brown & Root → Halliburton | `appos\|->appos->subsidiary->nn->\|nn` |
| the Euro RSCG Worldwide unit of Havas Advertising | Euro RSCG Worldwide → Havas Advertising | `nn\|<-nn<-unit->prep->of->pobj->\|pobj` |
| George P. Shultz met with Mr. Reagan | George P. Shultz → Mr. Reagan | `nsubj\|<-nsubj<-meet->prep->with->pobj->\|pobj` |

Worked reading of the second row: Gnassingbé `->rcmod->` *succeed* (a relative clause on
the source) `->prep->` *as* `->pobj->` *president* `->prep->` *of* `->pobj->` Togo.

The paths reflect the parser's analysis, errors included. For example, "C. Fred Bergsten,
director of the Institute for International Economics" comes out as
`cc|->cc->director->prep->of->pobj->|pobj`, with an appositive mislabelled `cc`.

## Corrupted records

When the original record contained a non-ASCII character (é, ö, ñ, a non-breaking space),
the 2013 conversion to JSON broke. `depPath` then holds fragments of the raw UMass line
(`trigger#… source#word/POS/NER_… dest#… path#… sen#<sentence> lex#… pos#… lc#… rc#…`),
and sometimes `source` holds such a fragment too. The sampler treats each one as a
distinct path.

| File | Records | Malformed |
|---|---|---|
| `Umass-sub-corpus/pluieTriples_2013_01_06_5.json` (the NYT run) | 8,516 | 30 |
| `Umass-sub-corpus-06-12/pluieTriples_2013_06_12_5.json` | 15,986 | 10 |
| `Umass-sub-corpus-06-12/pluieTriples_2013_06_12_3.json` | 3,357 | 9 |
| `Umass-sub-corpus-06-12/pluieTriples_2013_06_13_ex04.json` | 7,950 | 1 |
| every other `pluieTriples*` file | | 0 |

The `06-12` files also contain some records with an empty `depPath`.

A record is well-formed if `depPath` contains no `#` or whitespace and matches the
grammar above.
