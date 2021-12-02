package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BankAccountConditionCounterTest {

    @Test
    void testCounterOfBalanceGreaterThan() {
        List<BankAccount> bankAccounts = new ArrayList<>(Arrays.asList(
                new BankAccount("Gazdag Géza", "12345", 1_000),
                new BankAccount("Keksz Elek", "12345", 100),
                new BankAccount("Cifra Cili", "12345", -1),
                new BankAccount("Kerek Klára", bankAccounts.get(0).getAccountNumber(), )));
    }
}