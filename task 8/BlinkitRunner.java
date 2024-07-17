class BlinkitRunner{
	
 public static void main(String[] groceries){
 
   
        double price = Blinkit.order("Apples",3);
        System.out.println("Price of  is: " + price);
		
		double price1 = Blinkit.order("Cabbage");
        System.out.println("Price of  is: " + price1);
		
		double price2 = Blinkit.order("Spinach");
        System.out.println("Price of  is: " + price2);
		
		double price3 = Blinkit.order("Milk",6);
        System.out.println("Price of  is: " + price3);
		
		double price4 = Blinkit.order("Salmon",4);
        System.out.println("Price of  is: " + price4);
		
		
		
 }



}