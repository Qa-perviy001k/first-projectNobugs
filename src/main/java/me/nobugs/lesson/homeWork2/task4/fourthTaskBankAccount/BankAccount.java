package me.nobugs.lesson.homeWork2.task4.fourthTaskBankAccount;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String someOwner, double someBalance) {
        this.owner = someOwner;
        this.balance = someBalance;
    }

    public String getOwner() {
        return this.owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Нельзя внести отрицательную сумму!");
        }
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Нельзя снять отрицательную сумму, или 0!");
        } if (amount > balance) {
                    throw new IllegalArgumentException("Недостаточно средств!");
                }
            this.balance = this.balance - amount;
        }

        public void printBalance () {
            System.out.println("Владелец : " + this.owner + " \nТекущий баланс: " + this.balance);

        }
    }
