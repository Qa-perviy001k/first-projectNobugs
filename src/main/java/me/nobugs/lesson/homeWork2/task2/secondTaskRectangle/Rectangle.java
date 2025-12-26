package me.nobugs.lesson.homeWork2.task2.secondTaskRectangle;

public class Rectangle {

   private int width;
    private int height;

    public Rectangle(int someWidth, int someHeight) {
        this.width = someWidth;
        this.height = someHeight;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int newWidth) {
        this.width = newWidth;
    }

    public static int calculateArea(int width, int height) {
        return width * height;
    }

    public void printArea(){
        int area = calculateArea(this.width,this.height);
        System.out.println("Площадь прямоугольника: " + area);
    }

    public void print(){
        System.out.println("Значение после изменения ширины: " + this.width);
    }

}


