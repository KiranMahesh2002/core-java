class AmazonRunner {
    public static void main(String[] product) {
       
        boolean amazonAccountCreated = AmazonAccount.createAmazonAccount("Kiran_xworkz", "kiran.xworkz@gmail.com", "7349603510", "KIRAN M", "Xworkz@123", "rajajinagar");
        System.out.println("Amazon Account Created: " + amazonAccountCreated);
        if (amazonAccountCreated ==true ) {
            AmazonAccount.getAmazonAccountDetails();
        }else{
			System.out.println("details is not created");
		}

 }
}
