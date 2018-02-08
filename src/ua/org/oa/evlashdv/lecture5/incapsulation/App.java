package ua.org.oa.evlashdv.lecture5.incapsulation;

public class App {
    public static void main(String[] args) {
        Human human = new Human("Vasya", 250);

        System.out.println(human);

        Boss boss = Boss.getInstance("Vasya");
        Boss boss1 = Boss.getInstance("Kolya");

        System.out.println(boss);
        System.out.println(boss1);
    }
}
