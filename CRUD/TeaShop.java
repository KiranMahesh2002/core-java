class TeaShop{
 static String shopName = "Sri chowdeshwari Tea shop";
 static String address ="Malur";
 
 static String teaNames[] = {null,null,null,null,null,null};
 static double teaPrices[] ={0,0,0,0,0,0};
 static int index;
 static int value;
 
 public static boolean addTeaName(String teaName){
 System.out.println(" addTeaName started");
 boolean isaddTeaNameCreated = false;
 if(index < teaNames.length){
 if( teaName != null){
	 
		teaNames[index]	= teaName;
		index++;
		System.out.println(teaName +"added");
	 
	 isaddTeaNameCreated = true;
 }else{
	 System.out.println("Tea Name could not be Null");
 }
 }else System.out.println("cannot add Tea Name");
  System.out.println(" addTeaName ended");
 return isaddTeaNameCreated;
 } 
 
 public static boolean addTeaPrice(double teaPrice){
	 System.out.println(" teaPrice started");
	 boolean isPriceAdded= false;
	 if(teaPrice > 0.0){
			teaPrices[value]	= teaPrice;
			value++;
			
			isPriceAdded = true;
	 }else{ System.out.println("The Price Cannot be zero");
	 }
	 
	 System.out.println(" teaPrice ended");
	 return isPriceAdded;
 }

public static void getTeaName(){
	System.out.println("getTeaName Started");
	System.out.println("The Availanle Tea are : ");
	for(String teaName :teaNames)
		System.out.println(teaName);
	
}

public static void getTeaPrice(){
	System.out.println("getTeaPrice Started");
	System.out.println("The Availanle Tea  prices are : ");
	for(double teaPrice :teaPrices)
		System.out.println(teaPrice);
	System.out.println("getTeaPrice ended");
}

public static boolean updateTeaName(String oldTea ,String newTea){
	System.out.println("updateTeaName Started");
	boolean isTeaNameUpdated = false;
	for(int index = 0 ; index < teaNames.length; index++  )
	{   if(oldTea == teaNames[index]){
	                  teaNames[index] = newTea;
				  isTeaNameUpdated =true;
}
}if(isTeaNameUpdated==false){
	System.out.println(oldTea +"not found"); 	

		
	}
	System.out.println("updateTeaName ended");
	return isTeaNameUpdated;
}
 public static void getShopDetails(){
	
	System.out.println("The Shop Name is "+ shopName);
	System.out.println("The Address of Shop is "+ address);
}
}