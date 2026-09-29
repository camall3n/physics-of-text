# audit_9f5868d8ee0e — rel_1: coach of

Predicate ID: coach_of

Person X coaches or coached sports team or collegiate athletic program Y.

Includes: explicit coach title; direct coaching with correct subject and team; former/dismissed coach with clear office evidence; team/university shorthand when the athletic program role is clear. Excludes: manager/president/player alone; winning with a team alone; vacancy consideration alone; reverse team-to-coach direction. Ambiguous unless resolved by case-local evidence: missing coach subject or team attachment.

Complete census: 21 supported, 1 incorrect, 0 ambiguous; N=22. Precision 21/22=95.45% to 21/22=95.45%.

## Full relation dictionary

| Count | Dependency path |
|---:|---|
| 21 | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| 19 | appos\|-&gt;appos-&gt;coach-&gt;nn-&gt;\|nn |
| 15 | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 7 | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 7 | nsubj\|&lt;-nsubj&lt;-coach-&gt;poss-&gt;\|poss |
| 6 | rcmod\|-&gt;rcmod-&gt;coach-&gt;dobj-&gt;\|dobj |
| 5 | nsubj\|&lt;-nsubj&lt;-coach-&gt;dobj-&gt;\|dobj |
| 5 | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |
| 4 | dep\|-&gt;dep-&gt;coach-&gt;poss-&gt;\|poss |
| 2 | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;man-&gt;nn-&gt;\|nn |
| 2 | nsubj\|&lt;-nsubj&lt;-make-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;poss-&gt;\|poss |
| 2 | nsubj\|&lt;-nsubj&lt;-make-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 2 | poss\|&lt;-poss&lt;-departure&lt;-pobj&lt;-after&lt;-prep&lt;-continue-&gt;nsubj-&gt;\|nsubj |
| 2 | rcmod\|-&gt;rcmod-&gt;be-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;nn-&gt;\|nn |
| 2 | rcmod\|-&gt;rcmod-&gt;coach-&gt;poss-&gt;\|poss |
| 2 | rcmod\|-&gt;rcmod-&gt;consider-&gt;prep-&gt;for-&gt;pobj-&gt;vacancy-&gt;poss-&gt;\|poss |
| 2 | rcmod\|-&gt;rcmod-&gt;leave-&gt;dobj-&gt;\|dobj |
| 1 | appos\|-&gt;appos-&gt;adviser-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;adviser-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | appos\|-&gt;appos-&gt;adviser-&gt;prep-&gt;to-&gt;pobj-&gt;official-&gt;nn-&gt;\|nn |
| 1 | appos\|-&gt;appos-&gt;official-&gt;nn-&gt;\|nn |
| 1 | dep\|-&gt;dep-&gt;coach-&gt;nn-&gt;\|nn |
| 1 | dobj\|&lt;-dobj&lt;-coach-&gt;dep-&gt;extend-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | dobj\|&lt;-dobj&lt;-coach-&gt;dep-&gt;tell-&gt;dobj-&gt;player-&gt;nn-&gt;\|nn |
| 1 | dobj\|&lt;-dobj&lt;-coach&lt;-dep&lt;-ask-&gt;prep-&gt;about-&gt;pobj-&gt;start-&gt;poss-&gt;\|poss |
| 1 | dobj\|&lt;-dobj&lt;-coach&lt;-dep&lt;-defend-&gt;dobj-&gt;team-&gt;nn-&gt;\|nn |
| 1 | nn\|&lt;-nn&lt;-system-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-build-&gt;dobj-&gt;team-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-cast-&gt;prep-&gt;as-&gt;pobj-&gt;successor-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-celebrate-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-coach-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-coach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-get-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-guide-&gt;dobj-&gt;fortune-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-leave-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-put-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-remind-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-replace-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;amod-&gt;\|amod |
| 1 | nsubj\|&lt;-nsubj&lt;-resign-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;board-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-shed-&gt;prep-&gt;in-&gt;pobj-&gt;front-&gt;prep-&gt;of-&gt;pobj-&gt;bench-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-show-&gt;dobj-&gt;\|dobj |
| 1 | nsubj\|&lt;-nsubj&lt;-sit-&gt;prep-&gt;in-&gt;pobj-&gt;room-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-spend-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-stay-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | nsubj\|&lt;-nsubj&lt;-step-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-take-&gt;dobj-&gt;position-&gt;poss-&gt;\|poss |
| 1 | nsubj\|&lt;-nsubj&lt;-take-&gt;prep-&gt;for-&gt;pobj-&gt;perception-&gt;prep-&gt;of-&gt;pobj-&gt;football-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-turn-&gt;dobj-&gt;program-&gt;poss-&gt;woman-&gt;nn-&gt;\|nn |
| 1 | nsubj\|&lt;-nsubj&lt;-win-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| 1 | nsubjpass\|&lt;-nsubjpass&lt;-dismiss-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-include&lt;-prep&lt;-player&lt;-pobj&lt;-of&lt;-prep&lt;-many&lt;-amod&lt;-coach-&gt;poss-&gt;\|poss |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-dep&lt;-from&lt;-prep&lt;-change&lt;-pobj&lt;-with&lt;-prep&lt;-appear&lt;-dep&lt;-weapon-&gt;appos-&gt;\|appos |
| 1 | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-assistant-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-relationship-&gt;dep-&gt;coach-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-attention&lt;-dobj&lt;-coach-&gt;prep-&gt;after-&gt;pobj-&gt;loss-&gt;poss-&gt;\|poss |
| 1 | poss\|&lt;-poss&lt;-departure-&gt;rcmod-&gt;hire-&gt;nsubj-&gt;\|nsubj |
| 1 | poss\|&lt;-poss&lt;-office&lt;-nsubj&lt;-provide-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-relationship-&gt;prep-&gt;with-&gt;pobj-&gt;management-&gt;nn-&gt;\|nn |
| 1 | poss\|&lt;-poss&lt;-role-&gt;prep-&gt;in-&gt;pobj-&gt;victory-&gt;poss-&gt;\|poss |
| 1 | poss\|&lt;-poss&lt;-season&lt;-pobj&lt;-in&lt;-prep&lt;-championship-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-season&lt;-pobj&lt;-in&lt;-prep&lt;-game-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-silence-&gt;prep-&gt;over-&gt;pobj-&gt;victory-&gt;prep-&gt;over-&gt;pobj-&gt;\|pobj |
| 1 | poss\|&lt;-poss&lt;-staff-&gt;nn-&gt;\|nn |
| 1 | prep\|-&gt;prep-&gt;in-&gt;dep-&gt;as-&gt;pobj-&gt;coach-&gt;nn-&gt;\|nn |
| 1 | prep\|-&gt;prep-&gt;in-&gt;pobj-&gt;system-&gt;nn-&gt;\|nn |
| 1 | prep\|-&gt;prep-&gt;of-&gt;pobj-&gt;share-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;angry-&gt;dep-&gt;turnover-&gt;dep-&gt;squander-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;begin-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;coach-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;coach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;dismiss-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;dismiss-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;embark-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;feud-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;go-&gt;prep-&gt;through-&gt;pobj-&gt;office-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;guide-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;inspired-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;join-&gt;dep-&gt;dismiss-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;join-&gt;dobj-&gt;management-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;football-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;lift-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;lose-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;meet-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;mold-&gt;dobj-&gt;program-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;old-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;reach-&gt;nsubj-&gt;team-&gt;dep-&gt;\|dep |
| 1 | rcmod\|-&gt;rcmod-&gt;resign-&gt;prep-&gt;as-&gt;pobj-&gt;expert-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;return-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;return-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;see-&gt;prep-&gt;in-&gt;pobj-&gt;stint-&gt;prep-&gt;behind-&gt;pobj-&gt;bench-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;synonymous-&gt;prep-&gt;as-&gt;pobj-&gt;president-&gt;poss-&gt;\|poss |
| 1 | rcmod\|-&gt;rcmod-&gt;take-&gt;dobj-&gt;\|dobj |
| 1 | rcmod\|-&gt;rcmod-&gt;take-&gt;dobj-&gt;team-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;thank-&gt;prep-&gt;for-&gt;pobj-&gt;contribution-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| 1 | rcmod\|-&gt;rcmod-&gt;turn-&gt;nsubj-&gt;\|nsubj |
| 1 | rcmod\|-&gt;rcmod-&gt;win-&gt;nsubj-&gt;team-&gt;nn-&gt;\|nn |
| 1 | rcmod\|-&gt;rcmod-&gt;win-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

