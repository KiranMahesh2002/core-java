class Liberty{
static String shoeBrands[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index; 
public static boolean addshoebrand(String shoebrand){
boolean isaddshoebrand = false;
if(index < shoeBrands.length){
if(shoebrand != null){
shoeBrands[index]= shoebrand;
index++;
isaddshoebrand=true;

}
}
return isaddshoebrand;
}
public static void getaddshoebrand(){
System.out.println("the shoe brands are:");
for(String shoebrandss : shoeBrands ){
System.out.println(shoebrandss);
}
}

public static boolean updateaddshoebrand(String oldShoeBrand , String newShoeBrand){
boolean isupdateaddshoebrand = false;
for(int index = 0; index < shoeBrands.length ; index++){
if(oldShoeBrand == shoeBrands[index]){
shoeBrands[index] = newShoeBrand;
isupdateaddshoebrand = true;
}
}
if(isupdateaddshoebrand == false ){
System.out.println(oldShoeBrand +"not found");
}
return isupdateaddshoebrand;
}
}