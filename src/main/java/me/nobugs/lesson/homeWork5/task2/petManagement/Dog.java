package me.nobugs.lesson.homeWork5.task2.petManagement;

public class Dog extends HousePet {
    @Override
    public void eat() {
        System.out.println("Питомец выполняет прием пищи: Ест сухой корм");
    }

    @Override
    public void act() {
        System.out.println("Питомец выполняет действие: Гуляет");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
