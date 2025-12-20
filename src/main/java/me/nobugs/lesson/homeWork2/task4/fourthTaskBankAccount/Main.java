package me.nobugs.lesson.homeWork2.task4.fourthTaskBankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bA = new BankAccount("Иван",20);
            bA.printBalance();
            bA.deposit(123.00);
            bA.printBalance();
            bA.withdraw(20.42);
            bA.printBalance();

        }
    }
