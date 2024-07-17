class FoodPanda{
public static double takeOrder(String foodName){
if(foodName== "PineApple" ){
return 60.00;
}
if(foodName == "Gauva"){
return 60.00;
}
if(foodName == "pear"){
return 60.00;
}
if(foodName == "ragi"){
return 150.00;
}
if(foodName == "chicken thighs"){
return 280.00;
}
if(foodName == "mutton leg"){
return 400.00;
}
if(foodName == "chicken soup"){
return 100.00;
}
if(foodName == "mutton soup"){
return 200.00;
}
if(foodName == "rabdi"){
return 120.00;
}
if(foodName == "dahi"){
return 45.00;
}
if (foodName == "sugar" ){
return 80.00;
}
if(foodName == "dal"){
return 50.00;
}
if(foodName == "flourgram"){
return 70.00;
}
if(foodName == "maida"){
return 80.00;
}
if(foodName == "chikapea"){
return 60.00;
}
else{
System.out.println(foodName +"Not Found");
}
return 0.00;
}

public static double takeOrder(String foodName, int quantity){
				
				
				double price = 0.0;
				
	if(foodName == "sugar") {
		price = 80.0 * quantity;
		
		return price;
	}
	if(foodName == "dal") {
		price = 50.0 * quantity;
		
		return price;
	}
	if(foodName == "dahi") {
		price = 45.0 * quantity;
		
		return price;
	}
	return price;
			}
			
}