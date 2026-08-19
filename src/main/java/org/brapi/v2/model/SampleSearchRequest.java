package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * SampleSearchRequest
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-10T08:36:40.297Z[GMT]")


public class SampleSearchRequest   {
  @JsonProperty("commonCropNames")
  @Valid
  private List<String> commonCropNames = null;

  @JsonProperty("externalReferenceIDs")
  @Valid
  private List<String> externalReferenceIDs = null;

  @JsonProperty("externalReferenceIds")
  @Valid
  private List<String> externalReferenceIds = null;

  @JsonProperty("externalReferenceSources")
  @Valid
  private List<String> externalReferenceSources = null;

  @JsonProperty("germplasmDbIds")
  @Valid
  private List<String> germplasmDbIds = null;

  @JsonProperty("germplasmNames")
  @Valid
  private List<String> germplasmNames = null;

  @JsonProperty("observationUnitDbIds")
  @Valid
  private List<String> observationUnitDbIds = null;

  @JsonProperty("page")
  private Integer page = 0;

  @JsonProperty("pageSize")
  private Integer pageSize = 1000;

  @JsonProperty("plateDbIds")
  @Valid
  private List<String> plateDbIds = null;

  @JsonProperty("plateNames")
  @Valid
  private List<String> plateNames = null;

  @JsonProperty("programDbIds")
  @Valid
  private List<String> programDbIds = null;

  @JsonProperty("programNames")
  @Valid
  private List<String> programNames = null;

  @JsonProperty("sampleDbIds")
  @Valid
  private List<String> sampleDbIds = null;

  @JsonProperty("sampleGroupDbIds")
  @Valid
  private List<String> sampleGroupDbIds = null;

  @JsonProperty("sampleNames")
  @Valid
  private List<String> sampleNames = null;

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

  public SampleSearchRequest commonCropNames(List<String> commonCropNames) {
    this.commonCropNames = commonCropNames;
    return this;
  }

  public SampleSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
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
  @Schema(example = "[\"Tomatillo\",\"Paw Paw\"]", description = "The BrAPI Common Crop Name is the simple, generalized, widely accepted name of the organism being researched. It is most often used in multi-crop systems where digital resources need to be divided at a high level. Things like 'Maize', 'Wheat', and 'Rice' are examples of common crop names.  Use this parameter to only return results associated with the given crops.   Use `GET /commoncropnames` to find the list of available crops on a server.")
  
    public List<String> getCommonCropNames() {
    return commonCropNames;
  }

  public void setCommonCropNames(List<String> commonCropNames) {
    this.commonCropNames = commonCropNames;
  }

