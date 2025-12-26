package me.nobugs.lesson.homeWork2.task7.seventhTaskCircle;

public class Circle {

    private double radius;

    public Circle(double someRadius){
        this.radius = someRadius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius (double newRadius){
        if(newRadius < 0){
            throw new IllegalArgumentException("Не может быть отрицательным!");
        }
        this.radius = newRadius;
    }

    public void printInfo(){
        System.out.println("Радиус: " + this.radius);
    }

    public double calculateArea(){
        return (Math.PI * this.radius * this.radius);
    }

    public double calculateCircumference(){
        return (2 * Math.PI * this.radius);
    }

}
