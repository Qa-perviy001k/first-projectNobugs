package me.nobugs.lesson.homeWork3.task4;

public class University {
    static String universityName;
    String studentName;
    final int studentID;

    public University(String someStudentName, int someStudentID){
        this.studentName = someStudentName;
        this.studentID = someStudentID;
    }

    public static void changeUniversityName (String newName){
       universityName = newName;
    }

    public  String getStudentName(){
       return this.studentName;
    }

    public void printStudentInfo(){
        System.out.println("Имя студента: " + this.studentName + "\nID студента: " + this.studentID + "\nУниверситет: " + universityName);
    }
}
