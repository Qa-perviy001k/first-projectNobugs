package me.nobugs.lesson.homeWork2.task3.thirdTaskBook;

public class Main {
    public static void main(String[] args) {
        Book b = new Book("Святослав Куликов","Тестирование ПО");

        b.printInfo();
        b.setAuthor("Виктор Иванов");
        b.printInfo();

    }
}
