package me.nobugs.lesson.homeWork2.task6.sixthTaskStudentGroup;

public class StudentGroup {

    String groupName;
    int studentCount;

    StudentGroup(String someGroupName, int someStudentCount) {
        this.groupName = someGroupName;
        this.studentCount = someStudentCount;
    }

    String getGroupName() {
        return this.groupName;
    }

    int getStudentCount() {
        return this.studentCount;
    }

    void setGroupName(String newGroupName) {
        this.groupName = newGroupName;
    }

    void setStudentCount(int newStudentCount) {
        if (newStudentCount < 0){
            throw new IllegalArgumentException("Значение не может быть отрицательным!");
        }
        this.studentCount = newStudentCount;
    }

    void printInfo() {
        System.out.println("Номер группы: " + this.groupName + ", количество студентов в группе: " + this.studentCount);

    }

}
