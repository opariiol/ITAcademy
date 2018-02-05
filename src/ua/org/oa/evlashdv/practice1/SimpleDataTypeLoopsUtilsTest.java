package ua.org.oa.evlashdv.practice1;
public class SimpleDataTypeLoopsUtilsTest {
    //Test data for 4-th task
    public static final int SIDE_1 = 1;
    public static final int SIDE_2 = 4;
    public static final int HYPOTENUSE = 5;
    public static void main(String[] args) {
        System.out.println("~~~ Test for 4-th task ~~~");
        System.out.println("Triangle with SIDE_1=" + SIDE_1 + ", " +
                "SIDE_2=" + SIDE_2 + " and HYPOTENUSE=" + HYPOTENUSE + " is");
        SimpleDataTypeLoopsUtils.isRightTriangle(SIDE_1, SIDE_2, HYPOTENUSE);
        System.out.println("~~~ Test for 7-th task ~~~");
        System.out.println(SimpleDataTypeLoopsUtils.simpleNumbersSum(20));
    }
}
