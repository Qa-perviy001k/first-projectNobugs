package me.nobugs.lesson.homeWork2.task7.seventhTaskCircle;


public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        c.setRadius(8);

        double square = c.calculateArea();
        System.out.println("Площадь окружности: " + square);

        double circuit = c.calculateCircumference();
        System.out.println("Длина окружности: " + circuit);

    }
}
