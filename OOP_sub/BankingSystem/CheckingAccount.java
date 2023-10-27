public class CheckingAccount extends Account {
    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * .
     * @param amount 1
     */
    public void deposit(double amount) {
        try {
            double temp = balance;
            doDepositing(amount);
            addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_CHECKING,
                    amount,
                    temp,
                    balance));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    /**
     * .
     * @param amount 1
     */
    public void withdraw(double amount) {
        try {
            double temp = balance;
            doWithdrawing(amount);
            addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_CHECKING,
                    amount,
                    temp,
                    balance));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
