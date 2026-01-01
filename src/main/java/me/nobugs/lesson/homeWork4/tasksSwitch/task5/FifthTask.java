package me.nobugs.lesson.homeWork4.tasksSwitch.task5;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.println("Введите действие (оператор +, -, *, /): ");
        String action = scanner.next();

        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();

        calculator(num1, num2, action);


        scanner.close();

    }

    public static void calculator(double num1,double num2,String action) {
        double result;
        switch (action) {
            case "+":
                result = num1 + num2;
                System.out.println("Результат: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Результат: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Результат: " + result);
                break;
            case "/":
                if(num2 == 0) {
                    throw new ArithmeticException("Деление на 0 запрещено!");
                }
                result = num1 / num2;
                System.out.println("Результат: " + result);
                break;
            default:
                System.out.println("Такого значения нет!");
        }
    }
}
