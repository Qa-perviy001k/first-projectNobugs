package me.nobugs.lesson.homeWork4.tasksSwitch.task1;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер дня недели: ");
        int day = scanner.nextInt();

        System.out.println(dayOfWeek(day));

        scanner.close();

    }

    public static String dayOfWeek(int day) {
        String dayOfWeek = "";
        switch (day) {
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
                break;
            case 4:
                dayOfWeek = "Четверг";
                break;
            case 5:
                dayOfWeek = "Пятница";
                break;
            case 6:
                dayOfWeek = "Суббота";
                break;
            case 7:
                dayOfWeek = "Воскресенье";
                break;
                default:
                    dayOfWeek = "Несуществующий день недели";
        }
        return dayOfWeek;
    }
}
