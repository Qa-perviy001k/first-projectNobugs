package me.nobugs.lesson.homeWork5.task2.petManagement;

public class ManagementHousePet {
    private HousePet housePet;

    public void addHousePet(HousePet housePet) {
        System.out.println("\nПитомец: " + housePet + " успешно добавлен");
        this.housePet = housePet;
    }

    public void removeHousePet(HousePet housePet){
        System.out.println("\nПитомец: " + housePet + " успешно удален");
        this.housePet = null;
    }

    public void giveCommandPet(){
        this.housePet.eat();
        this.housePet.act();
    }

}
