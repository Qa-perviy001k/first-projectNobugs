package me.nobugs.lesson.homeWork6.task1ArrayList.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.
 */

public class FirstTask {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(10,20,30,40,50));

        numbers.add(60);

        System.out.println(numbers);
    }
}
