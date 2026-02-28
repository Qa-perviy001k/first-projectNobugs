package me.nobugs.lesson.homeWork6.task6HashMap.task2;

import java.util.HashMap;
import java.util.Map;

/**
 * Проверьте, есть ли определённое имя в HashMap.
 */

public class SecondTask {
    public static void main(String[] args) {

        Map<String, Integer> name = new HashMap<>();

        name.put("Viktor", 42);
        name.put("Alex", 22);

        if (name.containsKey("Alex")) {
            System.out.println("Имя найдено");
        } else {
            System.out.println("Имя не найдено");
        }
    }
}
