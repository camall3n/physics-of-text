# Ambiguous cases for user adjudication

These questions preserve the original assistant judgment and its evidence; they have not been resolved by assuming favorable answers. Follow each audit link for the full dictionary and predicate definition. Source references are TSV line numbers, including the header on line 1; the first data row is line 2. This file does not include every possible disagreement with the declared predicates; scope caveats for mixed clusters remain in each relation annotation.

## entityfix_latent_beta0001_seed20260912 — audit_4f7553d383

### rel_342__ent_1330__ent_1180

Predicate: analyst affiliation. The first person works as an analyst for or at the second organization.

Every path describes analyst affiliation, but the second latent entity represents both Paine Webber and Merrill Lynch. These different organization strings are not established as aliases, so one resolved ordered fact is uncertain.

**Question:** Should this latent entity be resolved to Paine Webber or Merrill Lynch, or split into two organizations?

Source rows: 1794, 1795, 1798, 7804, 7808, 7848. [Editable annotation](../manual_review/audit_4f7553d383/annotations/rel_342.json). [Full case folder](../manual_review/audit_4f7553d383/README.md).

### rel_342__ent_736__ent_783

Predicate: analyst affiliation. The first person works as an analyst for or at the second organization.

The analyst predicate is explicit for each row, but the first latent entity combines Tom Wolzien, Kenneth S. Abramowitz and Gary D. Black without evidence that they name one person.

**Question:** Which person does this first latent entity denote, given its Wolzien, Abramowitz and Black mentions?

Source rows: 600, 1790, 1791, 1792, 7845, 7846. [Editable annotation](../manual_review/audit_4f7553d383/annotations/rel_342.json). [Full case folder](../manual_review/audit_4f7553d383/README.md).

### rel_242__ent_7__ent_485

Predicate: chairs or heads organization. The first person holds or held the chair or head leadership office of the second organization or committee.

Several paths explicitly describe chairing or heading the Senate Armed Services Committee, but the first argument is only Democrat. The extraction does not identify which individual this latent entity denotes; membership and panel-level evidence are also mixed in.

**Question:** Which named Democrat is the first argument, and do these committee-chair references all denote that individual?

Source rows: 6309, 6310, 6311, 6312, 6313, 6315, 6316, 6317. [Editable annotation](../manual_review/audit_4f7553d383/annotations/rel_242.json). [Full case folder](../manual_review/audit_4f7553d383/README.md).

### rel_383__ent_1109__ent_672

Predicate: director affiliation. The first person holds or held a director role of, for, or at the second organization.

Appleby is called director for Study of American Catholicism, but that second argument may be an abbreviated institutional name or merely a topic; the professor-for row does not resolve the intended organization.

**Question:** Does Study of American Catholicism name the institution/program Appleby directs, and what full entity does the source sentence identify?

Source rows: 1748, 1750. [Editable annotation](../manual_review/audit_4f7553d383/annotations/rel_383.json). [Full case folder](../manual_review/audit_4f7553d383/README.md).

### rel_274__ent_1406__ent_1401

Predicate: political or organizational leader of. The first person is or was a political, organizational or community leader of the group, legislature or political body designated by the second argument.

The leader paths support Senate leadership separately for Dole and Daschle, but those different personal names are assigned to one first entity with no alias evidence.

**Question:** Which person does this first entity denote, Bob Dole or Tom Daschle, and should these Senate-leadership facts be split?

Source rows: 2964, 2973, 3009. [Editable annotation](../manual_review/audit_4f7553d383/annotations/rel_274.json). [Full case folder](../manual_review/audit_4f7553d383/README.md).

### rel_98__ent_409__ent_1420

Predicate: winner or champion of. The first entity won the competition or award designated by the second, or held its championship title.

There is explicit World Series win evidence for Yankees and Marlins, but the first latent entity combines those different team names. The participation row does not resolve the identity collision.

**Question:** Does this first entity denote the Yankees or the Marlins, and should their World Series facts be separated?

Source rows: 2181, 2257, 2693. [Editable annotation](../manual_review/audit_4f7553d383/annotations/rel_98.json). [Full case folder](../manual_review/audit_4f7553d383/README.md).

### rel_216__ent_1236__ent_647

Predicate: defeated opponent. The first competitor won a contest against the second competitor.

The Mets explicitly beat the Dodgers and defeat Florida Marlins, but the second latent entity merges those distinct opponent names. Clear win paths for each do not identify one opponent for this single tuple.

**Question:** Should the second entity be the Dodgers or Florida Marlins, or should these opponent facts be split?

Source rows: 6918, 6919, 6922, 6924, 6926, 6982. [Editable annotation](../manual_review/audit_4f7553d383/annotations/rel_216.json). [Full case folder](../manual_review/audit_4f7553d383/README.md).

### rel_216__ent_1310__ent_254

Predicate: defeated opponent. The first competitor won a contest against the second competitor.

