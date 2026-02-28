package me.nobugs.lesson.homeWork6.task2LinkedList.task4;

import java.util.LinkedList;
import java.util.List;

/**
 * Создайте LinkedList из целых чисел. Напишите программу, которая вычисляет сумму элементов списка.
 */

public class FouthTask {
    public static void main(String[] args) {

        List<Integer> numbers = new LinkedList<>();

        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int sum = 0;
        for (int max : numbers){
            sum += max;
        }

        System.out.println(sum);

    }
}
