package me.nobugs.lesson.homeWork4.tasksWhile.task1;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для вычесление факториала: ");
        int number = scanner.nextInt();

        long result = factorial(number);

        System.out.println("Результат: " + result);

        scanner.close();

    }
    public static long factorial(int number){
        long result = 1;
        int i = 1;
        if (number < 0){
            throw new IllegalArgumentException("Не может быть отрицательным!");
        }
        while (i <= number){
            result *= i;
            i ++;
        }
        return result;
    }

}