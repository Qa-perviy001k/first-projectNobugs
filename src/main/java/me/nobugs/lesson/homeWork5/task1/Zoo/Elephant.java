package me.nobugs.lesson.homeWork5.task1.Zoo;

public class Elephant extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Животное издает звук: Трубит");
    }

    @Override
    public void act() {
        System.out.println("Животное выполняет действие: Ходит");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
