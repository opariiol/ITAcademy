package ua.org.oa.timoshenkolv.unit3;

public class N12 {
    public static void main(String[] args) {
        int n=4;
        double a=2, b=9;
        if (b==0)
             System.out.println("b должно быть не равно 0");
        else
                switch (n){
                    case 1:
                        System.out.println("a+b= "+(a+b));
                        break;
                    case 2:
                        System.out.println("a-b= "+(a-b));
                        break;
                    case 3:
                        System.out.println("a*b= "+(a*b));
                        break;
                    case 4:
                        System.out.println("a/b= "+(a/b));
                        break;
                        default:
                            System.out.println("исходные данные введены не верно");
                }
        }
    }

