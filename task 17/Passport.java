class Passport {
    String cpvLocation;
    int dcdrLocation;
    String givenName;
    String surName;
    String dob;
    String email;
    boolean isemailoginSame;
    String loginId;
    String pwd;
    String cwd;
    String hintQue;
    String hintAns;
    String captcha;
    boolean isPassportCreated = false;

    public boolean createPassport(String cpvLocation, int dcdrLocation, String givenName, String surName,
                                  String dob, String email, boolean isemailoginSame, String loginId,
                                  String pwd, String cwd, String hintQue, String hintAns, String captcha) {

        boolean isGivenCpvLocValid = false;
        boolean isGivenDcdrLocValid = false;
        boolean isGivenNameValid = false;
        boolean isGivenSurnameValid = false;
        boolean isGivenDobValid = false;
        boolean isGivenEmailValid = false;
        boolean isGivenLoginIdValid = false;
        boolean isGivenPwdValid = false;
        boolean isGivenCwdValid = false;
        boolean isGivenHintQueValid = false;
        boolean isGivenHintAnsValid = false;
        boolean isGivenCaptchaValid = false;

        if (cpvLocation != null && !cpvLocation.isEmpty()) {
            this.cpvLocation = cpvLocation;
            isGivenCpvLocValid = true;
        } else {
            System.out.println("Please enter CPV location correctly");
        }

        if (dcdrLocation >= 0) {
            this.dcdrLocation = dcdrLocation;
            isGivenDcdrLocValid = true;
        } else {
            System.out.println("Please enter DCDR location correctly");
        }

        if (givenName != null && !givenName.isEmpty()) {
            this.givenName = givenName;
            isGivenNameValid = true;
        } else {
            System.out.println("Please enter given name correctly");
        }

        if (surName != null && !surName.isEmpty()) {
            this.surName = surName;
            isGivenSurnameValid = true;
        } else {
            System.out.println("Please enter surname correctly");
        }

        if (dob != null && !dob.isEmpty()) {
            this.dob = dob;
            isGivenDobValid = true;
        } else {
            System.out.println("Please enter date of birth correctly");
        }

        if (email != null && !email.isEmpty()) {
            this.email = email;
            isGivenEmailValid = true;
        } else {
            System.out.println("Please enter email correctly");
        }

        if (isemailoginSame) {
            this.isemailoginSame = isemailoginSame;
        } else {
            System.out.println("Please confirm email login correctly");
        }

        if (loginId != null && !loginId.isEmpty()) {
            this.loginId = loginId;
            isGivenLoginIdValid = true;
        } else {
            System.out.println("Please enter login ID correctly");
        }

        if (pwd != null && pwd.equals(cwd)) {
            this.pwd = pwd;
            this.cwd = cwd;
            isGivenPwdValid = true;
        } else {
            System.out.println("Please enter and confirm password correctly");
        }

        if (hintQue != null && !hintQue.isEmpty()) {
            this.hintQue = hintQue;
            isGivenHintQueValid = true;
        } else {
            System.out.println("Please enter hint question correctly");
        }

        if (hintAns != null && !hintAns.isEmpty()) {
            this.hintAns = hintAns;
            isGivenHintAnsValid = true;
        } else {
            System.out.println("Please enter hint answer correctly");
        }

        if (captcha != null && !captcha.isEmpty()) {
            this.captcha = captcha;
            isGivenCaptchaValid = true;
        } else {
            System.out.println("Please enter captcha correctly");
        }

        if (isGivenCpvLocValid && isGivenDcdrLocValid && isGivenNameValid && isGivenSurnameValid &&
                isGivenDobValid && isGivenEmailValid && isGivenLoginIdValid && isGivenPwdValid &&
                isGivenHintQueValid && isGivenHintAnsValid && isGivenCaptchaValid) {
            isPassportCreated = true;
        }

        return isPassportCreated;
    }

    public void getPassportDetails() {
        if (isPassportCreated) {
            System.out.println("Passport details:");
            System.out.println("CPV Location: " + cpvLocation);
            System.out.println("DCDR Location: " + dcdrLocation);
            System.out.println("Given Name: " + givenName);
            System.out.println("Surname: " + surName);
            System.out.println("Date of Birth: " + dob);
            System.out.println("Email: " + email);
            System.out.println("Is Email Same as Login: " + isemailoginSame);
            System.out.println("Login ID: " + loginId);
            System.out.println("Hint Question: " + hintQue);
            System.out.println("Hint Answer: " + hintAns);
            System.out.println("Captcha: " + captcha);
        } else {
            System.out.println("Passport details are not correctly provided.");
        }
    }
}
