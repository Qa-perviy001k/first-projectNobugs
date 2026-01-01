package me.nobugs.lesson.homeWork4.taskBreakContinue.task4;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {

        enteringLineStopCommand();

    }
    public static void enteringLineStopCommand(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Введите команду, для того что бы остановить напишите stop: ");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                System.out.println("Программа остановлена!");
                break;
            }
        }
        scanner.close();
    }
}