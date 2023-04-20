package org.brapi.v2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * VariantsSearchRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-09T10:36:40.154Z[GMT]")
public class VariantsSearchRequest   {
  @JsonProperty("callSetDbIds")
  @Valid
  private List<String> callSetDbIds = null;

  @JsonProperty("commonCropNames")
  @Valid
  private List<String> commonCropNames = null;

  @JsonProperty("end")
  private Integer end = null;

  @JsonProperty("externalReferenceIDs")
  @Valid
  private List<String> externalReferenceIDs = null;

  @JsonProperty("externalReferenceIds")
  @Valid
  private List<String> externalReferenceIds = null;

  @JsonProperty("externalReferenceSources")
  @Valid
  private List<String> externalReferenceSources = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  @JsonProperty("pageToken")
  private String pageToken = null;

  @JsonProperty("programDbIds")
  @Valid
  private List<String> programDbIds = null;

  @JsonProperty("programNames")
  @Valid
  private List<String> programNames = null;

  @JsonProperty("referenceDbId")
  private String referenceDbId = null;

  @JsonProperty("referenceDbIds")
  @Valid
  private List<String> referenceDbIds = null;

  @JsonProperty("referenceSetDbIds")
  @Valid
  private List<String> referenceSetDbIds = null;

  @JsonProperty("start")
  private Integer start = null;

  @JsonProperty("studyDbIds")
  @Valid
  private List<String> studyDbIds = null;

  @JsonProperty("studyNames")
  @Valid
  private List<String> studyNames = null;

  @JsonProperty("trialDbIds")
  @Valid
  private List<String> trialDbIds = null;

  @JsonProperty("trialNames")
  @Valid
  private List<String> trialNames = null;

  @JsonProperty("variantDbIds")
  @Valid
  private List<String> variantDbIds = null;

  @JsonProperty("variantSetDbIds")
  @Valid
  private List<String> variantSetDbIds = null;

  public VariantsSearchRequest callSetDbIds(List<String> callSetDbIds) {
    this.callSetDbIds = callSetDbIds;
    return this;
  }

  public VariantsSearchRequest addCallSetDbIdsItem(String callSetDbIdsItem) {
    if (this.callSetDbIds == null) {
      this.callSetDbIds = new ArrayList<String>();
    }
    this.callSetDbIds.add(callSetDbIdsItem);
    return this;
  }

  /**
   * **Deprecated in v2.1** Parameter unnecessary. Github issue number #474  <br/>Only return variant calls which belong to call sets with these IDs. If unspecified, return all variants and no variant call objects.
   * @return callSetDbIds
   **/
  @ApiModelProperty(example = "[\"4639fe3e\",\"b60d900b\"]", value = "**Deprecated in v2.1** Parameter unnecessary. Github issue number #474  <br/>Only return variant calls which belong to call sets with these IDs. If unspecified, return all variants and no variant call objects.")
  
    public List<String> getCallSetDbIds() {
    return callSetDbIds;
  }

  public void setCallSetDbIds(List<String> callSetDbIds) {
    this.callSetDbIds = callSetDbIds;
  }

  public VariantsSearchRequest commonCropNames(List<String> commonCropNames) {
    this.commonCropNames = commonCropNames;
    return this;
  }

