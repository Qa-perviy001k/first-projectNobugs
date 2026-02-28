package me.nobugs.lesson.homeWork6.task1ArrayList.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
 */

public class ThirdTask {
    public static void main(String[] args) {

        List <String> list = new ArrayList<>(Arrays.asList("Кот", "Мышка","Верблюд" , "Программирование"));

        String longest = "";

        for (String s : list) {
            if (s.length() > longest.length()){
                longest = s;
            }
        }
        System.out.println("Самое длинное слово " + longest);

    }
}
