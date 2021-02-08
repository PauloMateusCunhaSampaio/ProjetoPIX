package back.conta;

import java.io.Serializable;

import back.pessoa.Cliente;

public abstract class Conta implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private double saldo;
    private Cliente dono;
    private Extrato extrato;

    public Conta(Cliente dono, double valorInicial){
        this.dono = dono;
        this.saldo = valorInicial;
        this.extrato = new Extrato();
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(Conta conta, Double valor) {
        if (ehDepositavel(valor)){
            saldo += valor;
            extrato.addExtrato(conta, valor);
        }
    }

    public void sacar(Conta conta, double valor) {
        if (ehSacavel(valor)){
            saldo -= valor;
            extrato.addExtrato(conta, -valor);
        }
    }

    public Cliente getDono() {
        return dono;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected boolean ehDepositavel(double valor){return false;};

    protected boolean ehSacavel(double valor){return false;};

    public boolean transferir(Conta emissor, double valor){return false;};
}