## Every evaluated fact

### rel_1__ent_889__ent_561

**All observed names:** Parcells → Giants (10)

Ordered IDs: Ent[ent_889] → Ent[ent_561]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [4074](../raw_map.tsv:4074) | Parcells | Giants | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| [4075](../raw_map.tsv:4075) | Parcells | Giants | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [4076](../raw_map.tsv:4076) | Parcells | Giants | appos\|-&gt;appos-&gt;coach-&gt;nn-&gt;\|nn |
| [4077](../raw_map.tsv:4077) | Parcells | Giants | nsubj\|&lt;-nsubj&lt;-coach-&gt;poss-&gt;\|poss |
| [4078](../raw_map.tsv:4078) | Parcells | Giants | nsubj\|&lt;-nsubj&lt;-leave-&gt;dobj-&gt;\|dobj |
| [4079](../raw_map.tsv:4079) | Parcells | Giants | nsubj\|&lt;-nsubj&lt;-coach-&gt;dobj-&gt;\|dobj |
| [4080](../raw_map.tsv:4080) | Parcells | Giants | rcmod\|-&gt;rcmod-&gt;coach-&gt;dobj-&gt;\|dobj |
| [4081](../raw_map.tsv:4081) | Parcells | Giants | nsubj\|&lt;-nsubj&lt;-win-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |
| [4082](../raw_map.tsv:4082) | Parcells | Giants | dep\|-&gt;dep-&gt;coach-&gt;poss-&gt;\|poss |
| [4083](../raw_map.tsv:4083) | Parcells | Giants | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Parcells → Giants: An explicit coach title or direct coaching row establishes the person–team relation. Additional participation, administrative or association rows do not negate that coaching evidence.

Cited evidence lines: [4074](../raw_map.tsv:4074), [4075](../raw_map.tsv:4075), [4076](../raw_map.tsv:4076), [4077](../raw_map.tsv:4077), [4078](../raw_map.tsv:4078), [4079](../raw_map.tsv:4079), [4080](../raw_map.tsv:4080), [4081](../raw_map.tsv:4081), [4082](../raw_map.tsv:4082), [4083](../raw_map.tsv:4083).


Issue tags: mixed_evidence

### rel_1__ent_1175__ent_308

**All observed names:** Stu Jackson → Knicks (10)

Ordered IDs: Ent[ent_1175] → Ent[ent_308]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6476](../raw_map.tsv:6476) | Stu Jackson | Knicks | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| [6477](../raw_map.tsv:6477) | Stu Jackson | Knicks | appos\|-&gt;appos-&gt;coach-&gt;nn-&gt;\|nn |
| [6478](../raw_map.tsv:6478) | Stu Jackson | Knicks | nsubj\|&lt;-nsubj&lt;-remind-&gt;dobj-&gt;\|dobj |
| [6479](../raw_map.tsv:6479) | Stu Jackson | Knicks | nsubj\|&lt;-nsubj&lt;-put-&gt;dobj-&gt;\|dobj |
| [6480](../raw_map.tsv:6480) | Stu Jackson | Knicks | nsubj\|&lt;-nsubj&lt;-coach-&gt;poss-&gt;\|poss |
| [6481](../raw_map.tsv:6481) | Stu Jackson | Knicks | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6482](../raw_map.tsv:6482) | Stu Jackson | Knicks | rcmod\|-&gt;rcmod-&gt;dismiss-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;poss-&gt;\|poss |
| [6483](../raw_map.tsv:6483) | Stu Jackson | Knicks | poss\|&lt;-poss&lt;-role-&gt;prep-&gt;in-&gt;pobj-&gt;victory-&gt;poss-&gt;\|poss |
| [6484](../raw_map.tsv:6484) | Stu Jackson | Knicks | pobj\|&lt;-pobj&lt;-to&lt;-dep&lt;-from&lt;-prep&lt;-change&lt;-pobj&lt;-with&lt;-prep&lt;-appear&lt;-dep&lt;-weapon-&gt;appos-&gt;\|appos |
| [6485](../raw_map.tsv:6485) | Stu Jackson | Knicks | nsubjpass\|&lt;-nsubjpass&lt;-dismiss-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Stu Jackson → Knicks: An explicit coach title or direct coaching row establishes the person–team relation. Additional participation, administrative or association rows do not negate that coaching evidence.

Cited evidence lines: [6476](../raw_map.tsv:6476), [6477](../raw_map.tsv:6477), [6478](../raw_map.tsv:6478), [6479](../raw_map.tsv:6479), [6480](../raw_map.tsv:6480), [6481](../raw_map.tsv:6481), [6482](../raw_map.tsv:6482), [6483](../raw_map.tsv:6483), [6484](../raw_map.tsv:6484), [6485](../raw_map.tsv:6485).


Issue tags: mixed_evidence

### rel_1__ent_239__ent_561

**All observed names:** Bill Parcells → Giants (10)

