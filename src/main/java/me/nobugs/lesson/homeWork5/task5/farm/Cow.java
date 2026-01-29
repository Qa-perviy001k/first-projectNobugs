package me.nobugs.lesson.homeWork5.task5.farm;

public class Cow extends Animal{
    @Override
    public void act() {
        System.out.println("Поведение животного: Дает молоко");
    }

    @Override
    public void care() {
        System.out.println("Уход за животным: Нуждается в выпасе");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
