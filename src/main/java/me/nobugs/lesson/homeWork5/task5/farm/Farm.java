package me.nobugs.lesson.homeWork5.task5.farm;

public class Farm {
    private Animal animal;

    public void addAnimal(Animal animal) {
        System.out.println("\nЖивотное: " + animal + " успешно добавлено");
        this.animal = animal;
    }

    public void removeAnimal() {
        System.out.println("\nЖивотное: " + animal + " успешно удалено");
        this.animal = null;
    }

    public void interactionAnimal() {
        if (animal == null) {
            System.out.println("Животное не добавлено!");
        } else {
            this.animal.act();
            this.animal.care();
        }
    }
}
