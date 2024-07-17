class Ncr{


public static void main(String[] digi){
 int e = 6;
 int f = 4;
 int nCrValue = Factorial.toGetFact(e)/ (Factorial.toGetFact(e-f)*Factorial.toGetFact(f));
 System.out.println(" The nCr is : "+ nCrValue);

}

}