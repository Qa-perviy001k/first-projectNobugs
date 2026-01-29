package me.nobugs.lesson.homeWork5.task1.Zoo;

public class Zoopark {
    private Animal animal;

    public void addAnimal(Animal animal) {
        System.out.println("\nЖивотное: " + animal + " успешно добавлено" );
        this.animal = animal;
    }

    public void giveCommandAnimal() {
        if (animal == null) {
            System.out.println("Животное не добавлено!");
        } else {
            this.animal.makeSound();
            this.animal.act();
        }
    }

    public void removeAnimal() {
        System.out.println("\nЖивотное " + animal + " успешно удалено" );
        this.animal = null;
    }
}
