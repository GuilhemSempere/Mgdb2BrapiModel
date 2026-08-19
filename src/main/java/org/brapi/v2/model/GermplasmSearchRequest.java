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
 * GermplasmSearchRequest
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-10T08:37:47.760Z[GMT]")

public class GermplasmSearchRequest {

    @JsonProperty("accessionNumbers")
    @Valid
    private List<String> accessionNumbers = null;

    @JsonProperty("binomialNames")
    @Valid
    private List<String> binomialNames = null;

    @JsonProperty("collections")
    @Valid
    private List<String> collections = null;

    @JsonProperty("commonCropNames")
    @Valid
    private List<String> commonCropNames = null;

    @JsonProperty("externalReferenceIds")
    @Valid
    private List<String> externalReferenceIds = null;

    @JsonProperty("externalReferenceSources")
    @Valid
    private List<String> externalReferenceSources = null;

    @JsonProperty("familyCodes")
    @Valid
    private List<String> familyCodes = null;

    @JsonProperty("genus")
    @Valid
    private List<String> genus = null;

    @JsonProperty("germplasmDbIds")
    @Valid
    private List<String> germplasmDbIds = null;

    @JsonProperty("germplasmNames")
    @Valid
    private List<String> germplasmNames = null;

    @JsonProperty("germplasmPUIs")
    @Valid
    private List<String> germplasmPUIs = null;

    @JsonProperty("instituteCodes")
    @Valid
    private List<String> instituteCodes = null;

    @JsonProperty("page")
    private Integer page = 0;

    @JsonProperty("pageSize")
    private Integer pageSize = 1000;

    @JsonProperty("parentDbIds")
    @Valid
    private List<String> parentDbIds = null;

    @JsonProperty("progenyDbIds")
    @Valid
    private List<String> progenyDbIds = null;

    @JsonProperty("programDbIds")
    @Valid
    private List<String> programDbIds = null;

    @JsonProperty("programNames")
    @Valid
    private List<String> programNames = null;

    @JsonProperty("species")
    @Valid
    private List<String> species = null;

    @JsonProperty("studyDbIds")
    @Valid
    private List<String> studyDbIds = null;

    @JsonProperty("studyNames")
    @Valid
    private List<String> studyNames = null;

    @JsonProperty("synonyms")
    @Valid
    private List<String> synonyms = null;

    @JsonProperty("trialDbIds")
    @Valid
    private List<String> trialDbIds = null;

    @JsonProperty("trialNames")
    @Valid
    private List<String> trialNames = null;

    public GermplasmSearchRequest accessionNumbers(List<String> accessionNumbers) {
        this.accessionNumbers = accessionNumbers;
        return this;
    }

    public GermplasmSearchRequest addAccessionNumbersItem(String accessionNumbersItem) {
        if (this.accessionNumbers == null) {
            this.accessionNumbers = new ArrayList<String>();
        }
        this.accessionNumbers.add(accessionNumbersItem);
        return this;
    }

    /**
     * List unique identifiers for accessions within a genebank
     *
     * @return accessionNumbers
   *
     */
    @Schema(example = "[\"A0000003\",\"A0000477\"]", description = "List unique identifiers for accessions within a genebank")

    public List<String> getAccessionNumbers() {
        return accessionNumbers;
    }

    public void setAccessionNumbers(List<String> accessionNumbers) {
        this.accessionNumbers = accessionNumbers;
    }

    public GermplasmSearchRequest binomialNames(List<String> binomialNames) {
        this.binomialNames = binomialNames;
        return this;
    }

    public GermplasmSearchRequest addBinomialNamesItem(String binomialNamesItem) {
        if (this.binomialNames == null) {
            this.binomialNames = new ArrayList<String>();
        }
        this.binomialNames.add(binomialNamesItem);
        return this;
    }

    /**
     * List of the full binomial name (scientific name) to identify a germplasm
     *
     * @return binomialNames
   *
     */
    @Schema(example = "[\"Aspergillus fructus\",\"Zea mays\"]", description = "List of the full binomial name (scientific name) to identify a germplasm")

    public List<String> getBinomialNames() {
        return binomialNames;
    }

    public void setBinomialNames(List<String> binomialNames) {
        this.binomialNames = binomialNames;
    }

    public GermplasmSearchRequest collections(List<String> collections) {
        this.collections = collections;
        return this;
    }

