package me.nobugs.lesson.homeWork2.task9.theNinthTaskProduct;

public class Product {
    private String name;
    private double price;

    public Product(String someName, double somePrice){
        this.name = someName;
        this.price = somePrice;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public void printInfo(){
        System.out.println("Товар: " + this.name + "\nЦена: " + this.price + ".руб");
    }

    public void applyDiscount(double discount){
        if (discount <= 0){
            throw new IllegalArgumentException("Скидка не может быть отрицательной или равна 0!");
        }else if (discount > 50){
            throw new IllegalArgumentException("Скидка не может быть более 50%");
        }
        this.price = this.price - (this.price * discount / 100) ;
    }
}
