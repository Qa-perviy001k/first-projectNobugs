package me.nobugs.lesson.homeWork2.task8.eighthTaskTeacher;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String someName, String someSubject){
        this.name = someName;
        this.subject = someSubject;
    }

    public String getName(){
        return this.name;
    }

    public String getSubject(){
        return this.subject;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setSubject(String newSubject){
        this.subject = newSubject;
    }

    public void printInfo(){
        System.out.println("Имя учителя: " + this.name + "\nПредмет: " + this.subject);

    }
}
