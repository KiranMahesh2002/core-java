class FlightBooking {
   
    static String passengerName;
    static String flightNumber;
    static String departureCity;
    static String destinationCity;
    static String departureDate;


    public static boolean bookFlight(String name, String flightNum, String from, String to, String date) {
        boolean bookingConfirmed = false;

        
        passengerName = name;
        flightNumber = flightNum;
        departureCity = from;
        destinationCity = to;
        departureDate = date;

       
        return bookingConfirmed;
    }

    
    public static void getBookingDetails() {
        System.out.println("The Passenger Name: " + passengerName);
        System.out.println(" The Flight Number: " + flightNumber);
        System.out.println("The Departure From: " + departureCity);
        System.out.println("The Destination arriving To: " + destinationCity);
        System.out.println("Departure Date: " + departureDate);
    }
}
