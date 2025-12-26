package me.nobugs.lesson.homeWork2.task6.sixthTaskStudentGroup;

public class StudentGroup {

   private String groupName;
   private int studentCount;

    public StudentGroup(String someGroupName, int someStudentCount) {
        this.groupName = someGroupName;
        this.studentCount = someStudentCount;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public int getStudentCount() {
        return this.studentCount;
    }

    public void setGroupName(String newGroupName) {
        this.groupName = newGroupName;
    }

    public void setStudentCount(int newStudentCount) {
        if (newStudentCount < 0){
            throw new IllegalArgumentException("Значение не может быть отрицательным!");
        }
        this.studentCount = newStudentCount;
    }

    public void printInfo() {
        System.out.println("Номер группы: " + this.groupName + "\nКоличество студентов в группе: " + this.studentCount);

    }

}
