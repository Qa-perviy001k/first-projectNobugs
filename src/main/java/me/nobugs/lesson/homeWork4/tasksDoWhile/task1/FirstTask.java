package me.nobugs.lesson.homeWork4.tasksDoWhile.task1;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {

        requestForPositiveNumber();

    }

    public static void requestForPositiveNumber() {;
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Введите число: ");;

            while (!scanner.hasNextInt()) {
                System.out.println("Это не число! Попробуйте еще раз.");
                scanner.next();
            }
            number = scanner.nextInt();

        } while (number <= 0);

        System.out.println("Ваше число положительное: " + number);
        scanner.close();
    }

}
