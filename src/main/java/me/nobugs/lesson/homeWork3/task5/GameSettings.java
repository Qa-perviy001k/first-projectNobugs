package me.nobugs.lesson.homeWork3.task5;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String someGameName) {
        this.gameName = someGameName;
    }

    public static void setMaxPlayers(int maxPlayers) {
        GameSettings.maxPlayers = maxPlayers;
    }

    public void addPlayer() {
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        } else {
            throw new IllegalArgumentException("Превышен лимит, maxPlayers!");
        }
    }

        void printGameStatus () {
            System.out.println("Название игры: " + this.gameName + "\nТекущее количество игроков: " + this.currentPlayers + "\nМаксимальное количество игроков: " + GameSettings.maxPlayers);
        }
    }
