package me.nobugs.lesson.homeWork5.task1.zoopark;

public class Elephant extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Животное издает звук: Трубит");
    }

    @Override
    public void act() {
        System.out.println("Живетное выполняет действие: Ходит");
    }

    public String toString() {
        return "Elephant";
    }
}