Ordered IDs: Ent[ent_239] → Ent[ent_561]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6486](../raw_map.tsv:6486) | Bill Parcells | Giants | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| [6487](../raw_map.tsv:6487) | Bill Parcells | Giants | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6488](../raw_map.tsv:6488) | Bill Parcells | Giants | appos\|-&gt;appos-&gt;coach-&gt;nn-&gt;\|nn |
| [6489](../raw_map.tsv:6489) | Bill Parcells | Giants | rcmod\|-&gt;rcmod-&gt;coach-&gt;dobj-&gt;\|dobj |
| [6490](../raw_map.tsv:6490) | Bill Parcells | Giants | nsubj\|&lt;-nsubj&lt;-coach-&gt;poss-&gt;\|poss |
| [6491](../raw_map.tsv:6491) | Bill Parcells | Giants | dep\|-&gt;dep-&gt;coach-&gt;poss-&gt;\|poss |
| [6492](../raw_map.tsv:6492) | Bill Parcells | Giants | nsubj\|&lt;-nsubj&lt;-coach-&gt;dobj-&gt;\|dobj |
| [6493](../raw_map.tsv:6493) | Bill Parcells | Giants | rcmod\|-&gt;rcmod-&gt;leave-&gt;dobj-&gt;\|dobj |
| [6494](../raw_map.tsv:6494) | Bill Parcells | Giants | rcmod\|-&gt;rcmod-&gt;coach-&gt;poss-&gt;\|poss |
| [6495](../raw_map.tsv:6495) | Bill Parcells | Giants | rcmod\|-&gt;rcmod-&gt;coach-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Bill Parcells → Giants: An explicit coach title or direct coaching row establishes the person–team relation. Additional participation, administrative or association rows do not negate that coaching evidence.

Cited evidence lines: [6486](../raw_map.tsv:6486), [6487](../raw_map.tsv:6487), [6488](../raw_map.tsv:6488), [6489](../raw_map.tsv:6489), [6490](../raw_map.tsv:6490), [6491](../raw_map.tsv:6491), [6492](../raw_map.tsv:6492), [6493](../raw_map.tsv:6493), [6494](../raw_map.tsv:6494), [6495](../raw_map.tsv:6495).


Issue tags: mixed_evidence

### rel_1__ent_1176__ent_543

**All observed names:** Bill Fitch → Nets (10)

Ordered IDs: Ent[ent_1176] → Ent[ent_543]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6496](../raw_map.tsv:6496) | Bill Fitch | Nets | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| [6497](../raw_map.tsv:6497) | Bill Fitch | Nets | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6498](../raw_map.tsv:6498) | Bill Fitch | Nets | poss\|&lt;-poss&lt;-departure-&gt;rcmod-&gt;hire-&gt;nsubj-&gt;\|nsubj |
| [6499](../raw_map.tsv:6499) | Bill Fitch | Nets | nsubj\|&lt;-nsubj&lt;-take-&gt;dobj-&gt;position-&gt;poss-&gt;\|poss |
| [6500](../raw_map.tsv:6500) | Bill Fitch | Nets | nsubj\|&lt;-nsubj&lt;-coach-&gt;poss-&gt;\|poss |
| [6501](../raw_map.tsv:6501) | Bill Fitch | Nets | appos\|-&gt;appos-&gt;coach-&gt;nn-&gt;\|nn |
| [6502](../raw_map.tsv:6502) | Bill Fitch | Nets | rcmod\|-&gt;rcmod-&gt;lose-&gt;nsubj-&gt;\|nsubj |
| [6503](../raw_map.tsv:6503) | Bill Fitch | Nets | rcmod\|-&gt;rcmod-&gt;have-&gt;dobj-&gt;\|dobj |
| [6504](../raw_map.tsv:6504) | Bill Fitch | Nets | rcmod\|-&gt;rcmod-&gt;coach-&gt;poss-&gt;\|poss |
| [6505](../raw_map.tsv:6505) | Bill Fitch | Nets | rcmod\|-&gt;rcmod-&gt;angry-&gt;dep-&gt;turnover-&gt;dep-&gt;squander-&gt;nsubj-&gt;\|nsubj |

**Judgment: supported** (primary). Bill Fitch → Nets: An explicit coach title or direct coaching row establishes the person–team relation. Additional participation, administrative or association rows do not negate that coaching evidence.

Cited evidence lines: [6496](../raw_map.tsv:6496), [6497](../raw_map.tsv:6497), [6498](../raw_map.tsv:6498), [6499](../raw_map.tsv:6499), [6500](../raw_map.tsv:6500), [6501](../raw_map.tsv:6501), [6502](../raw_map.tsv:6502), [6503](../raw_map.tsv:6503), [6504](../raw_map.tsv:6504), [6505](../raw_map.tsv:6505).


Issue tags: mixed_evidence

### rel_1__ent_238__ent_400

**All observed names:** Bruce Coslet → Jets (10)

Ordered IDs: Ent[ent_238] → Ent[ent_400]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6506](../raw_map.tsv:6506) | Bruce Coslet | Jets | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| [6507](../raw_map.tsv:6507) | Bruce Coslet | Jets | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6508](../raw_map.tsv:6508) | Bruce Coslet | Jets | appos\|-&gt;appos-&gt;coach-&gt;nn-&gt;\|nn |
| [6509](../raw_map.tsv:6509) | Bruce Coslet | Jets | nsubj\|&lt;-nsubj&lt;-show-&gt;dobj-&gt;\|dobj |
| [6510](../raw_map.tsv:6510) | Bruce Coslet | Jets | rcmod\|-&gt;rcmod-&gt;take-&gt;dobj-&gt;\|dobj |
| [6511](../raw_map.tsv:6511) | Bruce Coslet | Jets | rcmod\|-&gt;rcmod-&gt;lift-&gt;dobj-&gt;\|dobj |
| [6512](../raw_map.tsv:6512) | Bruce Coslet | Jets | rcmod\|-&gt;rcmod-&gt;join-&gt;dep-&gt;dismiss-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;nn-&gt;\|nn |
| [6513](../raw_map.tsv:6513) | Bruce Coslet | Jets | rcmod\|-&gt;rcmod-&gt;go-&gt;prep-&gt;through-&gt;pobj-&gt;office-&gt;poss-&gt;\|poss |
| [6514](../raw_map.tsv:6514) | Bruce Coslet | Jets | rcmod\|-&gt;rcmod-&gt;embark-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;poss-&gt;\|poss |
| [6515](../raw_map.tsv:6515) | Bruce Coslet | Jets | rcmod\|-&gt;rcmod-&gt;dismiss-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Bruce Coslet → Jets: An explicit coach title or direct coaching row establishes the person–team relation. Additional participation, administrative or association rows do not negate that coaching evidence.

Cited evidence lines: [6506](../raw_map.tsv:6506), [6507](../raw_map.tsv:6507), [6508](../raw_map.tsv:6508), [6509](../raw_map.tsv:6509), [6510](../raw_map.tsv:6510), [6511](../raw_map.tsv:6511), [6512](../raw_map.tsv:6512), [6513](../raw_map.tsv:6513), [6514](../raw_map.tsv:6514), [6515](../raw_map.tsv:6515).


Issue tags: mixed_evidence

### rel_1__ent_1177__ent_1005

**All observed names:** Phil Jackson → Bulls (10)

