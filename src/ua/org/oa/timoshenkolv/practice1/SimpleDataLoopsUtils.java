package ua.org.oa.timoshenkolv.practice1;

public class SimpleDataLoopsUtils {
    static byte myByte;
    static short myShort;
    static char myChar;
    static int myInt;
    static long myLong;
    static float myFloat;
    static double myDouble;
    static boolean myBoolean;

    public static void simpleDataClassPrint() {
        System.out.println("myByte= " + myByte);
        System.out.println("myShort= " + myShort);
        System.out.println("myInt= " + myInt);
        System.out.println("myChar= " + myChar);
        System.out.println("myLong= " + myLong);
        System.out.println("myFloat= " + myFloat);
        System.out.println("myDouble= " + myDouble);
        System.out.println("myBoolean= " + myBoolean);
    }

    public static void simpleDataMethodPrint() {
        byte myByte1 = 1;
        short myShort1 = 2;
        char myChar1 = 85;
        int myInt1 = 4;
        long myLong1 = 5;
        float myFloat1 = 6;
        double myDouble1 = 7;
        boolean myBoolean1 = true;
        System.out.println("myByte1= " + myByte1);
        System.out.println("myShort1= " + myShort1);
        System.out.println("myInt1= " + myInt1);
        System.out.println("myChar1= " + myChar1);
        System.out.println("myLong1= " + myLong1);
        System.out.println("myFloat1= " + myFloat1);
        System.out.println("myDouble1= " + myDouble1);
        System.out.println("myBoolean1= " + myBoolean1);
    }

    public static void variableTypeFloatValueAssign() {
        float f1, f2, f3, f4, f5, f6;
        f1 = 1.f;
        f2 = 1;
        f3 = 0x1;
        f4 = 0b1;
        f5 = 1.0e1f;
        f6 = 01f;
        System.out.println("1.= " + f1);
        System.out.println("1= " + f2);
        System.out.println("0x1= " + f3);
        System.out.println("0b1= " + f4);
        System.out.println("1.0e1= " + f5);
        System.out.println("01= " + f6);
    }

    public static void variableTypeShortValueAssign(){


        final int MYINT1 = 12;
        final int MYINT2 = 11;
        final double MYDOUBLE1 = 3.5;
        float myFloat = 3.5f;
        double myDouble = 3.5;
        int myInt = 5;
        byte myByte = 7;
        short myShort1 = (short) (MYINT1 + MYINT2);
        short myShort2 = (short) (MYINT1 + MYDOUBLE1);
        short myShort3 = (short) (myFloat + myInt);
        short myShort4 = (short) (myByte + myShort1);
        short myShort5 = (short) (myFloat + myDouble);
        System.out.println("myShort1= " + myShort1);
        System.out.println("myShort2= " + myShort2);
        System.out.println("myShort3= " + myShort3);
        System.out.println("myShort4= " + myShort4);
        System.out.println("myShort5= " + myShort5);

    }

    public static void isRightTriangle(int side1, int side2, int hipotenuse) {
        if (side1 + side2 > hipotenuse) {
            System.out.println(side1 * side1 + side2 * side2 == hipotenuse * hipotenuse ? "Right Triangle" : "not Right Triangle");
        } else
            System.out.println("It is not triangle");
    }

    public static int intNumbersSum(int START, int END) {
        int sum = 0;
        if (START < END) {
            for (int i = START; i <= END; i++) {
                sum += i;
            }
        }
       else
            System.out.println("Data is not correct");
        return sum;
       
    }

    public static int intEvenNumbersSum(int START, int END) {
        int sumEven = 0;
        if (START < END) {
            for (int i = START; i <= END; i++) {
                if (i % 2 == 0) {
                    sumEven += i;
                }
            }
        }
        else
            System.out.println("Data is not correct");
        return sumEven;
    }
    public static int intSimpleNumbersSum(int END){
        int sum = 0;
        m:for (int i = 2; i <= END; i++) {
            for (int j = 2; j <= i/2; j++) {
                if(i%j == 0){
                    continue m;
                }
            }
            sum+=i;
        }
        return sum;
    }


    public static boolean variablesSum (int A, int B, int C) {
            boolean myBoolean;
            myBoolean=(A+B==C)|(A+C==B)|(B+C==A);
            return (myBoolean);
                                                     }

    public static int meanValueCalculate(int START1, int END1) {
      int mean=0;
       if ((START1>0)&(END1>0)) {
           while (START1 > END1) {
               START1--;
               END1++;
               mean = START1;
           }
       } else
           System.out.println("Data is not correct");
       return mean;
    }
}



