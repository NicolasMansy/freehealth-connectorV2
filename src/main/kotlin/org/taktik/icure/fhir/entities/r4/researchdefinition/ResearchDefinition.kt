//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package org.taktik.icure.fhir.entities.r4.researchdefinition

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import org.taktik.icure.fhir.entities.r4.DomainResource
import org.taktik.icure.fhir.entities.r4.Meta
import org.taktik.icure.fhir.entities.r4.Resource
import org.taktik.icure.fhir.entities.r4.codeableconcept.CodeableConcept
import org.taktik.icure.fhir.entities.r4.contactdetail.ContactDetail
import org.taktik.icure.fhir.entities.r4.extension.Extension
import org.taktik.icure.fhir.entities.r4.identifier.Identifier
import org.taktik.icure.fhir.entities.r4.narrative.Narrative
import org.taktik.icure.fhir.entities.r4.period.Period
import org.taktik.icure.fhir.entities.r4.reference.Reference
import org.taktik.icure.fhir.entities.r4.relatedartifact.RelatedArtifact
import org.taktik.icure.fhir.entities.r4.usagecontext.UsageContext

/**
 * A research context or question
 *
 * The ResearchDefinition resource describes the conditional state (population and any exposures
 * being compared within the population) and outcome (if specified) that the knowledge (evidence,
 * assertion, recommendation) is about.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using= JsonDeserializer.None::class)
class ResearchDefinition(
  /**
   * When the research definition was approved by publisher
   */
  var approvalDate: String? = null,
  var author: List<ContactDetail> = listOf(),
  var comment: List<String> = listOf(),
  var contact: List<ContactDetail> = listOf(),
  override var contained: List<Resource> = listOf(),
  /**
   * Use and/or publishing restrictions
   */
  var copyright: String? = null,
  /**
   * Date last changed
   */
  var date: String? = null,
  /**
   * Natural language description of the research definition
   */
  var description: String? = null,
  var editor: List<ContactDetail> = listOf(),
  /**
   * When the research definition is expected to be used
   */
  var effectivePeriod: Period? = null,
  var endorser: List<ContactDetail> = listOf(),
  /**
   * For testing purposes, not real usage
   */
  var experimental: Boolean? = null,
  /**
   * What exposure?
   */
  var exposure: Reference? = null,
  /**
   * What alternative exposure state?
   */
  var exposureAlternative: Reference? = null,
  override var extension: List<Extension> = listOf(),
  /**
   * Logical id of this artifact
   */
  override var id: String? = null,
  var identifier: List<Identifier> = listOf(),
  /**
   * A set of rules under which this content was created
   */
  override var implicitRules: String? = null,
  var jurisdiction: List<CodeableConcept> = listOf(),
  /**
   * Language of the resource content
   */
  override var language: String? = null,
  /**
   * When the research definition was last reviewed
   */
  var lastReviewDate: String? = null,
  var library: List<String> = listOf(),
  /**
   * Metadata about the resource
   */
  override var meta: Meta? = null,
  override var modifierExtension: List<Extension> = listOf(),
  /**
   * Name for this research definition (computer friendly)
   */
  var name: String? = null,
  /**
   * What outcome?
   */
  var outcome: Reference? = null,
  /**
   * What population?
   */
  var population: Reference,
  /**
   * Name of the publisher (organization or individual)
   */
  var publisher: String? = null,
  /**
   * Why this research definition is defined
   */
  var purpose: String? = null,
  var relatedArtifact: List<RelatedArtifact> = listOf(),
  var reviewer: List<ContactDetail> = listOf(),
  /**
   * Title for use in informal contexts
   */
  var shortTitle: String? = null,
  /**
   * draft | active | retired | unknown
   */
  var status: String? = null,
  /**
   * E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device
   */
  var subjectCodeableConcept: CodeableConcept? = null,
  /**
   * E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device
   */
  var subjectReference: Reference? = null,
  /**
   * Subordinate title of the ResearchDefinition
   */
  var subtitle: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override var text: Narrative? = null,
  /**
   * Name for this research definition (human friendly)
   */
  var title: String? = null,
  var topic: List<CodeableConcept> = listOf(),
  /**
   * Canonical identifier for this research definition, represented as a URI (globally unique)
   */
  var url: String? = null,
  /**
   * Describes the clinical usage of the ResearchDefinition
   */
  var usage: String? = null,
  var useContext: List<UsageContext> = listOf(),
  /**
   * Business version of the research definition
   */
  var version: String? = null
) : DomainResource
