package algorithmssum;

import java.util.List;

import static algorithmssum.TransactionOperation.CREDIT;

public class TransactionSumCalculator {

    public int sumAmountOfCreditEntries(List<Transaction> transactions) {
        int sumCreditAmount = 0;
        for (Transaction item : transactions) {
            if (item.getTransactionOperation() == CREDIT)
                sumCreditAmount += item.getAmount();
        }
        return sumCreditAmount;
    }
}
