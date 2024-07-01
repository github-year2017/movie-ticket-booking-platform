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
 * BookingResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-01T12:51:04.268344+05:30[Asia/Kolkata]")
public class BookingResponse {

  @JsonProperty("booking_id")
  private String bookingId;

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
  private List<String> seats = null;

  public BookingResponse bookingId(String bookingId) {
    this.bookingId = bookingId;
    return this;
  }

  /**
   * Get bookingId
   * @return bookingId
  */
  
  @Schema(name = "booking_id", required = false)
  public String getBookingId() {
    return bookingId;
  }

  public void setBookingId(String bookingId) {
    this.bookingId = bookingId;
  }

  public BookingResponse movieId(String movieId) {
    this.movieId = movieId;
    return this;
  }

  /**
   * Get movieId
   * @return movieId
  */
  
  @Schema(name = "movie_id", required = false)
  public String getMovieId() {
    return movieId;
  }

  public void setMovieId(String movieId) {
    this.movieId = movieId;
  }

  public BookingResponse theatreId(String theatreId) {
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

  public BookingResponse showTime(String showTime) {
    this.showTime = showTime;
    return this;
  }

  /**
   * Get showTime
   * @return showTime
  */
  
  @Schema(name = "show_time", required = false)
  public String getShowTime() {
    return showTime;
  }

  public void setShowTime(String showTime) {
    this.showTime = showTime;
  }

  public BookingResponse date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @Valid 
  @Schema(name = "date", required = false)
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public BookingResponse seats(List<String> seats) {
    this.seats = seats;
    return this;
  }

  public BookingResponse addSeatsItem(String seatsItem) {
    if (this.seats == null) {
      this.seats = new ArrayList<>();
    }
    this.seats.add(seatsItem);
    return this;
  }

  /**
   * Get seats
   * @return seats
  */
  
  @Schema(name = "seats", required = false)
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
    BookingResponse bookingResponse = (BookingResponse) o;
    return Objects.equals(this.bookingId, bookingResponse.bookingId) &&
        Objects.equals(this.movieId, bookingResponse.movieId) &&
        Objects.equals(this.theatreId, bookingResponse.theatreId) &&
        Objects.equals(this.showTime, bookingResponse.showTime) &&
        Objects.equals(this.date, bookingResponse.date) &&
        Objects.equals(this.seats, bookingResponse.seats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingId, movieId, theatreId, showTime, date, seats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingResponse {\n");
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
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

