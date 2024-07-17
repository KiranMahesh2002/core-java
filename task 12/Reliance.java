public class Reliance {
    static String[] homeAppliances = { null, null, null, null, null, null, null, null, null, null, null};
    static int index = 0;

    public static boolean createHomeAppliance(String appliance) {
       boolean isAddApplianceCreated = false;
 if( appliance != null){
	 
		homeAppliances[index]	= appliance;
		index++;
	 
	 isAddApplianceCreated = true;
 }else{
	 System.out.println("Home Appliance could not be Null");
 }
 
 return isAddApplianceCreated;
    }

    public static void getHomeAppliances() {

		System.out.println("The Availanle Appliances are : ");
	for(String appliance :homeAppliances)
		System.out.println(appliance);
   
}
public static boolean updatenewAppliances(String oldApplianceName , String newApplianceName){
boolean isupdatednewappliance = false;
for(int index = 0; index < addAppliances.length ; index++ )	{
	if (oldApplianceName == addAppliances[index]){
		addAppliances[index] = newApplianceName ;
	    isupdatednewappliance = true;
		
	
}
}
if (isupdatednewappliance == false){
	System.out.println(oldApplianceName + "not found");
}
return isupdatednewappliance;
	
}
}
