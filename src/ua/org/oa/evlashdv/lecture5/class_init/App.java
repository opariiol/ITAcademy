package ua.org.oa.evlashdv.lecture5.class_init;

public class App {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        A a1 = new A();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        A a2 = new A();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
    }
}

class A {
    public Field field1 = new Field("field1");
    public static Field staticField1 = new Field("staticField1");
    {
        System.out.println("init block");
    }
    public A(){
        System.out.println("Constructor");
    }
    public Field field2 = new Field("field2");
    public static Field staticField2 = new Field("staticField2");
    static {
        System.out.println("static init block");
    }
}

class Field {
    public Field(String s) {
        System.out.println(s);
    }
}
