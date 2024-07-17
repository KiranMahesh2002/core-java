class DominosRunner{
public static void main(String foodApps[]){

     
      System.out.println("Main started");
       
	    
		
	 double value = Dominos.takeOrders("Blazing Onion & Paprika");
     System.out.println( value);
	 
	 double value1 = Dominos.takeOrders("Fiery Sausage & Paprika");
     System.out.println(value1);
	 
     double value2 = Dominos.takeOrders("Primavera Gourmet-Pizza");
	 System.out.println(value2);
	 
     double value3 = Dominos.takeOrders("Smoked Chicken Gourmet-Pizza");
	 System.out.println(value3);
	 
     double value4 = Dominos.takeOrders("Margherita");
	 System.out.println(value4);
	 
     double value5 = Dominos.takeOrders("Farmhouse");
	 System.out.println(value5);
	 
     double value6 = Dominos.takeOrders("Peppy Paneer");
	 System.out.println(value6);
	 
	 double value7 = Dominos.takeOrders("Veg Extravaganza");
	 System.out.println(value7);
	 
	 double value8 = Dominos.takeOrders("Veggie Paradise");
	 System.out.println(value8);
	 
	 double value9 = Dominos.takeOrders("Veggie Paradise");
	 System.out.println(value9);
	 
	 double value10 = Dominos.takeOrders("Pepper Barbecue Chicken");
	 System.out.println(value10);
	 
	 double value11 = Dominos.takeOrders("Chicken Sausage",4);
	 System.out.println(value11);
	 
	 double value12 = Dominos.takeOrders("Chicken Pepperoni Gourmet-Pizza");
	 System.out.println(value12);
	 
	 double value13 = Dominos.takeOrders("Blazing Onion & Paprika",3);
	 System.out.println(value13);
	 
	 double value14 = Dominos.takeOrders("Fresh Veggie",2);
	 System.out.println(value14);
	 
	   
	  System.out.println("Main ended");
}
}