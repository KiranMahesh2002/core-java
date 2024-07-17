class ConferenceRegistration {
    
    static String attendeeName;
    static String conferenceName;
    static String registrationType;
    static double registrationFee;
	static String time;

 
    public static boolean registerForConference(String name, String conference, String type, double fee) {
        boolean registrationCompleted = false;

        
        attendeeName = name;
        conferenceName = conference;
        registrationType = type;
        registrationFee = fee;
		time = meetingTime;

        return registrationCompleted;
    }

 
    public static void getRegistrationDetails() {
        System.out.println("The Attendee Name is : " + attendeeName);
        System.out.println("Conference Name is : " + conferenceName);
        System.out.println("Registration Type is : " + registrationType);
        System.out.println("Registration Fee is : Rs" + registrationFee);
		System.out.println("The Meeting Time is : " + time);
    }
}
