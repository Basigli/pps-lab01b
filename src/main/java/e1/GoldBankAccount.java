package e1;

public class GoldBankAccount implements BankAccount {

    public static final int OVERDRAFT_AMOUNT = 500;
    private BankAccount base;

    public GoldBankAccount(BankAccount bankAccount) {
        this.base = bankAccount;
    }


    @Override
    public int getBalance() {
        return this.base.getBalance();
    }

    @Override
    public void deposit(int amount) {
        this.base.deposit(amount);
    }

    @Override
    public void withdraw(int amount) {
        if ((this.getBalance() + OVERDRAFT_AMOUNT) < amount){
            throw new IllegalStateException();
        }
        base.withdraw(amount);
    }
}
