class ZomatoRunner{
public static void main(String foodApps[]){

      System.out.println("Main started");
       
	    String foodName ="Pizza";
		
	 double value = Zomato.takeOrders(foodName);
	 System.out.println("Pizza amount is "+ value);
	 double value1 = Zomato.takeOrders("Burger");
     System.out.println(value1);	 
     double value2 = Zomato.takeOrders("Roti Curry");
	 System.out.println(value2);
     double value3 = Zomato.takeOrders("Ice Cream");
	 System.out.println(value3);
     double value4 = Zomato.takeOrders("Pani Puri");
	 System.out.println(value4);
     double value5 = Zomato.takeOrders("Samosa");
	 System.out.println(value5);
     double value6 = Zomato.takeOrders("Masala Dosa");
	 System.out.println(value6);
	 double value7 = Zomato.takeOrders("Gobi Manchuri");
	 System.out.println(value7);
	 double value8 = Zomato.takeOrders("Sweet Pongal");
	 System.out.println(value8);
	 double value9 = Zomato.takeOrders("Halwa");
	 System.out.println(value9);
	 double value10 = Zomato.takeOrders("Paneer Roti");
	 System.out.println(value10);
	 double value11 = Zomato.takeOrders("Cold Drinks");
	 System.out.println(value11);
	 double value12 = Zomato.takeOrders("Pasta",4);
	 System.out.println(value12);
	 double value13 = Zomato.takeOrders("Vada Pav",6);
	 System.out.println(value13);
	 double value14 = Zomato.takeOrders("Bel Puri",3);
	 System.out.println(value14);
	 
	   
	  System.out.println("Main ended");
}
}