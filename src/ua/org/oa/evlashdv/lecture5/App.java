package ua.org.oa.evlashdv.lecture5;

public class App {
    public static int counter = 0;
    public static void main(String[] args) {
        method(0);
        System.out.println(fibanachi(5));
        System.out.println(counter);
    }

    public static int fibanachi(int number){
        counter++;
        if(number == 0){
            return 0;
        }
        if(number == 1){
            return 1;
        }
        return fibanachi(number - 1) + fibanachi(number - 2);
    }

    public static void method(int i){
        System.out.println(i);
        if(i < 10) {
            method(i + 1);
        }
        System.out.println(i);
    }
}
