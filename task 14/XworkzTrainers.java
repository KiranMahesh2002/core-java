class XworkzTrainers
{

public static void main(String[]args){
System.out.println("main started");
	
Xworkz.addTrainerNames("Omkar");
Xworkz.addTrainerNames("Akshara P");
Xworkz.addTrainerNames("Devendra Singh");
Xworkz.addTrainerNames("Mamatha");
Xworkz.addTrainerNames("Amulya");
Xworkz.addTrainerNames("Mohammed Musaib R S");
Xworkz.addTrainerNames("Kousalya");
Xworkz.addTrainerNames("Lokesh");
Xworkz.addTrainerNames("Shantanu");
Xworkz.addTrainerNames("Vinoda");
Xworkz.addTrainerNames("Suhas");
Xworkz.addTrainerNames("Hareesha H R");
Xworkz.addTrainerNames("Haji");
Xworkz.getaddTrainerNames();
System.out.println("Update stated");
Xworkz.updateTrainerName("Amulya" , "Amith");
System.out.println("Update ended");

Xworkz.getaddTrainerNames();

Xworkz.findTrainer("Mamatha");

System.out.println("main ended");
}

}