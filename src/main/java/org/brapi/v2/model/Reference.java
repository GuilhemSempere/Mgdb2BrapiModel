package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.brapi.v2.model.OntologyTerm;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A &#x60;Reference&#x60; is a canonical assembled contig, intended to act as a reference coordinate space for other genomic annotations. A single &#x60;Reference&#x60; might represent the human chromosome 1, for instance.  &#x60;Reference&#x60; s are designed to be immutable.
 */
@ApiModel(description = "A `Reference` is a canonical assembled contig, intended to act as a reference coordinate space for other genomic annotations. A single `Reference` might represent the human chromosome 1, for instance.  `Reference` s are designed to be immutable.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-08T14:59:28.380Z[GMT]")
public class Reference {
  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo = null;
  
  @JsonProperty("commonCropName")
  private String commonCropName = null;

  @JsonProperty("externalReferences")
  private ExternalReferences externalReferences = null;

  @JsonProperty("isDerived")
  private Boolean isDerived = null;

  @JsonProperty("length")
  private String length = null;

  @JsonProperty("md5checksum")
  private String md5checksum = null;

  @JsonProperty("referenceDbId")
  private String referenceDbId = null;

  @JsonProperty("referenceName")
  private String referenceName = null;

  @JsonProperty("referenceSetDbId")
  private String referenceSetDbId = null;

  @JsonProperty("referenceSetName")
  private String referenceSetName = null;
  
  @JsonProperty("sourceAccessions")
  @Valid
  private List<String> sourceAccessions = null;

  @JsonProperty("sourceDivergence")
  private Float sourceDivergence = null;

  @JsonProperty("sourceGermplasm")
  @Valid
  private List<ReferenceSourceGermplasm> sourceGermplasm = null;

  @JsonProperty("sourceURI")
  private String sourceURI = null;

  @JsonProperty("species")
  private OntologyTerm species = null;

