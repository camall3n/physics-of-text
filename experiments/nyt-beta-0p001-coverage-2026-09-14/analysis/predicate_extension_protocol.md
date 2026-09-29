# Extending the frozen predicate catalogue beyond the top 20

Status: approved by the parent on 2026-09-14 before grading any new lower-ranked facts. Prior top-20 definitions and complete judgments are preserved exactly and reused with source provenance. No definition in the earlier frozen catalogue is edited.

## Selection and scope

1. Read every dictionary path and its assigned-row frequency for the relation. Read literal arguments as necessary to establish their roles; a `son-of` path can end at a place because of extraction/relative attachment and must not automatically become a kinship relation. This inspection does not assign case grades.
2. List the coherent candidate meanings and choose the dominant semantic predicate represented by the dictionary. Use row frequencies to describe dictionary support, not to classify fact truth. Record the supporting path IDs, important competing meanings, and the directional argument roles. A single surface word is not sufficient for interpreting a long dependency path.
3. Reuse a frozen catalogue ID when its actual scope matches the selected meaning. Related but different predicates retain distinct IDs: founder versus owner or manager; birthplace versus death place or residence; sports competitor versus winner; an officeholder versus the body having that officeholder. Specific titles do not become broad office predicates merely to accept more cases. If a genuinely mixed office family is dominant, use the already defined office family consistently and record its breadth.
4. If the dominant meaning has no existing definition, propose an atomic extension containing `id`, `label`, `definition`, `includes`, `excludes`, `ambiguous`, `notes`, and exact scope notes. Resolve it centrally before using the ID. Another reviewer must use that same definition rather than a locally broadened synonym. Append the new entry; retain the old catalogue hash, extension hash, and an individual predicate-definition hash.
5. Freeze each relation's assignment and dictionary-based rationale before its facts receive S/E/A judgments. Prefer completing the run's dictionary-to-predicate map first. A later discovered error in the assignment is an explicit amendment: preserve the prior assignment, explain why it was erroneous independently of improved scores, and reconsider every affected fact and equivalent relation. Never silently widen a definition after seeing failures.

A candidate is coherent when it specifies a relation between the ordered argument roles independently of the cases it would pass. It must be more informative than “associated with” or “some connection.” Linguistic paraphrases of the same proposition may be grouped; unrelated propositions cannot be joined to improve precision. Parenthetical notes cannot covertly add extra accepted meanings.

## Tied or unclear dictionaries

Record real ties and the evidence for choosing one interpretation. Use the highest-frequency clear predicate family as the primary interpretation when identifiable. If two families have equal dictionary support, prefer the family containing the highest-frequency individually interpretable path; if still tied, record both and request central adjudication before grades. This tie rule cannot settle an unclear argument direction or an uninterpretable path.

Do not force a generic universal predicate onto an uninterpretable cluster. Flag it for central adjudication and explain exactly what is unresolved. If a primary predicate can be fixed but a case lacks enough evidence, that case is A under the ordinary rubric. If no meaningful predicate can be assigned to the relation at all, use a centrally declared unresolved_relation designation with every fact A and a specific relation-semantic indeterminacy reason; retain every case in the denominator and count these cases separately. This exceptional treatment was approved before grading; it must not replace an identifiable coherent dominant meaning.

## Grading and comparability

After freezing the assignment, read every expressed fact and all of its supplied evidence. Apply the same earlier S/E/A, locality, identity, attachment, time, and missing-argument rules. Automation may prepare evidence, preserve exact prior judgments, validate citations, and calculate counts; it must not grade cases by matching words to a predicate. Supporting evidence in one fact cannot be borrowed by another fact with the same names.

A fact is supported if at least one local row clearly supports the fixed predicate with coherent argument identity. Extra unrelated rows are flagged as mixed evidence. Consequently this is existential fact support, not sentence-assignment purity. The distinction is particularly consequential in the lower-ranked dictionaries and must remain visible in the report.

The coverage cutoffs select nested prefixes of the relation ranking by assigned input-row count, including all facts in the boundary relation. They are not recall estimates. Prior top-20 results remain separately reproducible. Different runs select different facts at the same coverage level; keep run-specific denominators, ambiguity endpoints, and exact per-relation counts. These complete censuses need no sampling confidence interval.

## Suggested assignment record

```json
{
  "audit_id": "audit_...",
  "relation": "rel_...",
  "rank": 21,
  "predicate_id": "founder_of",
  "predicate_sha256": "...",
  "assignment_status": "frozen_before_case_grading",
  "dictionary_sha256": "...",
  "complete_dictionary_read": true,
  "argument_roles_inspected": true,
  "supporting_path_indices": [0, 1, 2],
  "selection_reason": "Explicit dictionary-based semantic rationale",
  "competing_meanings": ["managerial office"],
  "scope_limitations": ["Founding does not establish an office or current ownership"],
  "frozen_at": "...",
  "reviewer": "..."
}
```

Path support counts in a rationale are manually identified dictionary-family counts, not automatically generated case judgments. A supporting family can still have unsupported or ambiguous cases because of direction, modality, attachment, or entity identity.
