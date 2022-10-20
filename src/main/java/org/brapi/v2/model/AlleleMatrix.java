package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * AlleleMatrix
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-19T13:16:35.755Z[GMT]")


public class AlleleMatrix   {
  @JsonProperty("callSetDbIds")
  @Valid
  private List<String> callSetDbIds = null;

  @JsonProperty("dataMatrices")
  @Valid
  private List<AlleleMatrixDataMatrices> dataMatrices = new ArrayList<>();

  @JsonProperty("expandHomozygotes")
  private Boolean expandHomozygotes = null;

  @JsonProperty("pagination")
  @Valid
  private List<AlleleMatrixPagination> pagination = null;

  @JsonProperty("sepPhased")
  private String sepPhased = null;

  @JsonProperty("sepUnphased")
  private String sepUnphased = null;

  @JsonProperty("unknownString")
  private String unknownString = null;

  @JsonProperty("variantDbIds")
  @Valid
  private List<String> variantDbIds = null;

  @JsonProperty("variantSetDbIds")
  @Valid
  private List<String> variantSetDbIds = null;

  public AlleleMatrix callSetDbIds(List<String> callSetDbIds) {
    this.callSetDbIds = callSetDbIds;
    return this;
  }

  public AlleleMatrix addCallSetDbIdsItem(String callSetDbIdsItem) {
    if (this.callSetDbIds == null) {
      this.callSetDbIds = new ArrayList<String>();
    }
    this.callSetDbIds.add(callSetDbIdsItem);
    return this;
  }

  /**
   * A list of unique identifiers for the CallSets contained in the matrix response. This array should match the ordering for columns in the matrix. A CallSet is a unique combination of a Sample and a sequencing event. CallSets often have a 1-to-1 relationship with Samples, but this is not always the case.
   * @return callSetDbIds
   **/
  @Schema(example = "[\"aca00001\",\"aca00002\",\"aca00003\"]", description = "A list of unique identifiers for the CallSets contained in the matrix response. This array should match the ordering for columns in the matrix. A CallSet is a unique combination of a Sample and a sequencing event. CallSets often have a 1-to-1 relationship with Samples, but this is not always the case.")
  
    public List<String> getCallSetDbIds() {
    return callSetDbIds;
  }

  public void setCallSetDbIds(List<String> callSetDbIds) {
    this.callSetDbIds = callSetDbIds;
  }

  public AlleleMatrix dataMatrices(List<AlleleMatrixDataMatrices> dataMatrices) {
    this.dataMatrices = dataMatrices;
    return this;
  }

  public AlleleMatrix addDataMatricesItem(AlleleMatrixDataMatrices dataMatricesItem) {
    if (this.dataMatrices == null) {
      this.dataMatrices = new ArrayList<AlleleMatrixDataMatrices>();
    }
    this.dataMatrices.add(dataMatricesItem);
    return this;
  }

  /**
   * The 'dataMatrices' are an array of matrix objects that hold the allele data and associated metadata. Each matrix should be the same size and orientation, aligned with the \"callSetDbIds\" as columns and the \"variantDbIds\" as rows.
   * @return dataMatrices
   **/
  @Schema(example = "[{\"dataMatrix\":[[\"0|0\",\"1|0\",\"1/1\"],[\"0|0\",\"1|0\",\"1/1\"],[\"0|0\",\"1|0\",\"1/1\"]],\"dataMatrixAbbreviation\":\"GT\",\"dataMatrixName\":\"Genotype\",\"dataType\":\"string\"},{\"dataMatrix\":[[\"48\",\"48\",\"43\"],[\"49\",\"3\",\"41\"],[\"21\",\"2\",\"35\"]],\"dataMatrixAbbreviation\":\"GQ\",\"dataMatrixName\":\"Genotype Quality\",\"dataType\":\"integer\"}]", description = "The 'dataMatrices' are an array of matrix objects that hold the allele data and associated metadata. Each matrix should be the same size and orientation, aligned with the \"callSetDbIds\" as columns and the \"variantDbIds\" as rows.")
      @Valid
    public List<AlleleMatrixDataMatrices> getDataMatrices() {
    return dataMatrices;
  }

  public void setDataMatrices(List<AlleleMatrixDataMatrices> dataMatrices) {
    this.dataMatrices = dataMatrices;
  }

  public AlleleMatrix expandHomozygotes(Boolean expandHomozygotes) {
    this.expandHomozygotes = expandHomozygotes;
    return this;
  }

  /**
   * Should homozygotes be expanded (true) or collapsed into a single occurrence (false)
   * @return expandHomozygotes
   **/
  @Schema(example = "true", description = "Should homozygotes be expanded (true) or collapsed into a single occurrence (false)")
  
    public Boolean isExpandHomozygotes() {
    return expandHomozygotes;
  }

  public void setExpandHomozygotes(Boolean expandHomozygotes) {
    this.expandHomozygotes = expandHomozygotes;
  }

  public AlleleMatrix pagination(List<AlleleMatrixPagination> pagination) {
    this.pagination = pagination;
    return this;
  }

  public AlleleMatrix addPaginationItem(AlleleMatrixPagination paginationItem) {
    if (this.pagination == null) {
      this.pagination = new ArrayList<AlleleMatrixPagination>();
    }
    this.pagination.add(paginationItem);
    return this;
  }

  /**
   * Pagination for the matrix
   * @return pagination
   **/
  @Schema(example = "[{\"dimension\":\"VARIANTS\",\"page\":0,\"pageSize\":500,\"totalCount\":10000,\"totalPages\":20},{\"dimension\":\"CALLSETS\",\"page\":4,\"pageSize\":1000,\"totalCount\":10000,\"totalPages\":10}]", description = "Pagination for the matrix")
      @Valid
    public List<AlleleMatrixPagination> getPagination() {
    return pagination;
  }

