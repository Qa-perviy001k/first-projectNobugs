package me.nobugs.lesson.homeWork6.task10ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Создайте ArrayDeque, добавьте 5 элементов и выведите их.
 */

public class FirstTask {
    public static void main(String[] args) {

        Deque<String> elements = new ArrayDeque<>();

        elements.add("Task 1");
        elements.add("Task 2");
        elements.add("Task 3");
        elements.add("Task 4");
        elements.add("Task 5");

        System.out.println(elements);
    }
}
