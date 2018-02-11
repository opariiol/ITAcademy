package ua.org.oa.timoshenkolv.HomeTask1;

public class Patient {
    public int id;
    public String surname;
    public int age;
    public boolean medicalPolicy;   //наличие медицинского полиса
    public String diagnosis;        //диагноз




    public Patient (int newId, String newSurname, int newAge,           //конструктор для обьектов класса Patient
                    boolean newMedicalPolicy, String newDiagnosis){
        id=newId;
        surname=newSurname;
        age=newAge;
        medicalPolicy=newMedicalPolicy;
        diagnosis=newDiagnosis;


    }

    @Override
    public String toString() {                              //мой toString
        return "Patient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", medicalPolicy=" + medicalPolicy +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }

    public static void treatPatient (String diagnosis){           //метод лечитьПациента
       boolean diagnosis1;
    String healthyPatient="Healthy";                            //переменная типа String c диагнозом "Здоров"
    diagnosis1=diagnosis.equals( healthyPatient);               //сравнить значение 2-ух переменных типа String
    if (diagnosis1) {
        diagnosis = healthyPatient;                             // если диагноз "Здоров"
        System.out.println("To discharge from hospital");       // то "Выписать из больницы"
    }
    else System.out.println("To take medicine");                //иначе "Принять лекарство"
   }
    public static void medicalPolicyPay(boolean medicalPolicy){         // метод оплатить медицинский полис
        System.out.println(medicalPolicy?"Medical policy ALREADY paid!":"Medical policy paid");

    }

}