  public SampleSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
    this.externalReferenceIDs = externalReferenceIDs;
    return this;
  }

  public SampleSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
    if (this.externalReferenceIDs == null) {
      this.externalReferenceIDs = new ArrayList<String>();
    }
    this.externalReferenceIDs.add(externalReferenceIDsItem);
    return this;
  }

  /**
   * **Deprecated in v2.1** Please use `externalReferenceIds`. Github issue number #460   List of external reference IDs. Could be a simple strings or a URIs. (use with `externalReferenceSources` parameter)
   * @return externalReferenceIDs
   **/
  @Schema(example = "[\"doi:10.155454/12341234\",\"14a19841\"]", description = "**Deprecated in v2.1** Please use `externalReferenceIds`. Github issue number #460   List of external reference IDs. Could be a simple strings or a URIs. (use with `externalReferenceSources` parameter)")
  
    public List<String> getExternalReferenceIDs() {
    return externalReferenceIDs;
  }

  public void setExternalReferenceIDs(List<String> externalReferenceIDs) {
    this.externalReferenceIDs = externalReferenceIDs;
  }

  public SampleSearchRequest externalReferenceIds(List<String> externalReferenceIds) {
    this.externalReferenceIds = externalReferenceIds;
    return this;
  }

  public SampleSearchRequest addExternalReferenceIdsItem(String externalReferenceIdsItem) {
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
  @Schema(example = "[\"doi:10.155454/12341234\",\"14a19841\"]", description = "List of external reference IDs. Could be a simple strings or a URIs. (use with `externalReferenceSources` parameter)")
  
    public List<String> getExternalReferenceIds() {
    return externalReferenceIds;
  }

  public void setExternalReferenceIds(List<String> externalReferenceIds) {
    this.externalReferenceIds = externalReferenceIds;
  }

  public SampleSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
    this.externalReferenceSources = externalReferenceSources;
    return this;
  }

  public SampleSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
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
  @Schema(example = "[\"DOI\",\"Field App Name\"]", description = "List of identifiers for the source system or database of an external reference (use with `externalReferenceIDs` parameter)")
  
    public List<String> getExternalReferenceSources() {
    return externalReferenceSources;
  }

  public void setExternalReferenceSources(List<String> externalReferenceSources) {
    this.externalReferenceSources = externalReferenceSources;
  }

  public SampleSearchRequest germplasmDbIds(List<String> germplasmDbIds) {
    this.germplasmDbIds = germplasmDbIds;
    return this;
  }

  public SampleSearchRequest addGermplasmDbIdsItem(String germplasmDbIdsItem) {
    if (this.germplasmDbIds == null) {
      this.germplasmDbIds = new ArrayList<String>();
    }
    this.germplasmDbIds.add(germplasmDbIdsItem);
    return this;
  }

  /**
   * The ID which uniquely identifies a germplasm
   * @return germplasmDbIds
   **/
  @Schema(example = "[\"d745e1e2\",\"6dd28d74\"]", description = "The ID which uniquely identifies a germplasm")
  
    public List<String> getGermplasmDbIds() {
    return germplasmDbIds;
  }

  public void setGermplasmDbIds(List<String> germplasmDbIds) {
    this.germplasmDbIds = germplasmDbIds;
  }

  public SampleSearchRequest germplasmNames(List<String> germplasmNames) {
    this.germplasmNames = germplasmNames;
    return this;
  }

  public SampleSearchRequest addGermplasmNamesItem(String germplasmNamesItem) {
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

  public SampleSearchRequest observationUnitDbIds(List<String> observationUnitDbIds) {
    this.observationUnitDbIds = observationUnitDbIds;
    return this;
  }

  public SampleSearchRequest addObservationUnitDbIdsItem(String observationUnitDbIdsItem) {
    if (this.observationUnitDbIds == null) {
      this.observationUnitDbIds = new ArrayList<String>();
    }
    this.observationUnitDbIds.add(observationUnitDbIdsItem);
    return this;
  }

  /**
   * The ID which uniquely identifies an observation unit
   * @return observationUnitDbIds
   **/
  @Schema(example = "[\"3cd0ca36\",\"983f3b14\"]", description = "The ID which uniquely identifies an observation unit")
  
    public List<String> getObservationUnitDbIds() {
    return observationUnitDbIds;
  }

  public void setObservationUnitDbIds(List<String> observationUnitDbIds) {
    this.observationUnitDbIds = observationUnitDbIds;
  }

  public SampleSearchRequest page(Integer page) {
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

  public SampleSearchRequest pageSize(Integer pageSize) {
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

  public SampleSearchRequest plateDbIds(List<String> plateDbIds) {
    this.plateDbIds = plateDbIds;
    return this;
  }

  public SampleSearchRequest addPlateDbIdsItem(String plateDbIdsItem) {
    if (this.plateDbIds == null) {
      this.plateDbIds = new ArrayList<String>();
    }
    this.plateDbIds.add(plateDbIdsItem);
    return this;
  }

  /**
   * The ID which uniquely identifies a plate of samples
   * @return plateDbIds
   **/
  @Schema(example = "[\"0cac98b8\",\"b96125fb\"]", description = "The ID which uniquely identifies a plate of samples")
  
    public List<String> getPlateDbIds() {
    return plateDbIds;
  }

  public void setPlateDbIds(List<String> plateDbIds) {
    this.plateDbIds = plateDbIds;
  }

  public SampleSearchRequest plateNames(List<String> plateNames) {
    this.plateNames = plateNames;
    return this;
  }

  public SampleSearchRequest addPlateNamesItem(String plateNamesItem) {
    if (this.plateNames == null) {
      this.plateNames = new ArrayList<String>();
    }
    this.plateNames.add(plateNamesItem);
    return this;
  }

  /**
   * The human readable name of a plate of samples
   * @return plateNames
   **/
  @Schema(example = "[\"0cac98b8\",\"b96125fb\"]", description = "The human readable name of a plate of samples")
  
    public List<String> getPlateNames() {
    return plateNames;
  }

  public void setPlateNames(List<String> plateNames) {
    this.plateNames = plateNames;
  }

  public SampleSearchRequest programDbIds(List<String> programDbIds) {
    this.programDbIds = programDbIds;
    return this;
  }

  public SampleSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
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
  @Schema(example = "[\"8f5de35b\",\"0e2d4a13\"]", description = "A BrAPI Program represents the high level organization or group who is responsible for conducting trials and studies. Things like Breeding Programs and Funded Projects are considered BrAPI Programs.   Use this parameter to only return results associated with the given programs.   Use `GET /programs` to find the list of available programs on a server.")
  
    public List<String> getProgramDbIds() {
    return programDbIds;
  }

  public void setProgramDbIds(List<String> programDbIds) {
    this.programDbIds = programDbIds;
  }

  public SampleSearchRequest programNames(List<String> programNames) {
    this.programNames = programNames;
    return this;
  }

  public SampleSearchRequest addProgramNamesItem(String programNamesItem) {
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
  @Schema(example = "[\"Better Breeding Program\",\"Best Breeding Program\"]", description = "Use this parameter to only return results associated with the given program names. Program names are not required to be unique.  Use `GET /programs` to find the list of available programs on a server.")
  
    public List<String> getProgramNames() {
    return programNames;
  }

  public void setProgramNames(List<String> programNames) {
    this.programNames = programNames;
  }

  public SampleSearchRequest sampleDbIds(List<String> sampleDbIds) {
    this.sampleDbIds = sampleDbIds;
    return this;
  }

  public SampleSearchRequest addSampleDbIdsItem(String sampleDbIdsItem) {
    if (this.sampleDbIds == null) {
      this.sampleDbIds = new ArrayList<String>();
    }
    this.sampleDbIds.add(sampleDbIdsItem);
    return this;
  }

  /**
   * The ID which uniquely identifies a sample
   * @return sampleDbIds
   **/
  @Schema(example = "[\"3bece2ca\",\"dd286cc6\"]", description = "The ID which uniquely identifies a sample")
  
    public List<String> getSampleDbIds() {
    return sampleDbIds;
  }

  public void setSampleDbIds(List<String> sampleDbIds) {
    this.sampleDbIds = sampleDbIds;
  }

  public SampleSearchRequest sampleGroupDbIds(List<String> sampleGroupDbIds) {
    this.sampleGroupDbIds = sampleGroupDbIds;
    return this;
  }

  public SampleSearchRequest addSampleGroupDbIdsItem(String sampleGroupDbIdsItem) {
    if (this.sampleGroupDbIds == null) {
      this.sampleGroupDbIds = new ArrayList<String>();
    }
    this.sampleGroupDbIds.add(sampleGroupDbIdsItem);
    return this;
  }

  /**
   * The unique identifier for a group of related Samples
   * @return sampleGroupDbIds
   **/
  @Schema(example = "[\"45e1e2d7\",\"6cc6dd28\"]", description = "The unique identifier for a group of related Samples")
  
    public List<String> getSampleGroupDbIds() {
    return sampleGroupDbIds;
  }

  public void setSampleGroupDbIds(List<String> sampleGroupDbIds) {
    this.sampleGroupDbIds = sampleGroupDbIds;
  }

  public SampleSearchRequest sampleNames(List<String> sampleNames) {
    this.sampleNames = sampleNames;
    return this;
  }

  public SampleSearchRequest addSampleNamesItem(String sampleNamesItem) {
    if (this.sampleNames == null) {
      this.sampleNames = new ArrayList<String>();
    }
    this.sampleNames.add(sampleNamesItem);
    return this;
  }

  /**
   * The human readable name of the sample
   * @return sampleNames
   **/
  @Schema(example = "[\"SA_111\",\"SA_222\"]", description = "The human readable name of the sample")
  
    public List<String> getSampleNames() {
    return sampleNames;
  }

  public void setSampleNames(List<String> sampleNames) {
    this.sampleNames = sampleNames;
  }

  public SampleSearchRequest studyDbIds(List<String> studyDbIds) {
    this.studyDbIds = studyDbIds;
    return this;
  }

  public SampleSearchRequest addStudyDbIdsItem(String studyDbIdsItem) {
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
  @Schema(example = "[\"cf6c4bd4\",\"691e69d6\"]", description = "List of study identifiers to search for")
  
    public List<String> getStudyDbIds() {
    return studyDbIds;
  }

  public void setStudyDbIds(List<String> studyDbIds) {
    this.studyDbIds = studyDbIds;
  }

  public SampleSearchRequest studyNames(List<String> studyNames) {
    this.studyNames = studyNames;
    return this;
  }

  public SampleSearchRequest addStudyNamesItem(String studyNamesItem) {
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
  @Schema(example = "[\"The First Bob Study 2017\",\"Wheat Yield Trial 246\"]", description = "List of study names to filter search results")
  
    public List<String> getStudyNames() {
    return studyNames;
  }

  public void setStudyNames(List<String> studyNames) {
    this.studyNames = studyNames;
  }

  public SampleSearchRequest trialDbIds(List<String> trialDbIds) {
    this.trialDbIds = trialDbIds;
    return this;
  }

  public SampleSearchRequest addTrialDbIdsItem(String trialDbIdsItem) {
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
  @Schema(example = "[\"d2593dc2\",\"9431a731\"]", description = "The ID which uniquely identifies a trial to search for")
  
    public List<String> getTrialDbIds() {
    return trialDbIds;
  }

  public void setTrialDbIds(List<String> trialDbIds) {
    this.trialDbIds = trialDbIds;
  }

  public SampleSearchRequest trialNames(List<String> trialNames) {
    this.trialNames = trialNames;
    return this;
  }

  public SampleSearchRequest addTrialNamesItem(String trialNamesItem) {
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
  @Schema(example = "[\"All Yield Trials 2016\",\"Disease Resistance Study Comparison Group\"]", description = "The human readable name of a trial to search for")
  
    public List<String> getTrialNames() {
    return trialNames;
  }

  public void setTrialNames(List<String> trialNames) {
    this.trialNames = trialNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SampleSearchRequest sampleSearchRequest = (SampleSearchRequest) o;
    return Objects.equals(this.commonCropNames, sampleSearchRequest.commonCropNames) &&
        Objects.equals(this.externalReferenceIDs, sampleSearchRequest.externalReferenceIDs) &&
        Objects.equals(this.externalReferenceIds, sampleSearchRequest.externalReferenceIds) &&
        Objects.equals(this.externalReferenceSources, sampleSearchRequest.externalReferenceSources) &&
        Objects.equals(this.germplasmDbIds, sampleSearchRequest.germplasmDbIds) &&
        Objects.equals(this.germplasmNames, sampleSearchRequest.germplasmNames) &&
        Objects.equals(this.observationUnitDbIds, sampleSearchRequest.observationUnitDbIds) &&
        Objects.equals(this.page, sampleSearchRequest.page) &&
        Objects.equals(this.pageSize, sampleSearchRequest.pageSize) &&
        Objects.equals(this.plateDbIds, sampleSearchRequest.plateDbIds) &&
        Objects.equals(this.plateNames, sampleSearchRequest.plateNames) &&
        Objects.equals(this.programDbIds, sampleSearchRequest.programDbIds) &&
        Objects.equals(this.programNames, sampleSearchRequest.programNames) &&
        Objects.equals(this.sampleDbIds, sampleSearchRequest.sampleDbIds) &&
        Objects.equals(this.sampleGroupDbIds, sampleSearchRequest.sampleGroupDbIds) &&
        Objects.equals(this.sampleNames, sampleSearchRequest.sampleNames) &&
        Objects.equals(this.studyDbIds, sampleSearchRequest.studyDbIds) &&
        Objects.equals(this.studyNames, sampleSearchRequest.studyNames) &&
        Objects.equals(this.trialDbIds, sampleSearchRequest.trialDbIds) &&
        Objects.equals(this.trialNames, sampleSearchRequest.trialNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonCropNames, externalReferenceIDs, externalReferenceIds, externalReferenceSources, germplasmDbIds, germplasmNames, observationUnitDbIds, page, pageSize, plateDbIds, plateNames, programDbIds, programNames, sampleDbIds, sampleGroupDbIds, sampleNames, studyDbIds, studyNames, trialDbIds, trialNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SampleSearchRequest {\n");
    
    sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
    sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
    sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
    sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
    sb.append("    germplasmDbIds: ").append(toIndentedString(germplasmDbIds)).append("\n");
    sb.append("    germplasmNames: ").append(toIndentedString(germplasmNames)).append("\n");
    sb.append("    observationUnitDbIds: ").append(toIndentedString(observationUnitDbIds)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    plateDbIds: ").append(toIndentedString(plateDbIds)).append("\n");
    sb.append("    plateNames: ").append(toIndentedString(plateNames)).append("\n");
    sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
    sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
    sb.append("    sampleDbIds: ").append(toIndentedString(sampleDbIds)).append("\n");
    sb.append("    sampleGroupDbIds: ").append(toIndentedString(sampleGroupDbIds)).append("\n");
    sb.append("    sampleNames: ").append(toIndentedString(sampleNames)).append("\n");
    sb.append("    studyDbIds: ").append(toIndentedString(studyDbIds)).append("\n");
    sb.append("    studyNames: ").append(toIndentedString(studyNames)).append("\n");
    sb.append("    trialDbIds: ").append(toIndentedString(trialDbIds)).append("\n");
    sb.append("    trialNames: ").append(toIndentedString(trialNames)).append("\n");
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