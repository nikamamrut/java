//q20
import java.util.ArrayList;

public class Patientlist {
    public static void main(String[] args) {
        // create a list of patients
        ArrayList<String> patients = new ArrayList<>();
        patients.add("Alice");
        patients.add("Bob");
        patients.add("Charlie");
        patients.add("David");
        patients.add("Alex");
        patients.add("Anne");
        
        // display the names of patients starting with 'A'
        System.out.println("Patients starting with 'A':");
        for (String patient : patients) {
            if (patient.startsWith("A")) {
                System.out.println(patient);
            }
        }
    }
}

