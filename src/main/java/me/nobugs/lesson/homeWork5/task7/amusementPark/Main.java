package me.nobugs.lesson.homeWork5.task7.amusementPark;

/***
 7. Парк развлечений
 Условие:
 В парке есть аттракцион, каждый из которых предлагает свои ощущения и требует обслуживания.
 Примеры:
 Американские горки — проверка безопасности
 Карусель — техническое обслуживание
 Нужно создать систему, которая управляет аттракционом и выводит информацию для посетителей.

 Сущности: Парк развлечений , аттракцион - американские горки, карусель
 Свойства, действия, связи:
 Парк развлечений - свойство аттракцион, действие добавить/удалить аттракцион , обслужить / ощущения
 Аттракцион - свойств нет, действие обслужить / ощущения
 Американские горки - свойств нет, действие обслужить / ощущения
 Карусель - свойств нет, действие обслужить / ощущения
 */

public class Main {
    public static void main(String[] args) {

        AmusementPark amusementPark = new AmusementPark();
        Carousel carousel = new Carousel();
        Switchback switchback = new Switchback();

        amusementPark.addAttraction(carousel);
        amusementPark.showAttraction();


        amusementPark.removeAttraction();

        amusementPark.addAttraction(switchback);
        amusementPark.showAttraction();

    }
}
