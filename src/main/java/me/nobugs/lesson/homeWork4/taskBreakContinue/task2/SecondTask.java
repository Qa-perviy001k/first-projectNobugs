package me.nobugs.lesson.homeWork4.taskBreakContinue.task2;

public class SecondTask {
    public static void main(String[] args) {
        skippingNumbersDivisible3();

    }

    public static void skippingNumbersDivisible3(){
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}