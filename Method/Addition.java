class Addition{


public static void main(String add[]){
System.out.println("Addition without using methods : ");
System.out.println(78 + 56);
System.out.println(15 + 46);
System.out.println(65 + 36);
System.out.println(88 + 16);
System.out.println("addition using methods ,which declared outside the main :");
add(56,87);
add(67,56);
add(2,3);
add(7,6);
add(5,8);
add(7,5);
}

   // declaration of method
   public static void add(int num1 ,int num2){
	   System.out.println( num1 + num2);
   }

}