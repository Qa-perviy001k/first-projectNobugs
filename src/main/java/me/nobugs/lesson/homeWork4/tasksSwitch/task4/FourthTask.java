package me.nobugs.lesson.homeWork4.tasksSwitch.task4;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Строка для обработки: ");
        String decodingText = scanner.nextLine();

        processingTextCommand(decodingText);

        scanner.close();
    }

    public static void processingTextCommand(String decodingText) {
        String normalizedCommand = decodingText.trim().toLowerCase();
        switch (normalizedCommand) {
            case "start":
                System.out.println("Система запущена.");
                break;
            case "stop":
                System.out.println("Система остановлена.");
                break;
            case "restart":
                System.out.println("Система перезагружена.");
                break;
            case "status":
                System.out.println("Информация обновляется, запросите позже.");
                break;
            default:
                System.out.println("Команда не распознана!");
        }
    }
}
