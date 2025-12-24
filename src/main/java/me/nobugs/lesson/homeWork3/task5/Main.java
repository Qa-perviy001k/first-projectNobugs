package me.nobugs.lesson.homeWork3.task5;

public class Main {
    public static void main(String[] args) {
        GameSettings gameOne = new GameSettings("Шахматы");
        GameSettings.setMaxPlayers(2);
        gameOne.addPlayer();
        gameOne.addPlayer();
        gameOne.printGameStatus();

        GameSettings gameTwo = new GameSettings("Карты");
        GameSettings.setMaxPlayers(6);
        gameTwo.addPlayer();
        gameTwo.addPlayer();
        gameTwo.addPlayer();
        gameTwo.addPlayer();
        gameTwo.addPlayer();
        gameTwo.addPlayer();
        gameTwo.printGameStatus();
    }
}
