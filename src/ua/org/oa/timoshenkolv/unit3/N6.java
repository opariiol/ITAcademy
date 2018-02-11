package ua.org.oa.timoshenkolv.unit3;

public class N6 {
    public static void main(String[] args) {
        int a=50;
        if (a==0)
            System.out.println("Нулевое число");
        else if (a>0){
            System.out.print("Положительное ");
           }
        else {
            System.out.print("Отрицательное ");
            if (a % 2 == 1)
                System.out.println("нечетное число");
            else
                System.out.println("четное число");

        }






    }
}
