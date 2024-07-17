class Value{

	static byte ages[] = {22,21,2433,130};
	static short bornYears[]  = {234002,41678};
	static int numbers[] = {187876,16767} ;
	static float experiences[] = {0.39898977f,0.587878789f}  ;
	static long noOfLanguageKnowns[] = {987876565987686L,89327863266763L}  ;
	static boolean isWorkings[] = {false,true,yes};
	static char grades[] = {'A','b','ab'};
	static double variables[] = {3.1465743d,1.238949494834974,2.2897971};// 15 decimal
	
public static void main(String[] digit){



System.out.println("the Values of 1st are : ");
for(byte age :ages){
System.out.println(age);
}

System.out.println(" the another values are : ");
for(int number:numbers)
{
System.out.println(number);
}

System.out.println("the Values of 1st are : ");
for(short bornYear :bornYears){
System.out.println(bornYear);
}

System.out.println("the Values of 1st are : ");
for(float experience :experiences){
System.out.println(experience);
}

System.out.println("the Values of 1st are : ");
for(long noOfLanguageKnown :noOfLanguageKnowns){
System.out.println(noOfLanguageKnown);
}

System.out.println("the Values of 1st are : ");
for(char grade :grades){
System.out.println(grade);
}

System.out.println("the Values of 1st are : ");
for(boolean isWorking :isWorkings){
System.out.println(isWorking);
}

System.out.println("the Values of 1st are : ");
for(double variable :variables){
System.out.println(variable);
}
}


}