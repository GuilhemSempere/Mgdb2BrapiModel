package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * AlleleMatrixSearchRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-19T13:16:35.755Z[GMT]")


public class AlleleMatrixSearchRequest   {
  @JsonProperty("callSetDbIds")
  @Valid
  private List<String> callSetDbIds = null;

  @JsonProperty("dataMatrixAbbreviations")
  @Valid
  private List<String> dataMatrixAbbreviations = null;

  @JsonProperty("dataMatrixNames")
  @Valid
  private List<String> dataMatrixNames = null;

  @JsonProperty("expandHomozygotes")
  private Boolean expandHomozygotes = null;

  @JsonProperty("germplasmDbIds")
  @Valid
  private List<String> germplasmDbIds = null;

  @JsonProperty("germplasmNames")
  @Valid
  private List<String> germplasmNames = null;

  @JsonProperty("germplasmPUIs")
  @Valid
  private List<String> germplasmPUIs = null;

  @JsonProperty("pagination")
  @Valid
  private List<AlleleMatrixSearchRequestPagination> pagination = new ArrayList();

  @JsonProperty("positionRanges")
  @Valid
  private List<String> positionRanges = null;

  @JsonProperty("preview")
  private Boolean preview = false;

  @JsonProperty("sampleDbIds")
  @Valid
  private List<String> sampleDbIds = null;

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

  public AlleleMatrixSearchRequest callSetDbIds(List<String> callSetDbIds) {
    this.callSetDbIds = callSetDbIds;
    return this;
  }

