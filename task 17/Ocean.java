class Ocean{

	String fish;
	String ship;
	String plants;
	
	public Ocean(String fish,String ship,String plants){
	
	this.fish = fish;
	this.ship=ship;
	this.plants=plants;
	}
	public void getDetails(){
		System.out.println("fish is "+this.fish+"\nships are "+this.ship+"\nplants are "+this.plants);
	}


}