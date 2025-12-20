package me.nobugs.lesson.homeWork2.task9.theNinthTaskProduct;

public class Main {
    public static void main(String[] args) {
        Product p = new Product("Протеин WHEY",12400.00);
        p.printInfo();

        p.setPrice(13500.00);
        p.printInfo();

        p.applyDiscount(50);
        p.printInfo();

    }


}
