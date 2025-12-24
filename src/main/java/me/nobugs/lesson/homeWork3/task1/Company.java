package me.nobugs.lesson.homeWork3.task1;

public class Company {
    static String companyName = "Авито";
    final int EmployeeID;
    String employeeName;

    Company(String someEmployeeName, int someEmployeeID) {
        this.employeeName = someEmployeeName;
        this.EmployeeID = someEmployeeID;
    }

    String getEmployeeName(){
        return this.employeeName;
    }

    void setEmployeeName(String newEmployeeID){
        this.employeeName = newEmployeeID;
    }

    static void printCompanyName(){
        System.out.println("Название компании: " + companyName);
    }

}
