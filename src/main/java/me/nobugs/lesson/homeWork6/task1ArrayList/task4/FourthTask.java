package me.nobugs.lesson.homeWork6.task1ArrayList.task4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Создайте ArrayList из целых чисел. Напишите программу, которая вычисляет и выводит сумму всех чисел в списке.
 */

public class FourthTask {
    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>((Arrays.asList(50,50,50,50,50)));

        int sum = 0;
        for (int num : number) {
            sum += num;
        }
        System.out.println(sum);
    }
}
