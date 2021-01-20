package Projeto;

public class Corrente extends conta {
    @Override
    public void depositar(double valor) {
        saldo+=valor;
    }

    @Override
    public void sacar(double valor) {
        if(saldo>valor)
        {System.out.println("Saldo insuficiente");}
        else{
            saldo-=valor;
        }
    }
}
