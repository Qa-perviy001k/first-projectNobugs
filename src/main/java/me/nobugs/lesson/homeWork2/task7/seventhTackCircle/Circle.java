package me.nobugs.lesson.homeWork2.task7.seventhTackCircle;

public class Circle {

     private double radius;

    Circle(double someRadius){
        this.radius = someRadius;
    }

    double getRadius(){
        return this.radius;
    }

    void setRadius (double newRadius){
        if(newRadius < 0){
            throw new IllegalArgumentException("Не может быть отрицательным!");
        }
        this.radius = newRadius;
    }

    void printInfo(){
        System.out.println("Радиус: " + this.radius);
    }

    public double calculateArea(){
        return (Math.PI * this.radius * this.radius);
    }

    public double calculateCircumference(){
        return (2 * Math.PI * this.radius);
    }

}
