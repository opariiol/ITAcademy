package myProjects.Task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// класс для запуска разработанных приложений.

public class AppThread {

    public static void main(String[] args) {
        ThreadsForSimpleNumbers threadNumber = new ThreadsForSimpleNumbers();
        threadNumber.start();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String i = (String)br.readLine();
            if(i != null){
                threadNumber.interrupt();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
