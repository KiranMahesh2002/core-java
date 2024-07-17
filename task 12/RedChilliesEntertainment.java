public class RedChilliesEntertainment {
    static String[] movieActors = {null, null, null, null, null, null, null, null, null};
    static int index = 0;

    public static boolean addMovieActors(String actor) {
         boolean isAddMovieActorsCreated = false;
 if( actor != null){

            movieActors[index] = actor;
            index++;
            isAddMovieActorsCreated = true;
        }else{ System.out.println("enter valid Actors Name");
    }
	return isAddMovieActorsCreated;
}

    public static void getMovieActors() {
        
		System.out.println("The Availanle movie actors  are : ");
	for(String actor :movieActors)
		System.out.println(actor);
    }
	public static boolean updateEntertainment(String oldActorName , String newActorName){
boolean isupdatedactors = false;
for(int index = 0; index < actorNames.length ; index++ ){
if(oldActorName == actorNames[index]){
    actorNames[index] = newActorName;
	isupdatedactors = true;
}
}
if (isupdatedactors == false) {
System.out.println(oldActorName +"not found");
}
return isupdatedactors;
}
}
