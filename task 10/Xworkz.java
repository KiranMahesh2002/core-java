class Xworkz{
    static String fName;
    static long pNumber;
    static long wNumber;
    static String mail;
    static String usn;
    

    public static boolean registerTrainee(String fullName, long phoneNumber, long whatsAppNumber,
	String emailId, String usnNumber) 
	{
	boolean isTraineeIDCreated=false;
    boolean isFullNameValid = false;
    boolean isPhoneNumberValid = false;
    boolean isWhatsAppNumberValid = false;
    boolean isEmailIdValid = false;
    boolean isUsnNumberValid = false;
	
	if(fullName != null){
		fName = fullName;
        isFullNameValid = true;
    }else{
        System.out.println("Please enter a valid full name.");
    }
	if(phoneNumber != 0){
       pNumber = phoneNumber;
       isPhoneNumberValid = true;
    }else{
      System.out.println("Please enter a valid phone number.");
        }
	if(whatsAppNumber != 0) {
       wNumber = whatsAppNumber;
       isWhatsAppNumberValid = true;
    }else{
       System.out.println("Please enter a valid WhatsApp number.");
    }
    if(emailId != null) {
        mail = emailId;
        isEmailIdValid = true;
    }else{
        System.out.println("Please enter a valid email ID.");
    }
    if(usnNumber != null) {
        usn = usnNumber;
        isUsnNumberValid = true;
    }else{
        System.out.println("Please enter a valid USN number.");
    }
    if(isFullNameValid && isPhoneNumberValid && isWhatsAppNumberValid &&
	isEmailIdValid && isUsnNumberValid) {
        isTraineeIDCreated = true;
    }else{
		System.out.println("Trainee Details are Missing");
	}

    return isTraineeIDCreated;
    }

    public static void getTraineeDetails() {
      
            System.out.println("The Full Name is: " + fName);
            System.out.println("The Phone Number is: " + pNumber);
            System.out.println("The WhatsApp Number is: " + wNumber);
            System.out.println("The E-mail ID is: " + mail);
            System.out.println("The USN Number is: " + usn);
        
    }
}
