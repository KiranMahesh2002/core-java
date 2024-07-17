class Passport{

static String cpvLoc ;
static int dcdrLoc ;
static String firstName ;
static String lastName ;
static String doB;
static String mail ;
static String loginID;
static boolean isLoginSame;
static String pass;
static String confirmPass;
static String hintQ;
static String hintA;
static String captc;

public static boolean createPassport(String cpvLocation, int dcdrLocation, String fName, String lName, String dob,
 String email, String loginId, boolean isEmailLoginSame, String password , String confirmPassword, String hintQue,
 String hintAns, String captcha ){
 boolean isPassportCreated = false;
  
  if( dcdrLocation > 0 && fName != null && email != null && dob != null && password != null && confirmPassword != null && cpvLocation != null && loginId != null && hintQue != null && hintAns != null && captcha != null){
                    cpvLoc = cpvLocation;
		                  dcdrLoc = dcdrLocation;		
                             firstName = fName;						  
                                      lastName = lName;
										doB	= dob;
										 mail = email;
					loginID	= loginId;
				isLoginSame	= isEmailLoginSame;
							pass	= password;
							confirmPass	= confirmPassword;
						hintQ	= hintQue;
						hintA	= hintAns;
							captc	= captcha;
							isPassportCreated =true;
 }else{
	 System.out.println("Please Provide Valid Details ............");
 }
	 
 return isPassportCreated;

 }
public static void getPassportDetails(){

System.out.println("The cpv Location is : " +cpvLoc);
System.out.println("The dcdr Location is : " +dcdrLoc);
System.out.println("The First Name is : "+ firstName);
System.out.println("The Last Name is : "+ lastName);
System.out.println("The Date of Birth is : " +doB);
System.out.println("The Mail is : " +mail);
System.out.println("The Login ID is : " +loginID);
System.out.println("is Email and Login is Same : " +isLoginSame);
System.out.println("The Password is : "+ pass);
System.out.println(" The Confirm password is : " +confirmPass);
System.out.println(" the Hint Question Is : " +hintQ);
System.out.println(" The Hint Answer is : " +hintA);
System.out.println(" The Captcha is : " +captc);



}

}