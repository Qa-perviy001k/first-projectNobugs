package me.nobugs.lesson.homeWork5.task3.restaurantManagement;

public class Drink extends Dish {
    private int volume;

    public Drink(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void showCharacteristics() {
        System.out.println("Объем напитка: " + this.volume);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
