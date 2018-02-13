package ua.org.oa.evlashdv.lecture4;

public class Human {
    public static String type = "Homo Sapiens";
    public String name;
    public int age;

    public Human(){

    }

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Human(String name){
        this(name,1);
    }

    public void sayHello(){
        System.out.println("Hello my name is " + name);
        sayAge();
    }

    public void sayAge(){
        System.out.println("my age is " + age);
    }

    public double calculate(char operation, double a, double b){
        double result =  0;
        switch (operation) {
            case '*':
                result = a * b;
                break;
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            default:
                System.out.println("Wrong operation!");
                break;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
