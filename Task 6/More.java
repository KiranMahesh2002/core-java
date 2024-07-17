class More{

	 static String groceries[] = {"Fresh Products", "Dairy Products", "Meat and Seafood", "Pantry Staples", "Beverages", "Snacks"};
static String beverages[] = {"Tea", "Juices", "Soft Drinks", "Coffee", "Energy Drinks", "Cold Water"};
static String[] perfumes = {"wild Stone", "Axe", "Fogg", "Perfume Sets", "MAD", "Eva"};
static String crockeries[] = {"Plates", "Bowls", "Cups and Saucers", "Mugs", "Serving Darehes", "Teapots"};
	  static String homeDecors[] = {"Wall Art", "Decorative Pillows", "Vases", "Clocks", "Mirrors", "Curtains"};
static String[] clothingCategories = {"Tops", "Bottoms", "Dresses", "Outerwear", "Activewear", "Swimwear"};
	static String electronicsCategories[] = {"Smartphones", "Laptops", "Tablets", "Cameras", "Headphones", "Smart Home Devices"};
static String[] bookGenres = {"Fiction", "Non-fiction", "Science Fiction", "Fantasy", "Mystery", "Biography"};
	static String musicGenres[] = {"Pop", "Rock", "Hip Hop", "Jazz", "Electronic", "Classical"};
static String[] sportsEquipment = {"Football", "Basketball", "Tennare Racquets", "Golf Clubs", "Yoga Mats", "Cycling Gear"};
	static String furnitureTypes[] = {"Sofas", "Tables", "Chairs", "Beds", "Desks", "Shelves"};
static String[] shoeBrands = {"Nike", "Adidas", "Puma", "Reebok", "New Balance", "Vans", "Converse", "Under Armour"};
	static String musicInstruments[] = {"Piano", "Guitar", "Violin", "Drums", "Saxophone", "Trumpet", "Flute", "Cello"};
 static String bodyLotions[] = {"Body Moareturizers", "Body Butters", "Hand Creams", "Body Oils", "Body Lotion Sets", "Skin Lotions"};
	static String travelLeareureCategories[] = {"Luggage", "Travel Accessories", "Hotel Stays", "Cruarees", "Adventure Tours", "Car Rentals", "Travel Insurance", "Event Tickets"};

public static void main(String[] brands){
			System.out.println("##########################################################");

//System.out.println("the Available Groceries are " + groceries[0] + "\n >>> " + groceries[1] + "\n >>> " + groceries[2] + "\n >>> "+ groceries[3] + "\n >>> " + groceries[4] + "\n >>> " + groceries[5]);
	System.out.println(" \n The Available Groceries are : \n");
		for(String grocerie : groceries){
			System.out.println(grocerie);
		}
			//System.out.println("the Available Beverages are " + beverages[0] + "\n >>> " + beverages[1] + "\n >>> " + beverages[2] + "\n >>> "+ beverages[3] + "\n >>> " + beverages[4] + "\n >>> " + beverages[5]);
		System.out.println("\n The Available Beverages Are : \n");
		for(int liquid = 0; liquid < beverages.length ; liquid++){
			System.out.println(beverages[liquid]);
		}
//System.out.println("the Available Perfumes are " + perfumes[0] + "\n >>> " + perfumes[1] + "\n >>> " + perfumes[2] + "\n >>> "+ perfumes[3] + "\n >>> " + perfumes[4] + "\n >>> " + perfumes[5]);
	System.out.println(" \n The Available Perfumes are : \n");
		for(String perfume : perfumes){
			System.out.println(perfume);
		}
		
	//System.out.println("the Available crockeries are " + crockeries[0] + "\n >>> " + crockeries[1] + "\n >>> " + crockeries[2] + "\n >>> "+ crockeries[3] + "\n >>> " + crockeries[4] + "\n >>> " + crockeries[5]);
			System.out.println("\n The Available crockeries Are : \n");
		for(int dining = 0; dining < crockeries.length ; dining++){
			System.out.println(crockeries[dining]);
		}
		
//System.out.println("the Available Home Decor are " + homeDecors[0] + "\n >>> " + homeDecors[1] + "\n >>> " + homeDecors[2] + "\n >>> "+ homeDecors[3] + "\n >>> " + homeDecors[4] + "\n >>> " + homeDecors[5]);
	System.out.println(" \n The Available Home Decor Items are : \n");
		for(String homeDecor : homeDecors){
			System.out.println(homeDecor);
		}
		
		//System.out.println("the Available clothings  are " + clothingCategories[0] + "\n >>> " + clothingCategories[1] + "\n >>> " + clothingCategories[2] + "\n >>> "+ clothingCategories[3] + "\n >>> " + clothingCategories[4] + "\n >>> " + clothingCategories[5]);
			System.out.println("\n The Available clothings Are : \n");
		for(int cloth = 0; cloth < clothingCategories.length ; cloth++){
			System.out.println(clothingCategories[cloth]);
		}	
			
				
	//System.out.println("the Available Electronics items as Categories are " + electronicsCategories[0] + "\n >>> " + electronicsCategories[1] + "\n >>> " + electronicsCategories[2] + "\n >>> "+ electronicsCategories[3] + "\n >>> " + electronicsCategories[4] + "\n >>> " + electronicsCategories[5]);
	System.out.println(" \n The Available Electronics items as Categories are : \n");
		for(String electronicsCategorie : electronicsCategories){
			System.out.println(electronicsCategorie);
		}	
		
//System.out.println("the Available Book Genres are " + bookGenres[0] + "\n >>> " + bookGenres[1] + "\n >>> " + bookGenres[2] + "\n >>> "+ bookGenres[3] + "\n >>> " + bookGenres[4] + "\n >>> " + bookGenres[5]);
	System.out.println("\n The Available Book Genres Are : \n");
		for(int book = 0; book < bookGenres.length ; book++){
			System.out.println(bookGenres[book]);
		}
		
	//System.out.println("the Available Music Genres are " + musicGenres[0] + "\n >>> " + musicGenres[1] + "\n >>> " + musicGenres[2] + "\n >>> "+ musicGenres[3] + "\n >>> " + musicGenres[4] + "\n >>> " + musicGenres[5]);
		System.out.println(" \n The Available Music Genres are : \n");
		for(String musicGenre : musicGenres){
			System.out.println(musicGenre);
		}
//System.out.println("the Available Sports Equipment are " + sportsEquipment[0] + "\n >>> " + sportsEquipment[1] + "\n >>> " + sportsEquipment[2] + "\n >>> "+ sportsEquipment[3] + "\n >>> " + sportsEquipment[4] + "\n >>> " + sportsEquipment[5]);
	System.out.println("\n The Available Sports Equipment Are : \n");
		for(int sports = 0; sports < sportsEquipment.length ; sports++){
			System.out.println(sportsEquipment[sports]);
		}
		
		//System.out.println("the Available Furniture Types are " + furnitureTypes[0] + "\n >>> " + furnitureTypes[1] + "\n >>> " + furnitureTypes[2] + "\n >>> "+ furnitureTypes[3] + "\n >>> " + furnitureTypes[4] + "\n >>> " + furnitureTypes[5]);
			System.out.println(" \n The  Available Furniture Types are : \n");
		for(String furnitureType : furnitureTypes){
			System.out.println(furnitureType);
		}
		
//System.out.println("the Available Shoe Brands are " + shoeBrands[0] + "\n >>> " + shoeBrands[1] + "\n >>> " + shoeBrands[2] + "\n >>> "+ shoeBrands[3] + "\n >>> " + shoeBrands[4] + "\n >>> " + shoeBrands[5]);
	System.out.println("\n The Available Shoe Brands Are : \n");
		for(int shoe = 0; shoe < shoeBrands.length ; shoe++){
			System.out.println(shoeBrands[shoe]);
		}
			//System.out.println("the Available Musical Instruments are " + musicInstruments[0] + "\n >>> " + musicInstruments[1] + "\n >>> " + musicInstruments[2] + "\n >>> "+ musicInstruments[3] + "\n >>> " + musicInstruments[4] + "\n >>> " + musicInstruments[5]);
			System.out.println(" \n The Available Musical Instruments are : \n");
		for(String musicInstrument: musicInstruments){
			System.out.println(musicInstrument);
		}
//System.out.println("the Available Body Lotions are " + bodyLotions[0] + "\n >>> " + bodyLotions[1] + "\n >>> " + bodyLotions[2] + "\n >>> "+ bodyLotions[3] + "\n >>> " + bodyLotions[4] + "\n >>> " + bodyLotions[5]);			
	System.out.println("\n The Available Body Lotions Are : \n");
		for(int lotion = 0; lotion < bodyLotions.length ; lotion++){
			System.out.println(bodyLotions[lotion]);
		}	
			//System.out.println("the Available Travel Leareure Categories are " + travelLeareureCategories[0] + "\n >>> " + travelLeareureCategories[1] + "\n >>> " + travelLeareureCategories[2] + "\n >>> "+ travelLeareureCategories[3] + "\n >>> " + travelLeareureCategories[4] + "\n >>> " + travelLeareureCategories[5]);
		System.out.println(" \n The  Available Travel Leareure Categories are : \n");
		for(String travelLeareureCategorie :travelLeareureCategories){
			System.out.println(travelLeareureCategorie);
		}


}

}