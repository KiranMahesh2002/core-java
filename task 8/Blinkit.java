class Blinkit {

    public static double order(String itemName){
if (itemName == "Apples") {
	return 150.00;
} if (itemName == "Bananas") {
	return 50.00;
} if (itemName == "Oranges") {
	return 80.00;
} if (itemName == "Grapes") {
	return 120.00;
} if (itemName == "Mangoes") {
	return 200.00;
} if (itemName == "Tomatoes") {
	return 30.00;
} if (itemName == "Potatoes") {
	return 25.00;
} if (itemName == "Onions") {
	return 20.00;
} if (itemName == "Carrots") {
	return 60.00;
} if (itemName == "Cabbage") {
	return 40.00;
} if (itemName == "Broccoli") {
	return 90.00;
} if (itemName == "Spinach") {
	return 35.00;
} if (itemName == "Chicken Breast") {
	return 300.00;
} if (itemName == "Salmon") {
	return 400.00;
} if (itemName == "Milk") {
	return 25.00;
        } else {
            System.out.println(itemName + " Not Found");
            return 0.0;
        }
    }
	
	public static double order(String foodName, int quantity){
				
				
				double price = 0.0;
				
	if(foodName == "Milk") {
		price = 25.0 * quantity;
		
		return price;
	}
	if(foodName == "Salmon") {
		price = 400.0 * quantity;
		
		return price;
	}
	if(foodName == "Apples") {
		price = 150.0 * quantity;
		
		return price;
	}
	return price;
			}
	
}