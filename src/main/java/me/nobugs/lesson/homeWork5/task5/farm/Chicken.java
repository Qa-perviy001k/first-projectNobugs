package me.nobugs.lesson.homeWork5.task5.farm;

public class Chicken extends Animal{
    @Override
    public void act() {
        System.out.println("Поведение животного: Несет яйца");
    }

    @Override
    public void care() {
        System.out.println("Уход за животным: Требует зерно");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
