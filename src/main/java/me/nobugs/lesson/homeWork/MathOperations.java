package me.nobugs.lesson.homeWork;

public class MathOperations {
    public static void main(String[] args) {

        int add1 = add(30, 20);
        System.out.println("\nРезультат сложения двух чисел: " + add1);

        int subtract1 = subtract(30, 20);
        System.out.println("\nРезультат вычитания двух чисел: " + subtract1);

        int multiply1 = multiply(30, 20);
        System.out.println("\nРезультат умножения двух чисел: " + multiply1);

        int divide1 = divide(30, 20);
        System.out.println("\nРезультат деления двух чисел: " + divide1);

        int findMax1 = findMax(30, 20);
        System.out.println("\nМаксимальное число из двух представленных: " + findMax1);

        int difference1 = difference(30, 20);
        System.out.println("\nАбсолютная разница: " + difference1);

        int squareArea1 = squareArea(40);
        System.out.println("\nПлощадь квадрата: " + squareArea1);

        int squarePerimeter1 = squarePerimeter(40);
        System.out.println("\nПериметр квадрата: " + squarePerimeter1);

        double convertSecondsToMinutes1 = convertSecondsToMinutes(300);
        System.out.println("\nПеревод секунд в минуты: " + convertSecondsToMinutes1);

        double averageSpeed1 = averageSpeed(100, 1);
        System.out.println("\nСредняя скорость: " + averageSpeed1);

        double findHypotenuse1 = findHypotenuse(11, 5);
        System.out.println("\nГипотенуза: " + findHypotenuse1);

        double circleCircumference1 = circleCircumference(30);
        System.out.println("\nДлина окружности: " + circleCircumference1);

        double calculatePercentage1 = calculatePercentage(100, 30);
        System.out.println("\nПроцент с итога: " + calculatePercentage1);

        double celsiusToFahrenheit1 = celsiusToFahrenheit(20);
        System.out.println("\nПеревод Цельсии в Фаренгейты: " + celsiusToFahrenheit1);

        double fahrenheitToCelsius1 = fahrenheitToCelsius(20);
        System.out.println("\nПеревод Фаренгейта в Цельсии: " + fahrenheitToCelsius1);

    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        int total = x / y;
        if (total == 0) {
            throw new ArithmeticException("Результат не может быть равен 0!");
        }
        return total;
    }

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static double convertSecondsToMinutes(double seconds) {
        return seconds / 60.0;
    }

    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double circleCircumference(double radius) {
        return (2 * Math.PI * radius);
    }

    public static double calculatePercentage(double total, double part) {
        double result = (part / total) * 100;
        if (result == 0) {
                throw new ArithmeticException("Результат не может быть равен 0!");
            }
            return result;
        }

        public static double celsiusToFahrenheit ( double c){
            return (c * 9 / 5) + 32;
        }

        public static double fahrenheitToCelsius ( double f){
            return (f - 32) * 5 / 9;
        }
    }



