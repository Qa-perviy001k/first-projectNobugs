package me.nobugs.lesson.homeWork5.task4.aquarium;

public class Shark extends Creature {
    @Override
    public void act() {
        System.out.println("Существо выполняет действие: Плавает быстро и агрессивно" );
    }

    public String toString() {
        return "Shark";
    }
}
