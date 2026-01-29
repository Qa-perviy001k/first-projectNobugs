package me.nobugs.lesson.homeWork5.task7.amusementPark;

public class AmusementPark {
    private Attraction attraction;

    public void addAttraction(Attraction attraction) {
        System.out.println("\nАттракцион: " + attraction + " успешно добавлен");
        this.attraction = attraction;
    }

    public void removeAttraction() {
        System.out.println("\nАттракцион: " + attraction + " успешно удален");
        this.attraction = null;
    }

    public void showAttraction() {
        if (attraction == null) {
            System.out.println("Аттракцион не добавлен!");
        } else {
            this.attraction.service();
            this.attraction.emotions();
        }
    }
}