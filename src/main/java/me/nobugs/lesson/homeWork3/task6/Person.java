package me.nobugs.lesson.homeWork3.task6;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    Person(String someFirstName,String someLastName,String SomeSsn){
        this.firstName = someFirstName;
        this.lastName = someLastName;
        this.ssn = SomeSsn;
    }

    String getFirstName(){
        return this.firstName;
    }

    String getLastName(){
        return this.lastName;
    }

    String getSsn(){
        return this.ssn;
    }

    void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    void setLastName(String newLastName){
        this.lastName = newLastName;
    }

    void printPersonInfo(){
        System.out.println("Имя: " + this.firstName + "\nФамилия: " + this.lastName + "\nSSN: " + this.ssn);
    }
}