Ordered IDs: Ent[ent_1177] → Ent[ent_1005]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6516](../raw_map.tsv:6516) | Phil Jackson | Bulls | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| [6517](../raw_map.tsv:6517) | Phil Jackson | Bulls | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6518](../raw_map.tsv:6518) | Phil Jackson | Bulls | appos\|-&gt;appos-&gt;coach-&gt;nn-&gt;\|nn |
| [6519](../raw_map.tsv:6519) | Phil Jackson | Bulls | rcmod\|-&gt;rcmod-&gt;coach-&gt;dobj-&gt;\|dobj |
| [6520](../raw_map.tsv:6520) | Phil Jackson | Bulls | dep\|-&gt;dep-&gt;coach-&gt;poss-&gt;\|poss |
| [6521](../raw_map.tsv:6521) | Phil Jackson | Bulls | rcmod\|-&gt;rcmod-&gt;join-&gt;dobj-&gt;management-&gt;poss-&gt;\|poss |
| [6522](../raw_map.tsv:6522) | Phil Jackson | Bulls | rcmod\|-&gt;rcmod-&gt;inspired-&gt;nsubj-&gt;\|nsubj |
| [6523](../raw_map.tsv:6523) | Phil Jackson | Bulls | rcmod\|-&gt;rcmod-&gt;feud-&gt;nsubj-&gt;\|nsubj |
| [6524](../raw_map.tsv:6524) | Phil Jackson | Bulls | poss\|&lt;-poss&lt;-silence-&gt;prep-&gt;over-&gt;pobj-&gt;victory-&gt;prep-&gt;over-&gt;pobj-&gt;\|pobj |
| [6525](../raw_map.tsv:6525) | Phil Jackson | Bulls | poss\|&lt;-poss&lt;-relationship-&gt;prep-&gt;with-&gt;pobj-&gt;management-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Phil Jackson → Bulls: An explicit coach title or direct coaching row establishes the person–team relation. Additional participation, administrative or association rows do not negate that coaching evidence.

Cited evidence lines: [6516](../raw_map.tsv:6516), [6517](../raw_map.tsv:6517), [6518](../raw_map.tsv:6518), [6519](../raw_map.tsv:6519), [6520](../raw_map.tsv:6520), [6521](../raw_map.tsv:6521), [6522](../raw_map.tsv:6522), [6523](../raw_map.tsv:6523), [6524](../raw_map.tsv:6524), [6525](../raw_map.tsv:6525).


Issue tags: mixed_evidence

### rel_1__ent_1060__ent_308

**All observed names:** Rick Pitino → Knicks (10)

Ordered IDs: Ent[ent_1060] → Ent[ent_308]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6536](../raw_map.tsv:6536) | Rick Pitino | Knicks | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| [6537](../raw_map.tsv:6537) | Rick Pitino | Knicks | nsubj\|&lt;-nsubj&lt;-coach-&gt;poss-&gt;\|poss |
| [6538](../raw_map.tsv:6538) | Rick Pitino | Knicks | appos\|-&gt;appos-&gt;coach-&gt;nn-&gt;\|nn |
| [6539](../raw_map.tsv:6539) | Rick Pitino | Knicks | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6540](../raw_map.tsv:6540) | Rick Pitino | Knicks | rcmod\|-&gt;rcmod-&gt;consider-&gt;prep-&gt;for-&gt;pobj-&gt;vacancy-&gt;poss-&gt;\|poss |
| [6541](../raw_map.tsv:6541) | Rick Pitino | Knicks | poss\|&lt;-poss&lt;-departure&lt;-pobj&lt;-after&lt;-prep&lt;-continue-&gt;nsubj-&gt;\|nsubj |
| [6542](../raw_map.tsv:6542) | Rick Pitino | Knicks | nsubj\|&lt;-nsubj&lt;-make-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6543](../raw_map.tsv:6543) | Rick Pitino | Knicks | nsubj\|&lt;-nsubj&lt;-make-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;poss-&gt;\|poss |
| [6544](../raw_map.tsv:6544) | Rick Pitino | Knicks | nsubj\|&lt;-nsubj&lt;-coach-&gt;dobj-&gt;\|dobj |
| [6545](../raw_map.tsv:6545) | Rick Pitino | Knicks | nsubj\|&lt;-nsubj&lt;-cast-&gt;prep-&gt;as-&gt;pobj-&gt;successor-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Rick Pitino → Knicks: An explicit coach title or direct coaching row establishes the person–team relation. Additional participation, administrative or association rows do not negate that coaching evidence.

Cited evidence lines: [6536](../raw_map.tsv:6536), [6537](../raw_map.tsv:6537), [6538](../raw_map.tsv:6538), [6539](../raw_map.tsv:6539), [6540](../raw_map.tsv:6540), [6541](../raw_map.tsv:6541), [6542](../raw_map.tsv:6542), [6543](../raw_map.tsv:6543), [6544](../raw_map.tsv:6544), [6545](../raw_map.tsv:6545).


Issue tags: mixed_evidence

### rel_1__ent_945__ent_702

**All observed names:** Jim Calhoun → Connecticut (10)

Ordered IDs: Ent[ent_945] → Ent[ent_702]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7183](../raw_map.tsv:7183) | Jim Calhoun | Connecticut | appos\|-&gt;appos-&gt;coach-&gt;nn-&gt;\|nn |
| [7184](../raw_map.tsv:7184) | Jim Calhoun | Connecticut | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7185](../raw_map.tsv:7185) | Jim Calhoun | Connecticut | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7186](../raw_map.tsv:7186) | Jim Calhoun | Connecticut | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| [7187](../raw_map.tsv:7187) | Jim Calhoun | Connecticut | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |
| [7188](../raw_map.tsv:7188) | Jim Calhoun | Connecticut | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;man-&gt;nn-&gt;\|nn |
| [7189](../raw_map.tsv:7189) | Jim Calhoun | Connecticut | rcmod\|-&gt;rcmod-&gt;meet-&gt;nsubj-&gt;\|nsubj |
| [7190](../raw_map.tsv:7190) | Jim Calhoun | Connecticut | rcmod\|-&gt;rcmod-&gt;coach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7191](../raw_map.tsv:7191) | Jim Calhoun | Connecticut | rcmod\|-&gt;rcmod-&gt;coach-&gt;dobj-&gt;\|dobj |
| [7192](../raw_map.tsv:7192) | Jim Calhoun | Connecticut | rcmod\|-&gt;rcmod-&gt;be-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Jim Calhoun → Connecticut: An explicit coach title or direct coaching row establishes the person–team relation. Additional participation, administrative or association rows do not negate that coaching evidence.

Cited evidence lines: [7183](../raw_map.tsv:7183), [7184](../raw_map.tsv:7184), [7185](../raw_map.tsv:7185), [7186](../raw_map.tsv:7186), [7187](../raw_map.tsv:7187), [7188](../raw_map.tsv:7188), [7189](../raw_map.tsv:7189), [7190](../raw_map.tsv:7190), [7191](../raw_map.tsv:7191), [7192](../raw_map.tsv:7192).


Issue tags: mixed_evidence

### rel_1__ent_944__ent_705

**All observed names:** P. J. Carlesimo → Seton Hall (10)

