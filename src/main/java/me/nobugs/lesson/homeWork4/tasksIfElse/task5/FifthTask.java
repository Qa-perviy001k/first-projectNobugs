package me.nobugs.lesson.homeWork4.tasksIfElse.task5;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        AgeDiscount(age);

        scanner.close();
    }

    public static void AgeDiscount(int age){
        if(age <= 0){
            System.out.println("Возраст не может быть меньше, равен 0, или отрицательным.");
        } else if (age < 18){
            System.out.println("Ваша скидка '25%'.");
        } else if (age >= 65){
            System.out.println("Ваша скидка '30%'.");
        } else {
            System.out.println("Скидка не предоставляется, вернитесь позже.");
        }
    }
}
