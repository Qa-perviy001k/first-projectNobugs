package me.nobugs.lesson.homeWork6.task3HashSet.task1;

import java.util.HashSet;
import java.util.Set;

/**
 * Создайте HashSet из 5 чисел и выведите его содержимое.
 */


public class FirstTask {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);
    }
}
