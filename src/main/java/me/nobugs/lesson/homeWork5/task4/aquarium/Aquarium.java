package me.nobugs.lesson.homeWork5.task4.aquarium;

public class Aquarium {
    private Creature creature;

    public void addCreature(Creature creature){
        System.out.println("\nСущество: " + creature + " успешно добавлено");
        this.creature = creature;
    }

    public void removeCreature(){
        System.out.println("\nСущество: " + creature + " успешно удалено");
        this.creature = null;
    }

    public void giveCommand(){
        if (creature == null){
            System.out.println("Существо не добавлено!");
        } else {
            this.creature.act();
        }
    }
}
