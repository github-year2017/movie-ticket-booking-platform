package com.example.movieticketbooking.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Theatre
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-01T12:51:04.268344+05:30[Asia/Kolkata]")
public class Theatre {

  @JsonProperty("theatre_id")
  private String theatreId;

  @JsonProperty("theatre_name")
  private String theatreName;

  @JsonProperty("show_times")
  @Valid
  private List<String> showTimes = null;

  public Theatre theatreId(String theatreId) {
    this.theatreId = theatreId;
    return this;
  }

  /**
   * Get theatreId
   * @return theatreId
  */
  
  @Schema(name = "theatre_id", required = false)
  public String getTheatreId() {
    return theatreId;
  }

  public void setTheatreId(String theatreId) {
    this.theatreId = theatreId;
  }

  public Theatre theatreName(String theatreName) {
    this.theatreName = theatreName;
    return this;
  }

  /**
   * Get theatreName
   * @return theatreName
  */
  
  @Schema(name = "theatre_name", required = false)
  public String getTheatreName() {
    return theatreName;
  }

  public void setTheatreName(String theatreName) {
    this.theatreName = theatreName;
  }

  public Theatre showTimes(List<String> showTimes) {
    this.showTimes = showTimes;
    return this;
  }

  public Theatre addShowTimesItem(String showTimesItem) {
    if (this.showTimes == null) {
      this.showTimes = new ArrayList<>();
    }
    this.showTimes.add(showTimesItem);
    return this;
  }

  /**
   * Get showTimes
   * @return showTimes
  */
  
  @Schema(name = "show_times", required = false)
  public List<String> getShowTimes() {
    return showTimes;
  }

  public void setShowTimes(List<String> showTimes) {
    this.showTimes = showTimes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Theatre theatre = (Theatre) o;
    return Objects.equals(this.theatreId, theatre.theatreId) &&
        Objects.equals(this.theatreName, theatre.theatreName) &&
        Objects.equals(this.showTimes, theatre.showTimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(theatreId, theatreName, showTimes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Theatre {\n");
    sb.append("    theatreId: ").append(toIndentedString(theatreId)).append("\n");
    sb.append("    theatreName: ").append(toIndentedString(theatreName)).append("\n");
    sb.append("    showTimes: ").append(toIndentedString(showTimes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

