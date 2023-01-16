package day2workshop;

public class FixedDepositAccount extends BankAccount {

    public static double interest = 3.0;
    public static int duration = 6;

    public FixedDepositAccount(String accountNo, double balance) {
        super(accountNo, balance);
    }
    

    //Override parent deposit & withdraw methods as they are unavailable for FD
    @Override
    public void deposit(double amount){
        System.out.println("No deposit operation");
    }

    @Override
    public void withdraw(double amount){
        System.out.println("No withdrawal operation");
    }

    //Child can access parent class functions
    @Override
    public void showAccount() {
        System.out.println("Account Number: " + this.getAccountNo());
        System.out.println("Full Name: " + this.getFullName());
        System.out.printf("Balance: $%.02f\n", this.getBalance() * (100 + interest)/100);
    }

}