  public Reference additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public Reference putAdditionalInfoItem(String key, String additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new HashMap<String, String>();
    }
    this.additionalInfo.put(key, additionalInfoItem);
    return this;
  }

  /**
   * Additional arbitrary info
   * @return additionalInfo
  **/
  @ApiModelProperty(value = "Additional arbitrary info")
  
    public Map<String, String> getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }
  
  public Reference commonCropName(String commonCropName) {
	    this.commonCropName = commonCropName;
	    return this;
	  }

  /**
   * Common name for the crop
   * @return commonCropName
   **/
  @ApiModelProperty(value = "Common name for the crop")
  
    public String getCommonCropName() {
    return commonCropName;
  }

  public void setCommonCropName(String commonCropName) {
    this.commonCropName = commonCropName;
  }

  public Reference externalReferences(ExternalReferences externalReferences) {
    this.externalReferences = externalReferences;
    return this;
  }

  /**
   * Get externalReferences
   * @return externalReferences
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ExternalReferences getExternalReferences() {
    return externalReferences;
  }

  public void setExternalReferences(ExternalReferences externalReferences) {
    this.externalReferences = externalReferences;
  }


  public Reference isDerived(Boolean isDerived) {
    this.isDerived = isDerived;
    return this;
  }

  /**
   * A sequence X is said to be derived from source sequence Y, if X and Y are of the same length and the per-base sequence divergence at A/C/G/T bases is sufficiently small. Two sequences derived from the same official sequence share the same coordinates and annotations, and can be replaced with the official sequence for certain use cases.
   * @return isDerived
  **/
  @ApiModelProperty(value = "A sequence X is said to be derived from source sequence Y, if X and Y are of the same length and the per-base sequence divergence at A/C/G/T bases is sufficiently small. Two sequences derived from the same official sequence share the same coordinates and annotations, and can be replaced with the official sequence for certain use cases.")
  
    public Boolean isIsDerived() {
    return isDerived;
  }

  public void setIsDerived(Boolean isDerived) {
    this.isDerived = isDerived;
  }

  public Reference length(String length) {
    this.length = length;
    return this;
  }

  /**
   * The length of this reference's sequence.
   * @return length
  **/
  @ApiModelProperty(value = "The length of this reference's sequence.")
  
    public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }

  public Reference md5checksum(String md5checksum) {
    this.md5checksum = md5checksum;
    return this;
  }

  /**
   * The MD5 checksum uniquely representing this `Reference` as a lower-case hexadecimal string, calculated as the MD5 of the upper-case sequence excluding all whitespace characters (this is equivalent to SQ:M5 in SAM).
   * @return md5checksum
  **/
  @ApiModelProperty(value = "The MD5 checksum uniquely representing this `Reference` as a lower-case hexadecimal string, calculated as the MD5 of the upper-case sequence excluding all whitespace characters (this is equivalent to SQ:M5 in SAM).")
  
    public String getMd5checksum() {
    return md5checksum;
  }

  public void setMd5checksum(String md5checksum) {
    this.md5checksum = md5checksum;
  }

  public Reference referenceDbId(String referenceDbId) {
    this.referenceDbId = referenceDbId;
    return this;
  }

  /**
   * The reference ID. Unique within the repository.
   * @return referenceDbId
  **/
  @ApiModelProperty(value = "The reference ID. Unique within the repository.")
  
    public String getReferenceDbId() {
    return referenceDbId;
  }

  public void setReferenceDbId(String referenceDbId) {
    this.referenceDbId = referenceDbId;
  }

  public Reference referenceName(String referenceName) {
    this.referenceName = referenceName;
    return this;
  }

  /**
   * The unique name of this reference within the Reference Set (e.g. '22').
   * @return referenceName
  **/
  @ApiModelProperty(value = "The unique name of this reference within the Reference Set (e.g. '22').")
  
    public String getReferenceName() {
    return referenceName;
  }

  public void setReferenceName(String referenceName) {
    this.referenceName = referenceName;
  }


  public Reference referenceSetDbId(String referenceSetDbId) {
    this.referenceSetDbId = referenceSetDbId;
    return this;
  }

  /**
   * The unique identifier for a `ReferenceSet`
   * @return referenceSetDbId
   **/
  @ApiModelProperty(value = "The unique identifier for a `ReferenceSet`")
  
    public String getReferenceSetDbId() {
    return referenceSetDbId;
  }

  public void setReferenceSetDbId(String referenceSetDbId) {
    this.referenceSetDbId = referenceSetDbId;
  }

  public Reference referenceSetName(String referenceSetName) {
    this.referenceSetName = referenceSetName;
    return this;
  }

  /**
   * The human readable name of a `ReferenceSet`
   * @return referenceSetName
   **/
  @ApiModelProperty(value = "The human readable name of a `ReferenceSet`")
  
    public String getReferenceSetName() {
    return referenceSetName;
  }

  public void setReferenceSetName(String referenceSetName) {
    this.referenceSetName = referenceSetName;
  }

  public Reference sourceAccessions(List<String> sourceAccessions) {
    this.sourceAccessions = sourceAccessions;
    return this;
  }

  public Reference addSourceAccessionsItem(String sourceAccessionsItem) {
    if (this.sourceAccessions == null) {
      this.sourceAccessions = new ArrayList<String>();
    }
    this.sourceAccessions.add(sourceAccessionsItem);
    return this;
  }

  /**
   * All known corresponding accession IDs in INSDC (GenBank/ENA/DDBJ) which must include a version number, e.g. `GCF_000001405.26`.
   * @return sourceAccessions
  **/
  @ApiModelProperty(value = "All known corresponding accession IDs in INSDC (GenBank/ENA/DDBJ) which must include a version number, e.g. `GCF_000001405.26`.")
  
    public List<String> getSourceAccessions() {
    return sourceAccessions;
  }

  public void setSourceAccessions(List<String> sourceAccessions) {
    this.sourceAccessions = sourceAccessions;
  }

  public Reference sourceDivergence(Float sourceDivergence) {
    this.sourceDivergence = sourceDivergence;
    return this;
  }

  /**
   * The `sourceDivergence` is the fraction of non-indel bases that do not match the reference this message was derived from.
   * @return sourceDivergence
  **/
  @ApiModelProperty(value = "The `sourceDivergence` is the fraction of non-indel bases that do not match the reference this message was derived from.")
  
    public Float getSourceDivergence() {
    return sourceDivergence;
  }

  public void setSourceDivergence(Float sourceDivergence) {
    this.sourceDivergence = sourceDivergence;
  }

  public Reference sourceGermplasm(List<ReferenceSourceGermplasm> sourceGermplasm) {
    this.sourceGermplasm = sourceGermplasm;
    return this;
  }

  public Reference addSourceGermplasmItem(ReferenceSourceGermplasm sourceGermplasmItem) {
    if (this.sourceGermplasm == null) {
      this.sourceGermplasm = new ArrayList<ReferenceSourceGermplasm>();
    }
    this.sourceGermplasm.add(sourceGermplasmItem);
    return this;
  }

  /**
   * All known corresponding Germplasm
   * @return sourceGermplasm
   **/
  @ApiModelProperty(value = "All known corresponding Germplasm")
      @Valid
    public List<ReferenceSourceGermplasm> getSourceGermplasm() {
    return sourceGermplasm;
  }

  public void setSourceGermplasm(List<ReferenceSourceGermplasm> sourceGermplasm) {
    this.sourceGermplasm = sourceGermplasm;
  }

  public Reference sourceURI(String sourceURI) {
    this.sourceURI = sourceURI;
    return this;
  }

  /**
   * The URI from which the sequence was obtained. Specifies a FASTA format file/string with one name, sequence pair. In most cases, clients should call the `getReferenceBases()` method to obtain sequence bases for a `Reference` instead of attempting to retrieve this URI.
   * @return sourceURI
  **/
  @ApiModelProperty(value = "The URI from which the sequence was obtained. Specifies a FASTA format file/string with one name, sequence pair. In most cases, clients should call the `getReferenceBases()` method to obtain sequence bases for a `Reference` instead of attempting to retrieve this URI.")
  
    public String getSourceURI() {
    return sourceURI;
  }

  public void setSourceURI(String sourceURI) {
    this.sourceURI = sourceURI;
  }

  public Reference species(OntologyTerm species) {
    this.species = species;
    return this;
  }

  /**
   * Get species
   * @return species
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OntologyTerm getSpecies() {
    return species;
  }

  public void setSpecies(OntologyTerm species) {
    this.species = species;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reference reference = (Reference) o;
    return Objects.equals(this.additionalInfo, reference.additionalInfo) &&
        Objects.equals(this.isDerived, reference.isDerived) &&
        Objects.equals(this.length, reference.length) &&
        Objects.equals(this.md5checksum, reference.md5checksum) &&
        Objects.equals(this.referenceDbId, reference.referenceDbId) &&
        Objects.equals(this.referenceName, reference.referenceName) &&
        Objects.equals(this.sourceAccessions, reference.sourceAccessions) &&
        Objects.equals(this.sourceDivergence, reference.sourceDivergence) &&
        Objects.equals(this.sourceURI, reference.sourceURI) &&
        Objects.equals(this.species, reference.species);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, isDerived, length, md5checksum, referenceDbId, referenceName, sourceAccessions, sourceDivergence, sourceURI, species);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reference {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    isDerived: ").append(toIndentedString(isDerived)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    md5checksum: ").append(toIndentedString(md5checksum)).append("\n");
    sb.append("    referenceDbId: ").append(toIndentedString(referenceDbId)).append("\n");
    sb.append("    referenceName: ").append(toIndentedString(referenceName)).append("\n");
    sb.append("    sourceAccessions: ").append(toIndentedString(sourceAccessions)).append("\n");
    sb.append("    sourceDivergence: ").append(toIndentedString(sourceDivergence)).append("\n");
    sb.append("    sourceURI: ").append(toIndentedString(sourceURI)).append("\n");
    sb.append("    species: ").append(toIndentedString(species)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
