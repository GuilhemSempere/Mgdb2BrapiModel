package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CallsSearchRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-19T13:16:35.755Z[GMT]")
//manually removed pageToken (deprecated)

public class CallsSearchRequest   {
  @JsonProperty("callSetDbIds")
  @Valid
  private List<String> callSetDbIds = null;

  @JsonProperty("dimensionColumnAggregation")
  private AlleleMatrixSearchRequest.DimensionColumnAggregationEnum dimensionColumnAggregation = AlleleMatrixSearchRequest.DimensionColumnAggregationEnum.CALLSET;

  @JsonProperty("expandHomozygotes")
  private Boolean expandHomozygotes = null;

  @JsonProperty("page")
  private Integer page = 0;

  @JsonProperty("pageSize")
  private Integer pageSize = 1000;

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

  @JsonProperty("germplasmDbIds")
  @Valid
  private List<String> germplasmDbIds = null;

  @JsonProperty("sampleDbIds")
  @Valid
  private List<String> sampleDbIds = null;

  @JsonProperty("studyDbIds")
  @Valid
  private List<String> studyDbIds = null;

  @JsonProperty("germplasmNames")
  @Valid
  private List<String> germplasmNames = null;

  @JsonProperty("germplasmPUIs")
  @Valid
  private List<String> germplasmPUIs = null;

  public CallsSearchRequest callSetDbIds(List<String> callSetDbIds) {
    this.callSetDbIds = callSetDbIds;
    return this;
  }

  public CallsSearchRequest addCallSetDbIdsItem(String callSetDbIdsItem) {
    if (this.callSetDbIds == null) {
      this.callSetDbIds = new ArrayList<String>();
    }
    this.callSetDbIds.add(callSetDbIdsItem);
    return this;
  }

  /**
   * Override the default column aggregation granularity. When not set, the server uses the finest-grained level implied by the provided material filters.
   * Accepted values: 'callSet' (one column per CallSet, no merging), 'sample' (one column per Sample, genotypes merged by majority vote),
   * 'germplasm' (one column per Germplasm, genotypes merged by majority vote). In case of a tie, the column is treated as missing data.
   * @return dimensionColumnAggregation
   **/
  @Schema(example = "germplasm", allowableValues = {"callSet", "sample", "germplasm"}, hidden = true,
          description = "Override the default column aggregation granularity. Accepted values: 'callSet' (default, one column per CallSet), "
                  + "'sample' (one column per Sample, genotypes aggregated by majority vote), "
                  + "'germplasm' (one column per Germplasm, genotypes aggregated by majority vote). "
                  + "On a tie, the column is treated as missing data.")
  public AlleleMatrixSearchRequest.DimensionColumnAggregationEnum getDimensionColumnAggregation() {
    return dimensionColumnAggregation;
  }

  public void setDimensionColumnAggregation(AlleleMatrixSearchRequest.DimensionColumnAggregationEnum dimensionColumnAggregation) {
    this.dimensionColumnAggregation = dimensionColumnAggregation;
  }

  /**
   * A list of IDs which uniquely identify `CallSets` within the given database server
   * @return callSetDbIds
   **/
  @Schema(example = "[\"a03202ec\",\"274e4f63\"]", description = "A list of IDs which uniquely identify `CallSets` within the given database server")
  
    public List<String> getCallSetDbIds() {
    return callSetDbIds;
  }

  public void setCallSetDbIds(List<String> callSetDbIds) {
    this.callSetDbIds = callSetDbIds;
  }

