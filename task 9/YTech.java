class YTech {
    
    static String user;
    static String email;
    static String password;
    static String membershipLevel;

    
    public static boolean register(String username, String emailAddress,
                                   String userPassword, String membership) {
        boolean isUserRegistered = false;

     
        user = username;
        email = emailAddress;
        password = userPassword;
        membershipLevel = membership;

        
        return isUserRegistered;
    }

   
    public static void getRegisteredDetails() {
        System.out.println("The User Name is : " + user);
        System.out.println("The Email Id is : " + email);
		System.out.println("The PassWord is : " + password);
        System.out.println(" The Membership Level: " + membershipLevel);
    }
}
