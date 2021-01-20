package Projeto;

public class Poupanca extends conta {
    @Override
    public void depositar(double valor) {
        saldo+=valor;
    }

    @Override
    public void sacar(double valor) {
        int meses=0;//tem q colocar a quantidade de meses q o dinheiro ficou na conta
        if(saldo>valor || meses<12)
        {System.out.println("Saldo insuficiente ou tempo limite não atingido");}
        else{
            saldo-=valor;
        }
    }
}
