package ua.org.oa.evlashdv.lecture2;

public class App {

    public static int age = 25;
    final public static int SIZE = 50;


    public static void main(String[] args) {
        char myChar = 'A';
        char myChar1 = 65;
        char myChar2 = '\u0041';

        System.out.println(myChar);
        System.out.println((int)'i');
        System.out.println(myChar2);

        double d = 0;
        for (int i = 0; i < 100; i++) {
            d = d + 0.1;
            System.out.println(d);
        }

        float myFloat = 0.1f;
        double myDouble = 0.1;

        System.out.println(myDouble == myFloat);

        System.out.println(age);

        int price = 250;

        System.out.println(price);

        price = 25 + 56;
        System.out.println(price);

        System.out.println("age = " + age);

        int age = 50;

        System.out.println("age = " + age);
        System.out.println("age = " + App.age);

        final int SIZE;
        SIZE = 55;
        System.out.println(9%4);
        System.out.println(15%2 == 0);

        System.out.println(4586 % 100);

        int i = 2;
        i += 2;
        System.out.println(i);
        ++i;
        System.out.println(i);

        long l = 25;
        l = 5658978565424542565L;
        float fl = l;
        System.out.println(fl);
        l = (long) fl;
        System.out.println(l);

        i = 56897;
        byte b = (byte)i;
        System.out.println(b);

        b = 25 + 56;
        System.out.println(b);

        byte b1 = 125;
        byte b2 = 126;
        b = (byte)(b1 + b2);
        System.out.println(b);

        long myLong = 1000_000 * 1000_1000L;
        System.out.println(myLong);

        myDouble = 3/4d;
        System.out.println(myDouble);

        System.out.println(.5);

        myDouble = 4/.0 + 6 - Double.POSITIVE_INFINITY;
        System.out.println(myDouble);

        b = 127;
        b++;
        System.out.println(b);

    }
}
