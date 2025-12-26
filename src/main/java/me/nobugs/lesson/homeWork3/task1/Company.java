package me.nobugs.lesson.homeWork3.task1;

public class Company {
    static String companyName = "Авито";
    final int EmployeeID;
    String employeeName;

    public Company(String someEmployeeName, int someEmployeeID) {
        this.employeeName = someEmployeeName;
        this.EmployeeID = someEmployeeID;
    }

    public String getEmployeeName(){
        return this.employeeName;
    }

    public void setEmployeeName(String newEmployeeID){
        this.employeeName = newEmployeeID;
    }

    public static void printCompanyName(){
        System.out.println("Название компании: " + companyName);
    }

}
