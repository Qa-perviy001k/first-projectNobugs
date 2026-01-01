package me.nobugs.lesson.homeWork4.tasksIfElse.task6;

import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите результат теста: ");
        int score = scanner.nextInt();

        testScoreResult(score);

        scanner.close();

    }

    public static void testScoreResult(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("Баллы не могу быть отрицательными, или меньше 0.");
        } else if (score < 60) {
            System.out.println("Неудовлетворительно.");
        } else if (score <= 74) {
            System.out.println("Удовлетворительно");
        } else if (score <= 89) {
            System.out.println("Хорошо");
        } else if (score <= 100) {
            System.out.println("Отлично");
        } else {
            System.out.println("Оценки выше 100 баллов несуществует.");
        }
    }
}
