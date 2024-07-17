class TelevisionRunner{

public static void main(String[] args) {
System.out.println("Main Started");
        Television.getTelevisionDetails();
	Television.turnOnOrOff();
	
        Television.increaseVolume();
			Television.decreaseVolume();
			Television.turnOnOrOff();
		System.out.println("Main ended");
    }
}