package myProjects.Task_1.Part_1_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppForExecutors {
    public static void main(String[] args) {
        // input data
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number of interval: ");
        int firstNumber = scan.nextInt(); // the first element of the list of numbers
        System.out.println("Enter last number of interval: ");
        int lastNumber = scan.nextInt(); // the last element of the list of numbers
        System.out.println("Enter the count of threads: ");
        int countThreads = scan.nextInt(); // we decide, how many threads we will start in this case
        int lastNumberInInterval = lastNumber/countThreads; // this will be last number in every thread

        // array with simple numbers for every thread
        ExecutorSimpleNumbers counters [] = new ExecutorSimpleNumbers[countThreads];
        // with abstraction ExecutorService we input the required number of threads
        ExecutorService executorService = Executors.newFixedThreadPool(countThreads);
        // list for data save from our threads
        List[] simpleNumbers = new ArrayList[countThreads];
        // collection of all simple numbers in our enter data list
        ArrayList<Integer> simpleNumberList = new ArrayList<>();
        counters [0] = new ExecutorSimpleNumbers(firstNumber, lastNumber, simpleNumberList);
        // start of our threads from abstraction ExecutorService
        executorService.execute(counters[0]);
        // cycle for our count of threads
        for (int i = 1; i < countThreads; i ++){
            simpleNumbers [0] = simpleNumberList;
            ArrayList <Integer> listOfSimpleNumberForThread = new ArrayList<>();
            counters [i] = new ExecutorSimpleNumbers(lastNumberInInterval*i,lastNumberInInterval*i +
                    lastNumberInInterval, listOfSimpleNumberForThread);
            // we run every thread
            executorService.execute(counters[i]);
            // list of simple numbers in every thread
            simpleNumbers [i] = listOfSimpleNumberForThread;
        }
        // we finished our threads
        executorService.shutdown();
        // we write all simple numbers from our data array
        System.out.println("Total primes in our entered data array:" + Arrays.toString(simpleNumbers));
    }

}