  public AlleleMatrixSearchRequest addCallSetDbIdsItem(String callSetDbIdsItem) {
    if (this.callSetDbIds == null) {
      this.callSetDbIds = new ArrayList<String>();
    }
    this.callSetDbIds.add(callSetDbIdsItem);
    return this;
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

  public AlleleMatrixSearchRequest dataMatrixAbbreviations(List<String> dataMatrixAbbreviations) {
    this.dataMatrixAbbreviations = dataMatrixAbbreviations;
    return this;
  }

  public AlleleMatrixSearchRequest addDataMatrixAbbreviationsItem(String dataMatrixAbbreviationsItem) {
    if (this.dataMatrixAbbreviations == null) {
      this.dataMatrixAbbreviations = new ArrayList<String>();
    }
    this.dataMatrixAbbreviations.add(dataMatrixAbbreviationsItem);
    return this;
  }

  /**
   * `dataMatrixAbbreviations` is a comma seperated list of abbreviations (ie 'GT', 'RD' etc). This list controls which data matrices are returned in the response.
   * @return dataMatrixAbbreviations
   **/
  @Schema(example = "[\"GT\",\"RD\"]", description = "`dataMatrixAbbreviations` is a comma seperated list of abbreviations (ie 'GT', 'RD' etc). This list controls which data matrices are returned in the response.")
  
    public List<String> getDataMatrixAbbreviations() {
    return dataMatrixAbbreviations;
  }

  public void setDataMatrixAbbreviations(List<String> dataMatrixAbbreviations) {
    this.dataMatrixAbbreviations = dataMatrixAbbreviations;
  }

  public AlleleMatrixSearchRequest dataMatrixNames(List<String> dataMatrixNames) {
    this.dataMatrixNames = dataMatrixNames;
    return this;
  }

  public AlleleMatrixSearchRequest addDataMatrixNamesItem(String dataMatrixNamesItem) {
    if (this.dataMatrixNames == null) {
      this.dataMatrixNames = new ArrayList<String>();
    }
    this.dataMatrixNames.add(dataMatrixNamesItem);
    return this;
  }

  /**
   * `dataMatrixNames` is a list of names (ie 'Genotype', 'Read Depth' etc). This list controls which data matrices are returned in the response.
   * @return dataMatrixNames
   **/
  @Schema(example = "[\"Genotype\",\"Read Depth\"]", description = "`dataMatrixNames` is a list of names (ie 'Genotype', 'Read Depth' etc). This list controls which data matrices are returned in the response.")
  
    public List<String> getDataMatrixNames() {
    return dataMatrixNames;
  }

  public void setDataMatrixNames(List<String> dataMatrixNames) {
    this.dataMatrixNames = dataMatrixNames;
  }

  public AlleleMatrixSearchRequest expandHomozygotes(Boolean expandHomozygotes) {
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

  public AlleleMatrixSearchRequest germplasmDbIds(List<String> germplasmDbIds) {
    this.germplasmDbIds = germplasmDbIds;
    return this;
  }

  public AlleleMatrixSearchRequest addGermplasmDbIdsItem(String germplasmDbIdsItem) {
    if (this.germplasmDbIds == null) {
      this.germplasmDbIds = new ArrayList<String>();
    }
    this.germplasmDbIds.add(germplasmDbIdsItem);
    return this;
  }

  /**
   * A list of IDs which uniquely identify `Germplasm` within the given database server
   * @return germplasmDbIds
   **/
  @Schema(example = "[\"a03202ec\",\"274e4f63\"]", description = "A list of IDs which uniquely identify `Germplasm` within the given database server")
  
    public List<String> getGermplasmDbIds() {
    return germplasmDbIds;
  }

  public void setGermplasmDbIds(List<String> germplasmDbIds) {
    this.germplasmDbIds = germplasmDbIds;
  }

  public AlleleMatrixSearchRequest germplasmNames(List<String> germplasmNames) {
    this.germplasmNames = germplasmNames;
    return this;
  }

  public AlleleMatrixSearchRequest addGermplasmNamesItem(String germplasmNamesItem) {
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

  public void setGermplasmNames(List<String> germplasmNames) {
    this.germplasmNames = germplasmNames;
  }

  public AlleleMatrixSearchRequest germplasmPUIs(List<String> germplasmPUIs) {
    this.germplasmPUIs = germplasmPUIs;
    return this;
  }

  public AlleleMatrixSearchRequest addGermplasmPUIsItem(String germplasmPUIsItem) {
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

  public AlleleMatrixSearchRequest pagination(List<AlleleMatrixSearchRequestPagination> pagination) {
    this.pagination = pagination;
    return this;
  }

  public AlleleMatrixSearchRequest addPaginationItem(AlleleMatrixSearchRequestPagination paginationItem) {
    if (this.pagination == null) {
      this.pagination = new ArrayList<AlleleMatrixSearchRequestPagination>();
    }
    this.pagination.add(paginationItem);
    return this;
  }

  /**
   * Pagination for the matrix
   * @return pagination
   **/
  @Schema(example = "[{\"dimension\":\"variants\",\"page\":0,\"pageSize\":500},{\"dimension\":\"callsets\",\"page\":4,\"pageSize\":1000}]", description = "Pagination for the matrix")
      @Valid
    public List<AlleleMatrixSearchRequestPagination> getPagination() {
    return pagination;
  }

  public void setPagination(List<AlleleMatrixSearchRequestPagination> pagination) {
    this.pagination = pagination;
  }

  public AlleleMatrixSearchRequest positionRanges(List<String> positionRanges) {
    this.positionRanges = positionRanges;
    return this;
  }

  public AlleleMatrixSearchRequest addPositionRangesItem(String positionRangesItem) {
    if (this.positionRanges == null) {
      this.positionRanges = new ArrayList<String>();
    }
    this.positionRanges.add(positionRangesItem);
    return this;
  }

  /**
   * The postion range to search <br/> Uses the format \"<chrom>:<start>-<end>\" where <chrom> is the chromosome name, <start> is  the starting position of the range, and <end> is the ending position of the range
   * @return positionRanges
   **/
  @Schema(example = "[\"20:1000-35000\",\"20:87000-125000\"]", description = "The postion range to search <br/> Uses the format \"<chrom>:<start>-<end>\" where <chrom> is the chromosome name, <start> is  the starting position of the range, and <end> is the ending position of the range")
  
    public List<String> getPositionRanges() {
    return positionRanges;
  }

  public void setPositionRanges(List<String> positionRanges) {
    this.positionRanges = positionRanges;
  }

  public AlleleMatrixSearchRequest preview(Boolean preview) {
    this.preview = preview;
    return this;
  }

  /**
   * Default Value = false <br/> If 'preview' is set to true, then the server should only return the lists of 'callSetDbIds',  'variantDbIds', and 'variantSetDbIds'. The server should not return any matrix data. This is intended to be a preview and give the client a sense of how large the matrix returned will be <br/> If 'preview' is set to false or not set (default), then the server should return all the matrix data as requested.
   * @return preview
   **/
  @Schema(example = "true", description = "Default Value = false <br/> If 'preview' is set to true, then the server should only return the lists of 'callSetDbIds',  'variantDbIds', and 'variantSetDbIds'. The server should not return any matrix data. This is intended to be a preview and give the client a sense of how large the matrix returned will be <br/> If 'preview' is set to false or not set (default), then the server should return all the matrix data as requested.")
  
    public Boolean isPreview() {
    return preview;
  }

  public void setPreview(Boolean preview) {
    this.preview = preview;
  }

  public AlleleMatrixSearchRequest sampleDbIds(List<String> sampleDbIds) {
    this.sampleDbIds = sampleDbIds;
    return this;
  }

  public AlleleMatrixSearchRequest addSampleDbIdsItem(String sampleDbIdsItem) {
    if (this.sampleDbIds == null) {
      this.sampleDbIds = new ArrayList<String>();
    }
    this.sampleDbIds.add(sampleDbIdsItem);
    return this;
  }

  /**
   * A list of IDs which uniquely identify `Samples` within the given database server
   * @return sampleDbIds
   **/
  @Schema(example = "[\"a03202ec\",\"274e4f63\"]", description = "A list of IDs which uniquely identify `Samples` within the given database server")
  
    public List<String> getSampleDbIds() {
    return sampleDbIds;
  }

  public void setSampleDbIds(List<String> sampleDbIds) {
    this.sampleDbIds = sampleDbIds;
  }

  public AlleleMatrixSearchRequest sepPhased(String sepPhased) {
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

  public AlleleMatrixSearchRequest sepUnphased(String sepUnphased) {
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

  public AlleleMatrixSearchRequest unknownString(String unknownString) {
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

  public AlleleMatrixSearchRequest variantDbIds(List<String> variantDbIds) {
    this.variantDbIds = variantDbIds;
    return this;
  }

  public AlleleMatrixSearchRequest addVariantDbIdsItem(String variantDbIdsItem) {
    if (this.variantDbIds == null) {
      this.variantDbIds = new ArrayList<String>();
    }
    this.variantDbIds.add(variantDbIdsItem);
    return this;
  }

  /**
   * A list of IDs which uniquely identify `Variants` within the given database server
   * @return variantDbIds
   **/
  @Schema(example = "[\"bba0b258\",\"ff97d4f0\"]", description = "A list of IDs which uniquely identify `Variants` within the given database server")
  
    public List<String> getVariantDbIds() {
    return variantDbIds;
  }

  public void setVariantDbIds(List<String> variantDbIds) {
    this.variantDbIds = variantDbIds;
  }

  public AlleleMatrixSearchRequest variantSetDbIds(List<String> variantSetDbIds) {
    this.variantSetDbIds = variantSetDbIds;
    return this;
  }

  public AlleleMatrixSearchRequest addVariantSetDbIdsItem(String variantSetDbIdsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlleleMatrixSearchRequest alleleMatrixSearchRequest = (AlleleMatrixSearchRequest) o;
    return Objects.equals(this.callSetDbIds, alleleMatrixSearchRequest.callSetDbIds) &&
        Objects.equals(this.dataMatrixAbbreviations, alleleMatrixSearchRequest.dataMatrixAbbreviations) &&
        Objects.equals(this.dataMatrixNames, alleleMatrixSearchRequest.dataMatrixNames) &&
        Objects.equals(this.expandHomozygotes, alleleMatrixSearchRequest.expandHomozygotes) &&
        Objects.equals(this.germplasmDbIds, alleleMatrixSearchRequest.germplasmDbIds) &&
        Objects.equals(this.germplasmNames, alleleMatrixSearchRequest.germplasmNames) &&
        Objects.equals(this.germplasmPUIs, alleleMatrixSearchRequest.germplasmPUIs) &&
        Objects.equals(this.pagination, alleleMatrixSearchRequest.pagination) &&
        Objects.equals(this.positionRanges, alleleMatrixSearchRequest.positionRanges) &&
        Objects.equals(this.preview, alleleMatrixSearchRequest.preview) &&
        Objects.equals(this.sampleDbIds, alleleMatrixSearchRequest.sampleDbIds) &&
        Objects.equals(this.sepPhased, alleleMatrixSearchRequest.sepPhased) &&
        Objects.equals(this.sepUnphased, alleleMatrixSearchRequest.sepUnphased) &&
        Objects.equals(this.unknownString, alleleMatrixSearchRequest.unknownString) &&
        Objects.equals(this.variantDbIds, alleleMatrixSearchRequest.variantDbIds) &&
        Objects.equals(this.variantSetDbIds, alleleMatrixSearchRequest.variantSetDbIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callSetDbIds, dataMatrixAbbreviations, dataMatrixNames, expandHomozygotes, germplasmDbIds, germplasmNames, germplasmPUIs, pagination, positionRanges, preview, sampleDbIds, sepPhased, sepUnphased, unknownString, variantDbIds, variantSetDbIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlleleMatrixSearchRequest {\n");
    
    sb.append("    callSetDbIds: ").append(toIndentedString(callSetDbIds)).append("\n");
    sb.append("    dataMatrixAbbreviations: ").append(toIndentedString(dataMatrixAbbreviations)).append("\n");
    sb.append("    dataMatrixNames: ").append(toIndentedString(dataMatrixNames)).append("\n");
    sb.append("    expandHomozygotes: ").append(toIndentedString(expandHomozygotes)).append("\n");
    sb.append("    germplasmDbIds: ").append(toIndentedString(germplasmDbIds)).append("\n");
    sb.append("    germplasmNames: ").append(toIndentedString(germplasmNames)).append("\n");
    sb.append("    germplasmPUIs: ").append(toIndentedString(germplasmPUIs)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    positionRanges: ").append(toIndentedString(positionRanges)).append("\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
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
