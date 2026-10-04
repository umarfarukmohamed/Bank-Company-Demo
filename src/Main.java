class BankAccount {

    String accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : " + balance);
    }
}

class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(String accountNumber, String accountHolderName,
                   double balance, double interestRate) {

        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest       : " + interest);
    }
}

class PremiumSavingsAccount extends SavingsAccount {

    double cashback;

    PremiumSavingsAccount(String accountNumber, String accountHolderName,
                          double balance, double interestRate, double cashback) {

        super(accountNumber, accountHolderName, balance, interestRate);
        this.cashback = cashback;
    }

    void displayPremiumBenefits() {
        System.out.println("Cashback       : " + cashback);
    }
}

public class Main {

    public static void main(String[] args) {

        PremiumSavingsAccount account =
                new PremiumSavingsAccount(
                        "ACC101",
                        "Umar",
                        10000,
                        5,
                        500
                );

        account.displayAccountDetails();
        account.deposit(2000);
        account.calculateInterest();
        account.displayPremiumBenefits();

        System.out.println("Final Balance  : " + account.balance);
    }
}