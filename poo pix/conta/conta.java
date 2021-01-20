package conta;

public abstract class conta implements contaInterface{
    
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