Ordered IDs: Ent[ent_944] → Ent[ent_705]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7193](../raw_map.tsv:7193) | P. J. Carlesimo | Seton Hall | appos\|-&gt;appos-&gt;coach-&gt;nn-&gt;\|nn |
| [7194](../raw_map.tsv:7194) | P. J. Carlesimo | Seton Hall | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| [7195](../raw_map.tsv:7195) | P. J. Carlesimo | Seton Hall | rcmod\|-&gt;rcmod-&gt;coach-&gt;dobj-&gt;\|dobj |
| [7196](../raw_map.tsv:7196) | P. J. Carlesimo | Seton Hall | rcmod\|-&gt;rcmod-&gt;return-&gt;dobj-&gt;\|dobj |
| [7197](../raw_map.tsv:7197) | P. J. Carlesimo | Seton Hall | rcmod\|-&gt;rcmod-&gt;old-&gt;nsubj-&gt;\|nsubj |
| [7198](../raw_map.tsv:7198) | P. J. Carlesimo | Seton Hall | pobj\|&lt;-pobj&lt;-with&lt;-prep&lt;-relationship-&gt;dep-&gt;coach-&gt;nn-&gt;\|nn |
| [7199](../raw_map.tsv:7199) | P. J. Carlesimo | Seton Hall | nsubj\|&lt;-nsubj&lt;-shed-&gt;prep-&gt;in-&gt;pobj-&gt;front-&gt;prep-&gt;of-&gt;pobj-&gt;bench-&gt;poss-&gt;\|poss |
| [7200](../raw_map.tsv:7200) | P. J. Carlesimo | Seton Hall | nsubj\|&lt;-nsubj&lt;-celebrate-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7201](../raw_map.tsv:7201) | P. J. Carlesimo | Seton Hall | nsubj\|&lt;-nsubj&lt;-build-&gt;dobj-&gt;team-&gt;nn-&gt;\|nn |
| [7202](../raw_map.tsv:7202) | P. J. Carlesimo | Seton Hall | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). P. J. Carlesimo → Seton Hall: An explicit coach title or direct coaching row establishes the person–team relation. Additional participation, administrative or association rows do not negate that coaching evidence.

Cited evidence lines: [7193](../raw_map.tsv:7193), [7194](../raw_map.tsv:7194), [7195](../raw_map.tsv:7195), [7196](../raw_map.tsv:7196), [7197](../raw_map.tsv:7197), [7198](../raw_map.tsv:7198), [7199](../raw_map.tsv:7199), [7200](../raw_map.tsv:7200), [7201](../raw_map.tsv:7201), [7202](../raw_map.tsv:7202).


Issue tags: mixed_evidence

### rel_1__ent_947__ent_704

**All observed names:** Jim Boeheim → Syracuse (10)

Ordered IDs: Ent[ent_947] → Ent[ent_704]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7203](../raw_map.tsv:7203) | Jim Boeheim | Syracuse | appos\|-&gt;appos-&gt;coach-&gt;nn-&gt;\|nn |
| [7204](../raw_map.tsv:7204) | Jim Boeheim | Syracuse | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| [7205](../raw_map.tsv:7205) | Jim Boeheim | Syracuse | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7206](../raw_map.tsv:7206) | Jim Boeheim | Syracuse | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7207](../raw_map.tsv:7207) | Jim Boeheim | Syracuse | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |
| [7208](../raw_map.tsv:7208) | Jim Boeheim | Syracuse | pobj\|&lt;-pobj&lt;-to&lt;-prep&lt;-assistant-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7209](../raw_map.tsv:7209) | Jim Boeheim | Syracuse | nsubj\|&lt;-nsubj&lt;-sit-&gt;prep-&gt;in-&gt;pobj-&gt;room-&gt;nn-&gt;\|nn |
| [7210](../raw_map.tsv:7210) | Jim Boeheim | Syracuse | nsubj\|&lt;-nsubj&lt;-say-&gt;prep-&gt;in-&gt;pobj-&gt;\|pobj |
| [7211](../raw_map.tsv:7211) | Jim Boeheim | Syracuse | nsubj\|&lt;-nsubj&lt;-be-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7212](../raw_map.tsv:7212) | Jim Boeheim | Syracuse | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;man-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Jim Boeheim → Syracuse: An explicit coach title or direct coaching row establishes the person–team relation. Additional participation, administrative or association rows do not negate that coaching evidence.

Cited evidence lines: [7203](../raw_map.tsv:7203), [7204](../raw_map.tsv:7204), [7205](../raw_map.tsv:7205), [7206](../raw_map.tsv:7206), [7207](../raw_map.tsv:7207), [7208](../raw_map.tsv:7208), [7209](../raw_map.tsv:7209), [7210](../raw_map.tsv:7210), [7211](../raw_map.tsv:7211), [7212](../raw_map.tsv:7212).


Issue tags: mixed_evidence

### rel_1__ent_1091__ent_1092

**All observed names:** Colin Campbell → Ranger (10)

Ordered IDs: Ent[ent_1091] → Ent[ent_1092]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7223](../raw_map.tsv:7223) | Colin Campbell | Ranger | appos\|-&gt;appos-&gt;coach-&gt;nn-&gt;\|nn |
| [7224](../raw_map.tsv:7224) | Colin Campbell | Ranger | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| [7225](../raw_map.tsv:7225) | Colin Campbell | Ranger | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7226](../raw_map.tsv:7226) | Colin Campbell | Ranger | nsubj\|&lt;-nsubj&lt;-coach-&gt;nn-&gt;\|nn |
| [7227](../raw_map.tsv:7227) | Colin Campbell | Ranger | nsubj\|&lt;-nsubj&lt;-coach-&gt;dobj-&gt;\|dobj |
| [7228](../raw_map.tsv:7228) | Colin Campbell | Ranger | dep\|-&gt;dep-&gt;coach-&gt;poss-&gt;\|poss |
| [7229](../raw_map.tsv:7229) | Colin Campbell | Ranger | rcmod\|-&gt;rcmod-&gt;return-&gt;nsubj-&gt;\|nsubj |
| [7230](../raw_map.tsv:7230) | Colin Campbell | Ranger | prep\|-&gt;prep-&gt;in-&gt;pobj-&gt;system-&gt;nn-&gt;\|nn |
| [7231](../raw_map.tsv:7231) | Colin Campbell | Ranger | poss\|&lt;-poss&lt;-staff-&gt;nn-&gt;\|nn |
| [7232](../raw_map.tsv:7232) | Colin Campbell | Ranger | poss\|&lt;-poss&lt;-office&lt;-nsubj&lt;-provide-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Colin Campbell → Ranger: An explicit coach title or direct coaching row establishes the person–team relation. Additional participation, administrative or association rows do not negate that coaching evidence.

Cited evidence lines: [7223](../raw_map.tsv:7223), [7224](../raw_map.tsv:7224), [7225](../raw_map.tsv:7225), [7226](../raw_map.tsv:7226), [7227](../raw_map.tsv:7227), [7228](../raw_map.tsv:7228), [7229](../raw_map.tsv:7229), [7230](../raw_map.tsv:7230), [7231](../raw_map.tsv:7231), [7232](../raw_map.tsv:7232).


Issue tags: mixed_evidence

### rel_1__ent_1093__ent_1094

**All observed names:** Lou Holtz → Notre Dame (10)

