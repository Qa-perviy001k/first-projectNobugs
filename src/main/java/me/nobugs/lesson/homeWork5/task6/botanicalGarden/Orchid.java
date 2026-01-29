package me.nobugs.lesson.homeWork5.task6.botanicalGarden;

public class Orchid extends Plant{
    @Override
    public void carePlant() {
        System.out.println("Уход за растением: Нуждается в тени и высокой влажности");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
