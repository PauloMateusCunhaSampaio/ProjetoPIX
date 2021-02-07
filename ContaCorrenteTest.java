package Testando;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Test.Conta;
import Test.ContaCorrente;

public class ContaCorrenteTest {

    @Test
    public void testehDepositavel() {
    	ContaCorrente a = new ContaCorrente(null, 0);
        boolean b;

        b = a.ehDepositavel(1);
        assertTrue(b);
        
        b = a.ehDepositavel(-1);
        assertFalse(b);
        
        b = a.ehDepositavel(0);
        assertFalse(b);

    }
    
    @Test
    public void testehSacavel() {
    	ContaCorrente a = new ContaCorrente(null, 1000);
        boolean b;
        
        b = a.ehSacavel(1);
        assertTrue(b);
        
        b = a.ehSacavel(1000);
        assertTrue(b);
        
        b = a.ehSacavel(-1);
        assertFalse(b);
        
        b = a.ehSacavel(0);
        assertFalse(b);
        
        b = a.ehSacavel(1001);
        assertFalse(b);

    }
    
    @Test
    public void testtransferir() {
    	ContaCorrente a = new ContaCorrente(null, 1000);
        boolean b;
        
		Conta c = new ContaCorrente(null, 1000);
		
		
		b = a.transferir(c, 1);
        assertTrue(b);
        
        b = a.transferir(c, -1);
        assertFalse(b);
        
        b = a.transferir(c, 0);
        assertFalse(b);
        
        b = a.transferir(c, 1001);
        assertFalse(b);

    }
}