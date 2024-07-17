class MicroWave {

    static boolean isConnected ;
    static int timer; 
    static int minTimer = 0;
    static int maxTimer = 30;

    public static void turnOnOrOff() {
        System.out.println(" >>>>> turnOnOrOff is started");
        if (isConnected == false  ) {
            isConnected = true;
            System.out.println("Microwave is turned on");
        } else if (isConnected == true) {
            isConnected = false;
            System.out.println("The Microwave is turned off");
        }
        System.out.println(" >>>>>> turnOnOrOff is ended");
    }

    public static void increaseTimer() {
        System.out.println("increaseTimer() started");
        if (isConnected == true) {
            if (timer < maxTimer) {
                timer = timer + 1;
                System.out.println("The Current Timer is " + timer + " minutes");
            } else {
                System.out.println("Max Timer Reached");
            }
        } else {
            System.out.println("Turn on the Microwave !!!!!!!!");
        }
        System.out.println("increaseTimer() ended");
    }

    public static void decreaseTimer() {
        System.out.println("DecreaseTimer started");
        if (isConnected == true) {
            if (timer > minTimer) {
                timer = timer - 1;
                System.out.println("The Current Timer is " + timer + " minutes");
            } else {
                System.out.println("The Timer is at its minimum");
            }
        } else {
            System.out.println("Turn on the Microwave !!!!!!!!!!!!");
        }
        System.out.println("DecreaseTimer ended");
    }

    public static void getMicrowaveDetails() {
        System.out.println(" >>>>>>> getMicrowaveDetails started");
        String brandName = "LG";
        String capacity = "19 Litres";
	System.out.println("The Brand Name is: " + brandName);
        System.out.println("The weight of the Product is: " + capacity);
	System.out.println(" >>>>>>>> getMicrowaveDetails ended");
    }

    
}
