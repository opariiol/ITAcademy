package ua.org.oa.timoshenkolv.unit3;

public class N9 {
    public static void main(String[] args) {
        int a=1, b=1,c=2, d=1;
        if ((a==b)&(a==c))
            System.out.println(4);
        else if ((a==b)&(a==d))
            System.out.println(3);
        else  if ((a==c)&(a==d))
            System.out.println(2);
        else if ((b==c)&(c==d))
            System.out.println(1);
        else System.out.println("Исходные данные не верны");
    }
}
