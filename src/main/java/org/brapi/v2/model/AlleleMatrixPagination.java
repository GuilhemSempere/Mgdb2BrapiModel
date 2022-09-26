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
 * AlleleMatrixPagination
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-19T13:16:35.755Z[GMT]")


public class AlleleMatrixPagination   {
  /**
   * The dimension of the matrix being paginated
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
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("dimension")
  private DimensionEnum dimension = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  @JsonProperty("totalCount")
  private Integer totalCount = null;

  @JsonProperty("totalPages")
  private Integer totalPages = null;

  public AlleleMatrixPagination dimension(DimensionEnum dimension) {
    this.dimension = dimension;
    return this;
  }

  /**
   * The dimension of the matrix being paginated
   * @return dimension
   **/
  @Schema(example = "VARIANTS", description = "The dimension of the matrix being paginated")
  
    public DimensionEnum getDimension() {
    return dimension;
  }

  public void setDimension(DimensionEnum dimension) {
    this.dimension = dimension;
  }

  public AlleleMatrixPagination page(Integer page) {
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

  public AlleleMatrixPagination pageSize(Integer pageSize) {
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

  public AlleleMatrixPagination totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * The total number of elements that are available on the server and match the requested query parameters.
   * @return totalCount
   **/
  @Schema(example = "10000", description = "The total number of elements that are available on the server and match the requested query parameters.")
  
    public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public AlleleMatrixPagination totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * The total number of pages of elements available on the server. This should be calculated with the following formula.  <br/>totalPages = CEILING( totalCount / requested_page_size)
   * @return totalPages
   **/
  @Schema(example = "20", description = "The total number of pages of elements available on the server. This should be calculated with the following formula.  <br/>totalPages = CEILING( totalCount / requested_page_size)")
  
    public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlleleMatrixPagination alleleMatrixPagination = (AlleleMatrixPagination) o;
    return Objects.equals(this.dimension, alleleMatrixPagination.dimension) &&
        Objects.equals(this.page, alleleMatrixPagination.page) &&
        Objects.equals(this.pageSize, alleleMatrixPagination.pageSize) &&
        Objects.equals(this.totalCount, alleleMatrixPagination.totalCount) &&
        Objects.equals(this.totalPages, alleleMatrixPagination.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimension, page, pageSize, totalCount, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlleleMatrixPagination {\n");
    
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
