package me.nobugs.lesson.homeWork5.task6.botanicalGarden;

public class Peyote extends Plant{
    @Override
    public void carePlant() {
        System.out.println("Уход за растением: Требует много света и необходим редкий полив");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
