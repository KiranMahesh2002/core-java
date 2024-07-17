class Television {

    static boolean isConnected = true;
    static int currentVolume;
    static int minVolume = 0;
    static int maxVolume = 100;

    public static void turnOnOrOff() {
        System.out.println(" >>>>> turnOnOrOff is started");
        if (isConnected == false) {
            isConnected = true;
            System.out.println("Television is turned on");
        } else if (isConnected == true) {
            isConnected = false;
            System.out.println("The Television is turned off");
        }
        System.out.println(" >>>>>> turnOnOrOff is ended");
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
            System.out.println("Turn on the Television !!!!!!!!");
        }
        System.out.println("increaseVolume() ended");
    }

    public static void decreaseVolume() {
        System.out.println("DecreaseVolume started");
        if (isConnected == true) {
            if (currentVolume > minVolume) {
                currentVolume = currentVolume - 1;
                System.out.println("The Current Volume is " + currentVolume);
            } else {
                System.out.println("The Volume is at its minimum");
            }
        } else {
            System.out.println("Turn on the Television !!!!!!!!!!!!");
        }
        System.out.println("DecreaseVolume ended");
    }

    public static void getTelevisionDetails() {
        System.out.println(" >>>>>>> getTelevisionDetails started");
        String brandName = "Sony";
        String screenSize = "55 inches";
        String weight = "15 Kg";
        System.out.println("The Brand Name is: " + brandName);
        System.out.println("The Screen Size is: " + screenSize);
        System.out.println("The weight of the Product is: "+ weight);
        System.out.println(" >>>>>>>> getTelevisionDetails ended");
    }

    
}
