class ZeptoRunner{
public static void main(String foodApps[]){

     
      System.out.println("Main started");
       
	    
		
	 double value = Zepto.takeOrders("Onion",3);
     System.out.println( value);
	 
	 double value1 = Zepto.takeOrders("Banana Elaichi / Yelakki");
     System.out.println(value1);
	 
     double value2 = Zepto.takeOrders("Tender Coconut");
	 System.out.println(value2);
	 
     double value3 = Zepto.takeOrders("Carrot Local");
	 System.out.println(value3);
	 
     double value4 =Zepto .takeOrders("Sweet Corn");
	 System.out.println(value4);
	 
     double value5 = Zepto.takeOrders("Lady Finger");
	 System.out.println(value5);
	 
     double value6 =Zepto.takeOrders("Broccoli");
	 System.out.println(value6);
	 
	 double value7 = Zepto.takeOrders("Sweet Potato");
	 System.out.println(value7);
	 
	 double value8 =Zepto .takeOrders("Beetroot",5);

	 System.out.println(value8);
	 
	 double value9 =Zepto .takeOrders("Watermelon Kiran");
	 System.out.println(value9);
	 
	 double value10 = Zepto.takeOrders("Cherry Indian");
	 System.out.println(value10);
	 
	 double value11 =Zepto .takeOrders("Litchi");
	 System.out.println(value11);
	 
	 double value12 = Zepto.takeOrders("Capsicum Red & Yellow");
	 System.out.println(value12);
	 
	 double value13 = Zepto.takeOrders("Cabbage",6);
	 System.out.println(value13);
	 
	 double value14 = Zepto.takeOrders("Potato");
	 System.out.println(value14);
	 
	   
	  System.out.println("Main ended");
}
}