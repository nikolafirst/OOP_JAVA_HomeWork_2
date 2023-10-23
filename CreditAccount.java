public class CreditAccount extends AbstractAccount {
    public CreditAccount(double initialAmount) {
        super(initialAmount);
    }

    @Override
    public void take(double amount) {
        balance -= amount + amount * 0.01; // комиссия 1%
    }
}
