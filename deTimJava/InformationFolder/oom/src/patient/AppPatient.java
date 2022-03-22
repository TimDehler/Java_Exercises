package patient;

public class AppPatient {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Max Mustermann", 16131561, "AB649465", "18.11.2001");
        Patient patient2 = new Patient("Delia Müller", 749532, "AB498409", "24.03.1999");

        System.out.println(patient1);
        System.out.println(patient2);
    }
}
