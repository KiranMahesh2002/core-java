class YTechRunner {
    public static void main(String[] tech) {
        
        YTech.register("Someone", "Someone@email.com", "securepassword", "premium");

        
        YTech.getRegisteredDetails();
    }
}