  public CallsSearchRequest expandHomozygotes(Boolean expandHomozygotes) {
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

  public CallsSearchRequest page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.
   * @return page
   **/
  @Schema(example = "0", description = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.")
  
    public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public CallsSearchRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * The size of the pages to be returned. Default is `1000`.
   * @return pageSize
   **/
  @Schema(example = "1000", description = "The size of the pages to be returned. Default is `1000`.")
  
    public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public CallsSearchRequest sepPhased(String sepPhased) {
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

  public CallsSearchRequest sepUnphased(String sepUnphased) {
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

  public CallsSearchRequest unknownString(String unknownString) {
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

  public CallsSearchRequest variantDbIds(List<String> variantDbIds) {
    this.variantDbIds = variantDbIds;
    return this;
  }

  public CallsSearchRequest addVariantDbIdsItem(String variantDbIdsItem) {
    if (this.variantDbIds == null) {
      this.variantDbIds = new ArrayList<String>();
    }
    this.variantDbIds.add(variantDbIdsItem);
    return this;
  }

  /**
   * A list of IDs which uniquely identify `Variant` within the given database server
   * @return variantDbIds
   **/
  @Schema(example = "[\"bba0b258\",\"ff97d4f0\"]", description = "A list of IDs which uniquely identify `Variant` within the given database server")
  
    public List<String> getVariantDbIds() {
    return variantDbIds;
  }

  public void setVariantDbIds(List<String> variantDbIds) {
    this.variantDbIds = variantDbIds;
  }

  public CallsSearchRequest variantSetDbIds(List<String> variantSetDbIds) {
    this.variantSetDbIds = variantSetDbIds;
    return this;
  }

  public CallsSearchRequest addVariantSetDbIdsItem(String variantSetDbIdsItem) {
    if (this.variantSetDbIds == null) {
      this.variantSetDbIds = new ArrayList<String>();
    }
    this.variantSetDbIds.add(variantSetDbIdsItem);
    return this;
  }

  /**
   * A list of IDs which uniquely identify `VariantSets` within the given database server
   * @return variantSetDbIds
   **/
  @Schema(example = "[\"407c0508\",\"49e24dfc\"]", description = "A list of IDs which uniquely identify `VariantSets` within the given database server")
  
    public List<String> getVariantSetDbIds() {
    return variantSetDbIds;
  }

  public void setVariantSetDbIds(List<String> variantSetDbIds) {
    this.variantSetDbIds = variantSetDbIds;
  }

  /**
   * A list of IDs which uniquely identify `Germplasm` within the given database server
   * @return germplasmDbIds
   **/
  @Schema(example = "[\"module§individualId\"]", description = "A list of IDs which uniquely identify `Germplasm` within the given database server")

  public List<String> getGermplasmDbIds() {
    return germplasmDbIds;
  }

  public void setGermplasmDbIds(List<String> germplasmDbIds) {
    this.germplasmDbIds = germplasmDbIds;
  }

  /**
   * A list of IDs which uniquely identify `Samples` within the given database server
   * @return sampleDbIds
   **/
  @Schema(example = "[\"module§sampleId\"]", description = "A list of IDs which uniquely identify `Samples` within the given database server")

  public List<String> getSampleDbIds() {
    return sampleDbIds;
  }

  public void setSampleDbIds(List<String> sampleDbIds) {
    this.sampleDbIds = sampleDbIds;
  }

  public CallsSearchRequest studyDbIds(List<String> studyDbIds) {
    this.studyDbIds = studyDbIds;
    return this;
  }

  public CallsSearchRequest addStudyDbIdsItem(String studyDbIdsItem) {
    if (this.studyDbIds == null) {
      this.studyDbIds = new ArrayList<String>();
    }
    this.studyDbIds.add(studyDbIdsItem);
    return this;
  }

  public CallsSearchRequest germplasmPUIs(List<String> germplasmPUIs) {
    this.germplasmPUIs = germplasmPUIs;
    return this;
  }

  /**
   * A list of IDs which uniquely identify Studies within the given database server.
   * Filters the matrix across both dimensions: the row dimension is restricted to VariantSets
   * belonging to the specified studies (via VariantSet.studyDbId), and the column dimension
   * is restricted to the CallSets derived from Samples associated with those VariantSets.
   * Acts as an AND constraint alongside all other filters.
   * @return studyDbIds
   **/
  @Schema(example = "[\"module§studyId\"]",
          description = "A list of IDs which uniquely identify Studies within the given database server. "
                  + "Filters both the row dimension (via the VariantSets associated with the Study) "
                  + "and the column dimension (via the Samples associated with those VariantSets). "
                  + "Acts as an AND constraint alongside all other filters.")
  public List<String> getStudyDbIds() {
    return studyDbIds;
  }

  public void setStudyDbIds(List<String> studyDbIds) {
    this.studyDbIds = studyDbIds;
  }

  public CallsSearchRequest addGermplasmPUIsItem(String germplasmPUIsItem) {
    if (this.germplasmPUIs == null) {
      this.germplasmPUIs = new ArrayList<String>();
    }
    this.germplasmPUIs.add(germplasmPUIsItem);
    return this;
  }

  /**
   * A list of premenant unique identifiers associated with `Germplasm`
   * @return germplasmPUIs
   **/
  @Schema(example = "[\"a03202ec\",\"274e4f63\"]", description = "A list of premenant unique identifiers associated with `Germplasm`")

  public List<String> getGermplasmPUIs() {
    return germplasmPUIs;
  }

  public void setGermplasmPUIs(List<String> germplasmPUIs) {
    this.germplasmPUIs = germplasmPUIs;
  }

  public CallsSearchRequest germplasmNames(List<String> germplasmNames) {
    this.germplasmNames = germplasmNames;
    return this;
  }

  public CallsSearchRequest addGermplasmNamesItem(String germplasmNamesItem) {
    if (this.germplasmNames == null) {
      this.germplasmNames = new ArrayList<String>();
    }
    this.germplasmNames.add(germplasmNamesItem);
    return this;
  }

  /**
   * A list of human readable `Germplasm` names
   * @return germplasmNames
   **/
  @Schema(example = "[\"a03202ec\",\"274e4f63\"]", description = "A list of human readable `Germplasm` names")

  public List<String> getGermplasmNames() {
    return germplasmNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallsSearchRequest callsSearchRequest = (CallsSearchRequest) o;
    return Objects.equals(this.callSetDbIds, callsSearchRequest.callSetDbIds) &&
        Objects.equals(this.expandHomozygotes, callsSearchRequest.expandHomozygotes) &&
        Objects.equals(this.page, callsSearchRequest.page) &&
        Objects.equals(this.pageSize, callsSearchRequest.pageSize) &&
        Objects.equals(this.sepPhased, callsSearchRequest.sepPhased) &&
        Objects.equals(this.sepUnphased, callsSearchRequest.sepUnphased) &&
        Objects.equals(this.unknownString, callsSearchRequest.unknownString) &&
        Objects.equals(this.variantDbIds, callsSearchRequest.variantDbIds) &&
        Objects.equals(this.variantSetDbIds, callsSearchRequest.variantSetDbIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callSetDbIds, expandHomozygotes, page, pageSize, sepPhased, sepUnphased, unknownString, variantDbIds, variantSetDbIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallsSearchRequest {\n");
    
    sb.append("    callSetDbIds: ").append(toIndentedString(callSetDbIds)).append("\n");
    sb.append("    dimensionColumnAggregation: ").append(toIndentedString(dimensionColumnAggregation)).append("\n");
    sb.append("    expandHomozygotes: ").append(toIndentedString(expandHomozygotes)).append("\n");
    sb.append("    germplasmDbIds: ").append(toIndentedString(germplasmDbIds)).append("\n");
    sb.append("    germplasmNames: ").append(toIndentedString(germplasmNames)).append("\n");
    sb.append("    germplasmPUIs: ").append(toIndentedString(germplasmPUIs)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    sampleDbIds: ").append(toIndentedString(sampleDbIds)).append("\n");
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
