# Exact-evidence semantic consistency

Diagnostic only: this file does not change annotations or scores. Matching requires the complete literal evidence set, the same frozen predicate, and the same status of entity-ID equality. Repetition of an identical row does not change the evidence set. Human overrides are respected.

Current reviewed facts: 8173; unreviewed: 315. Current-only disagreements: 11. Disagreements including separately identified preserved references: 12.

[Structured diagnostic](semantic_consistency.json)

Prior references do not enter any coverage or precision denominator. An identical evidence set is a consistency flag, not permission to copy a judgment automatically.

## 1. director_of

Signature: 6f1b935e5d5425268feaa2ea6b2abddeea3484a32afb201d7a4684866aca0664

Complete distinct evidence:

- "Desmond Ryan" → "Better Long Island" — `appos|->appos->director->prep->for->pobj->|pobj`
- "Desmond Ryan" → "Better Long Island" — `nsubj|<-nsubj<-director->prep->for->pobj->|pobj`
- "Desmond Ryan" → "Better Long Island" — `nsubj|<-nsubj<-say->prep->for->pobj->|pobj`
- "Desmond Ryan" → "Better Long Island" — `pobj|<-pobj<-by<-prep<-essay->prep->for->pobj->|pobj`
- "Desmond Ryan" → "Better Long Island" — `rcmod|->rcmod->call->prep->for->pobj->|pobj`

