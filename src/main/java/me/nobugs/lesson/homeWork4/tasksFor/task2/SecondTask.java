package me.nobugs.lesson.homeWork4.tasksFor.task2;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для суммирования: ");
        int n = scanner.nextInt();

        int result = sumOfNumbers(n);
        System.out.println("Сумма чисел от 1 до " + n + " = " + result);


        scanner.close();

    }

    public static int sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}