package day2workshop;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private final String accountNo;
    private String fullName;
    private double balance = 0.0;
    private boolean isActive = true; 
    private Date accountStartDate;
    private Date accountEndDate;

    //Banking Methods
    public void deposit(double amount){
        if(!isActive) {
            throw new IllegalArgumentException("Unable to deposit to closed account.");
        }
        if (amount < 0) {
            throw new IllegalArgumentException("Unable to deposit negative amount.");
        } else {
            balance = balance + amount;
            System.out.println("Deposit of $" + amount + " completed.");
        }
    }

    public void withdraw(double amount){
        if(!isActive) {
            throw new IllegalArgumentException("Unable to withdraw from closed account.");
        }
        if (balance < amount) {
            throw new IllegalArgumentException("Your balance is less than " + amount);
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal of $" + amount + " completed.");
        }
    }

    
    
    
    //Constructors
    public BankAccount(String accountNo, String fullName, double balance, boolean isActive, Date accountStartDate,
            Date accountEndDate) {
        this.accountNo = accountNo;
        this.fullName = fullName;
        this.balance = balance;
        this.isActive = isActive;
        this.accountStartDate = accountStartDate;
        this.accountEndDate = accountEndDate;
    }

    public BankAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public BankAccount(String accountNo, String fullName, double balance) {
        this.accountNo = accountNo;
        this.fullName = fullName;
        this.balance = balance;
    }

    // Getters & Setters
    // Anything with final keyword has no setter
    public String getAccountNo() {
        return accountNo;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    public Date getAccountStartDate() {
        return accountStartDate;
    }
    public void setAccountStartDate(Date accountStartDate) {
        this.accountStartDate = accountStartDate;
    }
    public Date getAccountEndDate() {
        return accountEndDate;
    }
    public void setAccountEndDate(Date accountEndDate) {
        this.accountEndDate = accountEndDate;
    }

    //customized function to show certain details
    public void showAccount() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Full Name: " + fullName);
        System.out.printf("Balance: $%.02f\n", balance);
    }

    @Override
    public String toString() {
        return "BankAccount [accountNo=" + accountNo + ", fullName=" + fullName + ", balance=" + balance + ", isActive="
                + isActive + ", accountStartDate=" + accountStartDate + ", accountEndDate=" + accountEndDate + "]";
    }

 
}
