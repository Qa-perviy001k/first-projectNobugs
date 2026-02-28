package me.nobugs.lesson.homeWork6.task9PriorityQueue;


import java.util.PriorityQueue;

/**
 * Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления
 */

public class FirstTask {
    public static void main(String[] args) {

        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.add(22);
        numbers.add(10);
        numbers.add(11);
        numbers.add(25);
        numbers.add(32);

        while (!numbers.isEmpty()) {
            System.out.println(numbers.poll());
        }
    }
}
