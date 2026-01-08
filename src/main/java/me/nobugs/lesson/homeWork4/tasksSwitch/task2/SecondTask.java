package me.nobugs.lesson.homeWork4.tasksSwitch.task2;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день недели (1-7): ");
        int day = scanner.nextInt();

        System.out.println("Стоимость билета: " + getTicketPrice(day) + " рублей.");

        scanner.close();

    }

    public static int getTicketPrice(int day) {
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return 300;
            case 6:
            case 7:
                return 450;
            default:
                throw new IllegalArgumentException("Несуществующий день недели");
        }
    }
}
