package ua.org.oa.timoshenkolv.unit3;

public class N14 {
    public static void main(String[] args) {
        int a=-1,b=5, summ=0;
        if (a>=b)
            System.out.println("исходные данные заданы не верно");
        else
            for (;a<=b;a++){
                summ+=a;
            }
        System.out.println("сумма= "+summ);


    }
}
