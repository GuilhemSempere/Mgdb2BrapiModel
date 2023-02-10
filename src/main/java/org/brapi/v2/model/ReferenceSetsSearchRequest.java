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
 * ReferenceSetsSearchRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-08T15:25:44.115Z[GMT]")


public class ReferenceSetsSearchRequest   {
  @JsonProperty("accessions")
  @Valid
  private List<String> accessions = null;

  @JsonProperty("assemblyPUIs")
  @Valid
  private List<String> assemblyPUIs = null;

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

  @JsonProperty("md5checksums")
  @Valid
  private List<String> md5checksums = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  @JsonProperty("programDbIds")
  @Valid
  private List<String> programDbIds = null;

  @JsonProperty("programNames")
  @Valid
  private List<String> programNames = null;

  @JsonProperty("referenceSetDbIds")
  @Valid
  private List<String> referenceSetDbIds = null;

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

  public ReferenceSetsSearchRequest accessions(List<String> accessions) {
    this.accessions = accessions;
    return this;
  }

  public ReferenceSetsSearchRequest addAccessionsItem(String accessionsItem) {
    if (this.accessions == null) {
      this.accessions = new ArrayList<String>();
    }
    this.accessions.add(accessionsItem);
    return this;
  }

  /**
   * If set, return the reference sets for which the `accession` matches this string (case-sensitive, exact match).
   * @return accessions
   **/
  @Schema(example = "[\"A0009283\",\"A0006657\"]", description = "If set, return the reference sets for which the `accession` matches this string (case-sensitive, exact match).")
  
    public List<String> getAccessions() {
    return accessions;
  }

  public void setAccessions(List<String> accessions) {
    this.accessions = accessions;
  }

  public ReferenceSetsSearchRequest assemblyPUIs(List<String> assemblyPUIs) {
    this.assemblyPUIs = assemblyPUIs;
    return this;
  }

  public ReferenceSetsSearchRequest addAssemblyPUIsItem(String assemblyPUIsItem) {
    if (this.assemblyPUIs == null) {
      this.assemblyPUIs = new ArrayList<String>();
    }
    this.assemblyPUIs.add(assemblyPUIsItem);
    return this;
  }

  /**
   * If set, return the reference sets for which the `assemblyId` matches this string (case-sensitive, exact match).
   * @return assemblyPUIs
   **/
  @Schema(example = "[\"doi:10.15454/312953986E3\",\"doi:10.15454/312953986E3\"]", description = "If set, return the reference sets for which the `assemblyId` matches this string (case-sensitive, exact match).")
  
    public List<String> getAssemblyPUIs() {
    return assemblyPUIs;
  }

  public void setAssemblyPUIs(List<String> assemblyPUIs) {
    this.assemblyPUIs = assemblyPUIs;
  }

  public ReferenceSetsSearchRequest commonCropNames(List<String> commonCropNames) {
    this.commonCropNames = commonCropNames;
    return this;
  }

  public ReferenceSetsSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
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

