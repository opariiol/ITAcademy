package ua.org.oa.timoshenkolv.unit3;

public class N16 {
    public static void main(String[] args) {
        int a=150,b=20, b1=0;
        if ((a<b)||(a<=0)||(b<=0))
            System.out.println("исходные данные заданы не верно");
        else {
            while (((a-b1)>=b)){
            b1+=b;
            }
        System.out.println("Длинна незанятой части а= "+(a-b1));
        }
    }

}
