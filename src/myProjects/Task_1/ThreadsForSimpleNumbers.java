package myProjects.Task_1;

import java.util.Scanner;
import myProjects.Task_1.SimpleNumbers;

// данный класс предназначен для создания потоков на выполнение поиска простых чисел

public class ThreadsForSimpleNumbers extends Thread {

   Thread thread = new Thread();
    @Override
    public void run() {
        while (!isInterrupted()){
            SimpleNumbers sn = new SimpleNumbers();
            System.out.println(sn);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){ e.printStackTrace();}

        }
    }
}

/* так и не смогла реализовать разбивку чисел по интервалам. Идея была в следующем:
    SimpleNumbers sn = new SimpleNumbers();
    int firstPart = sn*0.7;
    int secondPart = sn-firstPart,

   Thread threadOne = new Thread();
    @Override
    public void run() {
        while (!isInterrupted()){
            firstPart.SimpleNumbers;
            System.out.println(firstPart);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){ e.printStackTrace();}

    Thread threadTwo = new Thread();
    @Override
    public void run() {
    while (!isInterrupted()){
            secondPart.SimpleNumbers
            System.out.println(secondPart);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){ e.printStackTrace();}

    }
 */