  public ReferenceSetsSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
    this.externalReferenceIDs = externalReferenceIDs;
    return this;
  }

  public ReferenceSetsSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
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
  @Schema(example = "[\"doi:10.155454/12341234\",\"14a19841\"]", description = "**Deprecated in v2.1** Please use `externalReferenceIds`. Github issue number #460  <br>List of external reference IDs. Could be a simple strings or a URIs. (use with `externalReferenceSources` parameter)")
  
    public List<String> getExternalReferenceIDs() {
    return externalReferenceIDs;
  }

  public void setExternalReferenceIDs(List<String> externalReferenceIDs) {
    this.externalReferenceIDs = externalReferenceIDs;
  }

  public ReferenceSetsSearchRequest externalReferenceIds(List<String> externalReferenceIds) {
    this.externalReferenceIds = externalReferenceIds;
    return this;
  }

  public ReferenceSetsSearchRequest addExternalReferenceIdsItem(String externalReferenceIdsItem) {
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

  public ReferenceSetsSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
    this.externalReferenceSources = externalReferenceSources;
    return this;
  }

  public ReferenceSetsSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
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

  public ReferenceSetsSearchRequest germplasmDbIds(List<String> germplasmDbIds) {
    this.germplasmDbIds = germplasmDbIds;
    return this;
  }

  public ReferenceSetsSearchRequest addGermplasmDbIdsItem(String germplasmDbIdsItem) {
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

  public ReferenceSetsSearchRequest germplasmNames(List<String> germplasmNames) {
    this.germplasmNames = germplasmNames;
    return this;
  }

  public ReferenceSetsSearchRequest addGermplasmNamesItem(String germplasmNamesItem) {
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

  public ReferenceSetsSearchRequest md5checksums(List<String> md5checksums) {
    this.md5checksums = md5checksums;
    return this;
  }

  public ReferenceSetsSearchRequest addMd5checksumsItem(String md5checksumsItem) {
    if (this.md5checksums == null) {
      this.md5checksums = new ArrayList<String>();
    }
    this.md5checksums.add(md5checksumsItem);
    return this;
  }

  /**
   * If set, return the reference sets for which the `md5checksum` matches this string (case-sensitive, exact match).
   * @return md5checksums
   **/
  @Schema(example = "[\"c2365e900c81a89cf74d83dab60df146\"]", description = "If set, return the reference sets for which the `md5checksum` matches this string (case-sensitive, exact match).")
  
    public List<String> getMd5checksums() {
    return md5checksums;
  }

  public void setMd5checksums(List<String> md5checksums) {
    this.md5checksums = md5checksums;
  }

  public ReferenceSetsSearchRequest page(Integer page) {
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

  public ReferenceSetsSearchRequest pageSize(Integer pageSize) {
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

  public ReferenceSetsSearchRequest programDbIds(List<String> programDbIds) {
    this.programDbIds = programDbIds;
    return this;
  }

  public ReferenceSetsSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
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

  public ReferenceSetsSearchRequest programNames(List<String> programNames) {
    this.programNames = programNames;
    return this;
  }

  public ReferenceSetsSearchRequest addProgramNamesItem(String programNamesItem) {
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

  public ReferenceSetsSearchRequest referenceSetDbIds(List<String> referenceSetDbIds) {
    this.referenceSetDbIds = referenceSetDbIds;
    return this;
  }

  public ReferenceSetsSearchRequest addReferenceSetDbIdsItem(String referenceSetDbIdsItem) {
    if (this.referenceSetDbIds == null) {
      this.referenceSetDbIds = new ArrayList<String>();
    }
    this.referenceSetDbIds.add(referenceSetDbIdsItem);
    return this;
  }

  /**
   * The `ReferenceSets` to search.
   * @return referenceSetDbIds
   **/
  @Schema(example = "[\"32a19dd7\",\"2c182c18\"]", description = "The `ReferenceSets` to search.")
  
    public List<String> getReferenceSetDbIds() {
    return referenceSetDbIds;
  }

  public void setReferenceSetDbIds(List<String> referenceSetDbIds) {
    this.referenceSetDbIds = referenceSetDbIds;
  }

  public ReferenceSetsSearchRequest studyDbIds(List<String> studyDbIds) {
    this.studyDbIds = studyDbIds;
    return this;
  }

  public ReferenceSetsSearchRequest addStudyDbIdsItem(String studyDbIdsItem) {
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

  public ReferenceSetsSearchRequest studyNames(List<String> studyNames) {
    this.studyNames = studyNames;
    return this;
  }

  public ReferenceSetsSearchRequest addStudyNamesItem(String studyNamesItem) {
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

  public ReferenceSetsSearchRequest trialDbIds(List<String> trialDbIds) {
    this.trialDbIds = trialDbIds;
    return this;
  }

  public ReferenceSetsSearchRequest addTrialDbIdsItem(String trialDbIdsItem) {
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

  public ReferenceSetsSearchRequest trialNames(List<String> trialNames) {
    this.trialNames = trialNames;
    return this;
  }

  public ReferenceSetsSearchRequest addTrialNamesItem(String trialNamesItem) {
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
    ReferenceSetsSearchRequest referenceSetsSearchRequest = (ReferenceSetsSearchRequest) o;
    return Objects.equals(this.accessions, referenceSetsSearchRequest.accessions) &&
        Objects.equals(this.assemblyPUIs, referenceSetsSearchRequest.assemblyPUIs) &&
        Objects.equals(this.commonCropNames, referenceSetsSearchRequest.commonCropNames) &&
        Objects.equals(this.externalReferenceIDs, referenceSetsSearchRequest.externalReferenceIDs) &&
        Objects.equals(this.externalReferenceIds, referenceSetsSearchRequest.externalReferenceIds) &&
        Objects.equals(this.externalReferenceSources, referenceSetsSearchRequest.externalReferenceSources) &&
        Objects.equals(this.germplasmDbIds, referenceSetsSearchRequest.germplasmDbIds) &&
        Objects.equals(this.germplasmNames, referenceSetsSearchRequest.germplasmNames) &&
        Objects.equals(this.md5checksums, referenceSetsSearchRequest.md5checksums) &&
        Objects.equals(this.page, referenceSetsSearchRequest.page) &&
        Objects.equals(this.pageSize, referenceSetsSearchRequest.pageSize) &&
        Objects.equals(this.programDbIds, referenceSetsSearchRequest.programDbIds) &&
        Objects.equals(this.programNames, referenceSetsSearchRequest.programNames) &&
        Objects.equals(this.referenceSetDbIds, referenceSetsSearchRequest.referenceSetDbIds) &&
        Objects.equals(this.studyDbIds, referenceSetsSearchRequest.studyDbIds) &&
        Objects.equals(this.studyNames, referenceSetsSearchRequest.studyNames) &&
        Objects.equals(this.trialDbIds, referenceSetsSearchRequest.trialDbIds) &&
        Objects.equals(this.trialNames, referenceSetsSearchRequest.trialNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessions, assemblyPUIs, commonCropNames, externalReferenceIDs, externalReferenceIds, externalReferenceSources, germplasmDbIds, germplasmNames, md5checksums, page, pageSize, programDbIds, programNames, referenceSetDbIds, studyDbIds, studyNames, trialDbIds, trialNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceSetsSearchRequest {\n");
    
    sb.append("    accessions: ").append(toIndentedString(accessions)).append("\n");
    sb.append("    assemblyPUIs: ").append(toIndentedString(assemblyPUIs)).append("\n");
    sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
    sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
    sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
    sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
    sb.append("    germplasmDbIds: ").append(toIndentedString(germplasmDbIds)).append("\n");
    sb.append("    germplasmNames: ").append(toIndentedString(germplasmNames)).append("\n");
    sb.append("    md5checksums: ").append(toIndentedString(md5checksums)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
    sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
    sb.append("    referenceSetDbIds: ").append(toIndentedString(referenceSetDbIds)).append("\n");
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
