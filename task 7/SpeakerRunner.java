class SpeakerRunner{

public static void main(String[] args) {
System.out.println("Main Started");
	Speaker.getSpeakerDetails();
       boolean connected = Speaker.turnOnOrOff();
	   System.out.println("turned on"+ connected);
		Speaker.turnOnOrOff();
		connected = Speaker.turnOnOrOff();
	   System.out.println("turned off"+ connected);
			Speaker.increaseVolume();
		Speaker.decreaseVolume();
	System.out.println("Main ended");
    }
	


}