class Swiggy{

public static double takeOrder(String foodName){
if(foodName == "Pizza"){
return 99.99;
}
if(foodName == "Burger"){
return 119.00;
}
 if (foodName == "Pasta") {
	return 79.99;
} 
if (foodName == "Salad") {
	return 39.99;
}
 if (foodName == "Sandwich") {
	return 59.99;
}
 if (foodName == "Sushi") {
	return 129.99;
}
 if (foodName == "Steak") {
	return 149.99;
}
 if (foodName == "Chicken Wings") {
	return 89.99;
}
 if (foodName == "Tacos") {
	return 79.99;
}
 if (foodName == "Fries") {
	return 29.99;
} 
if (foodName == "Nachos") {
	return 39.99;
}
 if (foodName == "Soup") {
	return 49.99;
}
 if (foodName == "Cake") {
	return 69.99;
}
 if (foodName == "Ice Cream") {
	return 19.99;
}
 if (foodName == "Coffee") {
	return 9.99;
}
else{
System.out.println(foodName  +  "Not Found");
}
return 0.0;

}

public static double takeOrder(String foodName , int quantity){
	double price = 0.0;
	if(foodName == "Pizza") {
		price = 99.99 * quantity;
		
		return price;
	}
	if(foodName == "Cake") {
		price = 69.99 * quantity;
		
		return price;
	}
	if(foodName == "Coffee") {
		price = 9.99 * quantity;
		
		return price;
	}if(foodName == "Ice Cream") {
		price = 19.99 * quantity;
		
		return price;
	}
	
	
	return price;
}

}