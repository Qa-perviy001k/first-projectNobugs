package me.nobugs.lesson.homeWork4.tasksDoWhile.task2;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {

        passwordVerification();

    }

    public static void passwordVerification(){
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();
            if (!password.equals("admin123")) {
                System.out.println("Неверный пароль!");
            }
        }
        while (!password.equals("admin123"));
        System.out.println("Верно!");
        scanner.close();
    }

}