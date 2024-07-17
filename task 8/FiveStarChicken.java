class FiveStarChicken{
public static double takeOrders(String foodName){


            if(foodName == "Masala Fries"){
			return 329.00;
			}
			if(foodName == "Veg Fingers"){
			return 449.00;
			}
			if(foodName == "Pizza Pockets"){
			return 549.00;
			}
			if(foodName == "Veg Roll"){
			return 629.00;
			}	
			if(foodName == "Paneer Roll"){
			return 239.00;
			}
			if(foodName == "Thai Crispy"){
			return 459.00;
			}
			if(foodName == "Chilli Burst"){
			return 459.00;
			}
			if(foodName == "Crunchy Masala"){
			return 549.00;
			}
			if(foodName == "Chicken Nuggets"){
			return 459.00;
			}
			if(foodName == "Chicken Strips"){
			return 379.00;
			}
			if(foodName == "Chicken PopCorn"){
			return 449.00;
			}
			if(foodName == "Chicken Fingers"){
			return 369.00;
			}
			if(foodName == "Chicken Hot Shot"){
			return 629.00;
			}
			if(foodName == "Crispy Chicken Momos"){
			return 329.00;
			}
			if(foodName == "Krusty Bites"){
			return 379.00;
			}else{
				System.out.println(foodName +"Not Found");
			} 
            
			return 0.0;
			}
}