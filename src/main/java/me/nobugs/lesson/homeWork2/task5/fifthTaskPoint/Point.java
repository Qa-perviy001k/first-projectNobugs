package me.nobugs.lesson.homeWork2.task5.fifthTaskPoint;

public class Point {
    double x;
    double y;

    Point(double someX, double someY) {
        this.x = someX;
        this.y = someY;
    }

    double getX() {
        return this.x;
    }

    void setX(double newX) {
        if (newX < 0){
            throw new IllegalArgumentException("Значение не может быть отрицательным!");
        }
        this.x = newX;
    }

    void print(){
        System.out.println("Координаты города Москвы: " + this.x + ", " + this.y);


    }

}
