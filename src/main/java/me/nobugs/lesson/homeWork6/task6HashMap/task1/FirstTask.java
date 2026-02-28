package me.nobugs.lesson.homeWork6.task6HashMap.task1;

import java.util.HashMap;
import java.util.Map;

/**
 *Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
 */


public class FirstTask {
    public static void main(String[] args) {

        Map<String, Integer> keyValue = new HashMap<>();

        keyValue.put("Антон", 18);
        keyValue.put("Виктор", 20);
        keyValue.put("Олег", 25);
        keyValue.put("Мартин", 33);
        keyValue.put("Роман", 25);

        for (Map.Entry<String, Integer> entry : keyValue.entrySet()) {

            String name = entry.getKey();
            Integer age = entry.getValue();

            System.out.println("\nИмя: " + name + " \nВозраст: " + age);
        }
    }
}
