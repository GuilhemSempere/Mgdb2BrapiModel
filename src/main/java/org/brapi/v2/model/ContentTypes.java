package org.brapi.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ContentTypes
 */
public enum ContentTypes {
  APPLICATION_JSON("application/json"),
    TEXT_CSV("text/csv"),
    TEXT_TSV("text/tsv"),
    APPLICATION_FLAPJACK("application/flapjack");

  private String value;

  ContentTypes(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ContentTypes fromValue(String text) {
    for (ContentTypes b : ContentTypes.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}