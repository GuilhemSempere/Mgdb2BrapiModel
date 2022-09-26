package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AlleleMatrixResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-19T13:16:35.755Z[GMT]")


public class AlleleMatrixResponse   {
  @JsonProperty("@context")
  private Context _atContext = null;

  @JsonProperty("metadata")
  private Metadata metadata = null;

  @JsonProperty("result")
  private AlleleMatrix result = null;

  public AlleleMatrixResponse _atContext(Context _atContext) {
    this._atContext = _atContext;
    return this;
  }

  /**
   * Get _atContext
   * @return _atContext
   **/
  @Schema(description = "")
  
    @Valid
    public Context getAtContext() {
    return _atContext;
  }

  public void setAtContext(Context _atContext) {
    this._atContext = _atContext;
  }

  public AlleleMatrixResponse metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }

  public AlleleMatrixResponse result(AlleleMatrix result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AlleleMatrix getResult() {
    return result;
  }

  public void setResult(AlleleMatrix result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlleleMatrixResponse alleleMatrixResponse = (AlleleMatrixResponse) o;
    return Objects.equals(this._atContext, alleleMatrixResponse._atContext) &&
        Objects.equals(this.metadata, alleleMatrixResponse.metadata) &&
        Objects.equals(this.result, alleleMatrixResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atContext, metadata, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlleleMatrixResponse {\n");
    
    sb.append("    _atContext: ").append(toIndentedString(_atContext)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
