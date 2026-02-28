package me.nobugs.lesson.homeWork6.task7LinkedHashMap.task1;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
 */

public class FirstTask {
    public static void main(String[] args) {

        Map<String,String> elements = new LinkedHashMap<>();

        elements.put("Россия", "Москва");
        elements.put("Казахстан", "Астана");
        elements.put("Узбекистан", "Ташкент");
        elements.put("Швейцария", "Берн");
        elements.put("Сша", "Вашангтон");

        // Либо можно вывести все просто через обращению к елементу
        for (Map.Entry<String,String> entry: elements.entrySet()) {
            System.out.println("Страна " + entry.getKey() + " --> " + " Столица "+ entry.getValue());
        }
    }
}
