package ua.org.oa.evlashdv.lecture4;

import java.util.ArrayList;

import static java.lang.Math.*;

public class App {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.name);
        human.name = "Vasya";
        System.out.println(human.name);
        System.out.println(human.age);

        Human human1 = new Human();
        human1.name = "Vasya";

        System.out.println(human == human1);
        human = human1;
        System.out.println(human == human1);

        System.out.println(human);

        human.sayHello();
        System.out.println(human.calculate('+', 2, 5));

        System.out.println(human.type);

        Human human2 = new Human();
        human2.type = "Sapiens";
        System.out.println(human.type);
        System.out.println(Human.type);

        System.out.println(sum(2, 3, 6));

        System.out.println(new Human("Sveta", 25));
        System.out.println(new Human("Misha"));

        ArrayList arrayList;

        System.out.println(PI);
        System.out.println(E);


    }

    public static double sum(short s1, short s2){
        System.out.println("sum(short s1, short s2)");
        return s1 + s2;
    }
    public static double sum(double s1, double s2){
        System.out.println("sum(double s1, double s2)");
        return s1 + s2;
    }

    public static double sum(int... s1){
        System.out.println("sum(int... s1)");
        double sum = 0;
        for (int i = 0; i < s1.length; i++) {
            sum += s1[i];
        }
        return sum;
    }

    public static double sum(long s1, long s2){
        System.out.println("sum(long s1, long s2)");
        return s1 + s2;
    }
}