Victory/beat/defeat paths treat East and West as opponents, but other rows compare geographic or political worlds and allies. The generic names do not identify which competing teams or collectives this single entity pair denotes.

**Question:** Do East and West denote the same sports competitors throughout these rows, or have geographic/political East–West referents been merged into the pair?

Source rows: 6052, 6054, 6055, 6057, 6058, 6060. [Editable annotation](../manual_review/audit_4f7553d383/annotations/rel_216.json). [Full case folder](../manual_review/audit_4f7553d383/README.md).

### rel_223__ent_1220__ent_323

Predicate: geographical part of. The first named neighborhood, district or area is geographically contained in the second place.

The rows clearly put both Bedford-Stuyvesant and Brownsville in Brooklyn, but they combine two different neighborhood names as one first entity without alias evidence.

**Question:** Does this first entity denote Bedford-Stuyvesant or Brownsville, and should their containment facts be separate?

Source rows: 1099, 1100, 1101, 1106, 1168, 1170, 1171. [Editable annotation](../manual_review/audit_4f7553d383/annotations/rel_223.json). [Full case folder](../manual_review/audit_4f7553d383/README.md).

## entityfix_latent_beta0001_seed20260913 — audit_af30702564

### rel_125__ent_1186__ent_783

Predicate: analyst at organization. Person X is an analyst at, with or for organization Y.

The same first latent entity is Tom Wolzien, Kenneth S. Abramowitz and Gary D. Black. All have analyst evidence at the same company, but they do not identify a single person for this inferred pair.

**Question:** Which person should this fact identify, and should Wolzien, Abramowitz and Black be split into separate entities?

Source rows: 599, 600, 601, 1790, 1792, 7845. [Editable annotation](../manual_review/audit_af30702564/annotations/rel_125.json). [Full case folder](../manual_review/audit_af30702564/README.md).

### rel_274__ent_1203__ent_497

Predicate: leader or organizational head of. Person X holds or held a leadership or head office in political body or organization Y.

Milosevic has leader-of evidence, but Yugoslav is an incomplete/adjectival political-body argument; persuade/accuse paths do not resolve it.

**Question:** Does Yugoslav refer to the state Yugoslavia or a more specific omitted institution in the original leader-of sentence?

Source rows: 2826, 2827, 2828. [Editable annotation](../manual_review/audit_af30702564/annotations/rel_274.json). [Full case folder](../manual_review/audit_af30702564/README.md).

### rel_274__ent_1364__ent_55

Predicate: leader or organizational head of. Person X holds or held a leadership or head office in political body or organization Y.

The same latent pair combines Trimble/Ulster Unionist Party with Science fiction/Wild West. Leadership is supported for the named politician but the two ordered entity identities are inconsistent.

**Question:** Should Science fiction/Wild West be separated from David Trimble/Ulster Unionist Party, and which entity pair is intended here?

Source rows: 2895, 2898, 2902, 2903, 6040. [Editable annotation](../manual_review/audit_af30702564/annotations/rel_274.json). [Full case folder](../manual_review/audit_af30702564/README.md).

### rel_164__ent_1271__ent_1300

Predicate: managerial or leadership office in. Person X holds or held an explicit managerial or leadership office in organization or institution Y, such as chairperson, head, director, president, manager, chief or executive.

Stephanopoulos is Mr. Clinton director in a possessive path, but the organization or campaign in which the office is held is omitted.

**Question:** Which Clinton campaign, office or organization does director refer to, and should that body replace Mr. Clinton as the second argument?

Source rows: 3529. [Editable annotation](../manual_review/audit_af30702564/annotations/rel_164.json). [Full case folder](../manual_review/audit_af30702564/README.md).

### rel_352__ent_407__ent_1218

Predicate: subsidiary or organizational unit of. Organization or business unit X is a subsidiary, division, owned business or organizational part of parent organization Y.

Chicago has part-of-unit/part-of-DDB Worldwide paths, but a geographic city is standing for an unnamed office or business unit.

**Question:** Which Chicago office or organizational unit is meant, and should its full name replace the city argument?

Source rows: 4125, 4127, 4130. [Editable annotation](../manual_review/audit_af30702564/annotations/rel_352.json). [Full case folder](../manual_review/audit_af30702564/README.md).

### rel_304__ent_1370__ent_557

Predicate: defeated opponent. X defeated opposing competitor Y in at least one competitive contest.

The same first latent entity combines Montreal Expos and San Diego Padres. Both have defeat/beat evidence against Mets, but they are different teams and do not identify one inferred subject.

**Question:** Should Montreal Expos and San Diego Padres be separated, and which team is intended by this latent fact?

Source rows: 1047, 1048, 1059, 1060. [Editable annotation](../manual_review/audit_af30702564/annotations/rel_304.json). [Full case folder](../manual_review/audit_af30702564/README.md).

