package me.nobugs.lesson.homeWork5.task2.petManagement;

public class Cat extends HousePet {

    @Override
    public void eat(){
        System.out.println("Питомец выполняет прием пищи: Ест влажный корм");
    }

    @Override
    public void act(){
        System.out.println("Питомец выполняет действие: Играет");
    }

    public String toString() {
        return "Cat";
    }

}
