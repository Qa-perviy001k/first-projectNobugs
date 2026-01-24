package me.nobugs.lesson.homeWork5.task4.aquarium;

public class Starfish extends Creature{
    @Override
    public void act() {
        System.out.println("Существо выполняет действие: Медленно ползает");
    }

    public String toString() {
        return "Starfish";
    }
}
