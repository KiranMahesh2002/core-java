class Mixer {

    static boolean isConnected = true;
    static int speedLevel;
    static int minSpeed = 0;
    static int maxSpeed = 10;

    public static void turnOnOrOff() {
        System.out.println(" >>>>> turnOnOrOff is started");
        if (isConnected == false) {
            isConnected = true;
            System.out.println("Mixer is turned on");
        } else if (isConnected == true) {
            isConnected = false;
            System.out.println("The Mixer is turned off");
        }
        System.out.println(" >>>>>> turnOnOrOff is ended");
    }

    public static void increaseSpeed() {
        System.out.println("increaseSpeed() started");
        if (isConnected == true) {
            if (speedLevel < maxSpeed) {
                speedLevel = speedLevel + 1;
                System.out.println("The Current Speed Level is " + speedLevel);
            } else {
                System.out.println("Max Speed Reached");
            }
        } else {
            System.out.println("Turn on the Mixer !!!!!!!!");
        }
        System.out.println("increaseSpeed() ended");
    }

    public static void decreaseSpeed() {
        System.out.println("DecreaseSpeed started");
        if (isConnected == true) {
            if (speedLevel > minSpeed) {
                speedLevel = speedLevel - 1;
                System.out.println("The Current Speed Level is " + speedLevel);
            } else {
                System.out.println("The Speed Level is at its minimum");
            }
        } else {
            System.out.println("Turn on the Mixer !!!!!!!!!!!!");
        }
        System.out.println("DecreaseSpeed ended");
    }

    public static void getMixerDetails() {
        System.out.println(" >>>>>>> getMixerDetails started");
        String brandName = "Philips";
        String model = "HL7756/00";
        String weight = "3 Kg";
        System.out.println("The Brand Name is: " + brandName);
        System.out.println("The Model is: " + model);
        System.out.println("The weight of the Product is: " + weight);
        System.out.println(" >>>>>>>> getMixerDetails ended");
    }

   
}
