class AmusementPark {
    String name;
    String place;
    int noOfGames;
    int id;

    public AmusementPark(String name, String place, int noOfGames, int id) {
        this.name = name;
        this.place = place;
        this.noOfGames = noOfGames;
        this.id = id;
    }

    public void printDetails() {
        System.out.println("Amusement Park ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Place: " + place);
        System.out.println("No. of Games: " + noOfGames);
        System.out.println(); 
    }
}
