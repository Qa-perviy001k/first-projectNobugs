package me.nobugs.lesson.homeWork6.task3HashSet.task2;

import java.util.HashSet;
import java.util.Set;

/**
 * Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.
 */

public class SecondTask {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        for (int i = 0; i < 10; i ++) {
            numbers.add(i);
        }
        System.out.println("HashSet:");

            int checkNumber = 8;

            if (numbers.contains(checkNumber)) {
                System.out.println("Число " + checkNumber + " найдено");
            } else {
                System.out.println("Такого числа нет" + checkNumber);
            }
        }
    }
