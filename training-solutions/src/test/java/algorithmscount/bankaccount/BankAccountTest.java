package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {


    @Test
    void testCreateObject() {
        List<BankAccount> bankAccount = new ArrayList<>(Arrays.asList(
                new BankAccount("Dwight David Eisenhower", "D-day 12345", 999_999_999)));

        bankAccount.add(new BankAccount(bankAccount.get(0).getNameOfOwner(),
                "President 1234", bankAccount.get(0).getBalance()));

        assertEquals("Dwight David Eisenhower", bankAccount.get(0).getNameOfOwner());
        assertEquals("D-day 12345", bankAccount.get(0).getAccountNumber());
        assertEquals(999_999_999, bankAccount.get(0).getBalance());

        assertSame(bankAccount.get(0).getNameOfOwner(), bankAccount.get(1).getNameOfOwner());
        assertNotSame(bankAccount.get(0).getAccountNumber(), bankAccount.get(1).getAccountNumber());
    }
}