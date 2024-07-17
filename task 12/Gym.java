public class Gym {
    static String gymEquipments[] = {null, null, null, null, null, null, null, null};
    static int index = 0;

    public static boolean createGymEquipment(String equipment) {
		System.out.println(" createGymEquipment started");
		boolean isEquipmentCreated = false;
		
        if (equipment != null) {
            

            gymEquipments[index] = equipment;
            index++;
            isEquipmentCreated = true;
    }else {
		System.out.println("Enter the valid Equipments");
	}
	System.out.println(" createGymEquipment ended");
	return isEquipmentCreated;
			

	}
	
	public static boolean updateGymEquipment(String oldEquipmentName , String newUpdatedEquipment){
boolean isGymEquipmentUpdated = false;
for ( int index = 0; index < gymEquipments.length ; index++ ){
	if(oldEquipmentName == gymEquipments[index]){
		gymEquipments[index] = newUpdatedEquipment;
		isGymEquipmentUpdated = true;
	}
}
if(isGymEquipmentUpdated==false){
	System.out.println(oldEquipmentName +"not found");
}
return isGymEquipmentUpdated;

}

    public static void getGymEquipments() {
        System.out.println("The available gym equipments are:");
        for (int equip = 0; equip < gymEquipments.length; equip++) {
            System.out.println(equip + ") " + gymEquipments[equip]);
        }
    }
}
