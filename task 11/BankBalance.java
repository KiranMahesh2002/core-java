class BankBalance{
	
	static double balance;
	
	public static void credit(double amount){
		System.out.println("The Credit started");
		if(amount > 0 ){
		balance = balance + amount;
		}else{
			System.out.println("enter minimum amount");
		}
		System.out.println("the credit ended");
		return;
	}
	public static void debit(double amount){
		System.out.println("The Debit started");
		if(amount <= balance)
		balance = balance - amount;
	else System.out.println("Insufficient balance");
		System.out.println("the debit ended");
		return;
	}
	
	
	public static double getBalance(){
		System.out.println("the returning balance");
		return balance;
	}
	
}