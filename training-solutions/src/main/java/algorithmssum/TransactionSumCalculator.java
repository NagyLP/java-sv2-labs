package algorithmssum;

import java.util.List;

import static algorithmssum.TransactionOperation.CREDIT;

public class TransactionSumCalculator {

    public int sumAmountOfCreditEntries(List<Transaction> transactions) {
        int akkSum = 0;
        for (Transaction item : transactions) {
            if (item.getTransactionOperation() == CREDIT)
                akkSum += item.getAmount();
        }
        return akkSum;
    }
}
