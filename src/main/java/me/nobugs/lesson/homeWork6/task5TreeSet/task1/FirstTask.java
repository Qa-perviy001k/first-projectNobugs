package me.nobugs.lesson.homeWork6.task5TreeSet.task1;

import java.util.Set;
import java.util.TreeSet;

/**
 * Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.
 */

public class FirstTask {
    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);
    }
}
