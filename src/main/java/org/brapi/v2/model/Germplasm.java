package org.brapi.v2.model;

import java.util.Objects;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;

/**
 * Germplasm
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-20T14:32:35.470Z[GMT]")
public class Germplasm extends GermplasmNewRequest {

    @JsonProperty("germplasmDbId")
    private String germplasmDbId = null;

    public Germplasm germplasmDbId(String germplasmDbId) {
        this.germplasmDbId = germplasmDbId;
        return this;
    }

    /**
     * The ID which uniquely identifies a germplasm within the given database
     * server
     *
     * @return germplasmDbId
  *
     */
    @Schema(example = "d4076594", requiredMode = Schema.RequiredMode.REQUIRED, description = "The ID which uniquely identifies a germplasm within the given database server")
    @NotNull

    public String getGermplasmDbId() {
        return germplasmDbId;
    }

    public void setGermplasmDbId(String germplasmDbId) {
        this.germplasmDbId = germplasmDbId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Germplasm germplasm = (Germplasm) o;
        return Objects.equals(this.germplasmDbId, germplasm.germplasmDbId)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(germplasmDbId, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Germplasm {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    germplasmDbId: ").append(toIndentedString(germplasmDbId)).append("\n");
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

    static public final HashMap<String, String> germplasmFields = new HashMap<>();

    static {
        germplasmFields.put("germplasmdbid", "germplasmDbId");
        germplasmFields.put("accessionnumber", "accessionNumber");
        germplasmFields.put("acquisitiondate", "acquisitionDate");
        germplasmFields.put("additionalinfo", "additionalInfo");
        germplasmFields.put("biologicalstatusofaccessioncode", "biologicalStatusOfAccessionCode");
        germplasmFields.put("biologicalstatusofaccessiondescription", "biologicalStatusOfAccessionDescription");
        germplasmFields.put("breedingmethoddbid", "breedingMethodDbId");
        germplasmFields.put("collection", "collection");
        germplasmFields.put("collection", "collection");
        germplasmFields.put("commoncropname", "commonCropName");
        germplasmFields.put("countryoforigincode", "countryOfOriginCode");
        germplasmFields.put("defauldisplayname", "defaultDisplayName");
        germplasmFields.put("documentationURL", "documentationURL");
        germplasmFields.put("donors", "donors");
        germplasmFields.put("externalreferences", "externalReferences");
        germplasmFields.put("genus", "genus");
        germplasmFields.put("germplasmname", "germplasmName");
        germplasmFields.put("germplasmorigin", "germplasmOrigin");
        germplasmFields.put("germplasmpui", "germplasmPUI");
        germplasmFields.put("germplasmpreprocessing", "germplasmPreprocessing");
        germplasmFields.put("institutecode", "instituteCode");
        germplasmFields.put("institutename", "instituteName");
        germplasmFields.put("pedigree", "pedigree");
        germplasmFields.put("seedsource", "seedSource");
        germplasmFields.put("seedsourcedescription", "seedSourceDescription");
        germplasmFields.put("species", "species");
        germplasmFields.put("speciesauthority", "speciesAuthority");
        germplasmFields.put("storagetypes", "storageTypes");
        germplasmFields.put("subtaxa", "subtaxa");
        germplasmFields.put("subtaxaauthority", "subtaxaAuthority");
        germplasmFields.put("synonyms", "synonyms");
        germplasmFields.put("taxonids", "taxonIds");

    }
}
