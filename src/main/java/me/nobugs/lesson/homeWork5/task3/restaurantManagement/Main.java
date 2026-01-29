package me.nobugs.lesson.homeWork5.task3.restaurantManagement;

/***
 Условие:
 В меню ресторана добавляется блюдо.
 У каждого блюда свои параметры отображения:
 Блюдо — с температурой
 Напиток — с объёмом
 Нужно спроектировать систему, в которой можно добавлять блюда и выводить их описание с учётом характеристик.

 Сущности: ресторан , блюдо (горячее блюдо, напиток)
  Свойства, действия, связи:
  блюдо - нет свойств, показать характеристики
  подтипы блюд: (наследование)
  горячее блюдо - температура
  показать характеристики (температура)
  напиток - обьем
  показать характеристики (объем)
  ресторан - блюдо
  показать меню ( характеристика блюда)
  добавить блюдо

 */


public class Main {
    public static void main(String[] args) {

        RestaurantMenu restaurantMenu = new RestaurantMenu();

        HotDish steak = new HotDish(180);
        restaurantMenu.addDish(steak);
        restaurantMenu.showCharacteristics();

        Drink pepsi = new Drink(500);
        restaurantMenu.addDish(pepsi);
        restaurantMenu.showCharacteristics();






    }
}
