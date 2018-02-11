package ua.org.oa.timoshenkolv.practice1;

public class SimpleDataLoopsUtilsTest
{
    // Test data for 4 Task
    public static final int SIDE_1 =4;
    public static final int SIDE_2 =5;
    public static final int HYPOTENUSE =7;
    // Test data for 5,6,7 Task
   public static final int START=1;
   public static final int END=20;
    // Test data for 8 Task
    public static final int A=1;
    public static final int B=2;
    public static final int C=3;
    // Test data for 9 Task
    public static final int START1=5;
    public static final int END1=2;
    // Test data for 10 Task
    public static final double CREDIT_SUM =12000;
    public static final int INTEREST_RATE =12;
    public static final int CREDIT_TERM =12;



       public static void main(String[] args) {
        System.out.println("----Task1----");
        System.out.println("Class data:");
        SimpleDataLoopsUtils.simpleDataClassPrint();
        System.out.println();
        System.out.println("Method data:");
        SimpleDataLoopsUtils.simpleDataMethodPrint();

        System.out.println("----Task2----");
        System.out.println("Variables of type float:");
        SimpleDataLoopsUtils.variableTypeFloatValueAssign();

        System.out.println("----Task3----");
        System.out.println("Variables of type short:");
        SimpleDataLoopsUtils.variableTypeShortValueAssign ();


        System.out.println("----Task4----");
        System.out.println("Triangle with SIDE_1= "+ SIDE_1 + " SIDE_2= "+ SIDE_2 +" HYPOTENUSE= "+ HYPOTENUSE);
        SimpleDataLoopsUtils.isRightTriangle (SIDE_1, SIDE_2, HYPOTENUSE);

        System.out.println("----Task5----");
        int sum=SimpleDataLoopsUtils.intNumbersSum (START,END);
        System.out.println("Sum of numbers from "+START+" to "+END+" = "+sum);

        System.out.println("----Task6----");

        int sum1=SimpleDataLoopsUtils.intEvenNumbersSum (START,END);
        System.out.println("Sum of even numbers from "+START+" to "+END+" = "+sum1);

        System.out.println("----Task7----");

         int sum2=SimpleDataLoopsUtils.intSimpleNumbersSum (END);
           System.out.println("Sum of simple numbers from "+START+" to "+END+" = "+sum2);

         System.out.println("----Task8----");

          boolean myBoolean=SimpleDataLoopsUtils.variablesSum (A, B, C);

           System.out.println(myBoolean);

           System.out.println("----Task9----");

           int mean=SimpleDataLoopsUtils.meanValueCalculate (START1,END1);
           System.out.println("Mean value from "+START1+" to "+END1+" = "+mean);

           System.out.println("----Task10----");

           System.out.println("Credit= "+CREDIT_SUM+" Interest rate= "+INTEREST_RATE+"%/Year Credit term= "+CREDIT_TERM+" Month");
           Credit.monthlyPaymentCalculate(CREDIT_SUM, INTEREST_RATE,CREDIT_TERM);


       }
}
