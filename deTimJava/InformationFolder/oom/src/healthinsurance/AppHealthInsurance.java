package healthinsurance;

import java.util.ArrayList;

public class AppHealthInsurance {
    public static void main(String[] args) {
        AppHealthInsurance appHealthInsurance = new AppHealthInsurance();
        appHealthInsurance.typeOne();
        appHealthInsurance.typeTwo();
        appHealthInsurance.typeThree();
    }

    public void typeOne(){
        HealthInsurance TKK = new HealthInsurance(165315, "Techniker Krankenkasse");

        Patient patient = new Patient(65613, "Tim", TKK);
        System.out.println(patient.toString());
    }

    public void typeTwo(){
        HealthInsurance TKK = new HealthInsurance(165315, "Techniker Krankenkasse");
        HealthInsurance DAK = new HealthInsurance(489654, "Dak Krankenversicherung");

        Patient patient = new Patient(65613, "Tim", TKK);
        Patient patient1 = new Patient(46512, "Tim", DAK);

        System.out.println(patient.toString());
        System.out.println(patient1.toString());

    }

    public void typeThree(){
        ArrayList<HealthInsurance> insuranceList = new ArrayList<HealthInsurance>();
        HealthInsurance DAK = new HealthInsurance(489654, "Dak Krankenversicherung");
        HealthInsurance TKK = new HealthInsurance(165315, "Techniker Krankenkasse");
        insuranceList.add(DAK);
        insuranceList.add(TKK);


    }

    public HealthInsurance createHealthinsurance(){
        HealthInsurance TKK = new HealthInsurance(165315, "Techniker Krankenkasse");
        return  TKK;
    }
}
