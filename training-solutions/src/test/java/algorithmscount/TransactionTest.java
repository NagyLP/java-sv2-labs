package algorithmscount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TransactionTest {

    Transaction transaction = new Transaction(12345, TransactionType.CREDIT, 1_000);

    @Test
    void createTrans() {

        assertEquals(12345, transaction.getAccountNumber());
        assertEquals(1000, transaction.getAmount());
        assertTrue(transaction.isCredit());
        assertFalse(transaction.isDebit());
    }
}