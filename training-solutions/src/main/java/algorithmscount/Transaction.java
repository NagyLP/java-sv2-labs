package algorithmscount;

public class Transaction {

    private final int accountNumber;
    private final TransactionType transactionType;
    private final int amount;

    public Transaction(int accountNumber, TransactionType transactionType, int amount) {
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public boolean isCredit() {
        return transactionType == TransactionType.CREDIT;
    }

    public boolean isDebit() {
        return transactionType == TransactionType.DEBIT;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public int getAmount() {
        return amount;
    }
}
