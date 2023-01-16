package day2workshop;

import java.util.UUID;
import java.util.Random;

/**
 * Hello world!
 */
public final class App {
    private static final String Random = null;

    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        int n = 3;
        BankAccount bankAccount[] = new BankAccount[n]; //defining an array that can store fixed no. of bank accs

        for (int i = 0; i < bankAccount.length; i++) {
        String uuid = UUID.randomUUID().toString();

        double max = 10000.00;
        double min = 1000.00;

        Random randomNum = new Random();
        double initialBalance = min + randomNum.nextDouble(n); 

        bankAccount[i] = new BankAccount (uuid, initialBalance);
        }

        bankAccount[0].setFullName("Annie");
        bankAccount[1].setFullName("Branda");
        bankAccount[2].setFullName("Charles");

        for (int j = 0; j < bankAccount.length; j++) {
            bankAccount[j].showAccount();
        }

        // bankAccount[0].showAccount();
        // bankAccount[1].showAccount();
        // bankAccount[2].showAccount();

        System.out.println("-----------------------------------------");
        bankAccount[0].deposit(2000.00);
        bankAccount[1].withdraw(500.00);
        bankAccount[2].deposit(5000.00);

        for (int j = 0; j < bankAccount.length; j++) {
            bankAccount[j].showAccount();
        }

        // Creating FD account
        for (int i = 0; i < bankAccount.length; i++) {
            String uuid = UUID.randomUUID().toString();
    
            double min = 1000.00;
    
            Random randomNum = new Random();
            double initialBalance = min + randomNum.nextDouble(n); 
    
            bankAccount[i] = new FixedDepositAccount (uuid, initialBalance);
        }
        
        System.out.println("*******************************************");
        System.out.println("Fixed Deposit Accounts");
        bankAccount[0].setFullName("Damien");
        bankAccount[1].setFullName("Elsa");
        bankAccount[2].setFullName("Fiona");
        bankAccount[0].deposit(2000.00);
        bankAccount[1].withdraw(500.00);
        bankAccount[2].deposit(5000.00);

        for (int j = 0; j < bankAccount.length; j++) {
            bankAccount[j].showAccount();
        }

    }
}
