package Projeto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Test.Salario;

public class SalarioTest {

    @Test
    public void testIndentificacao() {
        Salario a = new Salario();
        boolean b;

        b = a.Indentificacao(900, 90);
        assertTrue(b);
        
        b = a.Indentificacao(900, 91);
        assertFalse(b);
        
        b = a.Indentificacao(1900, 90);
        assertFalse(b);

    }
}
