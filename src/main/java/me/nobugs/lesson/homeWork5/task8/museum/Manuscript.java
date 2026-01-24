package me.nobugs.lesson.homeWork5.task8.museum;

public class Manuscript extends Exhibit {

    @Override
    public void describe() {
        System.out.println("Описание: Древний текст");
    }

    @Override
    public void preserve() {
        System.out.println("Обстановка: Требует контролируемую влажность");
    }

    public String toString(){
        return "Manuscript";
    }
}