Ordered IDs: Ent[ent_1093] → Ent[ent_1094]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7233](../raw_map.tsv:7233) | Lou Holtz | Notre Dame | appos\|-&gt;appos-&gt;coach-&gt;nn-&gt;\|nn |
| [7234](../raw_map.tsv:7234) | Lou Holtz | Notre Dame | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| [7235](../raw_map.tsv:7235) | Lou Holtz | Notre Dame | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |
| [7236](../raw_map.tsv:7236) | Lou Holtz | Notre Dame | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7237](../raw_map.tsv:7237) | Lou Holtz | Notre Dame | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7238](../raw_map.tsv:7238) | Lou Holtz | Notre Dame | rcmod\|-&gt;rcmod-&gt;guide-&gt;dobj-&gt;\|dobj |
| [7239](../raw_map.tsv:7239) | Lou Holtz | Notre Dame | poss\|&lt;-poss&lt;-season&lt;-pobj&lt;-in&lt;-prep&lt;-championship-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7240](../raw_map.tsv:7240) | Lou Holtz | Notre Dame | nn\|&lt;-nn&lt;-system-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7241](../raw_map.tsv:7241) | Lou Holtz | Notre Dame | dep\|-&gt;dep-&gt;coach-&gt;nn-&gt;\|nn |
| [7242](../raw_map.tsv:7242) | Lou Holtz | Notre Dame | rcmod\|-&gt;rcmod-&gt;thank-&gt;prep-&gt;for-&gt;pobj-&gt;contribution-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Lou Holtz → Notre Dame: An explicit coach title or direct coaching row establishes the person–team relation. Additional participation, administrative or association rows do not negate that coaching evidence.

Cited evidence lines: [7233](../raw_map.tsv:7233), [7234](../raw_map.tsv:7234), [7235](../raw_map.tsv:7235), [7236](../raw_map.tsv:7236), [7237](../raw_map.tsv:7237), [7238](../raw_map.tsv:7238), [7239](../raw_map.tsv:7239), [7240](../raw_map.tsv:7240), [7241](../raw_map.tsv:7241), [7242](../raw_map.tsv:7242).


Issue tags: mixed_evidence

### rel_1__ent_1060__ent_961

**All observed names:** Rick Pitino → Knick (10)

Ordered IDs: Ent[ent_1060] → Ent[ent_961]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7243](../raw_map.tsv:7243) | Rick Pitino | Knick | appos\|-&gt;appos-&gt;coach-&gt;nn-&gt;\|nn |
| [7244](../raw_map.tsv:7244) | Rick Pitino | Knick | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| [7245](../raw_map.tsv:7245) | Rick Pitino | Knick | nsubj\|&lt;-nsubj&lt;-coach-&gt;poss-&gt;\|poss |
| [7246](../raw_map.tsv:7246) | Rick Pitino | Knick | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7247](../raw_map.tsv:7247) | Rick Pitino | Knick | rcmod\|-&gt;rcmod-&gt;consider-&gt;prep-&gt;for-&gt;pobj-&gt;vacancy-&gt;poss-&gt;\|poss |
| [7248](../raw_map.tsv:7248) | Rick Pitino | Knick | poss\|&lt;-poss&lt;-departure&lt;-pobj&lt;-after&lt;-prep&lt;-continue-&gt;nsubj-&gt;\|nsubj |
| [7249](../raw_map.tsv:7249) | Rick Pitino | Knick | nsubj\|&lt;-nsubj&lt;-replace-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;amod-&gt;\|amod |
| [7250](../raw_map.tsv:7250) | Rick Pitino | Knick | nsubj\|&lt;-nsubj&lt;-make-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7251](../raw_map.tsv:7251) | Rick Pitino | Knick | nsubj\|&lt;-nsubj&lt;-make-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;poss-&gt;\|poss |
| [7252](../raw_map.tsv:7252) | Rick Pitino | Knick | nsubj\|&lt;-nsubj&lt;-coach-&gt;dobj-&gt;\|dobj |

**Judgment: supported** (primary). Rick Pitino → Knick: An explicit coach title or direct coaching row establishes the person–team relation. Additional participation, administrative or association rows do not negate that coaching evidence.

Cited evidence lines: [7243](../raw_map.tsv:7243), [7244](../raw_map.tsv:7244), [7245](../raw_map.tsv:7245), [7246](../raw_map.tsv:7246), [7247](../raw_map.tsv:7247), [7248](../raw_map.tsv:7248), [7249](../raw_map.tsv:7249), [7250](../raw_map.tsv:7250), [7251](../raw_map.tsv:7251), [7252](../raw_map.tsv:7252).


Issue tags: mixed_evidence

### rel_1__ent_1096__ent_718

**All observed names:** Joe Paterno → Penn State (10)

Ordered IDs: Ent[ent_1096] → Ent[ent_718]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7263](../raw_map.tsv:7263) | Joe Paterno | Penn State | appos\|-&gt;appos-&gt;coach-&gt;nn-&gt;\|nn |
| [7264](../raw_map.tsv:7264) | Joe Paterno | Penn State | poss\|&lt;-poss&lt;-team-&gt;nn-&gt;\|nn |
| [7265](../raw_map.tsv:7265) | Joe Paterno | Penn State | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7266](../raw_map.tsv:7266) | Joe Paterno | Penn State | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| [7267](../raw_map.tsv:7267) | Joe Paterno | Penn State | rcmod\|-&gt;rcmod-&gt;win-&gt;nsubj-&gt;team-&gt;nn-&gt;\|nn |
| [7268](../raw_map.tsv:7268) | Joe Paterno | Penn State | nsubj\|&lt;-nsubj&lt;-take-&gt;prep-&gt;for-&gt;pobj-&gt;perception-&gt;prep-&gt;of-&gt;pobj-&gt;football-&gt;nn-&gt;\|nn |
| [7269](../raw_map.tsv:7269) | Joe Paterno | Penn State | nsubj\|&lt;-nsubj&lt;-get-&gt;prep-&gt;as-&gt;pobj-&gt;\|pobj |
| [7270](../raw_map.tsv:7270) | Joe Paterno | Penn State | rcmod\|-&gt;rcmod-&gt;lead-&gt;dobj-&gt;football-&gt;nn-&gt;\|nn |
| [7271](../raw_map.tsv:7271) | Joe Paterno | Penn State | rcmod\|-&gt;rcmod-&gt;begin-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;nn-&gt;\|nn |
| [7272](../raw_map.tsv:7272) | Joe Paterno | Penn State | prep\|-&gt;prep-&gt;of-&gt;pobj-&gt;share-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Joe Paterno → Penn State: An explicit coach title or direct coaching row establishes the person–team relation. Additional participation, administrative or association rows do not negate that coaching evidence.

Cited evidence lines: [7263](../raw_map.tsv:7263), [7264](../raw_map.tsv:7264), [7265](../raw_map.tsv:7265), [7266](../raw_map.tsv:7266), [7267](../raw_map.tsv:7267), [7268](../raw_map.tsv:7268), [7269](../raw_map.tsv:7269), [7270](../raw_map.tsv:7270), [7271](../raw_map.tsv:7271), [7272](../raw_map.tsv:7272).


Issue tags: mixed_evidence

### rel_1__ent_717__ent_959

**All observed names:** Geno Auriemma → UConn (10)

