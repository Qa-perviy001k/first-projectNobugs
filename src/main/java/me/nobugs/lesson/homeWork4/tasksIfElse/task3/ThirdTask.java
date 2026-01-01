package me.nobugs.lesson.homeWork4.tasksIfElse.task3;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int grade = scanner.nextInt();

        ratingOutput(grade);

        scanner.close();
    }

    public static void ratingOutput(int grade) {
        if (grade <= 0) {
        System.out.println("Оценка не может быть 0, или принимать отрицательное значение.");
        } else if (grade == 1 || grade == 2) {
            System.out.println("Неудовлетворительно.");
        } else if (grade == 3) {
            System.out.println("Удовлетворительно.");
        } else if (grade == 4) {
            System.out.println("Хорошо.");
        } else if (grade == 5) {
            System.out.println("Отлично.");
        }else{
            System.out.println("Таких оценок не существует.");
        }
    }
}

