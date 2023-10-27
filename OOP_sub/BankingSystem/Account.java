import java.util.ArrayList;
import java.util.List;


public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList = new ArrayList<>();

    public Account(){}

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    /**
     *.
     * @param amount 1
     */

    public void doWithdrawing(double amount)  {
        if (amount > balance) {
            try {
                throw new InsufficientFundsException(amount);
            } catch (InsufficientFundsException e) {
                throw new RuntimeException(e);
            }
        } else if (amount < 0) {
            try {
                throw new InvalidFundingAmountException(amount);
            } catch (InvalidFundingAmountException e) {
                throw new RuntimeException(e);
            }
        } else {
            balance -= amount;
        }

    }

    /**
     * .
     * @param amount 1
     */
    public void doDepositing(double amount) {
       if (amount < 0) {
           try {
               throw new InvalidFundingAmountException(amount);
           } catch (InvalidFundingAmountException e) {
               throw new RuntimeException(e);
           }
       } else {
           balance += amount;
       }
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    /**
     * .
     * @return 1
     */

    public String getTransactionHistory() {
        String result = "Lịch sử giao dịch của tài khoản " + this.getAccountNumber() + ":\n";
        for (Transaction t : transactionList) {
            result += t.getTransactionSummary() + "\n";
        }
       return result;

    }

    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    /**
     * .
     * @param obj 1
     * @return res
     */

    public boolean equals(Object obj) {
        if (obj instanceof Account) {
            Account account = (Account) obj;
            if (account.getAccountNumber() == this.getAccountNumber()) {
                return true;
            }
        }

        return false;
    }

}
