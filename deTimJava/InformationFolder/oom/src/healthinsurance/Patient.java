package healthinsurance;

public class Patient {

    private int patientNr;
    private String patientNm;
    private String address;
    private String dob;
    private HealthInsurance healthInsurance;
    private  boolean insuranceCardYN;

    public Patient(int patientNr, String patientNm, HealthInsurance healthInsurance) {
        this.patientNr = patientNr;
        this.patientNm = patientNm;
        this.healthInsurance = healthInsurance;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientNr=" + patientNr +
                ", patientNm='" + patientNm + '\'' +
                ", address='" + address + '\'' +
                ", dob='" + dob + '\'' +
                ", healthInsurance=" + healthInsurance +
                ", insuranceCardYN=" + insuranceCardYN +
                '}';
    }
}
