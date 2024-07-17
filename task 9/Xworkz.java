class Xworkz{
static String fName ;
static long contact;
static String qualify;
static String offer;

public static boolean enroll( String fullName, long contactNumber ,
String Qualification, String offeredAs){
  boolean isPersonEnrooled = false;
      fName = fullName;
		contact	= contactNumber;
			qualify	= Qualification;
				offer	= offeredAs;
				
				
				return isPersonEnrooled;
}
 
 public static void getEnrolledDetails(){
 
 System.out.println("The Full Name is : "+ fName);
 System.out.println("The Contact Number is : "+ contact);
 System.out.println("The Qualification is : "+ qualify);
 System.out.println("The Program is Offered As : "+ offer);
 
 }

}