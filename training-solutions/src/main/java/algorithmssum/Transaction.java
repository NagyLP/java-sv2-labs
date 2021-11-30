package algorithmssum;

public class Transaction {

    private final int accountNumber;
    private final TransactionOperation transactionOperation;
    private final int amount;

    public Transaction(int accountNumber, TransactionOperation transactionOperation, int amount) {
        this.accountNumber = accountNumber;
        this.transactionOperation = transactionOperation;
        this.amount = amount;
    }

//    public boolean isCredit() {
//        return transactionOperation == TransactionOperation.CREDIT;
//    }
//    public boolean isDebit() {
//        return transactionOperation == TransactionOperation.DEBIT;
//    }
//
//    public int getAccountNumber() {
//        return accountNumber;
//    }

    public TransactionOperation getTransactionOperation() {
        return transactionOperation;
    }

    public int getAmount() {
        return amount;
    }
}
