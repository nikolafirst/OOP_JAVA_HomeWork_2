public abstract class AbstractAccount implements Account {
    protected double balance;

    public AbstractAccount(double initialAmount) {
        this.balance = initialAmount;
    }

    @Override
    public double getAmount() {
        return balance;
    }

    @Override
    public void put(double amount) {
        balance += amount;
    }

    @Override
    public void take(double amount) {
        balance -= amount;
    }
}
