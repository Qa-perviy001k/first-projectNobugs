package me.nobugs.lesson.homeWork5.task6.botanicalGarden;

/***
 Условие:
 В ботаническом саду содержится одно растение.
 У разных растений — разные требования к уходу.
 Примеры:
 Орхидея — высокая влажность и тень
 Кактус — много света, редкий полив
 Нужно спроектировать систему, в которой можно добавить растение и обеспечить нужный уход.

 Сущности: Ботанический сад, растение - Орхидея, кактус
 Свойства, действия, связи:
 Ботанический сад - свойство растение, действие добавить/удалить растение, обслуживание
 Растение - свойств нет, действие уход/обстановка
 Орхидея - свойст нет, действие уход/обстановка
 Кактус - свойст нет, действие уход/обстановка

 */

public class Main {
    public static void main(String[] args) {
        BotanicalGarden botanicalGarden = new BotanicalGarden();
        Peyote cactus = new Peyote();
        Orchid orchid = new Orchid();

        botanicalGarden.addPlant(cactus);
        botanicalGarden.care();

        botanicalGarden.removePlant(cactus);

        botanicalGarden.addPlant(orchid);
        botanicalGarden.care();

    }
}
