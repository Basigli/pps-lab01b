package e1;

public class BronzeBankAccount implements BankAccount{

    private BankAccount base;

    public BronzeBankAccount (BankAccount bankAccount) {
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
        if (this.getBalance() < amount){
            throw new IllegalStateException();
        }
        this.base.withdraw(amount < 100 ? amount : amount + 1);

    }
}
