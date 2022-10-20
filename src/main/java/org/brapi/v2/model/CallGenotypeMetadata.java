package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * CallGenotypeMetadata
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-19T13:16:35.755Z[GMT]")


public class CallGenotypeMetadata   {
  /**
   * The type of field represented in this Genotype Field. This is intended to help parse the data out of JSON.
   */
  public enum DataTypeEnum {
    STRING("string"),
    
    INTEGER("integer"),
    
    FLOAT("float"),
    
    BOOLEAN("boolean");

    private String value;

    DataTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DataTypeEnum fromValue(String text) {
      for (DataTypeEnum b : DataTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("dataType")
  private DataTypeEnum dataType = null;

  @JsonProperty("fieldAbbreviation")
  private String fieldAbbreviation = null;

  @JsonProperty("fieldName")
  private String fieldName = null;

  @JsonProperty("fieldValue")
  private String fieldValue = null;

  public CallGenotypeMetadata dataType(DataTypeEnum dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * The type of field represented in this Genotype Field. This is intended to help parse the data out of JSON.
   * @return dataType
   **/
  @Schema(example = "integer", description = "The type of field represented in this Genotype Field. This is intended to help parse the data out of JSON.")
  
    public DataTypeEnum getDataType() {
    return dataType;
  }

  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }

  public CallGenotypeMetadata fieldAbbreviation(String fieldAbbreviation) {
    this.fieldAbbreviation = fieldAbbreviation;
    return this;
  }

  /**
   * The abbreviated code of the field represented in this Genotype Field. These codes should match the VCF standard when possible. Examples include: \"GQ\", \"RD\", and \"HQ\" <br> This maps to a FORMAT field in the VCF file standard.
   * @return fieldAbbreviation
   **/
  @Schema(example = "GQ", description = "The abbreviated code of the field represented in this Genotype Field. These codes should match the VCF standard when possible. Examples include: \"GQ\", \"RD\", and \"HQ\" <br> This maps to a FORMAT field in the VCF file standard.")
  
    public String getFieldAbbreviation() {
    return fieldAbbreviation;
  }

  public void setFieldAbbreviation(String fieldAbbreviation) {
    this.fieldAbbreviation = fieldAbbreviation;
  }

  public CallGenotypeMetadata fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * The name of the field represented in this Genotype Field. Examples include: \"Genotype Quality\", \"Read Depth\", and \"Haplotype Quality\" <br> This maps to a FORMAT field in the VCF file standard.
   * @return fieldName
   **/
  @Schema(example = "Genotype Quality", description = "The name of the field represented in this Genotype Field. Examples include: \"Genotype Quality\", \"Read Depth\", and \"Haplotype Quality\" <br> This maps to a FORMAT field in the VCF file standard.")
  
    public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public CallGenotypeMetadata fieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
    return this;
  }

  /**
   * The additional metadata value associated with this genotype call
   * @return fieldValue
   **/
  @Schema(example = "45.2", description = "The additional metadata value associated with this genotype call")
  
    public String getFieldValue() {
    return fieldValue;
  }

  public void setFieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallGenotypeMetadata callGenotypeMetadata = (CallGenotypeMetadata) o;
    return Objects.equals(this.dataType, callGenotypeMetadata.dataType) &&
        Objects.equals(this.fieldAbbreviation, callGenotypeMetadata.fieldAbbreviation) &&
        Objects.equals(this.fieldName, callGenotypeMetadata.fieldName) &&
        Objects.equals(this.fieldValue, callGenotypeMetadata.fieldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, fieldAbbreviation, fieldName, fieldValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallGenotypeMetadata {\n");
    
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    fieldAbbreviation: ").append(toIndentedString(fieldAbbreviation)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
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
