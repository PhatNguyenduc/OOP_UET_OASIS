import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

    private void deposit(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban nap vao khong hop le!");

        } else {
            balance += amount;
        }
    }

    private void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban rut ra khong hop le!");

        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance -= amount;
        }
    }

    /**
     * .
     * @param amount 1
     * @param operation 1
     */
    public void addTransaction(double amount, String operation) {
        if (!operation.equals(Transaction.DEPOSIT) && !operation.equals(Transaction.WITHDRAW)) {
            System.out.println("Yeu cau khong hop le!");
            return;
        }
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else  {
            withdraw(amount);
        }
        Transaction transaction = new Transaction(operation, amount, balance);
        transitionList.add(transaction);
    }

    /**
     * .
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            Transaction transaction = transitionList.get(i);
            String transactionType = transaction.getOperation();
            double transactionAmount = transaction.getAmount();
            double transactionBalance = transaction.getBalance();

            System.out.printf("Giao dich %d: %s tien $%.2f. So du luc nay: $%.2f.%n",
                    (i + 1), (transactionType.equals(Transaction.DEPOSIT) ? "Nap" : "Rut"),
                    transactionAmount, transactionBalance);
        }
    }





}
