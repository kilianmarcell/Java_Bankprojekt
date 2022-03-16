package hu.petrik.bankproject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank bank = new Bank();

    @BeforeEach
    void setUp() {
    }

    @Test
    void ujSzamlaEgyenlegNulla() {
        bank.ujSzamla("Teszt Elek", "1234");
        long egyenleg = bank.egyenleg("1234");
        assertEquals(0, egyenleg);
    }

    @Test
    void ujSzamlaEgyenlegFeltoltesMegfeleloEgyenleg() {
        bank.ujSzamla("Teszt Elek", "1234");
        bank.egyenlegFeltolt("1234", 1000);
        assertEquals(1000, bank.egyenleg("1234"));
    }

    @Test
    void tobbSzamlaEgyenlegFeltoltesMegfeleloEgyenleg() {
        bank.ujSzamla("Teszt Elek", "1234");
        bank.ujSzamla("Gipsz Jakab", "1111");
        bank.egyenlegFeltolt("1234", 1000);
        bank.egyenlegFeltolt("1111", 2100);
        bank.egyenlegFeltolt("1234", 3000);
        assertEquals(4000, bank.egyenleg("1234"));
        assertEquals(2100, bank.egyenleg("1111"));
    }

    @Test
    void ujSzamlaMeglevoSzamlaszammal() {
        bank.ujSzamla("Teszt Elek", "1234");

        assertThrows(IllegalArgumentException.class,
                () -> bank.ujSzamla("Gipsz Jakab", "1234"));
    }
}