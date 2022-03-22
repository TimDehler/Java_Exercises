package patient;

public class Patient {

    private String name;
    private int patientNumber;
    private String insuranceNumber;
    private String dateOfBirth;

    public Patient(String name, int patientNumber, String insuranceNumber, String dateOfBirth) {
        this.name = name;
        this.patientNumber = patientNumber;
        this.insuranceNumber = insuranceNumber;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Patient:" +
                " name= '" + name + '\'' +
                ", patient number= " + patientNumber +
                ", insurance number= '" + insuranceNumber + '\'' +
                ", date of birth= '" + dateOfBirth + '\'';
    }
}
