package me.nobugs.lesson.homeWork4.tasksIfElse.task2;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();


        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        checkLarger(num1, num2);

        scanner.close();
    }

        public static void checkLarger(int num1, int num2){
            if (num1 < 0 || num2 < 0) {
                throw  new IllegalArgumentException("Числа не могут быть отрицательными!");
            }

            if (num1 > num2) {
                System.out.println("Наибольшее число: " + num1);
            } else if (num2 > num1) {
                System.out.println("Наибольшее число: " + num2);
            } else {
                System.out.println("Числа равны: " + num1);
        }

    }
}