Ordered IDs: Ent[ent_717] → Ent[ent_959]; 10 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7273](../raw_map.tsv:7273) | Geno Auriemma | UConn | appos\|-&gt;appos-&gt;coach-&gt;nn-&gt;\|nn |
| [7274](../raw_map.tsv:7274) | Geno Auriemma | UConn | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| [7275](../raw_map.tsv:7275) | Geno Auriemma | UConn | rcmod\|-&gt;rcmod-&gt;win-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7276](../raw_map.tsv:7276) | Geno Auriemma | UConn | rcmod\|-&gt;rcmod-&gt;be-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;nn-&gt;\|nn |
| [7277](../raw_map.tsv:7277) | Geno Auriemma | UConn | prep\|-&gt;prep-&gt;in-&gt;dep-&gt;as-&gt;pobj-&gt;coach-&gt;nn-&gt;\|nn |
| [7278](../raw_map.tsv:7278) | Geno Auriemma | UConn | nsubj\|&lt;-nsubj&lt;-turn-&gt;dobj-&gt;program-&gt;poss-&gt;woman-&gt;nn-&gt;\|nn |
| [7279](../raw_map.tsv:7279) | Geno Auriemma | UConn | nsubj\|&lt;-nsubj&lt;-coach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7280](../raw_map.tsv:7280) | Geno Auriemma | UConn | dobj\|&lt;-dobj&lt;-coach-&gt;dep-&gt;tell-&gt;dobj-&gt;player-&gt;nn-&gt;\|nn |
| [7281](../raw_map.tsv:7281) | Geno Auriemma | UConn | dobj\|&lt;-dobj&lt;-coach-&gt;dep-&gt;extend-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7282](../raw_map.tsv:7282) | Geno Auriemma | UConn | dobj\|&lt;-dobj&lt;-coach&lt;-dep&lt;-defend-&gt;dobj-&gt;team-&gt;nn-&gt;\|nn |

**Judgment: supported** (primary). Geno Auriemma → UConn: An explicit coach title or direct coaching row establishes the person–team relation. Additional participation, administrative or association rows do not negate that coaching evidence.

Cited evidence lines: [7273](../raw_map.tsv:7273), [7274](../raw_map.tsv:7274), [7275](../raw_map.tsv:7275), [7276](../raw_map.tsv:7276), [7277](../raw_map.tsv:7277), [7278](../raw_map.tsv:7278), [7279](../raw_map.tsv:7279), [7280](../raw_map.tsv:7280), [7281](../raw_map.tsv:7281), [7282](../raw_map.tsv:7282).


Issue tags: mixed_evidence

### rel_1__ent_946__ent_1090

**All observed names:** John Thompson → Georgetown (8)

Ordered IDs: Ent[ent_946] → Ent[ent_1090]; 8 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7213](../raw_map.tsv:7213) | John Thompson | Georgetown | appos\|-&gt;appos-&gt;coach-&gt;nn-&gt;\|nn |
| [7214](../raw_map.tsv:7214) | John Thompson | Georgetown | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7215](../raw_map.tsv:7215) | John Thompson | Georgetown | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| [7216](../raw_map.tsv:7216) | John Thompson | Georgetown | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7217](../raw_map.tsv:7217) | John Thompson | Georgetown | rcmod\|-&gt;rcmod-&gt;coach-&gt;dobj-&gt;\|dobj |
| [7218](../raw_map.tsv:7218) | John Thompson | Georgetown | nsubj\|&lt;-nsubj&lt;-step-&gt;prep-&gt;as-&gt;pobj-&gt;coach-&gt;nn-&gt;\|nn |
| [7220](../raw_map.tsv:7220) | John Thompson | Georgetown | rcmod\|-&gt;rcmod-&gt;take-&gt;dobj-&gt;team-&gt;nn-&gt;\|nn |
| [7221](../raw_map.tsv:7221) | John Thompson | Georgetown | rcmod\|-&gt;rcmod-&gt;mold-&gt;dobj-&gt;program-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). John Thompson → Georgetown: An explicit coach title or direct coaching row establishes the person–team relation. Additional participation, administrative or association rows do not negate that coaching evidence.

Cited evidence lines: [7213](../raw_map.tsv:7213), [7214](../raw_map.tsv:7214), [7215](../raw_map.tsv:7215), [7216](../raw_map.tsv:7216), [7217](../raw_map.tsv:7217), [7218](../raw_map.tsv:7218), [7220](../raw_map.tsv:7220), [7221](../raw_map.tsv:7221).


Issue tags: mixed_evidence

### rel_1__ent_236__ent_478

**All observed names:** Lou Carnesecca → St. John (7)

Ordered IDs: Ent[ent_236] → Ent[ent_478]; 7 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6466](../raw_map.tsv:6466) | Lou Carnesecca | St. John | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| [6468](../raw_map.tsv:6468) | Lou Carnesecca | St. John | pobj\|&lt;-pobj&lt;-include&lt;-prep&lt;-player&lt;-pobj&lt;-of&lt;-prep&lt;-many&lt;-amod&lt;-coach-&gt;poss-&gt;\|poss |
| [6469](../raw_map.tsv:6469) | Lou Carnesecca | St. John | nsubj\|&lt;-nsubj&lt;-guide-&gt;dobj-&gt;fortune-&gt;poss-&gt;\|poss |
| [6470](../raw_map.tsv:6470) | Lou Carnesecca | St. John | dobj\|&lt;-dobj&lt;-coach&lt;-dep&lt;-ask-&gt;prep-&gt;about-&gt;pobj-&gt;start-&gt;poss-&gt;\|poss |
| [6471](../raw_map.tsv:6471) | Lou Carnesecca | St. John | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [6472](../raw_map.tsv:6472) | Lou Carnesecca | St. John | rcmod\|-&gt;rcmod-&gt;leave-&gt;dobj-&gt;\|dobj |
| [6475](../raw_map.tsv:6475) | Lou Carnesecca | St. John | poss\|&lt;-poss&lt;-season&lt;-pobj&lt;-in&lt;-prep&lt;-game-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Lou Carnesecca → St. John: An explicit coach title or direct coaching row establishes the person–team relation. Additional participation, administrative or association rows do not negate that coaching evidence.

Cited evidence lines: [6466](../raw_map.tsv:6466), [6468](../raw_map.tsv:6468), [6469](../raw_map.tsv:6469), [6470](../raw_map.tsv:6470), [6471](../raw_map.tsv:6471), [6472](../raw_map.tsv:6472), [6475](../raw_map.tsv:6475).


Issue tags: mixed_evidence

### rel_1__ent_1095__ent_960

**All observed names:** Mike Krzyzewski → Duke (6)

