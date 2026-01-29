package me.nobugs.lesson.homeWork5.task8.museum;

public class Sculpture extends Exhibit{
    @Override
    public void describe() {
        System.out.println("Описание: Скульптурный объект");

    }

    @Override
    public void preserve() {
        System.out.println("Обстановка: Нуждается в реставрации");
    }

    @Override
    public String toString(){
        return getClass().getSimpleName();
    }
}
