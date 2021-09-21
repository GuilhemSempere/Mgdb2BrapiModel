package org.brapi.v2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CommonCropNamesResponseResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-19T14:22:13.640Z[GMT]")
public class CommonCropNamesResponseResult   {
  @JsonProperty("data")
  @Valid
  private List<String> data = new ArrayList<String>();

  public CommonCropNamesResponseResult data(List<String> data) {
    this.data = data;
    return this;
  }

  public CommonCropNamesResponseResult addDataItem(String dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * array of crop names available on the server
   * @return data
  **/
  @ApiModelProperty(example = "[\"Tomatillo\", \"Paw Paw\"]", required = true, value = "array of crop names available on the server")
      @NotNull

    public List<String> getData() {
    return data;
  }

  public void setData(List<String> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonCropNamesResponseResult commonCropNamesResponseResult = (CommonCropNamesResponseResult) o;
    return Objects.equals(this.data, commonCropNamesResponseResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonCropNamesResponseResult {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
