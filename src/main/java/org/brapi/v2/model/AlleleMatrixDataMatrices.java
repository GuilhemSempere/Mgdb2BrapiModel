package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is a single data matrix. It could be the allele matrix or an additional layer of metadata associated with each genotype value.
 */
@Schema(description = "This is a single data matrix. It could be the allele matrix or an additional layer of metadata associated with each genotype value.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-19T13:16:35.755Z[GMT]")


public class AlleleMatrixDataMatrices   {
  @JsonProperty("dataMatrix")
  @Valid
  private List<List<String>> dataMatrix = null;

  @JsonProperty("dataMatrixAbbreviation")
  private String dataMatrixAbbreviation = null;

  @JsonProperty("dataMatrixName")
  private String dataMatrixName = null;

  /**
   * The type of field represented in this data matrix. This is intended to help parse the data out of JSON.
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

  public AlleleMatrixDataMatrices dataMatrix(List<List<String>> dataMatrix) {
    this.dataMatrix = dataMatrix;
    return this;
  }

  public AlleleMatrixDataMatrices addDataMatrixItem(List<String> dataMatrixItem) {
    if (this.dataMatrix == null) {
      this.dataMatrix = new ArrayList<List<String>>();
    }
    this.dataMatrix.add(dataMatrixItem);
    return this;
  }

  /**
   * The two dimensional array of data, providing the allele matrix or an additional layer of metadata associated with each genotype value. Each matrix should be the same size and orientation, aligned with the \"callSetDbIds\" as columns and the \"variantDbIds\" as rows.
   * @return dataMatrix
   **/
  @Schema(example = "[[\"0|0\",\"1|0\",\"1/1\"],[\"0|0\",\"1|0\",\"1/1\"],[\"0|0\",\"1|0\",\"1/1\"]]", description = "The two dimensional array of data, providing the allele matrix or an additional layer of metadata associated with each genotype value. Each matrix should be the same size and orientation, aligned with the \"callSetDbIds\" as columns and the \"variantDbIds\" as rows.")
      @Valid
    public List<List<String>> getDataMatrix() {
    return dataMatrix;
  }

  public void setDataMatrix(List<List<String>> dataMatrix) {
    this.dataMatrix = dataMatrix;
  }

  public AlleleMatrixDataMatrices dataMatrixAbbreviation(String dataMatrixAbbreviation) {
    this.dataMatrixAbbreviation = dataMatrixAbbreviation;
    return this;
  }

  /**
   * The abbreviated code of the field represented in this data matrix. These codes should match the VCF standard when possible and the key word \"GT\" is reserved for the allele matrix. Examples of other metadata matrices include: \"GQ\", \"RD\", and \"HQ\" <br> This maps to a FORMAT field in the VCF file standard.
   * @return dataMatrixAbbreviation
   **/
  @Schema(example = "GT", description = "The abbreviated code of the field represented in this data matrix. These codes should match the VCF standard when possible and the key word \"GT\" is reserved for the allele matrix. Examples of other metadata matrices include: \"GQ\", \"RD\", and \"HQ\" <br> This maps to a FORMAT field in the VCF file standard.")
  
    public String getDataMatrixAbbreviation() {
    return dataMatrixAbbreviation;
  }

  public void setDataMatrixAbbreviation(String dataMatrixAbbreviation) {
    this.dataMatrixAbbreviation = dataMatrixAbbreviation;
  }

  public AlleleMatrixDataMatrices dataMatrixName(String dataMatrixName) {
    this.dataMatrixName = dataMatrixName;
    return this;
  }

  /**
   * The name of the field represented in this data matrix. The key word \"Genotype\" is reserved for the allele matrix. Examples of other metadata matrices include: \"Genotype Quality\", \"Read Depth\", and \"Haplotype Quality\" <br> This maps to a FORMAT field in the VCF file standard.
   * @return dataMatrixName
   **/
  @Schema(example = "Genotype", description = "The name of the field represented in this data matrix. The key word \"Genotype\" is reserved for the allele matrix. Examples of other metadata matrices include: \"Genotype Quality\", \"Read Depth\", and \"Haplotype Quality\" <br> This maps to a FORMAT field in the VCF file standard.")
  
    public String getDataMatrixName() {
    return dataMatrixName;
  }

  public void setDataMatrixName(String dataMatrixName) {
    this.dataMatrixName = dataMatrixName;
  }

  public AlleleMatrixDataMatrices dataType(DataTypeEnum dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * The type of field represented in this data matrix. This is intended to help parse the data out of JSON.
   * @return dataType
   **/
  @Schema(example = "string", description = "The type of field represented in this data matrix. This is intended to help parse the data out of JSON.")
  
    public DataTypeEnum getDataType() {
    return dataType;
  }

  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlleleMatrixDataMatrices alleleMatrixDataMatrices = (AlleleMatrixDataMatrices) o;
    return Objects.equals(this.dataMatrix, alleleMatrixDataMatrices.dataMatrix) &&
        Objects.equals(this.dataMatrixAbbreviation, alleleMatrixDataMatrices.dataMatrixAbbreviation) &&
        Objects.equals(this.dataMatrixName, alleleMatrixDataMatrices.dataMatrixName) &&
        Objects.equals(this.dataType, alleleMatrixDataMatrices.dataType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataMatrix, dataMatrixAbbreviation, dataMatrixName, dataType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlleleMatrixDataMatrices {\n");
    
    sb.append("    dataMatrix: ").append(toIndentedString(dataMatrix)).append("\n");
    sb.append("    dataMatrixAbbreviation: ").append(toIndentedString(dataMatrixAbbreviation)).append("\n");
    sb.append("    dataMatrixName: ").append(toIndentedString(dataMatrixName)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
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
