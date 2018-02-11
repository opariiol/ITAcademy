package ua.org.oa.timoshenkolv.unit3;

public class N11 {
    public static void main(String[] args) {
        int i=13;
        switch (i){
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
                default:
                    System.out.println("значение задано не верно");
        }
    }
}
