package Projeto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Test.Poupanca;

public class PoupancaTest {

    @Test
    public void testLimite() {
        Poupanca a = new Poupanca();
        boolean b;
        
        b = a.Limite(12);
        assertTrue(b);

        b = a.Limite(13);
        assertTrue(b);

        b = a.Limite(11);
        assertFalse(b);

    }
}
