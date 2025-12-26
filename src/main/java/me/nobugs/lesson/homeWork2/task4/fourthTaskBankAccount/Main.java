package me.nobugs.lesson.homeWork2.task4.fourthTaskBankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bA = new BankAccount("Иван",20);
            bA.printBalance();
            bA.deposit(10);
            bA.printBalance();
            bA.withdraw(30);
            bA.printBalance();

        }
    }
