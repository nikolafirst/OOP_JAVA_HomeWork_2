import java.time.LocalDate;

public class DepositAccount extends AbstractAccount {
    private LocalDate lastWithdrawalDate;

    public DepositAccount(double initialAmount) {
        super(initialAmount);
        lastWithdrawalDate = LocalDate.now();
    }

    @Override
    public void take(double amount) {
        LocalDate currentDate = LocalDate.now();
        if (lastWithdrawalDate.plusMonths(1).isBefore(currentDate) || lastWithdrawalDate.isEqual(currentDate)) {
            balance -= amount;
            lastWithdrawalDate = LocalDate.now();
        } else {
            System.out.println("Вы не можете снять средства чаще, чем раз в месяц.");
        }
    }
}
