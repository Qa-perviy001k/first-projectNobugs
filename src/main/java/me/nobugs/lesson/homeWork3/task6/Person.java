package me.nobugs.lesson.homeWork3.task6;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    public Person(String someFirstName,String someLastName,String SomeSsn){
        this.firstName = someFirstName;
        this.lastName = someLastName;
        this.ssn = SomeSsn;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getSsn(){
        return this.ssn;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }

    public void printPersonInfo(){
        System.out.println("Имя: " + this.firstName + "\nФамилия: " + this.lastName + "\nSSN: " + this.ssn);
    }
}
