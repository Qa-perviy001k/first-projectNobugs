package me.nobugs.lesson.homeWork2.task5.fifthTaskPoint;

public class Point {
    private double x;
    private double y;

    public Point(double someX, double someY) {
        this.x = someX;
        this.y = someY;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double newX) {
        if (newX < 0){
            throw new IllegalArgumentException("Значение не может быть отрицательным!");
        }
        this.x = newX;
    }

    public void print(){
        System.out.println("Координаты города Москвы: " + this.x + ", " + this.y);


    }

}
