package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.brapi.v2.model.Context;
import org.brapi.v2.model.Metadata;
import org.brapi.v2.model.ServerInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CallsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-19T14:22:13.640Z[GMT]")
public class CallsResponse   {
  @JsonProperty("@context")
  private Context _atContext = null;

  @JsonProperty("metadata")
  private Metadata metadata = null;

  @JsonProperty("result")
  private ServerInfo result = null;

  public CallsResponse _atContext(Context _atContext) {
    this._atContext = _atContext;
    return this;
  }

  /**
   * Get _atContext
   * @return _atContext
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Context getAtContext() {
    return _atContext;
  }

  public void setAtContext(Context _atContext) {
    this._atContext = _atContext;
  }

  public CallsResponse metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }

  public CallsResponse result(ServerInfo result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public ServerInfo getResult() {
    return result;
  }

  public void setResult(ServerInfo result) {
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
    CallsResponse callsResponse = (CallsResponse) o;
    return Objects.equals(this._atContext, callsResponse._atContext) &&
        Objects.equals(this.metadata, callsResponse.metadata) &&
        Objects.equals(this.result, callsResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atContext, metadata, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallsResponse {\n");
    
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
