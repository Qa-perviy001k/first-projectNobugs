package me.nobugs.lesson.homeWork4.tasksFor.task1;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {

        outputNumbers();

    }

    public static void outputNumbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
