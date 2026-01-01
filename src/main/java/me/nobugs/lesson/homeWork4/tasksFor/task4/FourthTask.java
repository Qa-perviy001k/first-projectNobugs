package me.nobugs.lesson.homeWork4.tasksFor.task4;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число, простое, или нет?: ");
        int number = scanner.nextInt();

        System.out.println("Результат: " + checkNumberIsPrime(number));

        scanner.close();
    }

    public static boolean checkNumberIsPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number-1; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}