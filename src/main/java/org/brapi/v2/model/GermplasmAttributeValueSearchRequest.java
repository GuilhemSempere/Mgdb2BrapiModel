package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * GermplasmAttributeValueSearchRequest
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-14T15:37:29.213Z[GMT]")


public class GermplasmAttributeValueSearchRequest extends SearchRequestParametersPaging  {
  @JsonProperty("germplasmDbIds")
  @Valid
  private List<String> germplasmDbIds = null;

  @JsonProperty("germplasmNames")
  @Valid
  private List<String> germplasmNames = null;

  @JsonProperty("externalReferenceIDs")
  @Valid
  private List<String> externalReferenceIDs = null;

  @JsonProperty("externalReferenceSources")
  @Valid
  private List<String> externalReferenceSources = null;

  @JsonProperty("attributeDbIds")
  @Valid
  private List<String> attributeDbIds = null;

  @JsonProperty("attributeNames")
  @Valid
  private List<String> attributeNames = null;

  @JsonProperty("attributeValueDbIds")
  @Valid
  private List<String> attributeValueDbIds = null;

  @JsonProperty("dataTypes")
  @Valid
  private List<TraitDataType> dataTypes = null;

  @JsonProperty("methodDbIds")
  @Valid
  private List<String> methodDbIds = null;

  @JsonProperty("ontologyDbIds")
  @Valid
  private List<String> ontologyDbIds = null;

  @JsonProperty("scaleDbIds")
  @Valid
  private List<String> scaleDbIds = null;

  @JsonProperty("traitClasses")
  @Valid
  private List<String> traitClasses = null;

  @JsonProperty("traitDbIds")
  @Valid
  private List<String> traitDbIds = null;

  public GermplasmAttributeValueSearchRequest germplasmDbIds(List<String> germplasmDbIds) {
    this.germplasmDbIds = germplasmDbIds;
    return this;
  }

  public GermplasmAttributeValueSearchRequest addGermplasmDbIdsItem(String germplasmDbIdsItem) {
    if (this.germplasmDbIds == null) {
      this.germplasmDbIds = new ArrayList<String>();
    }
    this.germplasmDbIds.add(germplasmDbIdsItem);
    return this;
  }

  /**
   * List of IDs which uniquely identify germplasm to search for
   * @return germplasmDbIds
   **/
  @Schema(example = "[\"e9c6edd7\",\"1b1df4a6\"]", description = "List of IDs which uniquely identify germplasm to search for")
  
    public List<String> getGermplasmDbIds() {
    return germplasmDbIds;
  }

  public void setGermplasmDbIds(List<String> germplasmDbIds) {
    this.germplasmDbIds = germplasmDbIds;
  }

  public GermplasmAttributeValueSearchRequest germplasmNames(List<String> germplasmNames) {
    this.germplasmNames = germplasmNames;
    return this;
  }

  public GermplasmAttributeValueSearchRequest addGermplasmNamesItem(String germplasmNamesItem) {
    if (this.germplasmNames == null) {
      this.germplasmNames = new ArrayList<String>();
    }
    this.germplasmNames.add(germplasmNamesItem);
    return this;
  }

  /**
   * List of human readable names to identify germplasm to search for
   * @return germplasmNames
   **/
  @Schema(example = "[\"A0000003\",\"A0000477\"]", description = "List of human readable names to identify germplasm to search for")
  
    public List<String> getGermplasmNames() {
    return germplasmNames;
  }

  public void setGermplasmNames(List<String> germplasmNames) {
    this.germplasmNames = germplasmNames;
  }

