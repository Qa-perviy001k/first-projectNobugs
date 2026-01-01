package me.nobugs.lesson.homeWork4.taskBreakContinue.task1;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        sumNumbersNegative();
    }

    public static void sumNumbersNegative() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }
            sum += number;
        }
        System.out.println("Сумма введенных чисел: " + sum);
        scanner.close();
    }

}