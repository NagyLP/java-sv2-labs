package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountTest {

    BankAccount bankAccount = new BankAccount("Dwight David Eisenhower", "D-day 12345", 999_999_999);

    @Test
    void testCreateObject() {
        assertEquals("Dwight David Eisenhower", bankAccount.getNameOfOwner());
        assertEquals("D-day 12345", bankAccount.getAccountNumber());
        assertEquals(999_999_999, bankAccount.getBalance());

    }
}