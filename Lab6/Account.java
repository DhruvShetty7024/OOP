import java.util.Scanner;

class Account {
    private String customerName;
    private long accountNumber;
    protected double balance;

    Account(String customerName, long accountNumber, double initialBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    void displayBalance() {
        System.out.println("Account Balance: $" + balance);
    }

    void computeInterest() {
        
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance to withdraw $" + amount);
        }
    }

    void checkMinimumBalance() {
        
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String customerName, long accountNumber, double initialBalance) {
        super(customerName, accountNumber, initialBalance);
    }

    void computeInterest() {
        
    }

    void checkMinimumBalance() {
        if (balance < 1000) {
            System.out.println("Minimum balance penalty applied. Balance reduced by $10.");
            balance -= 10;
        }
    }
}

class SavingsBankAccount extends Account {
    SavingsBankAccount(String customerName, long accountNumber, double initialBalance) {
        super(customerName, accountNumber, initialBalance);
    }

    void computeInterest() {
        double interestRate = 4.0;
        double interest = (balance * interestRate) / 100.0;
        balance += interest;
        System.out.println("Interest credited: $" + interest);
    }

    void checkMinimumBalance() {
        if (balance < 500) {
            System.out.println("Minimum balance penalty applied. Balance reduced by $20.");
            balance -= 20;
        }
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Banking System");

        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter your account number: ");
        long accountNumber = scanner.nextLong();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        System.out.print("Choose the type of account (1 for Savings, 2 for Current): ");
        int accountType = scanner.nextInt();

        Account account;
        if (accountType == 1) {
            account = new SavingsBankAccount(customerName, accountNumber, initialBalance);
        } else if (accountType == 2) {
            account = new CurrentAccount(customerName, accountNumber, initialBalance);
        } else {
            System.out.println("Invalid account type. Exiting...");
            scanner.close();
            return;
        }

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Display Balance");
            System.out.println("3. Compute Interest (Savings Account only)");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Minimum Balance and Penalty (Savings Account only)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    account.displayBalance();
                    break;
                case 3:
                    account.computeInterest();
                    break;
                case 4:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 5:
                    account.checkMinimumBalance();
                    break;
                case 6:
                    System.out.println("Thank you for using the Banking System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