  public void setPagination(List<AlleleMatrixPagination> pagination) {
    this.pagination = pagination;
  }

  public AlleleMatrix sepPhased(String sepPhased) {
    this.sepPhased = sepPhased;
    return this;
  }

  /**
   * The string used as a separator for phased allele calls.
   * @return sepPhased
   **/
  @Schema(example = "|", description = "The string used as a separator for phased allele calls.")
  
    public String getSepPhased() {
    return sepPhased;
  }

  public void setSepPhased(String sepPhased) {
    this.sepPhased = sepPhased;
  }

  public AlleleMatrix sepUnphased(String sepUnphased) {
    this.sepUnphased = sepUnphased;
    return this;
  }

  /**
   * The string used as a separator for unphased allele calls.
   * @return sepUnphased
   **/
  @Schema(example = "/", description = "The string used as a separator for unphased allele calls.")
  
    public String getSepUnphased() {
    return sepUnphased;
  }

  public void setSepUnphased(String sepUnphased) {
    this.sepUnphased = sepUnphased;
  }

  public AlleleMatrix unknownString(String unknownString) {
    this.unknownString = unknownString;
    return this;
  }

  /**
   * The string used as a representation for missing data.
   * @return unknownString
   **/
  @Schema(example = ".", description = "The string used as a representation for missing data.")
  
    public String getUnknownString() {
    return unknownString;
  }

  public void setUnknownString(String unknownString) {
    this.unknownString = unknownString;
  }

  public AlleleMatrix variantDbIds(List<String> variantDbIds) {
    this.variantDbIds = variantDbIds;
    return this;
  }

  public AlleleMatrix addVariantDbIdsItem(String variantDbIdsItem) {
    if (this.variantDbIds == null) {
      this.variantDbIds = new ArrayList<String>();
    }
    this.variantDbIds.add(variantDbIdsItem);
    return this;
  }

  /**
   * A list of unique identifiers for the Variants contained in the matrix response. This array should match the ordering for rows in the matrix.
   * @return variantDbIds
   **/
  @Schema(example = "[\"feb54257\",\"feb40355\",\"feb40323\"]", description = "A list of unique identifiers for the Variants contained in the matrix response. This array should match the ordering for rows in the matrix.")
  
    public List<String> getVariantDbIds() {
    return variantDbIds;
  }

  public void setVariantDbIds(List<String> variantDbIds) {
    this.variantDbIds = variantDbIds;
  }

  public AlleleMatrix variantSetDbIds(List<String> variantSetDbIds) {
    this.variantSetDbIds = variantSetDbIds;
    return this;
  }

  public AlleleMatrix addVariantSetDbIdsItem(String variantSetDbIdsItem) {
    if (this.variantSetDbIds == null) {
      this.variantSetDbIds = new ArrayList<String>();
    }
    this.variantSetDbIds.add(variantSetDbIdsItem);
    return this;
  }

  /**
   * A list of unique identifiers for the VariantSets contained in the matrix response. A VariantSet is a data set originating from a sequencing event. Often, users will only be interested in data from a single VariantSet, but in some cases a user might be interested in a matrix with data from multiple VariantSets.
   * @return variantSetDbIds
   **/
  @Schema(example = "[\"cfde3944\",\"cfde2077\",\"cfde4424\"]", description = "A list of unique identifiers for the VariantSets contained in the matrix response. A VariantSet is a data set originating from a sequencing event. Often, users will only be interested in data from a single VariantSet, but in some cases a user might be interested in a matrix with data from multiple VariantSets.")
  
    public List<String> getVariantSetDbIds() {
    return variantSetDbIds;
  }

  public void setVariantSetDbIds(List<String> variantSetDbIds) {
    this.variantSetDbIds = variantSetDbIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlleleMatrix alleleMatrix = (AlleleMatrix) o;
    return Objects.equals(this.callSetDbIds, alleleMatrix.callSetDbIds) &&
        Objects.equals(this.dataMatrices, alleleMatrix.dataMatrices) &&
        Objects.equals(this.expandHomozygotes, alleleMatrix.expandHomozygotes) &&
        Objects.equals(this.pagination, alleleMatrix.pagination) &&
        Objects.equals(this.sepPhased, alleleMatrix.sepPhased) &&
        Objects.equals(this.sepUnphased, alleleMatrix.sepUnphased) &&
        Objects.equals(this.unknownString, alleleMatrix.unknownString) &&
        Objects.equals(this.variantDbIds, alleleMatrix.variantDbIds) &&
        Objects.equals(this.variantSetDbIds, alleleMatrix.variantSetDbIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callSetDbIds, dataMatrices, expandHomozygotes, pagination, sepPhased, sepUnphased, unknownString, variantDbIds, variantSetDbIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlleleMatrix {\n");
    
    sb.append("    callSetDbIds: ").append(toIndentedString(callSetDbIds)).append("\n");
    sb.append("    dataMatrices: ").append(toIndentedString(dataMatrices)).append("\n");
    sb.append("    expandHomozygotes: ").append(toIndentedString(expandHomozygotes)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    sepPhased: ").append(toIndentedString(sepPhased)).append("\n");
    sb.append("    sepUnphased: ").append(toIndentedString(sepUnphased)).append("\n");
    sb.append("    unknownString: ").append(toIndentedString(unknownString)).append("\n");
    sb.append("    variantDbIds: ").append(toIndentedString(variantDbIds)).append("\n");
    sb.append("    variantSetDbIds: ").append(toIndentedString(variantSetDbIds)).append("\n");
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