  public VariantsSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
    if (this.commonCropNames == null) {
      this.commonCropNames = new ArrayList<String>();
    }
    this.commonCropNames.add(commonCropNamesItem);
    return this;
  }

  /**
   * The BrAPI Common Crop Name is the simple, generalized, widely accepted name of the organism being researched. It is most often used in multi-crop systems where digital resources need to be divided at a high level. Things like 'Maize', 'Wheat', and 'Rice' are examples of common crop names.  Use this parameter to only return results associated with the given crops.   Use `GET /commoncropnames` to find the list of available crops on a server.
   * @return commonCropNames
   **/
  @ApiModelProperty(example = "[\"Tomatillo\",\"Paw Paw\"]", value = "The BrAPI Common Crop Name is the simple, generalized, widely accepted name of the organism being researched. It is most often used in multi-crop systems where digital resources need to be divided at a high level. Things like 'Maize', 'Wheat', and 'Rice' are examples of common crop names.  Use this parameter to only return results associated with the given crops.   Use `GET /commoncropnames` to find the list of available crops on a server.")
  
    public List<String> getCommonCropNames() {
    return commonCropNames;
  }

  public void setCommonCropNames(List<String> commonCropNames) {
    this.commonCropNames = commonCropNames;
  }

  public VariantsSearchRequest end(Integer end) {
    this.end = end;
    return this;
  }

  /**
   * The end of the window (0-based, exclusive) for which overlapping variants should be returned.
   * @return end
   **/
  @ApiModelProperty(example = "1500", value = "The end of the window (0-based, exclusive) for which overlapping variants should be returned.")
  
    public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  public VariantsSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
    this.externalReferenceIDs = externalReferenceIDs;
    return this;
  }

  public VariantsSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
    if (this.externalReferenceIDs == null) {
      this.externalReferenceIDs = new ArrayList<String>();
    }
    this.externalReferenceIDs.add(externalReferenceIDsItem);
    return this;
  }

  /**
   * **Deprecated in v2.1** Please use `externalReferenceIds`. Github issue number #460  <br>List of external reference IDs. Could be a simple strings or a URIs. (use with `externalReferenceSources` parameter)
   * @return externalReferenceIDs
   **/
  @ApiModelProperty(example = "[\"doi:10.155454/12341234\",\"14a19841\"]", value = "**Deprecated in v2.1** Please use `externalReferenceIds`. Github issue number #460  <br>List of external reference IDs. Could be a simple strings or a URIs. (use with `externalReferenceSources` parameter)")
  
    public List<String> getExternalReferenceIDs() {
    return externalReferenceIDs;
  }

  public void setExternalReferenceIDs(List<String> externalReferenceIDs) {
    this.externalReferenceIDs = externalReferenceIDs;
  }

  public VariantsSearchRequest externalReferenceIds(List<String> externalReferenceIds) {
    this.externalReferenceIds = externalReferenceIds;
    return this;
  }

  public VariantsSearchRequest addExternalReferenceIdsItem(String externalReferenceIdsItem) {
    if (this.externalReferenceIds == null) {
      this.externalReferenceIds = new ArrayList<String>();
    }
    this.externalReferenceIds.add(externalReferenceIdsItem);
    return this;
  }

  /**
   * List of external reference IDs. Could be a simple strings or a URIs. (use with `externalReferenceSources` parameter)
   * @return externalReferenceIds
   **/
  @ApiModelProperty(example = "[\"doi:10.155454/12341234\",\"14a19841\"]", value = "List of external reference IDs. Could be a simple strings or a URIs. (use with `externalReferenceSources` parameter)")
  
    public List<String> getExternalReferenceIds() {
    return externalReferenceIds;
  }

  public void setExternalReferenceIds(List<String> externalReferenceIds) {
    this.externalReferenceIds = externalReferenceIds;
  }

  public VariantsSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
    this.externalReferenceSources = externalReferenceSources;
    return this;
  }

  public VariantsSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
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
  @ApiModelProperty(example = "[\"DOI\",\"Field App Name\"]", value = "List of identifiers for the source system or database of an external reference (use with `externalReferenceIDs` parameter)")
  
    public List<String> getExternalReferenceSources() {
    return externalReferenceSources;
  }

  public void setExternalReferenceSources(List<String> externalReferenceSources) {
    this.externalReferenceSources = externalReferenceSources;
  }

  public VariantsSearchRequest page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.
   * @return page
   **/
  @ApiModelProperty(example = "0", value = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.")
  
    public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public VariantsSearchRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * The size of the pages to be returned. Default is `1000`.
   * @return pageSize
   **/
  @ApiModelProperty(example = "1000", value = "The size of the pages to be returned. Default is `1000`.")
  
    public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public VariantsSearchRequest pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * **Deprecated in v2.1** Please use `page`. Github issue number #451  <br>Used to request a specific page of data to be returned. <br>Tokenized pages are for large data sets which can not be efficiently broken into indexed pages. Use the nextPageToken and prevPageToken from a prior response to construct a query and move to the next or previous page respectively. 
   * @return pageToken
   **/
  @ApiModelProperty(example = "33c27874", value = "**Deprecated in v2.1** Please use `page`. Github issue number #451  <br>Used to request a specific page of data to be returned. <br>Tokenized pages are for large data sets which can not be efficiently broken into indexed pages. Use the nextPageToken and prevPageToken from a prior response to construct a query and move to the next or previous page respectively. ")
  
    public String getPageToken() {
    return pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  public VariantsSearchRequest programDbIds(List<String> programDbIds) {
    this.programDbIds = programDbIds;
    return this;
  }

  public VariantsSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
    if (this.programDbIds == null) {
      this.programDbIds = new ArrayList<String>();
    }
    this.programDbIds.add(programDbIdsItem);
    return this;
  }

  /**
   * A BrAPI Program represents the high level organization or group who is responsible for conducting trials and studies. Things like Breeding Programs and Funded Projects are considered BrAPI Programs.   Use this parameter to only return results associated with the given programs.   Use `GET /programs` to find the list of available programs on a server.
   * @return programDbIds
   **/
  @ApiModelProperty(example = "[\"8f5de35b\",\"0e2d4a13\"]", value = "A BrAPI Program represents the high level organization or group who is responsible for conducting trials and studies. Things like Breeding Programs and Funded Projects are considered BrAPI Programs.   Use this parameter to only return results associated with the given programs.   Use `GET /programs` to find the list of available programs on a server.")
  
    public List<String> getProgramDbIds() {
    return programDbIds;
  }

  public void setProgramDbIds(List<String> programDbIds) {
    this.programDbIds = programDbIds;
  }

  public VariantsSearchRequest programNames(List<String> programNames) {
    this.programNames = programNames;
    return this;
  }

  public VariantsSearchRequest addProgramNamesItem(String programNamesItem) {
    if (this.programNames == null) {
      this.programNames = new ArrayList<String>();
    }
    this.programNames.add(programNamesItem);
    return this;
  }

  /**
   * Use this parameter to only return results associated with the given program names. Program names are not required to be unique.  Use `GET /programs` to find the list of available programs on a server.
   * @return programNames
   **/
  @ApiModelProperty(example = "[\"Better Breeding Program\",\"Best Breeding Program\"]", value = "Use this parameter to only return results associated with the given program names. Program names are not required to be unique.  Use `GET /programs` to find the list of available programs on a server.")
  
    public List<String> getProgramNames() {
    return programNames;
  }

  public void setProgramNames(List<String> programNames) {
    this.programNames = programNames;
  }

  public VariantsSearchRequest referenceDbId(String referenceDbId) {
    this.referenceDbId = referenceDbId;
    return this;
  }

  /**
   * **Deprecated in v2.1** Please use `referenceDbIds`. Github issue number #472 <br/>Only return variants on this reference.
   * @return referenceDbId
   **/
  @ApiModelProperty(example = "120a2d5c", value = "**Deprecated in v2.1** Please use `referenceDbIds`. Github issue number #472 <br/>Only return variants on this reference.")
  
    public String getReferenceDbId() {
    return referenceDbId;
  }

  public void setReferenceDbId(String referenceDbId) {
    this.referenceDbId = referenceDbId;
  }

  public VariantsSearchRequest referenceDbIds(List<String> referenceDbIds) {
    this.referenceDbIds = referenceDbIds;
    return this;
  }

  public VariantsSearchRequest addReferenceDbIdsItem(String referenceDbIdsItem) {
    if (this.referenceDbIds == null) {
      this.referenceDbIds = new ArrayList<String>();
    }
    this.referenceDbIds.add(referenceDbIdsItem);
    return this;
  }

  /**
   * The unique identifier representing a genotype `Reference`
   * @return referenceDbIds
   **/
  @ApiModelProperty(example = "[\"89ab4d17\",\"74d3b63d\"]", value = "The unique identifier representing a genotype `Reference`")
  
    public List<String> getReferenceDbIds() {
    return referenceDbIds;
  }

  public void setReferenceDbIds(List<String> referenceDbIds) {
    this.referenceDbIds = referenceDbIds;
  }

  public VariantsSearchRequest referenceSetDbIds(List<String> referenceSetDbIds) {
    this.referenceSetDbIds = referenceSetDbIds;
    return this;
  }

  public VariantsSearchRequest addReferenceSetDbIdsItem(String referenceSetDbIdsItem) {
    if (this.referenceSetDbIds == null) {
      this.referenceSetDbIds = new ArrayList<String>();
    }
    this.referenceSetDbIds.add(referenceSetDbIdsItem);
    return this;
  }

  /**
   * The unique identifier representing a genotype `ReferenceSet`
   * @return referenceSetDbIds
   **/
  @ApiModelProperty(example = "[\"d3b63d4d\",\"3b63d74b\"]", value = "The unique identifier representing a genotype `ReferenceSet`")
  
    public List<String> getReferenceSetDbIds() {
    return referenceSetDbIds;
  }

  public void setReferenceSetDbIds(List<String> referenceSetDbIds) {
    this.referenceSetDbIds = referenceSetDbIds;
  }

  public VariantsSearchRequest start(Integer start) {
    this.start = start;
    return this;
  }

  /**
   * The beginning of the window (0-based, inclusive) for which overlapping variants should be returned. Genomic positions are non-negative integers less than reference length. Requests spanning the join of circular genomes are represented as two requests one on each side of the join (position 0).
   * @return start
   **/
  @ApiModelProperty(example = "100", value = "The beginning of the window (0-based, inclusive) for which overlapping variants should be returned. Genomic positions are non-negative integers less than reference length. Requests spanning the join of circular genomes are represented as two requests one on each side of the join (position 0).")
  
    public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public VariantsSearchRequest studyDbIds(List<String> studyDbIds) {
    this.studyDbIds = studyDbIds;
    return this;
  }

  public VariantsSearchRequest addStudyDbIdsItem(String studyDbIdsItem) {
    if (this.studyDbIds == null) {
      this.studyDbIds = new ArrayList<String>();
    }
    this.studyDbIds.add(studyDbIdsItem);
    return this;
  }

  /**
   * List of study identifiers to search for
   * @return studyDbIds
   **/
  @ApiModelProperty(example = "[\"cf6c4bd4\",\"691e69d6\"]", value = "List of study identifiers to search for")
  
    public List<String> getStudyDbIds() {
    return studyDbIds;
  }

  public void setStudyDbIds(List<String> studyDbIds) {
    this.studyDbIds = studyDbIds;
  }

  public VariantsSearchRequest studyNames(List<String> studyNames) {
    this.studyNames = studyNames;
    return this;
  }

  public VariantsSearchRequest addStudyNamesItem(String studyNamesItem) {
    if (this.studyNames == null) {
      this.studyNames = new ArrayList<String>();
    }
    this.studyNames.add(studyNamesItem);
    return this;
  }

  /**
   * List of study names to filter search results
   * @return studyNames
   **/
  @ApiModelProperty(example = "[\"The First Bob Study 2017\",\"Wheat Yield Trial 246\"]", value = "List of study names to filter search results")
  
    public List<String> getStudyNames() {
    return studyNames;
  }

  public void setStudyNames(List<String> studyNames) {
    this.studyNames = studyNames;
  }

  public VariantsSearchRequest trialDbIds(List<String> trialDbIds) {
    this.trialDbIds = trialDbIds;
    return this;
  }

  public VariantsSearchRequest addTrialDbIdsItem(String trialDbIdsItem) {
    if (this.trialDbIds == null) {
      this.trialDbIds = new ArrayList<String>();
    }
    this.trialDbIds.add(trialDbIdsItem);
    return this;
  }

  /**
   * The ID which uniquely identifies a trial to search for
   * @return trialDbIds
   **/
  @ApiModelProperty(example = "[\"d2593dc2\",\"9431a731\"]", value = "The ID which uniquely identifies a trial to search for")
  
    public List<String> getTrialDbIds() {
    return trialDbIds;
  }

  public void setTrialDbIds(List<String> trialDbIds) {
    this.trialDbIds = trialDbIds;
  }

  public VariantsSearchRequest trialNames(List<String> trialNames) {
    this.trialNames = trialNames;
    return this;
  }

  public VariantsSearchRequest addTrialNamesItem(String trialNamesItem) {
    if (this.trialNames == null) {
      this.trialNames = new ArrayList<String>();
    }
    this.trialNames.add(trialNamesItem);
    return this;
  }

  /**
   * The human readable name of a trial to search for
   * @return trialNames
   **/
  @ApiModelProperty(example = "[\"All Yield Trials 2016\",\"Disease Resistance Study Comparison Group\"]", value = "The human readable name of a trial to search for")
  
    public List<String> getTrialNames() {
    return trialNames;
  }

  public void setTrialNames(List<String> trialNames) {
    this.trialNames = trialNames;
  }

  public VariantsSearchRequest variantDbIds(List<String> variantDbIds) {
    this.variantDbIds = variantDbIds;
    return this;
  }

  public VariantsSearchRequest addVariantDbIdsItem(String variantDbIdsItem) {
    if (this.variantDbIds == null) {
      this.variantDbIds = new ArrayList<String>();
    }
    this.variantDbIds.add(variantDbIdsItem);
    return this;
  }

  /**
   * A list of IDs which uniquely identify `Variants`
   * @return variantDbIds
   **/
  @ApiModelProperty(example = "[\"3b63d889\",\"ab4d174d\"]", value = "A list of IDs which uniquely identify `Variants`")
  
    public List<String> getVariantDbIds() {
    return variantDbIds;
  }

  public void setVariantDbIds(List<String> variantDbIds) {
    this.variantDbIds = variantDbIds;
  }

  public VariantsSearchRequest variantSetDbIds(List<String> variantSetDbIds) {
    this.variantSetDbIds = variantSetDbIds;
    return this;
  }

  public VariantsSearchRequest addVariantSetDbIdsItem(String variantSetDbIdsItem) {
    if (this.variantSetDbIds == null) {
      this.variantSetDbIds = new ArrayList<String>();
    }
    this.variantSetDbIds.add(variantSetDbIdsItem);
    return this;
  }

  /**
   * A list of IDs which uniquely identify `VariantSets`
   * @return variantSetDbIds
   **/
  @ApiModelProperty(example = "[\"ba63d810\",\"434d1760\"]", value = "A list of IDs which uniquely identify `VariantSets`")
  
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
    VariantsSearchRequest variantsSearchRequest = (VariantsSearchRequest) o;
    return Objects.equals(this.callSetDbIds, variantsSearchRequest.callSetDbIds) &&
        Objects.equals(this.commonCropNames, variantsSearchRequest.commonCropNames) &&
        Objects.equals(this.end, variantsSearchRequest.end) &&
        Objects.equals(this.externalReferenceIDs, variantsSearchRequest.externalReferenceIDs) &&
        Objects.equals(this.externalReferenceIds, variantsSearchRequest.externalReferenceIds) &&
        Objects.equals(this.externalReferenceSources, variantsSearchRequest.externalReferenceSources) &&
        Objects.equals(this.page, variantsSearchRequest.page) &&
        Objects.equals(this.pageSize, variantsSearchRequest.pageSize) &&
        Objects.equals(this.pageToken, variantsSearchRequest.pageToken) &&
        Objects.equals(this.programDbIds, variantsSearchRequest.programDbIds) &&
        Objects.equals(this.programNames, variantsSearchRequest.programNames) &&
        Objects.equals(this.referenceDbId, variantsSearchRequest.referenceDbId) &&
        Objects.equals(this.referenceDbIds, variantsSearchRequest.referenceDbIds) &&
        Objects.equals(this.referenceSetDbIds, variantsSearchRequest.referenceSetDbIds) &&
        Objects.equals(this.start, variantsSearchRequest.start) &&
        Objects.equals(this.studyDbIds, variantsSearchRequest.studyDbIds) &&
        Objects.equals(this.studyNames, variantsSearchRequest.studyNames) &&
        Objects.equals(this.trialDbIds, variantsSearchRequest.trialDbIds) &&
        Objects.equals(this.trialNames, variantsSearchRequest.trialNames) &&
        Objects.equals(this.variantDbIds, variantsSearchRequest.variantDbIds) &&
        Objects.equals(this.variantSetDbIds, variantsSearchRequest.variantSetDbIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callSetDbIds, commonCropNames, end, externalReferenceIDs, externalReferenceIds, externalReferenceSources, page, pageSize, pageToken, programDbIds, programNames, referenceDbId, referenceDbIds, referenceSetDbIds, start, studyDbIds, studyNames, trialDbIds, trialNames, variantDbIds, variantSetDbIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantsSearchRequest {\n");
    
    sb.append("    callSetDbIds: ").append(toIndentedString(callSetDbIds)).append("\n");
    sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
    sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
    sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
    sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
    sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
    sb.append("    referenceDbId: ").append(toIndentedString(referenceDbId)).append("\n");
    sb.append("    referenceDbIds: ").append(toIndentedString(referenceDbIds)).append("\n");
    sb.append("    referenceSetDbIds: ").append(toIndentedString(referenceSetDbIds)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    studyDbIds: ").append(toIndentedString(studyDbIds)).append("\n");
    sb.append("    studyNames: ").append(toIndentedString(studyNames)).append("\n");
    sb.append("    trialDbIds: ").append(toIndentedString(trialDbIds)).append("\n");
    sb.append("    trialNames: ").append(toIndentedString(trialNames)).append("\n");
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
