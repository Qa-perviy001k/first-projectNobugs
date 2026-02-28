package me.nobugs.lesson.homeWork6.task2LinkedList.task2;

import java.util.LinkedList;

/**
 * Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.
 */

public class SecondTask {
    public static void main(String[] args) {

        LinkedList<String> task = new LinkedList<>();

        task.add("Задача номер один");
        task.add("Задача номер два");
        task.add("Задача номер три");

        System.out.println("\nКоличество задач в очереди: " + task.size());

        while (!task.isEmpty()) {
            String currentTask = task.poll();
            System.out.println(currentTask);
        }
        System.out.println("\nЗадачи обработаны, на текущий момент задач в обработке: " + task.size());

    }
}
