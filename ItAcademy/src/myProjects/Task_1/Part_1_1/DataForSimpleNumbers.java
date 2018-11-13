package myProjects.Task_1.Part_1_1;

import java.sql.SQLOutput;
import java.util.List;

public class DataForSimpleNumbers extends Thread{

    private int firstNum;
    private int lastNum;
    private List<Integer> simpleNumberList;

    public DataForSimpleNumbers(int firstNum, int lastNum, List<Integer> simpleNumberList) {
        this.firstNum = firstNum;
        this.lastNum = lastNum;
        this.simpleNumberList = simpleNumberList;
    }

    @Override
    public void run (){
        while (firstNum <= lastNum){
            boolean isPrime = checkSimpleNumber(firstNum);
            if (isPrime){
                simpleNumberList.add(firstNum);
            }
            firstNum += 1;
        }
        System.out.println("Counter № " + getName() + " has finisher work in this thread. ");

    }

    public static boolean checkSimpleNumber (int data){ // we check does it simple number
        for (int i = 2; i <= data/2; i++) {
            if((data % i == 0) & (i % 2 == 0)) return false;
        }
        return true;
    }
}

