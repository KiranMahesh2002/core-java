class FoodPandaRunner{
public static void main(String[]food){

 double value = FoodPanda.takeOrder("dahi",3);
     System.out.println( value);
	 
	 double value1 = FoodPanda.takeOrder("dal",5);
     System.out.println(value1);
	 
     double value2 = FoodPanda.takeOrder("sugar",6);
	 System.out.println(value2);
	  double value3 = FoodPanda.takeOrder("maida");
     System.out.println( value3);
	 
	 double value4 = FoodPanda.takeOrder("ragi");
     System.out.println(value4);
	 
     double value5 = FoodPanda.takeOrder("pear");
	 System.out.println(value5);
}
}