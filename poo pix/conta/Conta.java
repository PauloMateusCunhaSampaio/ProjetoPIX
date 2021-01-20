package conta;

public abstract class Conta implements ContaInterface{
    
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
