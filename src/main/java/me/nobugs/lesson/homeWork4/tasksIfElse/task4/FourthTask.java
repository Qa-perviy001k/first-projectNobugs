package me.nobugs.lesson.homeWork4.tasksIfElse.task4;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        checkParity(number);

        scanner.close();


    }

    public static void checkParity(int number) {
        if (number % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }
}
