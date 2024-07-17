class BankAccount {
    
    static String accountHolderName;
    static String accountNumber;
    static double balance;
    static String accountType;

  
    public static boolean createAccount(String holderName, String accNumber, double initialBalance, String type) {
        boolean accountCreated = false;

        
        accountHolderName = holderName;
        accountNumber = accNumber;
        balance = initialBalance;
        accountType = type;

        
        return accountCreated;
    }

  
  
    public static void getAccountDetails() {
        System.out.println("The Account Holder Name is : " + accountHolderName);
        System.out.println("The Account Number is : " + accountNumber);
        System.out.println("The Account Type is : " + accountType);
        System.out.println("The Available Balance: Rs" + balance);
    }
}
