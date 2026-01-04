package me.nobugs.lesson.homeWork3.task1;

public class Company {
    static String companyName = "Авито";
    final int employeeID;
    String employeeName;

    public Company(String someEmployeeName, int someEmployeeID) {
        this.employeeName = someEmployeeName;
        this.employeeID = someEmployeeID;
    }

    public String getEmployeeName(){
        return this.employeeName;
    }

    public void setEmployeeName(String newEmployeeName){
        employeeName = newEmployeeName;
    }

    public static void printCompanyName(){
        System.out.println("Название компании: " + companyName);
    }

}
