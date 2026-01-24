package me.nobugs.lesson.homeWork5.task4.aquarium;

/***
 Условие:
 В аквариуме может находиться одно морское существо.
 В зависимости от существа, оно ведёт себя по-разному.
 Примеры:
 Акула плавает быстро и агрессивно
 Морская звезда медленно ползает
 Нужно спроектировать систему, в которой можно добавить существо и продемонстрировать его поведение.

 Сущности: аквариум, существо - акула, морская звезда
 Свойства, действия, связи:
 Аквариум - свойство (существо) , действие дать команду.
 Существо - свойств нет, действие движение
 Акула - свойств нет, действие движение
 Морская звезда - свойств нет, действие движение

 */

public class Main {
    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium();
        Shark shark = new Shark();
        Starfish starfish = new Starfish();

        aquarium.addCreature(shark);
        aquarium.giveCommand();

        aquarium.removeCreature(shark);

        aquarium.addCreature(starfish);
        aquarium.giveCommand();
    }

}
