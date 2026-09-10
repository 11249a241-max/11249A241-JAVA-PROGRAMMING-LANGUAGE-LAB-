// 1. Define the Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// 2. Define the BankAccount class that manages the balance
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    // Method that throws the custom exception if the withdrawal amount is too high
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            double shortage = amount - balance;
            throw new InsufficientBalanceException("Transaction Denied! You are short of ₹" + shortage);
        }
        balance -= amount;
        System.out.println("Success! ₹" + amount + " withdrawn successfully.");
        System.out.println("Remaining Balance: ₹" + balance);
    }
}

// 3. Main class named ATM
public class ATM {
    public static void main(String[] args) {
        // Create an account with an initial balance of ₹5000
        BankAccount myAccount = new BankAccount(5000.0);

        System.out.println("Initial Balance: ₹" + myAccount.getBalance());

        // Test Case 1: Valid Withdrawal
        try {
            System.out.println("\nAttempting to withdraw ₹3000...");
            myAccount.withdraw(3000.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // Test Case 2: Invalid Withdrawal (Triggers Exception)
        try {
            System.out.println("\nAttempting to withdraw ₹4000...");
            myAccount.withdraw(4000.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        
        System.out.println("\nFinal Balance: ₹" + myAccount.getBalance());
    }
}
