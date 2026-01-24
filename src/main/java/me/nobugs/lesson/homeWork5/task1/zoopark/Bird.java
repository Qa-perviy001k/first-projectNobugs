package me.nobugs.lesson.homeWork5.task1.zoopark;

public class Bird extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Животное издает звук: Чирикает");
    }

    @Override
    public void act(){
        System.out.println("Животное выполняет действие: Летает");
    }

    public String toString() {
        return "Bird";
    }
}
