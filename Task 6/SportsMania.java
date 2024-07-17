class SportsMania {
     static String iplTeams[] = {"RCB","CSK", "Mumbai Indians", "KKR",  "SRH", "Rajasthan Royals", "Delhi Capitals", "Punjab Kings", "Gujarat Titans", "LSG"};
    
        static String top10Batsmens[] = {"Surya Kumar Yadav", "Mohammad Rizwan", "Devon Conway", "Babar Azam", "Aiden Markram", "JOs Buttler", "Rilee Rossouw", "David Mallan", "Martin Guptill", "Glenn Maxwell"};

     static String top10Bowlers[] = {"Rashid Khan", "Jasprit Bumrah", "Mujeeb Ur Rahman", "Trent Boult", "Kagiso Rabada", "Shaheen Afridi", "Adam Zampa", "Mohammed siraj", "Ravichandran Ashwin", "Mohammed Shami"};

      static String top10ICCTeams[] = {"New Zealand","India","England",  "Australia", "Pakistan", "South Africa", "Wwest Indies", "Bangladesh",  "Sri Lanka", "Afghanistan"};

    public static void main(String[] cricket) {
        System.out.println("#############################################################################################################################");

        //System.out.println(" The IPL Teams are: " + iplTeams[0] + "\n " + iplTeams[1] + "\n " + iplTeams[2] + "\n " + iplTeams[3] + "\n " + iplTeams[4] + "\n " + iplTeams[5] + "\n " + iplTeams[6] + "\n " + iplTeams[7] + "\n " + iplTeams[8] + "\n " + iplTeams[9]);
			System.out.println("\n The IPL Teams Are : \n");
		for(int ipl = 0; ipl < iplTeams.length ; ipl++){
			System.out.println(iplTeams[ipl]);
		}
//System.out.println("\n The Top 10 Batsmen are: " + top10Batsmens[0] + "\n " + top10Batsmens[1] + "\n " + top10Batsmens[2] + "\n " + top10Batsmens[3] + "\n " + top10Batsmens[4] + "\n " + top10Batsmens[5] + "\n " + top10Batsmens[6] + "\n " + top10Batsmens[7] + "\n " + top10Batsmens[8] + "\n " + top10Batsmens[9]);
			System.out.println(" \n Top 10 Batsmen are : \n");
		for(String top10Batsmen : top10Batsmens){
			System.out.println(top10Batsmen);
		}
	//System.out.println("\n The Top 10 Bowlers are: " + top10Bowlers[0] + "\n " + top10Bowlers[1] + "\n " + top10Bowlers[2] + "\n " + top10Bowlers[3] + "\n " + top10Bowlers[4] + "\n " + top10Bowlers[5] + "\n " + top10Bowlers[6] + "\n " + top10Bowlers[7] + "\n " + top10Bowlers[8] + "\n " + top10Bowlers[9]);
			System.out.println("\n The Top 10 Bowlers Are : \n");
		for(int bowler = 0; bowler < top10Bowlers.length ; bowler++){
			System.out.println(top10Bowlers[bowler]);
		}
       // System.out.println("\n The Top 10 ICC Teams are: " + top10ICCTeams[0] + "\n " + top10ICCTeams[1] + "\n " + top10ICCTeams[2] + "\n " + top10ICCTeams[3] + "\n " + top10ICCTeams[4] + "\n " + top10ICCTeams[5] + "\n " + top10ICCTeams[6] + "\n " + top10ICCTeams[7] + "\n " + top10ICCTeams[8] + "\n " + top10ICCTeams[9]);
			System.out.println(" \n The Top 10 ICC Teams are : \n");
		for(String top10ICCTeam : top10ICCTeams){
			System.out.println(top10ICCTeam);
		}
        System.out.println("###############################################################################################################################");
    }
}
