package ua.org.oa.evlashdv.practice1;
public class SimpleDataTypeLoopsUtils {
    public static void isRightTriangle(int side1, int side2, int hypotenuse){
        if(side1 + side2 > hypotenuse){
            System.out.println((side1*side1 + side2*side2 ==
                    hypotenuse*hypotenuse) ?"Right Triangle":"not Right Triangle");
        }else {
            System.out.println("not triangle");
        }
    }
    public static int simpleNumbersSum(int range){
        int sum = 0;
        m:for (int i = 2; i <= range; i++) {
            for (int j = 2; j <= i/2; j++) {
                if(i%j == 0){
                    continue m;
                }
            }
            sum+=i;
        }
        return sum;
    }
}
