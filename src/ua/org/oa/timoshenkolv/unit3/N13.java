package ua.org.oa.timoshenkolv.unit3;

public class N13 {
    public static void main(String[] args) {
        int a=1,b=5, n=0;
        if (a>=b)
            System.out.println("исходные данные заданы не верно");
        else
            for (;a<=b;a++){
                System.out.println(a);
                n++;
            }
        System.out.println("количество чисел= "+n);
    }
}
