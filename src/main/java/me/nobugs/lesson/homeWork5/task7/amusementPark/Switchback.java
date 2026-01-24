package me.nobugs.lesson.homeWork5.task7.amusementPark;

public class Switchback extends Attraction {
    @Override
    public void service() {
        System.out.println("Проверка: Проверка безопасности");
    }

    @Override
    public void emotions() {
        System.out.println("Ощущения: Страшно");
    }

    public String toString() {
        return "Switchback";
    }
}
