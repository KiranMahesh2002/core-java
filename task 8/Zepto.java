class Zepto{
public static double takeOrders(String foodName){


            if(foodName == "Onion"){
			return 59.00;
			}
			if(foodName == "Banana Elaichi / Yelakki"){
			return 55.00;
			}
			if(foodName == "Tender Coconut"){
			return 67.00;
			}
			if(foodName == "Carrot Local"){
			return 50.00;
			}	
			if(foodName == "Sweet Corn"){
			return 69.00;
			}
			if(foodName == "Lady Finger"){
			return 40.00;
			}
			if(foodName == "Broccoli"){
			return 105.00;
			}
			if(foodName == "Sweet Potato"){
			return 48.00;
			}
			if(foodName == "Beetroot"){
			return 37.00;
			}
			if(foodName == "Watermelon Kiran"){
			return 108.00;
			}
			if(foodName == "Cherry Indian"){
			return 131.00;
			}
			if(foodName == "Litchi"){
			return 321.00;
			}
			if(foodName == "Capsicum Red & Yellow"){
			return 97.00;
			}
			if(foodName == "Cabbage"){
			return 68.00;
			}
			if(foodName == "Potato"){
			return 53.00;
			}else{
				System.out.println(foodName +"Not Found");
			} 
            
			return 0.0;
			}
			
			public static double takeOrders(String foodName, int quantity){
				
				
				double price = 0.0;
	if(foodName == "Onion") {
		price = 59.00 * quantity;
		
		return price;
	}
	if(foodName == "Cabbage") {
		price = 68.00 * quantity;
		
		return price;
	}
	if(foodName == "Beetroot") {
		price = 37.00 * quantity;
		
		return price;
	}
	return price;
			}
}