- **supported** [audit_dcb746fa83d6/rel_383__ent_108__ent_1047](../census/audit_dcb746fa83d6/reports/rel_383.md#rel_383__ent_108__ent_1047) (current): Desmond Ryan → Better Long Island: Explicit director wording establishes a director office of or within the identified organization.
- **supported** [audit_e318fe663470/rel_175__ent_108__ent_721](../census/audit_e318fe663470/reports/rel_175.md#rel_175__ent_108__ent_721) (current): Desmond Ryan → Better Long Island: The supplied case explicitly identifies a director role for the ordered institution; other professional or speaking roles do not remove that local directorship evidence.
- **ambiguous** [audit_9c88162c7b22/rel_228__ent_108__ent_1047](../census/audit_9c88162c7b22/reports/rel_228.md#rel_228__ent_108__ent_1047) (current): Desmond Ryan → Better Long Island: Director-for attaches to Better Long Island, an incomplete or purpose-like institutional designation.

## 2. located_in

Signature: 6caf601f851a5574f711926fff19794095000a76195542b76bbbec0ecf4d46d6

Complete distinct evidence:

- "I.B.M." → "Armonk" — `rcmod|->rcmod->have->dobj->working->prep->in->pobj->|pobj`

- **ambiguous** [audit_dcb746fa83d6/rel_47__ent_547__ent_1262](../census/audit_dcb746fa83d6/reports/rel_47.md#rel_47__ent_547__ent_1262) (current): I.B.M. → Armonk: The sole have-working-in path omits who or what is working and does not clearly establish an organizational office or base.
- **supported** [audit_06dbdb9b03af/rel_1__ent_547__ent_789](../census/audit_06dbdb9b03af/reports/rel_1.md#rel_1__ent_547__ent_789) (current): I.B.M. → Armonk: Explicit concern/company/bank location, local division or working-in premises establishes organizational physical location.

## 3. travels_to

Signature: 263d5696d4a8d3a9929bec7b51e73e09d0a75b30044012361d272731e739575e

Complete distinct evidence:

- "Watsons" → "Birmingham" — `nsubj|<-nsubj<-go->prep->to->pobj->|pobj`
- "Watsons" → "Birmingham" — `poss|<-poss<-story<-dobj<-merge->prep->with->pobj->bombing->prep->in->pobj->|pobj`

- **ambiguous** [audit_dcb746fa83d6/rel_67__ent_93__ent_82](../census/audit_dcb746fa83d6/reports/rel_67.md#rel_67__ent_93__ent_82) (current): Watsons → Birmingham: The Watsons-to-Birmingham phrase may be an embedded story title rather than an independently asserted journey by an identified group.
- **supported** [audit_e318fe663470/rel_144__ent_281__ent_82](../census/audit_e318fe663470/reports/rel_144.md#rel_144__ent_281__ent_82) (current): Watsons → Birmingham: A local unqualified go/return-to construction supports geographic movement.
- **ambiguous** [audit_06dbdb9b03af/rel_206__ent_281__ent_82](../census/audit_06dbdb9b03af/reports/rel_206.md#rel_206__ent_281__ent_82) (current): Watsons → Birmingham: Go-to occurs alongside story and bombing narrative, so a literal family journey versus a work-title reference is unresolved.
- **supported** [audit_1f78d7eb1e88/rel_80__ent_1045__ent_976](../../nyt-complete-evaluation-2026-09-14/census/audit_1f78d7eb1e88/reports/rel_80.md#rel_80__ent_1045__ent_976) (prior_reference): Watsons → Birmingham: At least one row explicitly describes movement, relocation, return or a trip with the named geographic destination.
- **supported** [audit_9f5868d8ee0e/rel_69__ent_281__ent_82](../../nyt-complete-evaluation-2026-09-14/census/audit_9f5868d8ee0e/reports/rel_69.md#rel_69__ent_281__ent_82) (prior_reference): Watsons → Birmingham: A direct visit, arrival, journey or destination movement row supports travel to this named geographic place.

## 4. member_of

Signature: 042745eb010996273f456af011e7d89d3580c1369111d6a0139adb83087821f6

Complete distinct evidence:

- "House" → "Senate" — `nsubj|<-nsubj<-join->dobj->|dobj`

- **ambiguous** [audit_dcb746fa83d6/rel_187__ent_1368__ent_1197](../census/audit_dcb746fa83d6/reports/rel_187.md#rel_187__ent_1368__ent_1197) (current): House → Senate: The bare join edge can describe joint action between political counterparts rather than accession as a member.
- **incorrect** [audit_e318fe663470/rel_392__ent_1046__ent_1197](../census/audit_e318fe663470/reports/rel_392.md#rel_392__ent_1046__ent_1197) (current): House → Senate: Joining another country/chamber in an action or river confluence does not establish membership in an organization.

## 5. reviews_artistic_output_of

Signature: 47ea6a32fe328fb9f87bfa4bb50c7d8c0bb58764096cb6aa8b3a5b6d6cb395c1

Complete distinct evidence:

- "Naomi Siegel" → "Shakespeare Theater" — `nsubj|<-nsubj<-review->dobj->|dobj`

- **supported** [audit_dcb746fa83d6/rel_253__ent_901__ent_303](../census/audit_dcb746fa83d6/reports/rel_253.md#rel_253__ent_901__ent_303) (current): Naomi Siegel → Shakespeare Theater: A local direct artistic review or review-of-performance/production row identifies this artist or producing institution as the reviewed subject; shortened theater/circus names retain a coherent performer identity.
- **ambiguous** [audit_e318fe663470/rel_390__ent_1188__ent_1139](../census/audit_e318fe663470/reports/rel_390.md#rel_390__ent_1188__ent_1139) (current): Naomi Siegel → Shakespeare Theater: The isolated review of Shakespeare Theater does not distinguish a producing ensemble from a venue being reviewed.

## 6. travels_to

Signature: 3c16e00079c1513a93ee6b835cc59953f6549cf69585607fb6082448eb28aded

Complete distinct evidence:

- "Britain" → "China" — `nsubj|<-nsubj<-return->dobj->territory->prep->to->pobj->|pobj`
- "Britain" → "China" — `nsubj|<-nsubj<-return->prep->to->pobj->|pobj`
- "Britain" → "China" — `poss|<-poss<-hand-over->prep->to->pobj->|pobj`

- **incorrect** [audit_dcb746fa83d6/rel_180__ent_1386__ent_818](../census/audit_dcb746fa83d6/reports/rel_180.md#rel_180__ent_1386__ent_818) (current): Britain → China: The supplied evidence concerns death-place, territorial handover, an entrance, or other nontravel roles; Britain returning territory to China is not Britain traveling there.
- **ambiguous** [audit_9c88162c7b22/rel_17__ent_813__ent_818](../census/audit_9c88162c7b22/reports/rel_17.md#rel_17__ent_813__ent_818) (current): Britain → China: The apparent return-to is accompanied by returning territory and a hand-over, so the moving entity may be omitted territory rather than Britain.

## 7. has_political_leader

Signature: 9a2d799c3652cb6718121f16500d73f313c2cd30adf92acd12d101389531f80a

Complete distinct evidence:

- "Senate" → "Republicans" — `nn|<-nn<-leader->appos->|appos`

- **incorrect** [audit_dcb746fa83d6/rel_241__ent_1299__ent_1107](../census/audit_dcb746fa83d6/reports/rel_241.md#rel_241__ent_1299__ent_1107) (current): Senate → Republicans: Committee membership, corporate nationality, or a plural political group does not establish the required named individual political leader.
- **ambiguous** [audit_e318fe663470/rel_37__ent_1197__ent_1213](../census/audit_e318fe663470/reports/rel_37.md#rel_37__ent_1197__ent_1213) (current): Senate → Republicans: The leader construction supplies only Republican or Republicans rather than an identified individual officeholder.

## 8. economist_for

Signature: a91030cead0aa328d50b6c76f26b6ef825469969d689e31034f70c0f82d748f4

Complete distinct evidence:

- "Lawrence A. Kudlow" → "Bear" — `appos|->appos->economist->prep->at->pobj->|pobj`
- "Lawrence A. Kudlow" → "Bear" — `appos|->appos->economist->prep->for->pobj->|pobj`
- "Lawrence A. Kudlow" → "Bear" — `appos|->appos->economist->prep->of->pobj->|pobj`
- "Lawrence A. Kudlow" → "Bear" — `appos|->appos->economist->prep->with->pobj->|pobj`

- **supported** [audit_e318fe663470/rel_132__ent_852__ent_1222](../census/audit_e318fe663470/reports/rel_132.md#rel_132__ent_852__ent_1222) (current): Lawrence A. Kudlow → Bear: The local evidence directly identifies this person as an economist affiliated with the named institution; other professional titles or longer attachments do not remove the explicit economist support.
- **ambiguous** [audit_06dbdb9b03af/rel_112__ent_852__ent_613](../census/audit_06dbdb9b03af/reports/rel_112.md#rel_112__ent_852__ent_613) (current): Lawrence A. Kudlow → Bear: The economist role is explicit, but Bear is a materially incomplete principal name in these rows.
- **supported** [audit_9c88162c7b22/rel_91__ent_852__ent_613](../census/audit_9c88162c7b22/reports/rel_91.md#rel_91__ent_852__ent_613) (current): Lawrence A. Kudlow → Bear: An explicit economist-at, for, of or with path states the ordered professional affiliation. Bear is accepted employer shorthand under the preserved prior-census convention.

## 9. director_of

Signature: 6b96fd83b4352e2fc6a616aeef1f77426bb5d7e7fd00d1deb38c6011bda1dcdd

Complete distinct evidence:

- "Caroline Smith DeWaal" → "Center for Science" — `appos|->appos->director->prep->at->pobj->|pobj`
- "Caroline Smith DeWaal" → "Center for Science" — `appos|->appos->director->prep->of->pobj->|pobj`
- "Caroline Smith DeWaal" → "Center for Science" — `rcmod|->rcmod->director->prep->for->pobj->|pobj`

- **supported** [audit_e318fe663470/rel_370__ent_1048__ent_1049](../census/audit_e318fe663470/reports/rel_370.md#rel_370__ent_1048__ent_1049) (current): Caroline Smith DeWaal → Center for Science: A local director-of/at/for row identifies an explicit directorship within the stated institution.
- **ambiguous** [audit_9c88162c7b22/rel_334__ent_1048__ent_1049](../census/audit_9c88162c7b22/reports/rel_334.md#rel_334__ent_1048__ent_1049) (current): Caroline Smith DeWaal → Center for Science: Director is explicit but Center for Science omits the identifying institutional name.

## 10. located_in

Signature: a7f70165ea7f5473c725402f02f887c2cd5ab3719eb2e12ecef12b2be4691a56

Complete distinct evidence:

- "Forrester Research" → "Cambridge" — `appos|->appos->firm->dep->|dep`

- **supported** [audit_e318fe663470/rel_290__ent_1162__ent_1088](../census/audit_e318fe663470/reports/rel_290.md#rel_290__ent_1162__ent_1088) (current): Forrester Research → Cambridge: A local company/firm-in or geographic firm modifier/based-in construction establishes the organizational location.
- **ambiguous** [audit_d0f63db2a21a/rel_84__ent_1162__ent_1088](../../nyt-complete-evaluation-2026-09-14/census/audit_d0f63db2a21a/reports/rel_84.md#rel_84__ent_1162__ent_1088) (prior_reference): Forrester Research → Cambridge: The only firm-to-Cambridge link is an untyped dependency, so physical-location attachment remains unresolved.

## 11. succeeded_person

Signature: 8149dfcc8a5b2c595122f017320fffafbe899d8221360fa94a473627a63830b2

Complete distinct evidence:

- "Frank R. Lautenberg" → "Robert G. Torricelli" — `appos|->appos->senator->rcmod->reappear->prep->after->pobj->|pobj`
- "Frank R. Lautenberg" → "Robert G. Torricelli" — `appos|<-appos<-co-founder<-nsubj<-be->prep->as->pobj->replacement->prep->for->pobj->|pobj`
- "Frank R. Lautenberg" → "Robert G. Torricelli" — `dobj|<-dobj<-substitute->prep->for->pobj->|pobj`
- "Frank R. Lautenberg" → "Robert G. Torricelli" — `nsubj|<-nsubj<-call->dep->end->nsubj->|nsubj`
- "Frank R. Lautenberg" → "Robert G. Torricelli" — `nsubj|<-nsubj<-replace->dobj->|dobj`
- "Frank R. Lautenberg" → "Robert G. Torricelli" — `nsubj|<-nsubj<-take->dobj->place->poss->|poss`

- **supported** [audit_e318fe663470/rel_368__ent_1151__ent_215](../census/audit_e318fe663470/reports/rel_368.md#rel_368__ent_1151__ent_215) (current): Frank R. Lautenberg → Robert G. Torricelli: Explicit succeeded, took-place or predecessor constructions establish succession or replacement of the earlier role holder.
- **supported** [audit_06dbdb9b03af/rel_51__ent_1151__ent_215](../census/audit_06dbdb9b03af/reports/rel_51.md#rel_51__ent_1151__ent_215) (current): Frank R. Lautenberg → Robert G. Torricelli: Successor, succeed, take-place or explicit role replacement evidence establishes taking over from the named predecessor.
- **ambiguous** [audit_9c88162c7b22/rel_326__ent_1151__ent_215](../census/audit_9c88162c7b22/reports/rel_326.md#rel_326__ent_1151__ent_215) (current): Frank R. Lautenberg → Robert G. Torricelli: Replacement and substitution are clear but the actual role and whether the succession concerns candidacy or an office already held are not supplied.

## 12. agreed_with

Signature: 818479f9e71d74811d711b185f9fa2e1b54eb579e4be69f78cecfa65a97429cc

Complete distinct evidence:

- "Administration" → "Congress" — `poss|<-poss<-agreement->prep->with->pobj->|pobj`

- **ambiguous** [audit_06dbdb9b03af/rel_83__ent_183__ent_189](../census/audit_06dbdb9b03af/reports/rel_83.md#rel_83__ent_183__ent_189) (current): Administration → Congress: The agreement is explicit but Administration leaves the institutional principal unidentified.
- **supported** [audit_9c88162c7b22/rel_33__ent_183__ent_189](../census/audit_9c88162c7b22/reports/rel_33.md#rel_33__ent_183__ent_189) (current): Administration → Congress: The explicit possessive agreement-with-Congress paths establish an agreement by the named administration; no external agreement content is assumed.
