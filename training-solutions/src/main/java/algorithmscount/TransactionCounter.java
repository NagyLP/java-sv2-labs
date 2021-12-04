package algorithmscount;

import java.util.List;

import static algorithmscount.TransactionType.CREDIT;

public class TransactionCounter {

    public int countCreditLessThan(List<Transaction> transactions, int minValue) {
        int ccltSum = 0;
        for (Transaction item : transactions) {
            if (item.getTransactionType() == CREDIT && item.getAmount() < minValue)
                ccltSum += item.getAmount();
        }
        return ccltSum;
    }
}
