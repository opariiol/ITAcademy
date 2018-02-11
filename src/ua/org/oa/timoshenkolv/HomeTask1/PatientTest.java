package ua.org.oa.timoshenkolv.HomeTask1;

public class PatientTest {
    public static void main(String[] args) {
        Patient patient1=new Patient(1,"Ivanov",20,true,"Tonsillitis");
        Patient patient2=new Patient(2,"Petrov",60,false,"Pharyngitis");

        System.out.println(patient1);
        System.out.println(patient2);
        patient1.medicalPolicyPay(true);
        patient2.medicalPolicyPay(false);
       patient1.treatPatient ("Tonsillitis");
        patient2.treatPatient ("Healthy");


    }
}
