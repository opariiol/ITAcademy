package myProjects.Task_1.Part_1_1;

import myProjects.Task_1.Part_1_1.DataForSimpleNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppForSimpleThread {

    public static void main(String[] args) {
        // input data of numbers
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number of interval: ");
        int firstNumber = scan.nextInt(); // the first element of the list of numbers
        System.out.println("Enter last number of interval: ");
        int lastNumber = scan.nextInt(); // the last element of the list of numbers
        System.out.println("Enter count of threads: ");
        int countThreads = scan.nextInt(); // we decide, how many threads we will start in this case
        int lastNumberInInterval = lastNumber/countThreads; // this will be last number in every thread

        // array with simple number for every thread
        DataForSimpleNumbers counter [] = new DataForSimpleNumbers[countThreads];
        // list for data save from our threads
        List[] simpleNumbers = new ArrayList[countThreads];

        // distribution of data across all threads
        for (int i = 1; i < countThreads; i ++){
            List<Integer> listForExactThread = new ArrayList<>();
            counter[i] = new DataForSimpleNumbers(lastNumberInInterval*i,lastNumberInInterval*i +
                    lastNumberInInterval, listForExactThread);
            counter[i].setName("Counter № "+i);
            simpleNumbers[i] = listForExactThread;
        }

        // divide the list of numbers block into intervals and run in threads
        for (int i = 0; i < countThreads; i ++){
            List<Integer> listForExactThread = new ArrayList<>();
            counter[0] = new DataForSimpleNumbers(firstNumber, lastNumber,listForExactThread);
            counter[i].start();
            counter[0].run();
            simpleNumbers[0] = listForExactThread;
        }

        // if our thread finds exception and blocks, we will check it with block try-catch
        try {
            for (int i = 0 ; i < countThreads; i ++){
                counter[i].join();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println( "Our List of data:" + Arrays.toString(simpleNumbers)); // we write all data in array

    }


}
