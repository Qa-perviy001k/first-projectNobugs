package me.nobugs.lesson.homeWork5.task6.botanicalGarden;

public class BotanicalGarden {
    private Plant plant;

    public void addPlant(Plant plant){
        System.out.println("\nРастение: " + plant + " успешно добавлено");
        this.plant = plant;
    }
    public void removePlant(Plant plant){
        System.out.println("\nРастение: " + plant + " успешно удалено");
        this.plant = null;
    }

    public void care(){
        if (plant == null){
            System.out.println("Растение не добавлено!");
        }
        this.plant.carePlant();
    }
}
