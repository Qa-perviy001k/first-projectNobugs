package me.nobugs.lesson.homeWork6.task1ArrayList.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Напишите программу, которая выводит все чётные числа из ArrayList.
 */

public class SecondTask {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        for (Integer number: numbers) {
            if (number % 2 == 0) {
                System.out.println(number + "");
            }
        }
    }
}
