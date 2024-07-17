class Bar {
static String wineBrandNames[]= {null , null , null, null , null , null , null , null , null , null , null , null , null , null , null};
static int index ;
public static boolean addWineBrands(String wineNames){
boolean isaddWineBrands = false;
if(index < wineBrandNames.length){
if(wineNames != null){
wineBrandNames[index] = wineNames;
index++;
isaddWineBrands = true;
}
}
return isaddWineBrands;
}
public static void getaddWineBrands() {
for(String wineBrands : wineBrandNames){
System.out.println(wineBrands);
}
}
public static boolean updateaddWineBrands(String oldwinebrands , String newupdatedwinebrands){
boolean isupdateaddWineBrands = false;
for(int index = 0; index < wineBrandNames.length ; index++){
if(oldwinebrands == wineBrandNames[index]){
    wineBrandNames[index] = newupdatedwinebrands;
	isupdateaddWineBrands = true;
}
}
if(isupdateaddWineBrands == false){
System.out.println(oldwinebrands +"not found");

}
return isupdateaddWineBrands;
 }
}
