package ua.org.oa.timoshenkolv.unit3;

public class N5 {
    public static void main(String[] args) {
        int a=3, b=-3, c=2, min;
        if (a<b)
            min=a;
        else min=b;
        if (c<min)
            min=c;



        System.out.println("Cумма= "+(a+b+c-min));
    }
}