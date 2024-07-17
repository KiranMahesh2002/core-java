class Factorial{

public static int toGetFact(int factNumber)
{
System.out.println("Fact is started");
int fact = 1;
for(int value = 1; value <= factNumber ; value++)
{
 fact = value * fact;
}
System.out.println("fact is ended ");
return fact;
}

}