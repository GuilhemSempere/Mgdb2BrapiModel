package org.brapi.v2.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ReferenceSourceGermplasm
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-08T14:59:28.380Z[GMT]")


public class ReferenceSourceGermplasm   {
  @JsonProperty("germplasmDbId")
  private String germplasmDbId = null;

  @JsonProperty("germplasmName")
  private String germplasmName = null;

  public ReferenceSourceGermplasm germplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies a `Germplasm` within the given database server
   * @return germplasmDbId
   **/
  @Schema(example = "d4076594", description = "The ID which uniquely identifies a `Germplasm` within the given database server")
  
    public String getGermplasmDbId() {
    return germplasmDbId;
  }

  public void setGermplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
  }

  public ReferenceSourceGermplasm germplasmName(String germplasmName) {
    this.germplasmName = germplasmName;
    return this;
  }

  /**
   * The human readable name of a `Germplasm`
   * @return germplasmName
   **/
  @Schema(example = "A0000003", description = "The human readable name of a `Germplasm`")
  
    public String getGermplasmName() {
    return germplasmName;
  }

  public void setGermplasmName(String germplasmName) {
    this.germplasmName = germplasmName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferenceSourceGermplasm referenceSourceGermplasm = (ReferenceSourceGermplasm) o;
    return Objects.equals(this.germplasmDbId, referenceSourceGermplasm.germplasmDbId) &&
        Objects.equals(this.germplasmName, referenceSourceGermplasm.germplasmName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(germplasmDbId, germplasmName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceSourceGermplasm {\n");
    
    sb.append("    germplasmDbId: ").append(toIndentedString(germplasmDbId)).append("\n");
    sb.append("    germplasmName: ").append(toIndentedString(germplasmName)).append("\n");
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