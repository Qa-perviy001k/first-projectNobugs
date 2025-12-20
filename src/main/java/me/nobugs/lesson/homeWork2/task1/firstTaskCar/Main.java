package me.nobugs.lesson.homeWork2.task1.firstTaskCar;

public class Main {
    public static void main(String[] args) {

        Car car2 = new Car(2022,"БМВ 5 серии");
        car2.print();

        car2.setYear(2025);
        car2.print();
        car2.setBrand("Volkswagen");
        car2.print();
    }

}

