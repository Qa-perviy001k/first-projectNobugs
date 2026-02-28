package me.nobugs.lesson.homeWork6.task2LinkedList.task3;

import java.util.LinkedList;

/**
 *Создайте LinkedList, содержащий несколько строк. Напишите программу, которая печатает первый и последний элементы списка.
 */

public class ThirdTask {
    public static void main(String[] args) {

        LinkedList<String> element = new LinkedList<>();

        element.add("Кот");
        element.add("Кошка");

        if (!element.isEmpty()) {
            System.out.println(element.getFirst());
        }

        System.out.println(element.getLast());


    }
}
