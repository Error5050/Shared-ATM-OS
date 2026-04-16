public class BankAccount {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    // بدون synchronization
    public void withdraw(int amount) {
        if (balance >= amount) {
            int newBalance = balance - amount;
            balance = newBalance;
        }
    }

    // مع synchronization
    public synchronized void withdrawSync(int amount) {
        if (balance >= amount) {
            int newBalance = balance - amount;
            balance = newBalance;
        }
    }
}
