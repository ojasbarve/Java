class Doctor {
    private int doctorId;
    private String name;
    private String specialization;

    public Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    public void displayDoctor() {
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("--------------------------");
    }
}

class Patient {
    private int patientId;
    private String name;
    private String disease;

    public Patient(int patientId, String name, String disease) {
        this.patientId = patientId;
        this.name = name;
        this.disease = disease;
    }

    public void displayPatient() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Disease: " + disease);
        System.out.println("--------------------------");
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Doctor d1 = new Doctor(101, "Dr. Sharma", "Cardiologist");
        Doctor d2 = new Doctor(102, "Dr. Mehta", "Neurologist");

        Patient p1 = new Patient(201, "Rahul", "Fever");
        Patient p2 = new Patient(202, "Anita", "Migraine");

        d1.displayDoctor();
        d2.displayDoctor();

        p1.displayPatient();
        p2.displayPatient();
    }
}
