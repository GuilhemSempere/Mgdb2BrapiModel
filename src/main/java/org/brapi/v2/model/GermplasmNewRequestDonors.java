package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * GermplasmNewRequestDonors
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-20T14:32:35.470Z[GMT]")
public class GermplasmNewRequestDonors   {
  @JsonProperty("donorAccessionNumber")
  private String donorAccessionNumber = null;

  @JsonProperty("donorInstituteCode")
  private String donorInstituteCode = null;

  @JsonProperty("germplasmPUI")
  private String germplasmPUI = null;

  public GermplasmNewRequestDonors donorAccessionNumber(String donorAccessionNumber) {
    this.donorAccessionNumber = donorAccessionNumber;
    return this;
  }

  /**
   * Get donorAccessionNumber
   * @return donorAccessionNumber
  **/
  @Schema(example = "A0000123", description = "")
  
    public String getDonorAccessionNumber() {
    return donorAccessionNumber;
  }

  public void setDonorAccessionNumber(String donorAccessionNumber) {
    this.donorAccessionNumber = donorAccessionNumber;
  }

  public GermplasmNewRequestDonors donorInstituteCode(String donorInstituteCode) {
    this.donorInstituteCode = donorInstituteCode;
    return this;
  }

  /**
   * Get donorInstituteCode
   * @return donorInstituteCode
  **/
  @Schema(example = "PER001", description = "")
  
    public String getDonorInstituteCode() {
    return donorInstituteCode;
  }

  public void setDonorInstituteCode(String donorInstituteCode) {
    this.donorInstituteCode = donorInstituteCode;
  }

  public GermplasmNewRequestDonors germplasmPUI(String germplasmPUI) {
    this.germplasmPUI = germplasmPUI;
    return this;
  }

  /**
   * Get germplasmPUI
   * @return germplasmPUI
  **/
  @Schema(example = "http://pui.per/accession/A0000003", description = "")
  
    public String getGermplasmPUI() {
    return germplasmPUI;
  }

  public void setGermplasmPUI(String germplasmPUI) {
    this.germplasmPUI = germplasmPUI;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GermplasmNewRequestDonors germplasmNewRequestDonors = (GermplasmNewRequestDonors) o;
    return Objects.equals(this.donorAccessionNumber, germplasmNewRequestDonors.donorAccessionNumber) &&
        Objects.equals(this.donorInstituteCode, germplasmNewRequestDonors.donorInstituteCode) &&
        Objects.equals(this.germplasmPUI, germplasmNewRequestDonors.germplasmPUI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(donorAccessionNumber, donorInstituteCode, germplasmPUI);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmNewRequestDonors {\n");
    
    sb.append("    donorAccessionNumber: ").append(toIndentedString(donorAccessionNumber)).append("\n");
    sb.append("    donorInstituteCode: ").append(toIndentedString(donorInstituteCode)).append("\n");
    sb.append("    germplasmPUI: ").append(toIndentedString(germplasmPUI)).append("\n");
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
