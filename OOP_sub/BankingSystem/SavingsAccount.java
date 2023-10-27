public class SavingsAccount extends Account {
    public SavingsAccount(long accountNumber, double balance) {
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
            addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS,
                    amount, temp, balance));
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
            if (amount <= 1000 && (balance - amount) >= 5000) {
                doWithdrawing(amount);
                addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS,
                        amount, temp, balance));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
