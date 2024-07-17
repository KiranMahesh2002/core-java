class BankRunner{

public static void main(String[] no){
System.out.println("main Started");

	BankBalance.credit(5000);
double value = BankBalance.getBalance();
System.out.println(value);
	BankBalance.debit(500);
value = BankBalance.getBalance();
System.out.println(value);
	BankBalance.credit(2500);
double val = BankBalance.getBalance();
System.out.println(val);
BankBalance.debit(1000);
val = BankBalance.getBalance();
System.out.println(val);
	BankBalance.credit(3000);
double num = BankBalance.getBalance();
System.out.println(num);
BankBalance.debit(3500);
num = BankBalance.getBalance();
System.out.println(num);
BankBalance.credit(2000);
double number = BankBalance.getBalance();
System.out.println(number);

System.out.println("main ended");
return;
}


}