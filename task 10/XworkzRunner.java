class XworkzRunner{
	public static void main(String []xw){
	
	Xworkz.registerTrainee("Kiran",7026677294L,9686926272L,"kiranmyl2002@gmail.com","1ST20CS057");
	
	boolean isTraineeIDCreated = true;
	if(isTraineeIDCreated==true){
	Xworkz.getTraineeDetails();
	}else{
		System.out.println("The Trainee Id is not created");
	}
	} 

}