package Testando;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Test.Conta;
import Test.ContaCorrente;
import Test.ContaSalario;

public class ContaSalarioTest {

	@Test
    public void testehDepositavel() {
		ContaSalario a = new ContaSalario(null, 0);
        boolean b;
        
        Conta c = new ContaCorrente(null, 1000);
        Conta d = new ContaCorrente(null, 1000);
        
        a.setEmpregador(c);

        b = a.ehDepositavel(c,1);
        assertTrue(b);
        
        b = a.ehDepositavel(c,-1);
        assertFalse(b);
        
        b = a.ehDepositavel(c,0);
        assertFalse(b);
        
        b = a.ehDepositavel(d,1);
        assertFalse(b);
        
        b = a.ehDepositavel(d,0);
        assertFalse(b);
        
        b = a.ehDepositavel(d,-1);
        assertFalse(b);
        

    }
	
	@Test
    public void testehSacavel() {
		ContaSalario a = new ContaSalario(null, 1000);
        boolean b;

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
		ContaSalario a = new ContaSalario(null, 0);
        boolean b;
        ContaCorrente c = new ContaCorrente(null, 1000);
        a.setEmpregador(c);
        
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