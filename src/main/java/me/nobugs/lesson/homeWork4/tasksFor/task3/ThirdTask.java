package me.nobugs.lesson.homeWork4.tasksFor.task3;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для умножения: ");
        int n = scanner.nextInt();

        multiplicationTable(n);

        scanner.close();

    }
    public static void multiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + "=" + n * i);
        }
    }
}

