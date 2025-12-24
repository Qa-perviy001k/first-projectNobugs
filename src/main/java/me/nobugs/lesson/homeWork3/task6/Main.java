package me.nobugs.lesson.homeWork3.task6;

public class Main {
    public static void main(String[] args) {
        Person vasiliy = new Person("Василий","Иванов","145-22-3241");
        vasiliy.printPersonInfo();

        Person dmitriy = new Person("Дмитрий","Овечкин","144-55-2212");
        dmitriy.printPersonInfo();
        dmitriy.setFirstName("Виктор");
        dmitriy.printPersonInfo();
    }
}
