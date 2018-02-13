package ua.org.oa.evlashdv.lecture3;

public class App {

    public static final int MIN_NAME_LENGTH = 2;
    public static String name;

    public static void main(String[] args) {
        System.out.println((2>3) && (5<6));
        System.out.println(method1(false) & method2(false));

        if(name!=null && name.length() > MIN_NAME_LENGTH){
            System.out.println("name = " + name);
        }else{
            System.out.println("Wrong name!");
        }

        System.out.println("true ^ true = " +  (true ^ true));
        System.out.println("false ^ false = " +  (false ^ false));
        System.out.println("true ^ false = " +  (true ^ false));

        int x = 2568;
        System.out.println("x =  " + Integer.toBinaryString(x));
        System.out.println("x<<2 " + Integer.toBinaryString(x<<2));
        System.out.println("x<<2 " + (x<<2));
        System.out.println("~x =" + Integer.toBinaryString(~x));
        System.out.println("~x>>2 " + Integer.toBinaryString(~x>>2));
        System.out.println("~x>>>2 " + Integer.toBinaryString(~x>>>2));
        System.out.println("~x>>2 " + (~x>>2));
        System.out.println("~x>>>2 " + (~x>>>2));
        System.out.println(~x+1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("x =  " + Integer.toBinaryString(x));
        int y = 3987;
        System.out.println("y =  " + Integer.toBinaryString(y));
        System.out.println("x&y= " + Integer.toBinaryString(x&y));
        System.out.println("x|y= " + Integer.toBinaryString(x|y));
        System.out.println("x^y= " + Integer.toBinaryString(x^y));

        int z = 48;

        System.out.println((z & (int)Math.pow(2,4)) != 0);

        int salary;
        int workDay = 25;
        int norma = 22;
        if(workDay >= norma){
            salary = 500;
        }else{
            salary = 200;
        }
        System.out.println(salary);

        int dayNumber = 2;
        final int tuesdayNumber = 2;

        switch (dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case tuesdayNumber:
                System.out.println("Tuesday");
                break;

        }

        System.out.println((name!=null && name.length() > MIN_NAME_LENGTH)?"name = " + name:"Wrong name!");

        int i = 0;
        for (; i < 10; ) {
            System.out.println(i++);
        }
        System.out.println(i);

        byte b = 0;

//        for (;;){
//            System.out.println(b++);
//        }


        m:for (i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if(j == 3){
                    continue m;
                }
                System.out.print("m"+i+j+" ");
            }
            System.out.println();
        }

        {
            int n = 5;
            System.out.println(n);
        }
        //System.out.println(n);

        b:{
            System.out.println("A");
            {
                if(true)
                break b;
                System.out.println("B");
            }
            System.out.println("C");
        }
    }

    private static boolean method1(boolean b) {
        System.out.println("method1(" + b + ")");
        return b;
    }
    private static boolean method2(boolean b) {
        System.out.println("method2(" + b + ")");
        return b;
    }
}
