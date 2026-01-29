package me.nobugs.lesson.homeWork5.task3.restaurantManagement;

public class HotDish extends Dish {
    private int temperature;

    public HotDish(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void showCharacteristics() {
        System.out.println("Температура горячего блюда: " + this.temperature);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
