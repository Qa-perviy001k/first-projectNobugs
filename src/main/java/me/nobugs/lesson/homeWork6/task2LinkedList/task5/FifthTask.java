package me.nobugs.lesson.homeWork6.task2LinkedList.task5;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Используйте ListIterator для прохода по LinkedList в обоих направлениях.
 */

public class FifthTask {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");


        ListIterator<String> listIterator = list.listIterator();

        System.out.println("\nВперед: ");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\nНазад: ");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }
}
