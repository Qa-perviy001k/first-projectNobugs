package me.nobugs.lesson.homeWork4.tasksSwitch.task3;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите цифровую оценку: ");
        int score = scanner.nextInt();
        System.out.println("Оценка в буквах: " + convertNumbersLetters(score));

        scanner.close();


    }

    public static String convertNumbersLetters(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Оценка должна быть в диапазоне от 0 до 100");
        } else if (score < 60) {
            return "F";
        } else if (score <= 69) {
            return  "D";
        } else if (score <= 79) {
            return  "C";
        } else if (score <= 89) {
            return  "B";
        } else {
            return  "A";
        }
    }
}