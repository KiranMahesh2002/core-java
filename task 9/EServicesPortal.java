class EServicesPortal {
    
    static String fullName;
    static String address;
    static int age;
    static String aadharNumber;
    static String registrationStatus;

    
    public static boolean register(String name, String addr, int personAge, String aadhar) {
        boolean registrationCompleted = false;

   
        fullName = name;
        address = addr;
        age = personAge;
        aadharNumber = aadhar;
        registrationStatus = "Registered"; 
		
        return registrationCompleted;
    }


    public static void getRegistrationDetails() {
        System.out.println("Full Name is : " + fullName);
        System.out.println("The Address: " + address);
        System.out.println("The Age: " + age);
        System.out.println("The Aadhar Number: " + aadharNumber);
        System.out.println("Registration Status: " + registrationStatus);
    }
}
