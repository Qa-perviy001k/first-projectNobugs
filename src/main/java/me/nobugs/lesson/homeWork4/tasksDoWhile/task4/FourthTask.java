package me.nobugs.lesson.homeWork4.tasksDoWhile.task4;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        overProgramme();


    }
    public static void overProgramme() {
        String exit;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите команду, для завершения програмы: ");
            exit = scanner.nextLine();
        }
        while (!exit.equals("exit"));
        System.out.println("Программа завершена!");
        scanner.close();
    }


}