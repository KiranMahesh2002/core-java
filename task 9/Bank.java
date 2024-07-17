Class Bank{

static String phoneNum;
static String fName;
static long adharNum;
static String panNum;
static String doB;
static String genderType;
static String location;
static String nomineeName;
static String accountType;
static String branchName;

public static boolean createAccount(String fullName,String phoneNumber,long adhar ,String pan,
 String dob ,String gender ,String adress ,String nominee, String typeOfAccount, String branch){
 
    if(fullName != null && adhar > 0 && pan != null)
					fName	= fullName;
			phoneNum	= phoneNumber;
					adharNum	= adhar;
							panNum	= pan;
						doB	= dob;
					genderType	= gender;
							location	= adress;
							 nomineeName = nominee;
							 accountType = typeOfAccount;
							 branchName = branch;
							
 }


}