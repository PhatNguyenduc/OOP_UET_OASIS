public class InsufficientFundsException extends BankException {
    InsufficientFundsException(double amount) {
        super("Số dư tài khoản không đủ $"
                + String.format("%.2f", amount) + " để thực hiện giao dịch");
    }

    /**
     *.
     * @return res
     */
    @Override
    public String toString() {
        return getMessage();
    }

}
