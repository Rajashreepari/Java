import java.util.Scanner;

abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to Savings Account. New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to Current Account. New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current Account. New balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded or invalid amount.");
        }
    }
}

public class Banking_abstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank Account System");
        System.out.print("Enter initial balance for your Savings Account: ");
        double savingsBalance = scanner.nextDouble();
        BankAccount savings = new SavingsAccount(savingsBalance);

        System.out.print("Enter initial balance for your Current Account: ");
        double currentBalance = scanner.nextDouble();
        System.out.print("Enter overdraft limit for your Current Account: ");
        double overdraftLimit = scanner.nextDouble();
        BankAccount current = new CurrentAccount(currentBalance, overdraftLimit);

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Deposit to Savings Account");
            System.out.println("2. Withdraw from Savings Account");
            System.out.println("3. Deposit to Current Account");
            System.out.println("4. Withdraw from Current Account");
            System.out.println("5. Check Savings Account Balance");
            System.out.println("6. Check Current Account Balance");
            System.out.println("7. Exit");
            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit to Savings Account: ");
                    double savingsDeposit = scanner.nextDouble();
                    savings.deposit(savingsDeposit);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw from Savings Account: ");
                    double savingsWithdraw = scanner.nextDouble();
                    savings.withdraw(savingsWithdraw);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit to Current Account: ");
                    double currentDeposit = scanner.nextDouble();
                    current.deposit(currentDeposit);
                    break;
                case 4:
                    System.out.print("Enter amount to withdraw from Current Account: ");
                    double currentWithdraw = scanner.nextDouble();
                    current.withdraw(currentWithdraw);
                    break;
                case 5:
                    System.out.println("Savings Account Balance: " + savings.getBalance());
                    break;
                case 6:
                    System.out.println("Current Account Balance: " + current.getBalance());
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
