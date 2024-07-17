class AmazonAccount {
    static String username;
    static String email;
    static String phoneNumber;
    static String fullName;
    static String password;
    static String address;

    public static boolean createAmazonAccount(String uname, String mail, String phone, String name, String pwd, String addr) {
        boolean isAccountCreated = false;
        boolean isUnameValid = false;
        boolean isEmailValid = false;
        boolean isPhoneValid = false;
        boolean isNameValid = false;
        boolean isPwdValid = false;
        boolean isAddressValid = false;

        if (uname != null ) {
            username = uname;
            isUnameValid = true;
        } else {
            System.out.println("Please provide a valid User Name");
        }

        if (mail != null ) {
            email = mail;
            isEmailValid = true;
        } else {
            System.out.println("Please provide a valid E-mail");
        }

        if (phone != null ) {
            phoneNumber = phone;
            isPhoneValid = true;
        } else {
            System.out.println("Please provide a valid Phone Number");
        }

        if (name != null ) {
            fullName = name;
            isNameValid = true;
        } else {
            System.out.println("Please provide a valid Full Name");
        }

        if (pwd != null ) {
            password = pwd;
            isPwdValid = true;
        } else {
            System.out.println("Please provide a valid Password");
        }

        if (addr != null ) {
            address = addr;
            isAddressValid = true;
        } else {
            System.out.println("Please provide a valid Address");
        }

        if (isUnameValid && isEmailValid && isPhoneValid && isNameValid && isPwdValid && isAddressValid) {
            isAccountCreated = true;
        }

        return isAccountCreated;
    }

    public static void getAmazonAccountDetails() {
        System.out.println("THE User Name is: " + username);
        System.out.println("The E-mail Id is : " + email);
        System.out.println("The Phone Number is : " + phoneNumber);
        System.out.println("The Full Name is : " + fullName);
        System.out.println("The Password is : " + password);
        System.out.println("The Address is : " + address);
    }

    
}
