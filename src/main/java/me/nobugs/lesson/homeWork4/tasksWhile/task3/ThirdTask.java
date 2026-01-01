package me.nobugs.lesson.homeWork4.tasksWhile.task3;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        countdown(number);

        scanner.close();
    }
    public  static void countdown(int number){
        while (number > 0){
            System.out.println("Результат: " + number);
            number--;
        }
    }

}

