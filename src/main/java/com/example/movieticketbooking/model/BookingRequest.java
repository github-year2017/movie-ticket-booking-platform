package com.example.movieticketbooking.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * BookingRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-01T12:51:04.268344+05:30[Asia/Kolkata]")
public class BookingRequest {

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

  public BookingRequest movieId(String movieId) {
    this.movieId = movieId;
    return this;
  }

  /**
   * Get movieId
   * @return movieId
  */
  @NotNull 
  @Schema(name = "movie_id", required = true)
  public String getMovieId() {
    return movieId;
  }

  public void setMovieId(String movieId) {
    this.movieId = movieId;
  }

  public BookingRequest theatreId(String theatreId) {
    this.theatreId = theatreId;
    return this;
  }

  /**
   * Get theatreId
   * @return theatreId
  */
  @NotNull 
  @Schema(name = "theatre_id", required = true)
  public String getTheatreId() {
    return theatreId;
  }

  public void setTheatreId(String theatreId) {
    this.theatreId = theatreId;
  }

  public BookingRequest showTime(String showTime) {
    this.showTime = showTime;
    return this;
  }

  /**
   * Get showTime
   * @return showTime
  */
  @NotNull 
  @Schema(name = "show_time", required = true)
  public String getShowTime() {
    return showTime;
  }

  public void setShowTime(String showTime) {
    this.showTime = showTime;
  }

  public BookingRequest date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @NotNull @Valid 
  @Schema(name = "date", required = true)
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public BookingRequest seats(List<String> seats) {
    this.seats = seats;
    return this;
  }

  public BookingRequest addSeatsItem(String seatsItem) {
    this.seats.add(seatsItem);
    return this;
  }

  /**
   * Get seats
   * @return seats
  */
  @NotNull 
  @Schema(name = "seats", required = true)
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
    BookingRequest bookingRequest = (BookingRequest) o;
    return Objects.equals(this.movieId, bookingRequest.movieId) &&
        Objects.equals(this.theatreId, bookingRequest.theatreId) &&
        Objects.equals(this.showTime, bookingRequest.showTime) &&
        Objects.equals(this.date, bookingRequest.date) &&
        Objects.equals(this.seats, bookingRequest.seats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movieId, theatreId, showTime, date, seats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingRequest {\n");
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

