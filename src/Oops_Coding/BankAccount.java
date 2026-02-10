package Oops_Coding;

    /*Create a BankAccount class with private balance field. Implement deposit(), withdraw(),
    and getBalance() methods with proper validation.

Examples:
Input:
Initial balance: 1000, deposit: 500, withdraw: 200
Output:
Balance after deposit: 1500.0 Balance after withdrawal: 1300.0
💡 Explanation:Implement proper encapsulation with validation to prevent invalid operations
like negative deposits or insufficient balance withdrawals.*/

public class BankAccount {

    // Private field for balance, ensuring encapsulation
    private double balance;

    /**
     * Constructor to initialize the bank account with an initial balance.
     * @param initialBalance The starting balance. Must be non-negative.
     * @throws IllegalArgumentException if the initial balance is negative.
     */
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
    }

    /**
     * Deposits an amount into the account.
     * @param amount The amount to deposit. Must be positive.
     * @throws IllegalArgumentException if the deposit amount is not positive.
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
    }

    /**
     * Withdraws an amount from the account.
     * @param amount The amount to withdraw. Must be positive and less than or equal to the balance.
     * @throws IllegalArgumentException if the withdrawal amount is invalid (not positive or insufficient funds).
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        } else {
            throw new IllegalArgumentException("Insufficient funds for withdrawal of " + amount);
        }
    }

    /**
     * Returns the current balance of the account.
     * @return The current balance.
     */
    public double getBalance() {
        return balance;
    }

    // Main method to demonstrate the class usage
    public static void main(String[] args) {
        try {
            // Example 1: Standard operations
            BankAccount account1 = new BankAccount(1000.0);
            System.out.println("Initial Balance: " + account1.getBalance());

            account1.deposit(500.0);
            System.out.println("Balance after deposit: " + account1.getBalance());

            account1.withdraw(200.0);
            System.out.println("Balance after withdrawal: " + account1.getBalance());

            System.out.println("------------------------------------");

            // Example 2: Invalid operations (handled by exceptions)
            BankAccount account2 = new BankAccount(500.0);

            // Try invalid deposit
            try {
                account2.deposit(-50.0);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Try insufficient funds withdrawal
            try {
                account2.withdraw(1000.0);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error creating account: " + e.getMessage());
        }
    }
}
