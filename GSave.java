public class GSave implements BankAccountDecorator {
    private SavingsAccount savingsAccount;
    private static final double INTEREST_RATE = 0.025; // 2.5%

    public GSave(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    @Override
    public String showAccountType() {
        return "GSave";
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
        return savingsAccount.showBenefits() + " + GCash Transfer";
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