    public GermplasmSearchRequest addCollectionsItem(String collectionsItem) {
        if (this.collections == null) {
            this.collections = new ArrayList<String>();
        }
        this.collections.add(collectionsItem);
        return this;
    }

    /**
     * A specific panel/collection/population name this germplasm belongs to.
     *
     * @return collections
   *
     */
    @Schema(example = "[\"RDP1\",\"MDP1\"]", description = "A specific panel/collection/population name this germplasm belongs to.")

    public List<String> getCollections() {
        return collections;
    }

    public void setCollections(List<String> collections) {
        this.collections = collections;
    }

    public GermplasmSearchRequest commonCropNames(List<String> commonCropNames) {
        this.commonCropNames = commonCropNames;
        return this;
    }

    public GermplasmSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
        if (this.commonCropNames == null) {
            this.commonCropNames = new ArrayList<String>();
        }
        this.commonCropNames.add(commonCropNamesItem);
        return this;
    }

    /**
     * The BrAPI Common Crop Name is the simple, generalized, widely accepted
     * name of the organism being researched. It is most often used in
     * multi-crop systems where digital resources need to be divided at a high
     * level. Things like 'Maize', 'Wheat', and 'Rice' are examples of common
     * crop names. Use this parameter to only return results associated with the
     * given crops. Use `GET /commoncropnames` to find the list of available
     * crops on a server.
     *
     * @return commonCropNames
   *
     */
    @Schema(example = "[\"Tomatillo\",\"Paw Paw\"]", description = "The BrAPI Common Crop Name is the simple, generalized, widely accepted name of the organism being researched. It is most often used in multi-crop systems where digital resources need to be divided at a high level. Things like 'Maize', 'Wheat', and 'Rice' are examples of common crop names.  Use this parameter to only return results associated with the given crops.   Use `GET /commoncropnames` to find the list of available crops on a server.")

    public List<String> getCommonCropNames() {
        return commonCropNames;
    }

    public void setCommonCropNames(List<String> commonCropNames) {
        this.commonCropNames = commonCropNames;
    }

    public GermplasmSearchRequest externalReferenceIds(List<String> externalReferenceIds) {
        this.externalReferenceIds = externalReferenceIds;
        return this;
    }

    public GermplasmSearchRequest addExternalReferenceIdsItem(String externalReferenceIdsItem) {
        if (this.externalReferenceIds == null) {
            this.externalReferenceIds = new ArrayList<String>();
        }
        this.externalReferenceIds.add(externalReferenceIdsItem);
        return this;
    }

    /**
     * List of external reference IDs. Could be a simple strings or a URIs. (use
     * with `externalReferenceSources` parameter)
     *
     * @return externalReferenceIds
   *
     */
    @Schema(example = "[\"doi:10.155454/12341234\",\"14a19841\"]", description = "List of external reference IDs. Could be a simple strings or a URIs. (use with `externalReferenceSources` parameter)")

    public List<String> getExternalReferenceIds() {
        return externalReferenceIds;
    }

    public void setExternalReferenceIds(List<String> externalReferenceIds) {
        this.externalReferenceIds = externalReferenceIds;
    }

    public GermplasmSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
        this.externalReferenceSources = externalReferenceSources;
        return this;
    }

    public GermplasmSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
        if (this.externalReferenceSources == null) {
            this.externalReferenceSources = new ArrayList<String>();
        }
        this.externalReferenceSources.add(externalReferenceSourcesItem);
        return this;
    }

    /**
     * List of identifiers for the source system or database of an external
     * reference (use with `externalReferenceIDs` parameter)
     *
     * @return externalReferenceSources
   *
     */
    @Schema(example = "[\"DOI\",\"Field App Name\"]", description = "List of identifiers for the source system or database of an external reference (use with `externalReferenceIDs` parameter)")

    public List<String> getExternalReferenceSources() {
        return externalReferenceSources;
    }

    public void setExternalReferenceSources(List<String> externalReferenceSources) {
        this.externalReferenceSources = externalReferenceSources;
    }

    public GermplasmSearchRequest familyCodes(List<String> familyCodes) {
        this.familyCodes = familyCodes;
        return this;
    }

    public GermplasmSearchRequest addFamilyCodesItem(String familyCodesItem) {
        if (this.familyCodes == null) {
            this.familyCodes = new ArrayList<String>();
        }
        this.familyCodes.add(familyCodesItem);
        return this;
    }

    /**
     * A familyCode representing the family this germplasm belongs to.
     *
     * @return familyCodes
   *
     */
    @Schema(example = "[\"fa000203\",\"fa009965\"]", description = "A familyCode representing the family this germplasm belongs to.")

    public List<String> getFamilyCodes() {
        return familyCodes;
    }

    public void setFamilyCodes(List<String> familyCodes) {
        this.familyCodes = familyCodes;
    }

    public GermplasmSearchRequest genus(List<String> genus) {
        this.genus = genus;
        return this;
    }

    public GermplasmSearchRequest addGenusItem(String genusItem) {
        if (this.genus == null) {
            this.genus = new ArrayList<String>();
        }
        this.genus.add(genusItem);
        return this;
    }

    /**
     * List of Genus names to identify germplasm
     *
     * @return genus
   *
     */
    @Schema(example = "[\"Aspergillus\",\"Zea\"]", description = "List of Genus names to identify germplasm")

    public List<String> getGenus() {
        return genus;
    }

    public void setGenus(List<String> genus) {
        this.genus = genus;
    }

    public GermplasmSearchRequest germplasmDbIds(List<String> germplasmDbIds) {
        this.germplasmDbIds = germplasmDbIds;
        return this;
    }

    public GermplasmSearchRequest addGermplasmDbIdsItem(String germplasmDbIdsItem) {
        if (this.germplasmDbIds == null) {
            this.germplasmDbIds = new ArrayList<String>();
        }
        this.germplasmDbIds.add(germplasmDbIdsItem);
        return this;
    }

    /**
     * List of IDs which uniquely identify germplasm to search for
     *
     * @return germplasmDbIds
   *
     */
    @Schema(example = "[\"e9c6edd7\",\"1b1df4a6\"]", description = "List of IDs which uniquely identify germplasm to search for")

    public List<String> getGermplasmDbIds() {
        return germplasmDbIds;
    }

    public void setGermplasmDbIds(List<String> germplasmDbIds) {
        this.germplasmDbIds = germplasmDbIds;
    }

    public GermplasmSearchRequest germplasmNames(List<String> germplasmNames) {
        this.germplasmNames = germplasmNames;
        return this;
    }

    public GermplasmSearchRequest addGermplasmNamesItem(String germplasmNamesItem) {
        if (this.germplasmNames == null) {
            this.germplasmNames = new ArrayList<String>();
        }
        this.germplasmNames.add(germplasmNamesItem);
        return this;
    }

    /**
     * List of human readable names to identify germplasm to search for
     *
     * @return germplasmNames
   *
     */
    @Schema(example = "[\"A0000003\",\"A0000477\"]", description = "List of human readable names to identify germplasm to search for")

    public List<String> getGermplasmNames() {
        return germplasmNames;
    }

    public void setGermplasmNames(List<String> germplasmNames) {
        this.germplasmNames = germplasmNames;
    }

    public GermplasmSearchRequest germplasmPUIs(List<String> germplasmPUIs) {
        this.germplasmPUIs = germplasmPUIs;
        return this;
    }

    public GermplasmSearchRequest addGermplasmPUIsItem(String germplasmPUIsItem) {
        if (this.germplasmPUIs == null) {
            this.germplasmPUIs = new ArrayList<String>();
        }
        this.germplasmPUIs.add(germplasmPUIsItem);
        return this;
    }

    /**
     * List of Permanent Unique Identifiers to identify germplasm
     *
     * @return germplasmPUIs
   *
     */
    @Schema(example = "[\"http://pui.per/accession/A0000003\",\"http://pui.per/accession/A0000477\"]", description = "List of Permanent Unique Identifiers to identify germplasm")

    public List<String> getGermplasmPUIs() {
        return germplasmPUIs;
    }

    public void setGermplasmPUIs(List<String> germplasmPUIs) {
        this.germplasmPUIs = germplasmPUIs;
    }

    public GermplasmSearchRequest instituteCodes(List<String> instituteCodes) {
        this.instituteCodes = instituteCodes;
        return this;
    }

    public GermplasmSearchRequest addInstituteCodesItem(String instituteCodesItem) {
        if (this.instituteCodes == null) {
            this.instituteCodes = new ArrayList<String>();
        }
        this.instituteCodes.add(instituteCodesItem);
        return this;
    }

    /**
     * The code for the institute that maintains the material.  <br/> MCPD (v2.1)
     * (INSTCODE) 1. FAO WIEWS code of the institute where the accession is
     * maintained. The codes consist of the 3-letter ISO 3166 country code of
     * the country where the institute is located plus a number (e.g. PER001).
     * The current set of institute codes is available from
     * http://www.fao.org/wiews. For those institutes not yet having an FAO
     * Code, or for those with \"obsolete\" codes, see \"Common formatting rules
     * (v)\".
     *
     * @return instituteCodes
   *
     */
    @Schema(example = "[\"PER001\",\"NOR001\"]", description = "The code for the institute that maintains the material.  <br/> MCPD (v2.1) (INSTCODE) 1. FAO WIEWS code of the institute where the accession is maintained. The codes consist of the 3-letter ISO 3166 country code of the country where the institute is located plus a number (e.g. PER001). The current set of institute codes is available from http://www.fao.org/wiews. For those institutes not yet having an FAO Code, or for those with \"obsolete\" codes, see \"Common formatting rules (v)\".")

    public List<String> getInstituteCodes() {
        return instituteCodes;
    }

    public void setInstituteCodes(List<String> instituteCodes) {
        this.instituteCodes = instituteCodes;
    }

    public GermplasmSearchRequest page(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * Which result page is requested. The page indexing starts at 0 (the first
     * page is 'page'= 0). Default is `0`.
     *
     * @return page
   *
     */
    @Schema(example = "0", description = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.")

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public GermplasmSearchRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * The size of the pages to be returned. Default is `1000`.
     *
     * @return pageSize
   *
     */
    @Schema(example = "1000", description = "The size of the pages to be returned. Default is `1000`.")

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public GermplasmSearchRequest parentDbIds(List<String> parentDbIds) {
        this.parentDbIds = parentDbIds;
        return this;
    }

    public GermplasmSearchRequest addParentDbIdsItem(String parentDbIdsItem) {
        if (this.parentDbIds == null) {
            this.parentDbIds = new ArrayList<String>();
        }
        this.parentDbIds.add(parentDbIdsItem);
        return this;
    }

    /**
     * Search for Germplasm with these parents
     *
     * @return parentDbIds
   *
     */
    @Schema(example = "[\"72c1001f\",\"7346c553\"]", description = "Search for Germplasm with these parents")

    public List<String> getParentDbIds() {
        return parentDbIds;
    }

    public void setParentDbIds(List<String> parentDbIds) {
        this.parentDbIds = parentDbIds;
    }

    public GermplasmSearchRequest progenyDbIds(List<String> progenyDbIds) {
        this.progenyDbIds = progenyDbIds;
        return this;
    }

    public GermplasmSearchRequest addProgenyDbIdsItem(String progenyDbIdsItem) {
        if (this.progenyDbIds == null) {
            this.progenyDbIds = new ArrayList<String>();
        }
        this.progenyDbIds.add(progenyDbIdsItem);
        return this;
    }

    /**
     * Search for Germplasm with these children
     *
     * @return progenyDbIds
   *
     */
    @Schema(example = "[\"16e16a7e\",\"ce06cf9e\"]", description = "Search for Germplasm with these children")

    public List<String> getProgenyDbIds() {
        return progenyDbIds;
    }

    public void setProgenyDbIds(List<String> progenyDbIds) {
        this.progenyDbIds = progenyDbIds;
    }

    public GermplasmSearchRequest programDbIds(List<String> programDbIds) {
        this.programDbIds = programDbIds;
        return this;
    }

    public GermplasmSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
        if (this.programDbIds == null) {
            this.programDbIds = new ArrayList<String>();
        }
        this.programDbIds.add(programDbIdsItem);
        return this;
    }

    /**
     * A BrAPI Program represents the high level organization or group who is
     * responsible for conducting trials and studies. Things like Breeding
     * Programs and Funded Projects are considered BrAPI Programs. Use this
     * parameter to only return results associated with the given programs. Use
     * `GET /programs` to find the list of available programs on a server.
     *
     * @return programDbIds
   *
     */
    @Schema(example = "[\"8f5de35b\",\"0e2d4a13\"]", description = "A BrAPI Program represents the high level organization or group who is responsible for conducting trials and studies. Things like Breeding Programs and Funded Projects are considered BrAPI Programs.   Use this parameter to only return results associated with the given programs.   Use `GET /programs` to find the list of available programs on a server.")

    public List<String> getProgramDbIds() {
        return programDbIds;
    }

    public void setProgramDbIds(List<String> programDbIds) {
        this.programDbIds = programDbIds;
    }

    public GermplasmSearchRequest programNames(List<String> programNames) {
        this.programNames = programNames;
        return this;
    }

    public GermplasmSearchRequest addProgramNamesItem(String programNamesItem) {
        if (this.programNames == null) {
            this.programNames = new ArrayList<String>();
        }
        this.programNames.add(programNamesItem);
        return this;
    }

    /**
     * Use this parameter to only return results associated with the given
     * program names. Program names are not required to be unique. Use `GET
     * /programs` to find the list of available programs on a server.
     *
     * @return programNames
   *
     */
    @Schema(example = "[\"Better Breeding Program\",\"Best Breeding Program\"]", description = "Use this parameter to only return results associated with the given program names. Program names are not required to be unique.  Use `GET /programs` to find the list of available programs on a server.")

    public List<String> getProgramNames() {
        return programNames;
    }

    public void setProgramNames(List<String> programNames) {
        this.programNames = programNames;
    }

    public GermplasmSearchRequest species(List<String> species) {
        this.species = species;
        return this;
    }

    public GermplasmSearchRequest addSpeciesItem(String speciesItem) {
        if (this.species == null) {
            this.species = new ArrayList<String>();
        }
        this.species.add(speciesItem);
        return this;
    }

    /**
     * List of Species names to identify germplasm
     *
     * @return species
   *
     */
    @Schema(example = "[\"fructus\",\"mays\"]", description = "List of Species names to identify germplasm")

    public List<String> getSpecies() {
        return species;
    }

    public void setSpecies(List<String> species) {
        this.species = species;
    }

    public GermplasmSearchRequest studyDbIds(List<String> studyDbIds) {
        this.studyDbIds = studyDbIds;
        return this;
    }

    public GermplasmSearchRequest addStudyDbIdsItem(String studyDbIdsItem) {
        if (this.studyDbIds == null) {
            this.studyDbIds = new ArrayList<String>();
        }
        this.studyDbIds.add(studyDbIdsItem);
        return this;
    }

    /**
     * List of study identifiers to search for
     *
     * @return studyDbIds
   *
     */
    @Schema(example = "[\"cf6c4bd4\",\"691e69d6\"]", description = "List of study identifiers to search for")

    public List<String> getStudyDbIds() {
        return studyDbIds;
    }

    public void setStudyDbIds(List<String> studyDbIds) {
        this.studyDbIds = studyDbIds;
    }

    public GermplasmSearchRequest studyNames(List<String> studyNames) {
        this.studyNames = studyNames;
        return this;
    }

    public GermplasmSearchRequest addStudyNamesItem(String studyNamesItem) {
        if (this.studyNames == null) {
            this.studyNames = new ArrayList<String>();
        }
        this.studyNames.add(studyNamesItem);
        return this;
    }

    /**
     * List of study names to filter search results
     *
     * @return studyNames
   *
     */
    @Schema(example = "[\"The First Bob Study 2017\",\"Wheat Yield Trial 246\"]", description = "List of study names to filter search results")

    public List<String> getStudyNames() {
        return studyNames;
    }

    public void setStudyNames(List<String> studyNames) {
        this.studyNames = studyNames;
    }

    public GermplasmSearchRequest synonyms(List<String> synonyms) {
        this.synonyms = synonyms;
        return this;
    }

    public GermplasmSearchRequest addSynonymsItem(String synonymsItem) {
        if (this.synonyms == null) {
            this.synonyms = new ArrayList<String>();
        }
        this.synonyms.add(synonymsItem);
        return this;
    }

    /**
     * List of alternative names or IDs used to reference this germplasm
     *
     * @return synonyms
   *
     */
    @Schema(example = "[\"variety_1\",\"2c38f9b6\"]", description = "List of alternative names or IDs used to reference this germplasm")

    public List<String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    public GermplasmSearchRequest trialDbIds(List<String> trialDbIds) {
        this.trialDbIds = trialDbIds;
        return this;
    }

    public GermplasmSearchRequest addTrialDbIdsItem(String trialDbIdsItem) {
        if (this.trialDbIds == null) {
            this.trialDbIds = new ArrayList<String>();
        }
        this.trialDbIds.add(trialDbIdsItem);
        return this;
    }

    /**
     * The ID which uniquely identifies a trial to search for
     *
     * @return trialDbIds
   *
     */
    @Schema(example = "[\"d2593dc2\",\"9431a731\"]", description = "The ID which uniquely identifies a trial to search for")

    public List<String> getTrialDbIds() {
        return trialDbIds;
    }

    public void setTrialDbIds(List<String> trialDbIds) {
        this.trialDbIds = trialDbIds;
    }

    public GermplasmSearchRequest trialNames(List<String> trialNames) {
        this.trialNames = trialNames;
        return this;
    }

    public GermplasmSearchRequest addTrialNamesItem(String trialNamesItem) {
        if (this.trialNames == null) {
            this.trialNames = new ArrayList<String>();
        }
        this.trialNames.add(trialNamesItem);
        return this;
    }

    /**
     * The human readable name of a trial to search for
     *
     * @return trialNames
   *
     */
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
        GermplasmSearchRequest germplasmSearchRequest = (GermplasmSearchRequest) o;
        return Objects.equals(this.accessionNumbers, germplasmSearchRequest.accessionNumbers)
                && Objects.equals(this.binomialNames, germplasmSearchRequest.binomialNames)
                && Objects.equals(this.collections, germplasmSearchRequest.collections)
                && Objects.equals(this.commonCropNames, germplasmSearchRequest.commonCropNames)
                && Objects.equals(this.externalReferenceIds, germplasmSearchRequest.externalReferenceIds)
                && Objects.equals(this.externalReferenceSources, germplasmSearchRequest.externalReferenceSources)
                && Objects.equals(this.familyCodes, germplasmSearchRequest.familyCodes)
                && Objects.equals(this.genus, germplasmSearchRequest.genus)
                && Objects.equals(this.germplasmDbIds, germplasmSearchRequest.germplasmDbIds)
                && Objects.equals(this.germplasmNames, germplasmSearchRequest.germplasmNames)
                && Objects.equals(this.germplasmPUIs, germplasmSearchRequest.germplasmPUIs)
                && Objects.equals(this.instituteCodes, germplasmSearchRequest.instituteCodes)
                && Objects.equals(this.page, germplasmSearchRequest.page)
                && Objects.equals(this.pageSize, germplasmSearchRequest.pageSize)
                && Objects.equals(this.parentDbIds, germplasmSearchRequest.parentDbIds)
                && Objects.equals(this.progenyDbIds, germplasmSearchRequest.progenyDbIds)
                && Objects.equals(this.programDbIds, germplasmSearchRequest.programDbIds)
                && Objects.equals(this.programNames, germplasmSearchRequest.programNames)
                && Objects.equals(this.species, germplasmSearchRequest.species)
                && Objects.equals(this.studyDbIds, germplasmSearchRequest.studyDbIds)
                && Objects.equals(this.studyNames, germplasmSearchRequest.studyNames)
                && Objects.equals(this.synonyms, germplasmSearchRequest.synonyms)
                && Objects.equals(this.trialDbIds, germplasmSearchRequest.trialDbIds)
                && Objects.equals(this.trialNames, germplasmSearchRequest.trialNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessionNumbers, binomialNames, collections, commonCropNames, externalReferenceIds, externalReferenceSources, familyCodes, genus, germplasmDbIds, germplasmNames, germplasmPUIs, instituteCodes, page, pageSize, parentDbIds, progenyDbIds, programDbIds, programNames, species, studyDbIds, studyNames, synonyms, trialDbIds, trialNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GermplasmSearchRequest {\n");

        sb.append("    accessionNumbers: ").append(toIndentedString(accessionNumbers)).append("\n");
        sb.append("    binomialNames: ").append(toIndentedString(binomialNames)).append("\n");
        sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
        sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
        sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
        sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
        sb.append("    familyCodes: ").append(toIndentedString(familyCodes)).append("\n");
        sb.append("    genus: ").append(toIndentedString(genus)).append("\n");
        sb.append("    germplasmDbIds: ").append(toIndentedString(germplasmDbIds)).append("\n");
        sb.append("    germplasmNames: ").append(toIndentedString(germplasmNames)).append("\n");
        sb.append("    germplasmPUIs: ").append(toIndentedString(germplasmPUIs)).append("\n");
        sb.append("    instituteCodes: ").append(toIndentedString(instituteCodes)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    parentDbIds: ").append(toIndentedString(parentDbIds)).append("\n");
        sb.append("    progenyDbIds: ").append(toIndentedString(progenyDbIds)).append("\n");
        sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
        sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
        sb.append("    species: ").append(toIndentedString(species)).append("\n");
        sb.append("    studyDbIds: ").append(toIndentedString(studyDbIds)).append("\n");
        sb.append("    studyNames: ").append(toIndentedString(studyNames)).append("\n");
        sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
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
