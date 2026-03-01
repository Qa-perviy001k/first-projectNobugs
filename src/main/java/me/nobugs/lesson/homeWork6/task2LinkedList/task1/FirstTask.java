package me.nobugs.lesson.homeWork6.task2LinkedList.task1;


import java.util.LinkedList;
import java.util.List;

/**
 * Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.
 */

public class FirstTask {
    public static void main(String[] args) {
        List <String> list = new LinkedList<>();

        list.add("Лето");
        list.add("Осень");
        list.add("Зима");
        list.add("Зима");
        list.add("Лето");

        for (String l : list) {
            System.out.println(l);
        }
    }
}
