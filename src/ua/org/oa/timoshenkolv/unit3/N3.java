package ua.org.oa.timoshenkolv.unit3;

public class N3 {
    public static void main(String[] args) {
        double a, b,c,d,x1,x2;
        a=2; b=3; c=4;
        d=Math.abs(b*b-4*a*c);
        x1=(-b+Math.sqrt(d))/(2*a);
        x2=(-b-Math.sqrt(d))/(2*a);
        System.out.println("x1= "+x1);
        System.out.println("x2= "+x2);

    }
}
