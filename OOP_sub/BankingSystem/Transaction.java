public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 1;
    public static final int TYPE_WITHDRAW_CHECKING = 11;

    public static final int TYPE_DEPOSIT_SAVINGS = 2;
    public static final int TYPE_WITHDRAW_SAVINGS = 22;

    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;

    /**
     * .
     * @param type 1
     * @param amount 1
     * @param initialBalance 1
     * @param finalBalance 1
     */

    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    /**
     * .
     * @param type 1
     * @return res
     */
    private  String getTransactionTypeString(int type) {
        String res = "";
        if (type == TYPE_DEPOSIT_CHECKING) {
            res = "Nạp tiền vãng lai";
        } else if (type == TYPE_WITHDRAW_CHECKING) {
            res = "Rút tiền vãng lai";
        } else if (type == TYPE_DEPOSIT_SAVINGS) {
            res = "Nạp tiền tiết kiệm";
        } else if (type == TYPE_WITHDRAW_SAVINGS) {
            res = "Rút tiền tiết kiệm";
        }
        return res;


    }

    /**
     * .
     * @return res
     */
    public String getTransactionSummary() {
        return "- Kiểu giao dịch: " + getTransactionTypeString(type)
               + ". Số dư ban đầu: $" + String.format("%.2f", initialBalance)
               + ". Số tiền: $" + String.format("%.2f", amount)
               + ". Số dư cuối: $" + String.format("%.2f", finalBalance) + ".";
    }
}
