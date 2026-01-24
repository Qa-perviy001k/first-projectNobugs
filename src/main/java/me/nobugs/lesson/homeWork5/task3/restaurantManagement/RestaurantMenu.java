package me.nobugs.lesson.homeWork5.task3.restaurantManagement;

public class RestaurantMenu {

    private Dish dish;


    public void addDish(Dish dish) {
        System.out.println("Блюдо: " + dish + " успешно добавлено");
        this.dish = dish;
    }

    public void showCharacteristics() {
        this.dish.showCharacteristics();
    }






}
