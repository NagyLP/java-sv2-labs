package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {

    public int counterOfBalanceGreaterThan(List<BankAccount> balance, int minValue) {

        int count = 0;
        for (BankAccount item : balance) {
            if (item.getBalance() > minValue) {
                count++;
            }
        }
        return count;
    }
}
