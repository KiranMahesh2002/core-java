class DisneyPlus {
	
    static String top10Movies[] = {"Black Panther", "Ratatouille ", "The Princess Bride", "Raiders of the Lost Ark", "Rogue One", "Spider-Man: Homecoming","Who Framed Roger Rabbit?", "Mary Poppins ", "Hamilton", "Return of the Jedi"};
    
      static String kannadaMovies[] = {"Gaalipata", "Simple Agi Ondh Love Story ", "Chamak", "Paramathma", "Sidlingu", "Sidlingu", "Nenapali", "Mussanje Mathu", "kushi Kushiyagi", "Love Mocktail", "godhi banna sadharana maikattu", "Gulabi", "Kavacha", "Hanu Man", "Mungaru Male", "Chamak", "Drishya", "kirik Party", "Dia"};

     static String englishMovies[] = {"Coco", "soul", "The Favourite", "The Beatles", "Last Duel", "Ad Astra", "Encanto", "Widows", "Black Swan", "Can you forgive me?", "The Martin", "deadpool", "Harry Potter and the Philosopher's Stone", "Gandhi", "The Avengers", "Madagascar", "Spider-Man: Far From Home", "Iron Man", "The Dark Knight Rises", "DeadPool 2", "Batman", "Pirates of the Caribbean: The Curse of the Black Pearl", "the Notebook"};

       static String hindiMovies[] = {"chhichhore", "Mission Mangal", "A Thursday", "12th Fail", "Gulmohar", "raid", "Bhag milka bhag", "Super 39", "Bajrangi bhaijaan", "Bhool Bhulaiyaa", "Bhramashtra", "Govinda Mera Naam", "MS Dhoni", "Tanhaji", "Indias Most wanted", "PK", "Pink", "Barfi!", "Bala", "Jolly LlB"};

     static String tamilMovies[] = {"Rudramambapuram", "Geetha Govindam", "Akhanda", "ala Vaikunthapuramulo", "Bichagadu 2", "Arjun reddy", "The Warriorr", "Jersey", "Rangasthalam", "F2", "Veera simha Reddy", "Sadha Nannu Nadipe", "Mallikapuram", "raajahyogam", "Jallikattu", "Butterfly", "Liger", "bheemla Nayak", "Prince"  };

    public static void main(String[] movies) {
        System.out.println("##################################################################################################################################");
        
      //  System.out.println("Top 10 Movies: " + top10Movies[0] + "\n " + top10Movies[1] + "\n " + top10Movies[2] + "\n " + top10Movies[3] + "\n " + top10Movies[4] + "\n " + top10Movies[5] + "\n " + top10Movies[6] + "\n " + top10Movies[7] + "\n " + top10Movies[8] + "\n " + top10Movies[9]);
		System.out.println(" \n The TOP 10 Movies Are : \n");
		for(int index = 0; index < top10Movies.length ; index++){
			System.out.println(top10Movies[index]);
		}

        
        //System.out.println("\nKannada Movies: " + kannadaMovies[0] + "\n " + kannadaMovies[1] + "\n " + kannadaMovies[2] + "\n " + kannadaMovies[3] + "\n " + kannadaMovies[4] + "\n " + kannadaMovies[5] + "\n " + kannadaMovies[6] + "\n " + kannadaMovies[7] + "\n " + kannadaMovies[8] + "\n " + kannadaMovies[9] + "\n " + kannadaMovies[10] + "\n " + kannadaMovies[11] + "\n " + kannadaMovies[12] + "\n " + kannadaMovies[13] + "\n " + kannadaMovies[14] + "\n " + kannadaMovies[15]);
        System.out.println(" \n The Kannada Movies are : \n");
		for(String kanadaMovie:kannadaMovies){
			System.out.println(kanadaMovie);
		}
	//System.out.println("\nEnglish Movies: " + englishMovies[0] + "\n " + englishMovies[1] + "\n " + englishMovies[2] + "\n " + englishMovies[3] + "\n " + englishMovies[4] + "\n " + englishMovies[5] + "\n " + englishMovies[6] + "\n " + englishMovies[7] + "\n " + englishMovies[8] + "\n " + englishMovies[9] + "\n " + englishMovies[10] + "\n " + englishMovies[11] + "\n " + englishMovies[12] + "\n " + englishMovies[13] + "\n " + englishMovies[14] + "\n " + englishMovies[15] + "\n " + englishMovies[16] + "\n " + englishMovies[17] + "\n " + englishMovies[18] + "\n " + englishMovies[19] + "\n " + englishMovies[20] + "\n " + englishMovies[21] + "\n " + englishMovies[22]);
	System.out.println("\n The English Movies Are : \n");
		for(int hollywood = 0; hollywood < englishMovies.length ; hollywood++){
			System.out.println(englishMovies[hollywood]);
		}
	//System.out.println("\nHindi Movies: " + hindiMovies[0] + "\n " + hindiMovies[1] + "\n " + hindiMovies[2] + "\n " + hindiMovies[3] + "\n " + hindiMovies[4] + "\n " + hindiMovies[5] + "\n " + hindiMovies[6] + "\n " + hindiMovies[7] + "\n " + hindiMovies[8] + "\n " + hindiMovies[9] + "\n " + hindiMovies[10] + "\n " + hindiMovies[11] + "\n " + hindiMovies[12] + "\n " + hindiMovies[13] + "\n " + hindiMovies[14] + "\n " + hindiMovies[15] + "\n " + hindiMovies[16] + "\n " + hindiMovies[17] + "\n " + hindiMovies[18] + "\n " + hindiMovies[19]);
	System.out.println("\n The Hindi Movies are : \n");
		for(String hindiMovie:hindiMovies){
			System.out.println(hindiMovie);
		}
	//System.out.println("\n The Tamil Movies: " + tamilMovies[0] + "\n " + tamilMovies[1] + "\n " + tamilMovies[2] + "\n " + tamilMovies[3] + "\n " + tamilMovies[4] + "\n " + tamilMovies[5] + "\n " + tamilMovies[6] + "\n " + tamilMovies[7] + "\n " + tamilMovies[8] + "\n " + tamilMovies[9] + "\n " + tamilMovies[10] + "\n " + tamilMovies[11] + "\n " + tamilMovies[12] + "\n " + tamilMovies[13] + "\n " + tamilMovies[14] + "\n " + tamilMovies[15] + "\n " + tamilMovies[16] + "\n " + tamilMovies[17]);
		System.out.println("\n The Tamil Movies are : \n");
		for(String tamilMovie:tamilMovies){
			System.out.println(tamilMovie);
		}
        System.out.println("#############################################################################################################################################");
    }
}
