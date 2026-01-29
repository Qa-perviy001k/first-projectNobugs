package me.nobugs.lesson.homeWork5.task7.amusementPark;

public class Carousel extends Attraction {
    @Override
    public void service() {
        System.out.println("Проверка: Техническое обслуживание");
    }

    @Override
    public void emotions() {
        System.out.println("Ощущения: Спокойная карусель");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
