package me.nobugs.lesson.homeWork3.task2;

import static me.nobugs.lesson.homeWork3.task2.MathConstants.calculateCircleArea;
import static me.nobugs.lesson.homeWork3.task2.MathConstants.calculateCircumference;

public class Main {
    public static void main(String[] args) {
        double calculateCircleArea1 = calculateCircleArea(5.21221);
        System.out.println("Площадь круга: " + calculateCircleArea1);
        double calculateCircumference1 = calculateCircumference(5.21221);
        System.out.println("Длина окружности: " + calculateCircumference1);
    }


}
