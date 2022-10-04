package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AlleleMatrixSearchRequestPagination
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-19T13:16:35.755Z[GMT]")


public class AlleleMatrixSearchRequestPagination   {
  /**
   * the dimension of the matrix being paginated
   */
  public enum DimensionEnum {
    CALLSETS("CALLSETS"),
    
    VARIANTS("VARIANTS");

    private String value;

    DimensionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DimensionEnum fromValue(String text) {
      for (DimensionEnum b : DimensionEnum.values()) {
        if (String.valueOf(b.value).equalsIgnoreCase(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("dimension")
  private DimensionEnum dimension = null;

  @JsonProperty("page")
  private Integer page = 0;

  @JsonProperty("pageSize")
  private Integer pageSize = 1000;

  public AlleleMatrixSearchRequestPagination dimension(DimensionEnum dimension) {
    this.dimension = dimension;
    return this;
  }

  /**
   * the dimension of the matrix being paginated
   * @return dimension
   **/
  @Schema(example = "VARIANTS", description = "the dimension of the matrix being paginated")
  
    public DimensionEnum getDimension() {
    return dimension;
  }

  public void setDimension(DimensionEnum dimension) {
    this.dimension = dimension;
  }

  public AlleleMatrixSearchRequestPagination page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * the requested page number (zero indexed)
   * @return page
   **/
  @Schema(example = "0", description = "the requested page number (zero indexed)")
  
    public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public AlleleMatrixSearchRequestPagination pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * the maximum number of elements per page in this dimension of the matrix
   * @return pageSize
   **/
  @Schema(example = "500", description = "the maximum number of elements per page in this dimension of the matrix")
  
    public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlleleMatrixSearchRequestPagination alleleMatrixSearchRequestPagination = (AlleleMatrixSearchRequestPagination) o;
    return Objects.equals(this.dimension, alleleMatrixSearchRequestPagination.dimension) &&
        Objects.equals(this.page, alleleMatrixSearchRequestPagination.page) &&
        Objects.equals(this.pageSize, alleleMatrixSearchRequestPagination.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimension, page, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlleleMatrixSearchRequestPagination {\n");
    
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
