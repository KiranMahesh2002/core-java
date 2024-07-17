public class RelianceRunner {
    public static void main(String[] args) {
        Reliance.createHomeAppliance("Phone");
        Reliance.createHomeAppliance("ear buds");
        Reliance.createHomeAppliance("laptops");
        Reliance.createHomeAppliance("Air Conditioner");
        Reliance.createHomeAppliance("Television");
        Reliance.createHomeAppliance("Mixer");
        Reliance.createHomeAppliance("Vacuum Cleaner");
        Reliance.createHomeAppliance("Grinder");
        Reliance.createHomeAppliance("water purifyer");
        Reliance.createHomeAppliance("Water Heater");
        Reliance.createHomeAppliance("Iron Box");
        
        Reliance.getHomeAppliances();
		Reliance.updatenewAppliances("oven" , "air fryer");
Reliance.getHomeAppliances();
    }
}
