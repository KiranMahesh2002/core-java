class MyntraRunner{

public static void main(String[] cloth){

boolean myntraAccountCreated = MyntraAccount.createMyntraAccount("kali", "kaliwwe@gmail.com", "8987654321", "jhonsena", "p@ssw0rd", "WWE mania");
        System.out.println("Myntra Account Created: " + myntraAccountCreated);
        if (myntraAccountCreated) {
            MyntraAccount.getMyntraAccountDetails();
        }
		}
}