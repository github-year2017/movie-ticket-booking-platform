package com.example.movieticketbooking.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BookingsPostRequest
 */

@JsonTypeName("_bookings_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-01T12:51:04.268344+05:30[Asia/Kolkata]")
public class BookingsPostRequest {

  @JsonProperty("movie_id")
  private String movieId;

  @JsonProperty("theatre_id")
  private String theatreId;

  @JsonProperty("show_time")
  private String showTime;

  @JsonProperty("date")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate date;

  @JsonProperty("seats")
  @Valid
  private List<String> seats = new ArrayList<>();

  public BookingsPostRequest movieId(String movieId) {
    this.movieId = movieId;
    return this;
  }

  /**
   * The ID of the movie.
   * @return movieId
  */
  @NotNull 
  @Schema(name = "movie_id", description = "The ID of the movie.", required = true)
  public String getMovieId() {
    return movieId;
  }

  public void setMovieId(String movieId) {
    this.movieId = movieId;
  }

  public BookingsPostRequest theatreId(String theatreId) {
    this.theatreId = theatreId;
    return this;
  }

  /**
   * The ID of the theatre.
   * @return theatreId
  */
  @NotNull 
  @Schema(name = "theatre_id", description = "The ID of the theatre.", required = true)
  public String getTheatreId() {
    return theatreId;
  }

  public void setTheatreId(String theatreId) {
    this.theatreId = theatreId;
  }

  public BookingsPostRequest showTime(String showTime) {
    this.showTime = showTime;
    return this;
  }

  /**
   * The selected show time ( HH:MM).
   * @return showTime
  */
  @NotNull 
  @Schema(name = "show_time", description = "The selected show time ( HH:MM).", required = true)
  public String getShowTime() {
    return showTime;
  }

  public void setShowTime(String showTime) {
    this.showTime = showTime;
  }

  public BookingsPostRequest date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * The chosen date (YYYY-MM-DD).
   * @return date
  */
  @NotNull @Valid 
  @Schema(name = "date", description = "The chosen date (YYYY-MM-DD).", required = true)
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public BookingsPostRequest seats(List<String> seats) {
    this.seats = seats;
    return this;
  }

  public BookingsPostRequest addSeatsItem(String seatsItem) {
    this.seats.add(seatsItem);
    return this;
  }

  /**
   * An array of preferred seats.
   * @return seats
  */
  @NotNull 
  @Schema(name = "seats", description = "An array of preferred seats.", required = true)
  public List<String> getSeats() {
    return seats;
  }

  public void setSeats(List<String> seats) {
    this.seats = seats;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingsPostRequest bookingsPostRequest = (BookingsPostRequest) o;
    return Objects.equals(this.movieId, bookingsPostRequest.movieId) &&
        Objects.equals(this.theatreId, bookingsPostRequest.theatreId) &&
        Objects.equals(this.showTime, bookingsPostRequest.showTime) &&
        Objects.equals(this.date, bookingsPostRequest.date) &&
        Objects.equals(this.seats, bookingsPostRequest.seats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movieId, theatreId, showTime, date, seats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingsPostRequest {\n");
    sb.append("    movieId: ").append(toIndentedString(movieId)).append("\n");
    sb.append("    theatreId: ").append(toIndentedString(theatreId)).append("\n");
    sb.append("    showTime: ").append(toIndentedString(showTime)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    seats: ").append(toIndentedString(seats)).append("\n");
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

