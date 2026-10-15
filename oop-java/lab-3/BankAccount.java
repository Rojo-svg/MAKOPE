import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private final String accountNumber;
    private String ownerName;
    private double balance;
    private final List<String> history = new ArrayList<>();

    public BankAccount(String accountNumber, String ownerName, double openingBalance) {
        if (openingBalance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative");
        }

        this.accountNumber = accountNumber;
        setOwnerName(ownerName);
        this.balance = openingBalance;
        history.add("Opened with " + openingBalance);
    }

    public String getAccountNumber() { return accountNumber; }
    public String getOwnerName()     { return ownerName; }
    public double getBalance()       { return balance; }

    public List<String> getHistory() {
        return List.copyOf(history);
    }

    public void setOwnerName(String ownerName) {
        if (ownerName == null || 

ownerName.isBlank()) {
            throw new IllegalArgumentException("Owner name required");
        }
        this.ownerName = ownerName.trim();
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive");
        }
        balance += amount;
        history.add("Deposited " + amount);
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {

            throw new IllegalArgumentException("Withdrawal must be positive");
        }
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        history.add("Withdrew " + amount);
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s [%s] balance: %.2f", accountNumber, ownerName, balance);
    }
}