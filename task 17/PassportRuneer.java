class PassportRunner {
    public static void main(String[] args) {
        Passport passport = new Passport();

        passport.createPassport("PO", 17, "Devilers", "AbhramBenjamin", "17/02/1981", "Abd17@gmail.com", true,
                "Abd17@gmail.com", "abd@17", "abd@17", "sport", "rubby", "12JIT7");
        passport.getPassportDetails();
    }
}
