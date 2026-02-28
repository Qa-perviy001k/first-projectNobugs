package me.nobugs.lesson.homeWork6.task1ArrayList.task5;


import java.util.*;

/**
 * Создайте ArrayList из целых чисел. Напишите программу, которая находит и выводит максимальное число из списка.
 */

public class FifthTask {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>((Arrays.asList(1,2,3,4,5,6,7,8,9,10)));

        int max = Collections.max(number);
        System.out.println(max);
        }
    }
