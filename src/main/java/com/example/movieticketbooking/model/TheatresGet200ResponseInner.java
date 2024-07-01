package com.example.movieticketbooking.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * TheatresGet200ResponseInner
 */

@JsonTypeName("_theatres_get_200_response_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-01T12:51:04.268344+05:30[Asia/Kolkata]")
public class TheatresGet200ResponseInner {

  @JsonProperty("theatre_id")
  private String theatreId;

  @JsonProperty("theatre_name")
  private String theatreName;

  @JsonProperty("show_times")
  @Valid
  private List<String> showTimes = null;

  public TheatresGet200ResponseInner theatreId(String theatreId) {
    this.theatreId = theatreId;
    return this;
  }

  /**
   * The ID of the theatre.
   * @return theatreId
  */
  
  @Schema(name = "theatre_id", description = "The ID of the theatre.", required = false)
  public String getTheatreId() {
    return theatreId;
  }

  public void setTheatreId(String theatreId) {
    this.theatreId = theatreId;
  }

  public TheatresGet200ResponseInner theatreName(String theatreName) {
    this.theatreName = theatreName;
    return this;
  }

  /**
   * The name of the theatre.
   * @return theatreName
  */
  
  @Schema(name = "theatre_name", description = "The name of the theatre.", required = false)
  public String getTheatreName() {
    return theatreName;
  }

  public void setTheatreName(String theatreName) {
    this.theatreName = theatreName;
  }

  public TheatresGet200ResponseInner showTimes(List<String> showTimes) {
    this.showTimes = showTimes;
    return this;
  }

  public TheatresGet200ResponseInner addShowTimesItem(String showTimesItem) {
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
    TheatresGet200ResponseInner theatresGet200ResponseInner = (TheatresGet200ResponseInner) o;
    return Objects.equals(this.theatreId, theatresGet200ResponseInner.theatreId) &&
        Objects.equals(this.theatreName, theatresGet200ResponseInner.theatreName) &&
        Objects.equals(this.showTimes, theatresGet200ResponseInner.showTimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(theatreId, theatreName, showTimes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TheatresGet200ResponseInner {\n");
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

