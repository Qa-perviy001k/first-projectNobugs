package me.nobugs.lesson.homeWork2.task1.firstTaskCar;

public class Car {
    private int year;
    private String brand;

    public Car(int someYear, String someBrand) {

        this.year = someYear;
        this.brand = someBrand;
    }

    public void print() {
        System.out.println("Модель автомобиля: " + this.brand + ", год выпуска: " + this.year);
    }

    public int getYear() {
        return this.year;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public void setBrand(String newBrand){
        this.brand = newBrand;
    }
}
