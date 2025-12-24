package me.nobugs.lesson.homeWork3.task4;

public class Main {
    public static void main(String[] args) {
        University.changeUniversityName("МГИМО");
        University vasiliy = new University("Вася",1125);
        vasiliy.printStudentInfo();
        University grigoriy = new University("Григорий",2225);
        grigoriy.printStudentInfo();
        University kirill = new University("Кирилл",8825);
        kirill.printStudentInfo();
    }
}
