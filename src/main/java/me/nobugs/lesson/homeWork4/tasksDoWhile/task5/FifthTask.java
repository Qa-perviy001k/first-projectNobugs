package me.nobugs.lesson.homeWork4.tasksDoWhile.task5;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {

        countingNumberDigitsNumber();
    }
    public static void countingNumberDigitsNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для подсчета: ");
        int number = scanner.nextInt();
        int count = 0;

        if (number < 0) {
            number = -number;
        }
        do { count++;
            number = number / 10;
        }
        while (number > 0);

        System.out.println("Количество цифр: " + count);

        scanner.close();
    }

}
