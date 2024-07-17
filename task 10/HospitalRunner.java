public class HospitalRunner {
    public static void main(String[] patient) {
        
        boolean patientRecordCreated = HospitalPatient.createPatientRecord(
            "BHUVAN", 
            "bhuvan@25gmail.com", 
            "9876543210", 
            22, 
            "male", 
            "Durga", 
            "Dr.Bharath", 
            "143", 
            "20-06-2024"
        );
        
        System.out.println("Patient Record Created: " + patientRecordCreated);
        if (patientRecordCreated) {
            HospitalPatient.getPatientDetails();
        }
    }
}
