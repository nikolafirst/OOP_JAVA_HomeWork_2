public class FixedAmountAccount extends AbstractAccount {
    public FixedAmountAccount(double initialAmount) {
        super(initialAmount);
    }


    @Override
    public void put(double amount) {
        System.out.println("Операция недоступна для данного типа счета.");
    }

    @Override
    public void take(double amount) {
        System.out.println("Операция недоступна для данного типа счета.");
    }
}
