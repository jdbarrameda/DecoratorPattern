public class SavingsAccount {
    private int accountNumber;
    private String accountName;
    private double balance;
    private static final double INTEREST_RATE = 0.01; // 1%

    // Getters and setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String showInfo() {
        return "Account Number: " + accountNumber + "\nAccount Name: " + accountName + "\nBalance: " + balance;
    }

    public String showAccountType() {
        return "Savings Account";
    }

    public double getInterestRate() {
        return INTEREST_RATE;
    }

    public double computeBalanceWithInterest() {
        return balance + (balance * INTEREST_RATE);
    }

    public String showBenefits() {
        return "Standard Savings Account";
    }
}
