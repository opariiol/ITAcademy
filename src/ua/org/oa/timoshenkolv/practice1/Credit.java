package ua.org.oa.timoshenkolv.practice1;

public class Credit {
        public static void monthlyPaymentCalculate (double CREDIT_SUM, int INTEREST_RATE,int CREDIT_TERM){
        double monthCreditSum;
        double monthPayment;
        double monthPercentSum;
        double overPayment=0;
        if ((CREDIT_SUM<=0)|(INTEREST_RATE<=0)|(CREDIT_TERM<=0)){
            System.out.println("Data is not correct");
        } else {

            monthCreditSum = CREDIT_SUM / CREDIT_TERM;

            for (int i = 1; i <= CREDIT_TERM; i++) {
                monthPercentSum = (INTEREST_RATE / 100d / 12d) * CREDIT_SUM;
                monthPayment = monthPercentSum + monthCreditSum;
                System.out.println(i + " Month: " + monthCreditSum + " + " + monthPercentSum + " = " + monthPayment + " Body of credit= " + CREDIT_SUM);
                CREDIT_SUM -= monthCreditSum;
                overPayment += monthPercentSum;
            }

            System.out.println("Overpayment= " + overPayment);
        }
    }
}
