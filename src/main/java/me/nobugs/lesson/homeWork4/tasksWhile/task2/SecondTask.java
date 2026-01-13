package me.nobugs.lesson.homeWork4.tasksWhile.task2;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        printAllEvenNumbers(number);

        scanner.close();
    }

    public static void printAllEvenNumbers(int number) {
        int i = 1;
        if (number < 0) {
            System.out.println("Не может быть меньше 0!");
        }
            while (i <= number) {
             if (i % 2 == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }
    }