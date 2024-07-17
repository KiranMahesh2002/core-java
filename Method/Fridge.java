class Fridge{

static boolean isConnected = true;
 static int currentTemp  ; 
	   static  int  minTemp = 0 ; 
        static int maxTemp  = 6 ;
		
public static void turnOnOrOff(){
System.out.println(" >>>>> turnOnOrOff is started");
if(isConnected == false){
isConnected = true;
System.out.println("Fridge is turned on");
}else if(isConnected == true){
isConnected = false;
System.out.println("The Fridge is turned off");
}
System.out.println(" >>>>>> turnOnOrOff is ended");

}

public static void increaseTemp(){
				 System.out.println("increaseTemp() started");
			if(isConnected == true){	       
		 if(currentTemp < maxTemp){
			currentTemp = currentTemp + 1 ;
			System.out.println("The Current Temperature is "+ currentTemp);		
		}else{
			System.out.println("Max Temperature Reached");
			 } 
			}else{
				System.out.println("Turn on the Fridge !!!!!!!!");
			}
		System.out.println("increaseTemp() ended");
				 return ;
				 }

public static void decreaseTemp() {
        System.out.println("DecreaseTemp started");
        if (isConnected == true) {
            if (currentTemp > minTemp) {
                currentTemp = currentTemp - 1;
                System.out.println("The Current Temperature is "+ currentTemp);
            } else {
                System.out.println("The Temperature is at its minimum");
            }
        } else {
            System.out.println("Turn on the Fridge !!!!!!!!!!!!");
        }
        System.out.println("DecreaseTemp ended");
    }


public static void getFridgeDetails(){
System.out.println(" >>>>>>> getFridgeDetails started");
String brandName = "Philips";
String weight = "15Kg";
System.out.println("The Brand Name is : "+brandName);
System.out.println("The weight of the Product is : "+weight);


System.out.println(" >>>>>>>> getFridgeDetails ended");
}


}