  public GermplasmAttributeValueSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
    this.externalReferenceIDs = externalReferenceIDs;
    return this;
  }

  public GermplasmAttributeValueSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
    if (this.externalReferenceIDs == null) {
      this.externalReferenceIDs = new ArrayList<String>();
    }
    this.externalReferenceIDs.add(externalReferenceIDsItem);
    return this;
  }

  /**
   * List of external reference IDs. Could be a simple strings or a URIs. (use with `externalReferenceSources` parameter)
   * @return externalReferenceIDs
   **/
  @Schema(example = "[\"http://purl.obolibrary.org/obo/ro.owl\",\"14a19841\"]", description = "List of external reference IDs. Could be a simple strings or a URIs. (use with `externalReferenceSources` parameter)")
  
    public List<String> getExternalReferenceIDs() {
    return externalReferenceIDs;
  }

  public void setExternalReferenceIDs(List<String> externalReferenceIDs) {
    this.externalReferenceIDs = externalReferenceIDs;
  }

  public GermplasmAttributeValueSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
    this.externalReferenceSources = externalReferenceSources;
    return this;
  }

  public GermplasmAttributeValueSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
    if (this.externalReferenceSources == null) {
      this.externalReferenceSources = new ArrayList<String>();
    }
    this.externalReferenceSources.add(externalReferenceSourcesItem);
    return this;
  }

  /**
   * List of identifiers for the source system or database of an external reference (use with `externalReferenceIDs` parameter)
   * @return externalReferenceSources
   **/
  @Schema(example = "[\"OBO Library\",\"Field App Name\"]", description = "List of identifiers for the source system or database of an external reference (use with `externalReferenceIDs` parameter)")
  
    public List<String> getExternalReferenceSources() {
    return externalReferenceSources;
  }

  public void setExternalReferenceSources(List<String> externalReferenceSources) {
    this.externalReferenceSources = externalReferenceSources;
  }

  public GermplasmAttributeValueSearchRequest attributeDbIds(List<String> attributeDbIds) {
    this.attributeDbIds = attributeDbIds;
    return this;
  }

  public GermplasmAttributeValueSearchRequest addAttributeDbIdsItem(String attributeDbIdsItem) {
    if (this.attributeDbIds == null) {
      this.attributeDbIds = new ArrayList<String>();
    }
    this.attributeDbIds.add(attributeDbIdsItem);
    return this;
  }

  /**
   * List of Germplasm Attribute IDs to search for
   * @return attributeDbIds
   **/
  @Schema(example = "[\"2ef15c9f\",\"318e7f7d\"]", description = "List of Germplasm Attribute IDs to search for")
  
    public List<String> getAttributeDbIds() {
    return attributeDbIds;
  }

  public void setAttributeDbIds(List<String> attributeDbIds) {
    this.attributeDbIds = attributeDbIds;
  }

  public GermplasmAttributeValueSearchRequest attributeNames(List<String> attributeNames) {
    this.attributeNames = attributeNames;
    return this;
  }

  public GermplasmAttributeValueSearchRequest addAttributeNamesItem(String attributeNamesItem) {
    if (this.attributeNames == null) {
      this.attributeNames = new ArrayList<String>();
    }
    this.attributeNames.add(attributeNamesItem);
    return this;
  }

  /**
   * List of human readable Germplasm Attribute names to search for
   * @return attributeNames
   **/
  @Schema(example = "[\"Plant Height 1\",\"Root Color\"]", description = "List of human readable Germplasm Attribute names to search for")
  
    public List<String> getAttributeNames() {
    return attributeNames;
  }

  public void setAttributeNames(List<String> attributeNames) {
    this.attributeNames = attributeNames;
  }

  public GermplasmAttributeValueSearchRequest attributeValueDbIds(List<String> attributeValueDbIds) {
    this.attributeValueDbIds = attributeValueDbIds;
    return this;
  }

  public GermplasmAttributeValueSearchRequest addAttributeValueDbIdsItem(String attributeValueDbIdsItem) {
    if (this.attributeValueDbIds == null) {
      this.attributeValueDbIds = new ArrayList<String>();
    }
    this.attributeValueDbIds.add(attributeValueDbIdsItem);
    return this;
  }

  /**
   * List of Germplasm Attribute Value IDs to search for
   * @return attributeValueDbIds
   **/
  @Schema(example = "[\"ca4636d0\",\"c8a92409\"]", description = "List of Germplasm Attribute Value IDs to search for")
  
    public List<String> getAttributeValueDbIds() {
    return attributeValueDbIds;
  }

  public void setAttributeValueDbIds(List<String> attributeValueDbIds) {
    this.attributeValueDbIds = attributeValueDbIds;
  }

  public GermplasmAttributeValueSearchRequest dataTypes(List<TraitDataType> dataTypes) {
    this.dataTypes = dataTypes;
    return this;
  }

  public GermplasmAttributeValueSearchRequest addDataTypesItem(TraitDataType dataTypesItem) {
    if (this.dataTypes == null) {
      this.dataTypes = new ArrayList<TraitDataType>();
    }
    this.dataTypes.add(dataTypesItem);
    return this;
  }

  /**
   * List of scale data types to filter search results
   * @return dataTypes
   **/
  @Schema(example = "[\"Numerical\",\"Ordinal\",\"Text\"]", description = "List of scale data types to filter search results")
      @Valid
    public List<TraitDataType> getDataTypes() {
    return dataTypes;
  }

  public void setDataTypes(List<TraitDataType> dataTypes) {
    this.dataTypes = dataTypes;
  }

  public GermplasmAttributeValueSearchRequest methodDbIds(List<String> methodDbIds) {
    this.methodDbIds = methodDbIds;
    return this;
  }

  public GermplasmAttributeValueSearchRequest addMethodDbIdsItem(String methodDbIdsItem) {
    if (this.methodDbIds == null) {
      this.methodDbIds = new ArrayList<String>();
    }
    this.methodDbIds.add(methodDbIdsItem);
    return this;
  }

  /**
   * List of methods to filter search results
   * @return methodDbIds
   **/
  @Schema(example = "[\"07e34f83\",\"d3d5517a\"]", description = "List of methods to filter search results")
  
    public List<String> getMethodDbIds() {
    return methodDbIds;
  }

  public void setMethodDbIds(List<String> methodDbIds) {
    this.methodDbIds = methodDbIds;
  }

  public GermplasmAttributeValueSearchRequest ontologyDbIds(List<String> ontologyDbIds) {
    this.ontologyDbIds = ontologyDbIds;
    return this;
  }

  public GermplasmAttributeValueSearchRequest addOntologyDbIdsItem(String ontologyDbIdsItem) {
    if (this.ontologyDbIds == null) {
      this.ontologyDbIds = new ArrayList<String>();
    }
    this.ontologyDbIds.add(ontologyDbIdsItem);
    return this;
  }

  /**
   * List of ontology IDs to search for
   * @return ontologyDbIds
   **/
  @Schema(example = "[\"f44f7b23\",\"a26b576e\"]", description = "List of ontology IDs to search for")
  
    public List<String> getOntologyDbIds() {
    return ontologyDbIds;
  }

  public void setOntologyDbIds(List<String> ontologyDbIds) {
    this.ontologyDbIds = ontologyDbIds;
  }

  public GermplasmAttributeValueSearchRequest scaleDbIds(List<String> scaleDbIds) {
    this.scaleDbIds = scaleDbIds;
    return this;
  }

  public GermplasmAttributeValueSearchRequest addScaleDbIdsItem(String scaleDbIdsItem) {
    if (this.scaleDbIds == null) {
      this.scaleDbIds = new ArrayList<String>();
    }
    this.scaleDbIds.add(scaleDbIdsItem);
    return this;
  }

  /**
   * List of scales to filter search results
   * @return scaleDbIds
   **/
  @Schema(example = "[\"a13ecffa\",\"7e1afe4f\"]", description = "List of scales to filter search results")
  
    public List<String> getScaleDbIds() {
    return scaleDbIds;
  }

  public void setScaleDbIds(List<String> scaleDbIds) {
    this.scaleDbIds = scaleDbIds;
  }

  public GermplasmAttributeValueSearchRequest traitClasses(List<String> traitClasses) {
    this.traitClasses = traitClasses;
    return this;
  }

  public GermplasmAttributeValueSearchRequest addTraitClassesItem(String traitClassesItem) {
    if (this.traitClasses == null) {
      this.traitClasses = new ArrayList<String>();
    }
    this.traitClasses.add(traitClassesItem);
    return this;
  }

  /**
   * List of trait classes to filter search results
   * @return traitClasses
   **/
  @Schema(example = "[\"morphological\",\"phenological\",\"agronomical\"]", description = "List of trait classes to filter search results")
  
    public List<String> getTraitClasses() {
    return traitClasses;
  }

  public void setTraitClasses(List<String> traitClasses) {
    this.traitClasses = traitClasses;
  }

  public GermplasmAttributeValueSearchRequest traitDbIds(List<String> traitDbIds) {
    this.traitDbIds = traitDbIds;
    return this;
  }

  public GermplasmAttributeValueSearchRequest addTraitDbIdsItem(String traitDbIdsItem) {
    if (this.traitDbIds == null) {
      this.traitDbIds = new ArrayList<String>();
    }
    this.traitDbIds.add(traitDbIdsItem);
    return this;
  }

  /**
   * List of trait unique ID to filter search results
   * @return traitDbIds
   **/
  @Schema(example = "[\"ef81147b\",\"78d82fad\"]", description = "List of trait unique ID to filter search results")
  
    public List<String> getTraitDbIds() {
    return traitDbIds;
  }

  public void setTraitDbIds(List<String> traitDbIds) {
    this.traitDbIds = traitDbIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GermplasmAttributeValueSearchRequest germplasmAttributeValueSearchRequest = (GermplasmAttributeValueSearchRequest) o;
    return Objects.equals(this.germplasmDbIds, germplasmAttributeValueSearchRequest.germplasmDbIds) &&
        Objects.equals(this.germplasmNames, germplasmAttributeValueSearchRequest.germplasmNames) &&
        Objects.equals(this.externalReferenceIDs, germplasmAttributeValueSearchRequest.externalReferenceIDs) &&
        Objects.equals(this.externalReferenceSources, germplasmAttributeValueSearchRequest.externalReferenceSources) &&
        Objects.equals(this.attributeDbIds, germplasmAttributeValueSearchRequest.attributeDbIds) &&
        Objects.equals(this.attributeNames, germplasmAttributeValueSearchRequest.attributeNames) &&
        Objects.equals(this.attributeValueDbIds, germplasmAttributeValueSearchRequest.attributeValueDbIds) &&
        Objects.equals(this.dataTypes, germplasmAttributeValueSearchRequest.dataTypes) &&
        Objects.equals(this.methodDbIds, germplasmAttributeValueSearchRequest.methodDbIds) &&
        Objects.equals(this.ontologyDbIds, germplasmAttributeValueSearchRequest.ontologyDbIds) &&
        Objects.equals(this.scaleDbIds, germplasmAttributeValueSearchRequest.scaleDbIds) &&
        Objects.equals(this.traitClasses, germplasmAttributeValueSearchRequest.traitClasses) &&
        Objects.equals(this.traitDbIds, germplasmAttributeValueSearchRequest.traitDbIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(germplasmDbIds, germplasmNames, externalReferenceIDs, externalReferenceSources, attributeDbIds, attributeNames, attributeValueDbIds, dataTypes, methodDbIds, ontologyDbIds, scaleDbIds, traitClasses, traitDbIds, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmAttributeValueSearchRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    germplasmDbIds: ").append(toIndentedString(germplasmDbIds)).append("\n");
    sb.append("    germplasmNames: ").append(toIndentedString(germplasmNames)).append("\n");
    sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
    sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
    sb.append("    attributeDbIds: ").append(toIndentedString(attributeDbIds)).append("\n");
    sb.append("    attributeNames: ").append(toIndentedString(attributeNames)).append("\n");
    sb.append("    attributeValueDbIds: ").append(toIndentedString(attributeValueDbIds)).append("\n");
    sb.append("    dataTypes: ").append(toIndentedString(dataTypes)).append("\n");
    sb.append("    methodDbIds: ").append(toIndentedString(methodDbIds)).append("\n");
    sb.append("    ontologyDbIds: ").append(toIndentedString(ontologyDbIds)).append("\n");
    sb.append("    scaleDbIds: ").append(toIndentedString(scaleDbIds)).append("\n");
    sb.append("    traitClasses: ").append(toIndentedString(traitClasses)).append("\n");
    sb.append("    traitDbIds: ").append(toIndentedString(traitDbIds)).append("\n");
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
