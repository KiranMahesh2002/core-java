class Speaker {

    static boolean isConnected = true;
    static int currentVolume;
    static int minVolume = 0;
    static int maxVolume = 100;

    public static boolean turnOnOrOff() {
        System.out.println(" >>>>> turnOnOrOff is started");
       isConnected  = !isConnected ? true : false;
            
         
        System.out.println(" >>>>>> turnOnOrOff is ended");
		return isConnected;
    }

    public static void increaseVolume() {
        System.out.println("increaseVolume() started");
        if (isConnected == true) {
            if (currentVolume < maxVolume) {
                currentVolume = currentVolume + 1;
                System.out.println("The Current Volume is " + currentVolume);
            } else {
                System.out.println("Max Volume Reached");
            }
        } else {
            System.out.println("Turn on the Speaker !!!!!!!!");
        }
        System.out.println("increaseVolume() ended");
    }

    public static void decreaseVolume() {
        System.out.println("Decrease Volume started");
        if (isConnected == true) {
            if (currentVolume > minVolume) {
                currentVolume = currentVolume - 1;
                System.out.println("The Current Volume is " + currentVolume);
            } else {
                System.out.println("The Volume is at its minimum");
            }
        } else {
            System.out.println("Turn on the Speaker !!!!!!!!!!!!");
        }
        System.out.println("Decrease Volume ended");
    }

    public static void getSpeakerDetails() {
        System.out.println(" >>>>>>> getSpeakerDetails started");
        String brandName = "Bose";
        String model = "SoundLink Revolve+";
        String weight = "0.9 Kg";
        System.out.println("The Brand Name is: " + brandName);
        System.out.println("The Model is: " + model);
        System.out.println("The weight of the Product is: " + weight);
        System.out.println(" >>>>>>>> getSpeakerDetails ended");
    }

    
}
