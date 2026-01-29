package me.nobugs.lesson.homeWork5.task8.museum;

/***
 Условие:
 В музее выставлен экспонат.
 У каждого экспоната своя история и условия хранения.
 Примеры:
 Манускрипт — требует контролируемой влажности
 Скульптура — нуждается в реставрации
 Нужно создать систему, которая управляет экспонатом и предоставляет информацию о нём.

 Сущности:
 Музей, экспонат - манускрипт, скульптура

 Свойства, действия, связи:
 Музей - свойства экспонат, действие проверка
 Экспонат - нет свойств, действие обслуживание/обстановка
 Манускрипнт - нет свойств , действие обслуживание/обстановка
 Скульптура - нет свойств, действие обслуживание/ обстановка


 */



public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();
        Sculpture sculpture = new Sculpture();
        Manuscript manuscript = new Manuscript();

        museum.addExhibit(sculpture);
        museum.checkExhibit();

        museum.removeExhibit();

        museum.addExhibit(manuscript);
        museum.checkExhibit();

    }
}
