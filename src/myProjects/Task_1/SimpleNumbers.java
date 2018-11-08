package myProjects.Task_1;

import java.util.Scanner;

// Создаем класс и метод для определения простых чисел () проверка - остаток от деления на два

public class SimpleNumbers {

    public static void main(String[] args) {
        System.out.println("Введите положительное число:");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        for (int i = 2; i <= data; i++){
            if( i%2 != 0){
                System.out.println(i);
            }
        }

    }
}
