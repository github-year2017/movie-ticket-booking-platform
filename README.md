# Read Me
The following are description of APIs:

* Endpoint URL: /bookings
  HTTP Method: POST
  Description: Book movie tickets by selecting a theatre, timing, and preferred seats for the day.
  Request Body:

        movie_id (required): The ID of the movie.
        theatre_id (required): The ID of the theatre.
        show_time (required): The selected show time (format: HH:MM).
        date (required): The chosen date (format: YYYY-MM-DD).
        seats (required): An array of preferred seats.
  
        Responses:
        201 Created: Returns the details of the created booking.
        400 Bad Request: Indicates invalid input parameters.
        404 Not Found: Theatre, movie, or seats not found.
        500 Internal Server Error: Server encountered an error processing the request.
* Endpoint URL: /theatres
  HTTP Method: GET
  Description: Browse theatres currently running the selected movie in the specified town, including show timings by a chosen date.
  Query Parameters:

        movie_id (required): The ID of the movie.
        town (required): The name of the town.
        date (optional): The chosen date (format: YYYY-MM-DD). If not provided, defaults to the current date.
          
       Responses:
      200 OK: Returns an array of theatres with show timings.
      400 Bad Request: Indicates invalid parameters.
      404 Not Found: No theatres found matching the criteria.
      500 Internal Server Error: Server encountered an error processing the request.
