public class GymRunner {
    public static void main(String[] args) {
        
        Gym.createGymEquipment("Dumbels");
        Gym.createGymEquipment("Exercise Bike");
        Gym.createGymEquipment("Power rack");
        Gym.createGymEquipment("Weight plate");
        Gym.createGymEquipment("Pull-up Bar");
		Gym.createGymEquipment("Treadmill");
        Gym.createGymEquipment("wieght Bar");
        
        Gym.getGymEquipments();
		Gym.updateGymEquipment("bench" , "exercise bike");
		Gym.getGymEquipments();
    }
}
