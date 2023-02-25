package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * This represents a type of genotyping data or metadata available in this
 * VariantSet
 */
@Schema(description = "This represents a type of genotyping data or metadata available in this VariantSet")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-19T13:16:35.755Z[GMT]")

public class VariantSetMetadataFields {

    /**
     * The type of field represented in this Genotype Field. This is intended to
     * help parse the data out of JSON.
     */
    public enum DataTypeEnum {
        STRING("string"),
        INTEGER("integer"),
        FLOAT("float"),
        BOOLEAN("boolean");

        private String value;

        DataTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DataTypeEnum fromValue(String text) {
            for (DataTypeEnum b : DataTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("dataType")
    private DataTypeEnum dataType = null;

    @JsonProperty("fieldAbbreviation")
    private String fieldAbbreviation = null;

    @JsonProperty("fieldName")
    private String fieldName = null;

    public VariantSetMetadataFields dataType(DataTypeEnum dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * The type of field represented in this Genotype Field. This is intended to
     * help parse the data out of JSON.
     *
     * @return dataType
   *
     */
    @Schema(example = "integer", description = "The type of field represented in this Genotype Field. This is intended to help parse the data out of JSON.")

    public DataTypeEnum getDataType() {
        return dataType;
    }

    public void setDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
    }

    public VariantSetMetadataFields fieldAbbreviation(String fieldAbbreviation) {
        this.fieldAbbreviation = fieldAbbreviation;
        return this;
    }

    /**
     * The abbreviated code of the field represented in this Genotype Field.
     * These codes should match the VCF standard when possible. Examples
     * include: \"GQ\", \"RD\", and \"HQ\"
     *
     * @return fieldAbbreviation
   *
     */
    @Schema(example = "GQ", description = "The abbreviated code of the field represented in this Genotype Field. These codes should match the VCF standard when possible. Examples include: \"GQ\", \"RD\", and \"HQ\"")

    public String getFieldAbbreviation() {
        return fieldAbbreviation;
    }

    public void setFieldAbbreviation(String fieldAbbreviation) {
        this.fieldAbbreviation = fieldAbbreviation;
    }

    public VariantSetMetadataFields fieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * The name of the field represented in this Genotype Field. Examples
     * include: \"Genotype Quality\", \"Read Depth\", and \"Haplotype Quality\"
     *
     * @return fieldName
   *
     */
    @Schema(example = "Genotype Quality", description = "The name of the field represented in this Genotype Field. Examples include: \"Genotype Quality\", \"Read Depth\", and \"Haplotype Quality\"")

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VariantSetMetadataFields variantSetMetadataFields = (VariantSetMetadataFields) o;
        return Objects.equals(this.dataType, variantSetMetadataFields.dataType)
                && Objects.equals(this.fieldAbbreviation, variantSetMetadataFields.fieldAbbreviation)
                && Objects.equals(this.fieldName, variantSetMetadataFields.fieldName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataType, fieldAbbreviation, fieldName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VariantSetMetadataFields {\n");

        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    fieldAbbreviation: ").append(toIndentedString(fieldAbbreviation)).append("\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
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