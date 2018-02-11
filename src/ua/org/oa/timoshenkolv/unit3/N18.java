package ua.org.oa.timoshenkolv.unit3;

public class N18 {
    public static void main(String[] args) {
        int n = 37574647;
        final int A = 10;
        if (n <= 0)
            System.out.println("исходные данные заданы не верно");
        else {
            do {
                System.out.println(n % A);
                n = n / A;
            }
            while (n >= A);
            System.out.println(n);
        }

    }
}