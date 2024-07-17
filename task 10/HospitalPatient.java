class HospitalPatient {
    static String patientName;
    static String patientEmail;
    static String patientPhoneNumber;
    static int patientAge;
    static String patientGender;
    static String patientAddress;
    static String doctorName;
    static String roomNumber;
    static String admissionDate;

    public static boolean createPatientRecord(String name, String email, String phone,
	int age, String gender, String address,  String doctor, String room, String admission) {
        boolean isRecordCreated = false;
        boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isPhoneValid = false;
        boolean isAgeValid = false;
        boolean isGenderValid = false;
        boolean isAddressValid = false;
        boolean isDoctorValid = false;
        boolean isRoomValid = false;
        boolean isAdmissionValid = false;

        if (name != null ) {
            patientName = name;
            isNameValid = true;
        } else {
            System.out.println("Please provide a valid Patient Name");
        }

        if (email != null ) {
            patientEmail = email;
            isEmailValid = true;
        } else {
            System.out.println("Please provide a valid Email");
        }

        if (phone != null ) {
            patientPhoneNumber = phone;
            isPhoneValid = true;
        } else {
            System.out.println("Please provide a valid Phone Number");
        }

        if (age > 0) {
            patientAge = age;
            isAgeValid = true;
        } else {
            System.out.println("Please provide a valid Age");
        }

        if (gender != null ) {
            patientGender = gender;
            isGenderValid = true;
        } else {
            System.out.println("Please provide a valid Gender");
        }

        if (address != null ) {
            patientAddress = address;
            isAddressValid = true;
        } else {
            System.out.println("Please provide a valid Address");
        }


        if (doctor != null ) {
            doctorName = doctor;
            isDoctorValid = true;
        } else {
            System.out.println("Please provide a valid Doctor Name");
        }

        if (room != null ) {
            roomNumber = room;
            isRoomValid = true;
        } else {
            System.out.println("Please provide a valid Room Number");
        }

        if (admission != null ) {
            admissionDate = admission;
            isAdmissionValid = true;
        } else {
            System.out.println("Please provide a valid Admission Date");
        }

        if (isNameValid && isEmailValid && isPhoneValid && isAgeValid && isGenderValid && isAddressValid  && isDoctorValid && isRoomValid && isAdmissionValid) {
            isRecordCreated = true;
        }

        return isRecordCreated;
    }

    public static void getPatientDetails() {
        System.out.println("The Patient Name is : " + patientName);
        System.out.println("The Email Id is : " + patientEmail);
        System.out.println("The Phone Number is: " + patientPhoneNumber);
        System.out.println("The Age is : " + patientAge);
        System.out.println("The Gender is : " + patientGender);
        System.out.println("The Address is : " + patientAddress);
        System.out.println("The Doctor Name is : " + doctorName);
        System.out.println("The Room Number is : " + roomNumber);
        System.out.println("The Date of Admission is : " + admissionDate);
    }
}
