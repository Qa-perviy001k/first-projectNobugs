package me.nobugs.lesson.homeWork2.task1.firstTaskCar;

public class Car {
    int year;
    String brand;

    Car(int someYear, String someBrand) {

        this.year = someYear;
        this.brand = someBrand;
    }

    void print() {
        System.out.println("Модель автомобиля: " + this.brand + ", год выпуска: " + this.year);
    }

    int getYear() {
        return this.year;
    }

    String getBrand() {
        return this.brand;
    }

    void setYear(int newYear) {
        this.year = newYear;
    }

    void setBrand(String newBrand){
        this.brand = newBrand;
    }
}
