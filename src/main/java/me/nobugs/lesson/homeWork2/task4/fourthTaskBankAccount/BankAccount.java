package me.nobugs.lesson.homeWork2.task4.fourthTaskBankAccount;

public class BankAccount {
    private String owner;
   private double balance;

    BankAccount(String someOwner, double someBalance){
        this.owner = someOwner;
        this.balance = someBalance;
    }

    String getOwner(){
        return this.owner;
    }

    double getBalance(){
        return this.balance;
    }

    void setOwner(String newOwner){
        this.owner = newOwner;
    }

    public void deposit(double amount){
        if (amount < 0){
            throw new IllegalArgumentException("Нельзя внести отрицательную сумму!");
        }
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Нельзя снять отрицательную сумму, или 0!");
        }
        this.balance = this.balance - amount;
    }

    void printBalance(){
        System.out.println("Владелец : " + this.owner + " \nТекущий баланс: " + this.balance);


    }
}
