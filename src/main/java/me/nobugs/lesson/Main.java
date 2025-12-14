package me.nobugs.lesson;

public class Main {
    // поля
    static int a = 12;


    // метод
    // зеленая стрелочка - программа запускаема
    // метод main - точка входа в программу

    public static void main(String[] args) {

        int sum1 = sum(1, 2);
        System.out.println("Результат сложения : " + sum1);

        int mult = multiply(10,20);
        System.out.println("Результат умножения : " + mult);

        int substruct1 = substruct(30, 20);
        System.out.println("Результат вычитания : " + substruct1);

        double div1 = devide(10, 20);
        System.out.println("Результат деления : " + div1);
    }


    public static int sum(int x, int y) {
        // тело метода
        return x + y; // возвращаемое значение из метода

    }

    public static int multiply(int g, int s) {  // аргементы метода

        // тело метода
        int mult = g * s;
        return mult;


    }

    public static int substruct(int v, int z) {
        return v - z;
    }

    public static double devide(int m, int s) {
        return (double) m / s;
    }


}