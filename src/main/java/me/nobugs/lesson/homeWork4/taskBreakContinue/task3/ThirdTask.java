package me.nobugs.lesson.homeWork4.taskBreakContinue.task3;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {

        outputPositiveNumbers();

    }

    public static void outputPositiveNumbers(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Введите число: ");
            int number = scanner.nextInt();


            if (number < 0){
                continue;
            }

            if (number == 0){
                break;
            }
            System.out.println(number);
        }
        scanner.close();
        }

    }


