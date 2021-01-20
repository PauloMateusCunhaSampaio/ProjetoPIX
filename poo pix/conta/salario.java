package Projeto;

public class salario extends conta {
    @Override
    public void depositar(double valor) {
        saldo+=valor;
    }
    //temos que faazer de um modo q no main somente o patrao o cara acesse esse modo tipo so com um
    //codigo especifico acesse

    @Override
    public void sacar(double valor) {
        if(saldo>valor)
        {System.out.println("Saldo insuficiente");}
        else{
            saldo-=valor;
        }
    }
}
