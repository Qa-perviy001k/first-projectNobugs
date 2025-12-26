package me.nobugs.lesson.homeWork2.task10.tenthTaskLaptop;

public class Laptop {
    private String brand;
    private double price;

    public Laptop(String someBrand,double somePrice){
        this.brand = someBrand;
        this.price = somePrice;
    }

    public String getBrand(){
        return this.brand;
    }

    public double getPrice(){
        return this.price;
    }

    public void setBrand(String newBrand){
        this.brand = newBrand;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public void printInfo(){
        System.out.println("Бренд ноутбука: " + this.brand + "\nCтоимость: " + this.price + ".руб");
    }

}
