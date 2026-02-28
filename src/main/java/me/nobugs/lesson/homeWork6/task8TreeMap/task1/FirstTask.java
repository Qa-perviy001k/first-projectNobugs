package me.nobugs.lesson.homeWork6.task8TreeMap.task1;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
 */

public class FirstTask {
    public static void main(String[] args) {

        SortedMap<String, Integer> grade = new TreeMap<>();

        grade.put("Виктор", 10);
        grade.put("София", 7);
        grade.put("Олег", 5);
        grade.put("Маргарита", 3);
        grade.put("Ольга", 4);

        for (Map.Entry<String, Integer> entry : grade.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }
}
