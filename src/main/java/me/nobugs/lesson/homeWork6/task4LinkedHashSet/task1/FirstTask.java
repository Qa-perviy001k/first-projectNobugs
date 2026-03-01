package me.nobugs.lesson.homeWork6.task4LinkedHashSet.task1;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.
 */

public class FirstTask {
    public static void main(String[] args) {

        Set<String> line = new LinkedHashSet<>();

        line.add("Viktor");
        line.add("Peter");
        line.add("Anna");
        line.add("Alex");
        line.add("Nastya");

        for (String s: line){
            System.out.println(s);
        }

    }
}

