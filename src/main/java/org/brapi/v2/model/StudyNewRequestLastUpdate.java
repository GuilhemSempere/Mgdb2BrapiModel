package org.brapi.v2.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * The date and time when this study was last modified
 */
@Schema(description = "The date and time when this study was last modified")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-19T14:22:13.640Z[GMT]")
public class StudyNewRequestLastUpdate   {
  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("version")
  private String version = null;

  public StudyNewRequestLastUpdate timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public StudyNewRequestLastUpdate version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  **/
  @Schema(example = "1.2.3", description = "")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudyNewRequestLastUpdate studyNewRequestLastUpdate = (StudyNewRequestLastUpdate) o;
    return Objects.equals(this.timestamp, studyNewRequestLastUpdate.timestamp) &&
        Objects.equals(this.version, studyNewRequestLastUpdate.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudyNewRequestLastUpdate {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
