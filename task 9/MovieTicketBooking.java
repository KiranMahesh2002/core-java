class MovieTicketBooking {
    
    static String movieName;
    static String cinemaName;
    static String seatNumber;
    static String showTime;
	static String theatre;

    
    public static boolean bookTickets(String movie, String cinema, String seat, String time,String theatreName) {
        boolean bookingConfirmed = false;

        
        movieName = movie;
        cinemaName = cinema;
        seatNumber = seat;
        showTime = time;
		    theatre = theatreName;
        
        return bookingConfirmed;
    }

   
    public static void getBookingDetails() {
        System.out.println("The Movie Name: " + movieName);
        System.out.println("The Cinema Name: " + cinemaName);
        System.out.println("The Seat Number: " + seatNumber);
        System.out.println("The Show Time: " + showTime);
		 System.out.println("The Theater Name: " + theatre);
    }
}
