class GoldShop{
static String goldItems[]= {null , null , null , null , null,null,null};
static int index; 
public static boolean addGoldItem(String goldNames){
boolean isaddedgolditems = false;
if(index < goldItems.length){
if(goldNames != null){
  goldItems[index] = goldNames;
   index++;
isaddedgolditems = true;   
}
 }
 return isaddedgolditems;
}

public static void getaddGoldItem(){
for(String goldItemss : goldItems ){
System.out.println(goldItemss);
}
}
public static boolean updateGoldItem(String olditem , String newitem){
boolean isupdateGoldItem = false;
for(int index = 0 ; index < goldItems.length; index++ ){
if(olditem == goldItems[index]){
   goldItems[index] = newitem;
}
}
if (isupdateGoldItem == false){
System.out.println(olditem +" " +"not found");
}
return isupdateGoldItem;
}



}