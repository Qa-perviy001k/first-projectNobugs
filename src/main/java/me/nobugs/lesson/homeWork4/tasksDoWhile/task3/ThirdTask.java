package me.nobugs.lesson.homeWork4.tasksDoWhile.task3;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        outputtingNumbers();

    }

    public static void outputtingNumbers() {
        int i = 1;
        do {
            System.out.println(i);
            i ++;
        }
        while (i <= 10);
    }
}


