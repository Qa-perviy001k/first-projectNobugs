package me.nobugs.lesson.homeWork5.task8.museum;

public class Museum {
    private Exhibit exhibit;

    public void addExhibit(Exhibit exhibit) {
        System.out.println("\nЭкспонат: " + exhibit + " успешно добавлен");
        this.exhibit = exhibit;
    }

    public void removeExhibit(Exhibit exhibit) {
        System.out.println("\nЭкспонат: " + exhibit + " успешно удален");
        this.exhibit = null;
    }

    public void checkExhibit(){
        if (exhibit == null){
            System.out.println("Экспонат не добавлен!");
        }
        this.exhibit.describe();
        this.exhibit.preserve();
    }

}
