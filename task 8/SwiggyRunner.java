class SwiggyRunner{
	
 public static void main(String[] food){
 

        double price = Swiggy.takeOrder("Pizza");
        System.out.println("Price of one Pizza is: " + price);
		
		
        double price2 = Swiggy.takeOrder("Pizza",4);
        System.out.println("Price of 4 Pizza is: " + price2);
		
		        double price3 = Swiggy.takeOrder("Cake",3);
        System.out.println("Price of 4 Pizza is: " + price3);
		
		        double price4 = Swiggy.takeOrder("Coffee",6);
        System.out.println("Price of 4 Pizza is: " + price4);
		
		        double price5 = Swiggy.takeOrder("Ice Cream",2);
        System.out.println("Price of 4 Pizza is: " + price5);
		
 }



}