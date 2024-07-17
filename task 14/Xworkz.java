class Xworkz{
static String trainers[]={null, null , null , null , null , null , null , null , null ,null,null, null,null};
static int index,i;

public static boolean addTrainerNames(String trainerName){
boolean isTrainerNameAdded = false;
 if(index < trainers.length){
  if(trainerName != null){
     trainers[index] = trainerName;
	 index++;
	 isTrainerNameAdded = true;
  }
 }
return isTrainerNameAdded;
}
public static void getaddTrainerNames(){
System.out.println("The Trainer Names are	");	
for(String trainerRole : trainers){
System.out.println(trainerRole);
}
}
public static boolean updateTrainerName(String oldTrainerName , String newTrainerName){
boolean isTrainerNameUpdated = false;
for(int index = 0; index < trainers.length ; index++){
   if( oldTrainerName == trainers[index]){
	trainers[index] = newTrainerName;
	isTrainerNameUpdated = true;
}
}if(isTrainerNameAdded)
if(isTrainerNameUpdated == false){
 System.out.println(oldTrainerName +"not found");
 }

return isTrainerNameUpdated;
}
public static boolean findTrainer(String trainer){
	boolean isTrainerNameFound = false;
	
	for(int i = 0;i<trainers.length;i++){
	if(trainer == trainers[i]){
		System.out.println("The Traier " + trainer + " found");
		isTrainerNameFound= true;
	}
	}
	return isTrainerNameFound;
}
	
}

