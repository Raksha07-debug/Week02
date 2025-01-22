public class Patient {
    // Static variable shared across all patients
    private static String hospitalName = "General Hospital";
    private static int totalPatients = 0;

    // Final variable to uniquely identify each patient
    private final int patientID;

    // Instance variables for patient details
    private String name;
    private int age;
    private String ailment;

    // Constructor to initialize patient details
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++; // Increment total patients for each new instance
    }

    // Static method to return the total number of patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method to display patient details
    public void displayPatientDetails() {
        if (this instanceof Patient) { // Check if 'this' is an instance of Patient
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Ailment: " + this.ailment);
            System.out.println("Patient ID: " + this.patientID);
        } else {
            System.out.println("Invalid patient object.");
        }
    }

    // Main method to test the Patient class
    public static void main(String[] args) {
        // Creating patient instances
        Patient p1 = new Patient("Alice", 30, "Flu", 101);
        Patient p2 = new Patient("Bob", 45, "Cough", 102);

        // Displaying the details of the patients
        System.out.println("Displaying patient details:");
        p1.displayPatientDetails();
        p2.displayPatientDetails();

        // Displaying the total number of patients
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
    }
}
