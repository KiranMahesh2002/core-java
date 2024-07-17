class WatchShop{
static String watchBrands[]={null, null , null , null , null , null , null , null , null , null};
static int index;
public static boolean addWatchBrand(String brandName){
boolean isaddWatchBrand = false;
 if(index < watchBrands.length){
  if(brandName != null){
     watchBrands[index] = brandName;
	 index++;
	 isaddWatchBrand = true;
  }
 }
return isaddWatchBrand;
}
public static void getaddWatchBrand(){
for(String watchtypes : watchBrands){
System.out.println(watchtypes);
}
}
public static boolean updateaddWatchBrand(String oldWatchBrand , String newwatchBrand){
boolean isupdateaddWatchBrand = false;
for(int index = 0; index < watchBrands.length ; index++){
    oldWatchBrand = watchBrands[index];
	watchBrands[index] = newwatchBrand;
	isupdateaddWatchBrand = true;
}
if(isupdateaddWatchBrand == false){
 System.out.println(oldWatchBrand +"not found");
 }
return isupdateaddWatchBrand;
}

}