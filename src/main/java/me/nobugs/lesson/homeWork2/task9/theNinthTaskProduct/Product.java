package me.nobugs.lesson.homeWork2.task9.theNinthTaskProduct;

public class Product {
    String name;
    double price;

    Product(String someName, double somePrice){
        this.name = someName;
        this.price = somePrice;
    }

    String getName(){
        return this.name;
    }

    double getPrice(){
        return this.price;
    }

    void setPrice(double newPrice){
        this.price = newPrice;
    }

    void printInfo(){
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