Ordered IDs: Ent[ent_1095] → Ent[ent_960]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7253](../raw_map.tsv:7253) | Mike Krzyzewski | Duke | appos\|-&gt;appos-&gt;coach-&gt;nn-&gt;\|nn |
| [7254](../raw_map.tsv:7254) | Mike Krzyzewski | Duke | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7255](../raw_map.tsv:7255) | Mike Krzyzewski | Duke | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| [7256](../raw_map.tsv:7256) | Mike Krzyzewski | Duke | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [7258](../raw_map.tsv:7258) | Mike Krzyzewski | Duke | nsubj\|&lt;-nsubj&lt;-stay-&gt;prep-&gt;at-&gt;pobj-&gt;\|pobj |
| [7262](../raw_map.tsv:7262) | Mike Krzyzewski | Duke | rcmod\|-&gt;rcmod-&gt;reach-&gt;nsubj-&gt;team-&gt;dep-&gt;\|dep |

**Judgment: supported** (primary). Mike Krzyzewski → Duke: An explicit coach title or direct coaching row establishes the person–team relation. Additional participation, administrative or association rows do not negate that coaching evidence.

Cited evidence lines: [7253](../raw_map.tsv:7253), [7254](../raw_map.tsv:7254), [7255](../raw_map.tsv:7255), [7256](../raw_map.tsv:7256), [7258](../raw_map.tsv:7258), [7262](../raw_map.tsv:7262).


Issue tags: mixed_evidence

### rel_1__ent_963__ent_1140

**All observed names:** Richard N. Perle → Pentagon (6)

Ordered IDs: Ent[ent_963] → Ent[ent_1140]; 6 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [7504](../raw_map.tsv:7504) | Richard N. Perle | Pentagon | appos\|-&gt;appos-&gt;official-&gt;nn-&gt;\|nn |
| [7505](../raw_map.tsv:7505) | Richard N. Perle | Pentagon | appos\|-&gt;appos-&gt;adviser-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |
| [7506](../raw_map.tsv:7506) | Richard N. Perle | Pentagon | appos\|-&gt;appos-&gt;adviser-&gt;nn-&gt;\|nn |
| [7509](../raw_map.tsv:7509) | Richard N. Perle | Pentagon | appos\|-&gt;appos-&gt;adviser-&gt;prep-&gt;to-&gt;pobj-&gt;official-&gt;nn-&gt;\|nn |
| [7510](../raw_map.tsv:7510) | Richard N. Perle | Pentagon | rcmod\|-&gt;rcmod-&gt;resign-&gt;prep-&gt;as-&gt;pobj-&gt;expert-&gt;poss-&gt;\|poss |
| [7513](../raw_map.tsv:7513) | Richard N. Perle | Pentagon | nsubj\|&lt;-nsubj&lt;-resign-&gt;prep-&gt;as-&gt;pobj-&gt;chairman-&gt;prep-&gt;of-&gt;pobj-&gt;board-&gt;prep-&gt;to-&gt;pobj-&gt;\|pobj |

**Judgment: incorrect** (primary). Richard N. Perle → Pentagon: The supplied rows establish a Pentagon official/adviser and a board-chair role, not a sports coaching relation.

Cited evidence lines: [7504](../raw_map.tsv:7504), [7505](../raw_map.tsv:7505), [7506](../raw_map.tsv:7506), [7509](../raw_map.tsv:7509), [7510](../raw_map.tsv:7510), [7513](../raw_map.tsv:7513).




### rel_1__ent_1178__ent_1179

**All observed names:** Mike Milbury → Islanders (5)

Ordered IDs: Ent[ent_1178] → Ent[ent_1179]; 5 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6526](../raw_map.tsv:6526) | Mike Milbury | Islanders | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| [6528](../raw_map.tsv:6528) | Mike Milbury | Islanders | appos\|-&gt;appos-&gt;coach-&gt;prep-&gt;of-&gt;pobj-&gt;\|pobj |
| [6532](../raw_map.tsv:6532) | Mike Milbury | Islanders | appos\|-&gt;appos-&gt;coach-&gt;nn-&gt;\|nn |
| [6533](../raw_map.tsv:6533) | Mike Milbury | Islanders | rcmod\|-&gt;rcmod-&gt;see-&gt;prep-&gt;in-&gt;pobj-&gt;stint-&gt;prep-&gt;behind-&gt;pobj-&gt;bench-&gt;poss-&gt;\|poss |
| [6535](../raw_map.tsv:6535) | Mike Milbury | Islanders | poss\|&lt;-poss&lt;-attention&lt;-dobj&lt;-coach-&gt;prep-&gt;after-&gt;pobj-&gt;loss-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Mike Milbury → Islanders: An explicit coach title or direct coaching row establishes the person–team relation. Additional participation, administrative or association rows do not negate that coaching evidence.

Cited evidence lines: [6526](../raw_map.tsv:6526), [6528](../raw_map.tsv:6528), [6532](../raw_map.tsv:6532), [6533](../raw_map.tsv:6533), [6535](../raw_map.tsv:6535).


Issue tags: mixed_evidence

### rel_1__ent_1042__ent_308

**All observed names:** Isiah Thomas → Knicks (4)

Ordered IDs: Ent[ent_1042] → Ent[ent_308]; 4 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [1646](../raw_map.tsv:1646) | Isiah Thomas | Knicks | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| [1648](../raw_map.tsv:1648) | Isiah Thomas | Knicks | nsubj\|&lt;-nsubj&lt;-coach-&gt;poss-&gt;\|poss |
| [1650](../raw_map.tsv:1650) | Isiah Thomas | Knicks | rcmod\|-&gt;rcmod-&gt;turn-&gt;nsubj-&gt;\|nsubj |
| [1651](../raw_map.tsv:1651) | Isiah Thomas | Knicks | rcmod\|-&gt;rcmod-&gt;synonymous-&gt;prep-&gt;as-&gt;pobj-&gt;president-&gt;poss-&gt;\|poss |

**Judgment: supported** (primary). Isiah Thomas → Knicks: An explicit coach title or direct coaching row establishes the person–team relation. Additional participation, administrative or association rows do not negate that coaching evidence.

Cited evidence lines: [1646](../raw_map.tsv:1646), [1648](../raw_map.tsv:1648), [1650](../raw_map.tsv:1650), [1651](../raw_map.tsv:1651).


Issue tags: mixed_evidence

### rel_1__ent_1061__ent_1004

**All observed names:** Willie Randolph → Yankees (3)

Ordered IDs: Ent[ent_1061] → Ent[ent_1004]; 3 rows.

| Source line | First argument | Second argument | Full dependency path |
|---:|---|---|---|
| [6546](../raw_map.tsv:6546) | Willie Randolph | Yankees | appos\|-&gt;appos-&gt;coach-&gt;poss-&gt;\|poss |
| [6547](../raw_map.tsv:6547) | Willie Randolph | Yankees | appos\|-&gt;appos-&gt;coach-&gt;nn-&gt;\|nn |
| [6550](../raw_map.tsv:6550) | Willie Randolph | Yankees | nsubj\|&lt;-nsubj&lt;-spend-&gt;prep-&gt;with-&gt;pobj-&gt;\|pobj |

**Judgment: supported** (primary). Willie Randolph → Yankees: An explicit coach title or direct coaching row establishes the person–team relation. Additional participation, administrative or association rows do not negate that coaching evidence.

Cited evidence lines: [6546](../raw_map.tsv:6546), [6547](../raw_map.tsv:6547), [6550](../raw_map.tsv:6550).


Issue tags: mixed_evidence
