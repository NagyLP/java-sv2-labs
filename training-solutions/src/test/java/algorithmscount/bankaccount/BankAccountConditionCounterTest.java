package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BankAccountConditionCounterTest {

    @Test
    void testCounterOfBalanceGreaterThan() {
        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(new BankAccount("Gazdag Géza", "12345", 1_000));
        bankAccounts.add(new BankAccount("Keksz Elek", "12345", 100));
        bankAccounts.add(new BankAccount("Cifra Cili", "12345", -1));
        bankAccounts.add(new BankAccount("Kerek Klára", bankAccounts.get(0).getAccountNumber(), bankAccounts.get(0).getBalance()));

        assertEquals(2, new BankAccountConditionCounter().counterOfBalanceGreaterThan(bankAccounts, 100));
        assertNotEquals(1, new BankAccountConditionCounter().counterOfBalanceGreaterThan(bankAccounts, 100));
    }
}