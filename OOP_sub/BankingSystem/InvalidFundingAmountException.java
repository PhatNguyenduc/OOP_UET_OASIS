public class InvalidFundingAmountException extends BankException {
    public InvalidFundingAmountException(double amount) {
            super("Số tiền không hợp lệ: $" + String.format("%.2f", amount));
    }

    @Override
    public String toString() {
        return getMessage();
    }
}

