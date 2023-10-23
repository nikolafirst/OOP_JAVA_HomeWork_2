public class Main {
    public static void main(String[] args) {
        Account creditAccount = new CreditAccount(1000);
        creditAccount.put(500);
        creditAccount.take(200);
        System.out.println("Баланс кредитного счета: " + creditAccount.getAmount());

        Account depositAccount = new DepositAccount(2000);
        depositAccount.put(100);
        depositAccount.take(500);
        System.out.println("Баланс депозитного счета: " + depositAccount.getAmount());

        Account fixedAmountAccount = new FixedAmountAccount(3000);
        fixedAmountAccount.put(1000);
        fixedAmountAccount.take(2000);
        System.out.println("Баланс счета с фиксированной суммой: " + fixedAmountAccount.getAmount());
    }
}
