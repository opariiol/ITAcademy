package ua.org.oa.timoshenkolv.unit3;

public class N17 {
    public static void main(String[] args) {
        int n=7,k=10;
        if (n<=1||((3*k)<n))
        System.out.println("исходные данные заданы не верно");
        else {
            while ((3*k)>n) {
                k--;
            }
            k++;
            System.out.println("k="+k);
            }
        }
}
