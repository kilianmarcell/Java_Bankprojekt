package hu.petrik.bankproject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void ujSzamlaEgyenlegNulla() {
        Bank bank = new Bank();
        bank.ujSzamla("Teszt Elek", "1234");
        long egyenleg = bank.egyenleg("1234");
        assertEquals(0,egyenleg);
    }
}