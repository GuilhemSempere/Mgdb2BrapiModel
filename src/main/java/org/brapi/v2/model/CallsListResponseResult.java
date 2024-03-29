package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CallsListResponseResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-19T13:16:35.755Z[GMT]")


public class CallsListResponseResult   {
  @JsonProperty("data")
  @Valid
  private List<Call> data = new ArrayList<Call>();

  @JsonProperty("expandHomozygotes")
  private Boolean expandHomozygotes = null;

  @JsonProperty("sepPhased")
  private String sepPhased = null;

  @JsonProperty("sepUnphased")
  private String sepUnphased = null;

  @JsonProperty("unknownString")
  private String unknownString = null;

  public CallsListResponseResult data(List<Call> data) {
    this.data = data;
    return this;
  }

  public CallsListResponseResult addDataItem(Call dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<Call> getData() {
    return data;
  }

  public void setData(List<Call> data) {
    this.data = data;
  }

  public CallsListResponseResult expandHomozygotes(Boolean expandHomozygotes) {
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

  public CallsListResponseResult sepPhased(String sepPhased) {
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

  public CallsListResponseResult sepUnphased(String sepUnphased) {
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

  public CallsListResponseResult unknownString(String unknownString) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallsListResponseResult callsListResponseResult = (CallsListResponseResult) o;
    return Objects.equals(this.data, callsListResponseResult.data) &&
        Objects.equals(this.expandHomozygotes, callsListResponseResult.expandHomozygotes) &&
        Objects.equals(this.sepPhased, callsListResponseResult.sepPhased) &&
        Objects.equals(this.sepUnphased, callsListResponseResult.sepUnphased) &&
        Objects.equals(this.unknownString, callsListResponseResult.unknownString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, expandHomozygotes, sepPhased, sepUnphased, unknownString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallsListResponseResult {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    expandHomozygotes: ").append(toIndentedString(expandHomozygotes)).append("\n");
    sb.append("    sepPhased: ").append(toIndentedString(sepPhased)).append("\n");
    sb.append("    sepUnphased: ").append(toIndentedString(sepUnphased)).append("\n");
    sb.append("    unknownString: ").append(toIndentedString(unknownString)).append("\n");
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
