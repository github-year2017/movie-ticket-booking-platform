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
 * BookingsPost201Response
 */

@JsonTypeName("_bookings_post_201_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-01T12:51:04.268344+05:30[Asia/Kolkata]")
public class BookingsPost201Response {

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

  public BookingsPost201Response bookingId(String bookingId) {
    this.bookingId = bookingId;
    return this;
  }

  /**
   * The ID of the booking.
   * @return bookingId
  */
  
  @Schema(name = "booking_id", description = "The ID of the booking.", required = false)
  public String getBookingId() {
    return bookingId;
  }

  public void setBookingId(String bookingId) {
    this.bookingId = bookingId;
  }

  public BookingsPost201Response movieId(String movieId) {
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

  public BookingsPost201Response theatreId(String theatreId) {
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

  public BookingsPost201Response showTime(String showTime) {
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

  public BookingsPost201Response date(LocalDate date) {
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

  public BookingsPost201Response seats(List<String> seats) {
    this.seats = seats;
    return this;
  }

  public BookingsPost201Response addSeatsItem(String seatsItem) {
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
    BookingsPost201Response bookingsPost201Response = (BookingsPost201Response) o;
    return Objects.equals(this.bookingId, bookingsPost201Response.bookingId) &&
        Objects.equals(this.movieId, bookingsPost201Response.movieId) &&
        Objects.equals(this.theatreId, bookingsPost201Response.theatreId) &&
        Objects.equals(this.showTime, bookingsPost201Response.showTime) &&
        Objects.equals(this.date, bookingsPost201Response.date) &&
        Objects.equals(this.seats, bookingsPost201Response.seats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingId, movieId, theatreId, showTime, date, seats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingsPost201Response {\n");
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

