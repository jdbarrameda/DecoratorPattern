public class UpSave implements BankAccountDecorator {
    private SavingsAccount savingsAccount;
    private static final double INTEREST_RATE = 0.04; // 4.0%

    public UpSave(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return INTEREST_RATE;
    }

    @Override
    public double getBalance() {
        return savingsAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return savingsAccount.showBenefits() + " + With Insurance";
    }

    @Override
    public double computeBalanceWithInterest() {
        return savingsAccount.getBalance() + (savingsAccount.getBalance() * INTEREST_RATE);
    }

    @Override
    public String showInfo() {
        return savingsAccount.showInfo();
    }
}
