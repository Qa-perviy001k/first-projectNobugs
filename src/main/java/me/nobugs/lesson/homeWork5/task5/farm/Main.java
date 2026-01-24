package me.nobugs.lesson.homeWork5.task5.farm;

/***
 Условие:
 На ферме содержится одно домашнее животное.
 У каждого животного свои функции и нужды.
 Примеры:
 Корова даёт молоко, нуждается в выпасе
 Курица несёт яйца, требует зерно
 Нужно создать систему, которая позволяет управлять животным с учётом его потребностей.

Сущности: Ферма , животное - корова, курица
 Свойства, действия, связи:
 Ферма - свойство животное, действие
 Животное - свойств нет, действие уход/поведение
 Корова - свойств нет, действие уход/поведение
 Курица - свойсв нет, действие уход/поведение

 */
public class Main {
    public static void main(String[] args) {

        Farm farm = new Farm();
        Kine kine = new Kine();
        Chicken chicken = new Chicken();

        farm.addAnimal(kine);
        farm.interactionAnimal();

        farm.removeAnimal(kine);

        farm.addAnimal(chicken);
        farm.interactionAnimal();



    }
}
