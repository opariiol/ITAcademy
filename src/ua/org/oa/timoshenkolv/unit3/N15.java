package ua.org.oa.timoshenkolv.unit3;

public class N15 {
    public static void main(String[] args) {
        int n=6,p=1,i;
        if ((n<=0)&(p==0))
            System.out.println("исходные данные заданы не верно");
        else
            for (i=1;i<=n;i++){
                p*=i;
            }
        System.out.println("произведение 1*2*..*n= "+p);
    }
    }

