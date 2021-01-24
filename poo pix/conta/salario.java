package Projeto;

public class salario extends conta {
    protected int funcionario;
    protected int patrao;
    public int getPatrao() {
        return patrao;
    }

    protected void setPatrao(int patrao) {
        this.patrao = patrao;
    }
    public int getFuncionario() {
        return funcionario;
    }

    protected void setFuncionario(int funcionario) {
        this.funcionario = funcionario;
    }
    public boolean Indentificacao(int funcionario, int patrao){
        if(funcionario/10==patrao)
        {return true;}
        else{return false;}
    }
    
    @Override
    public void depositar(double valor) {
        if(Indentificacao(funcionario, patrao))
            {saldo+=valor;}
    }

    @Override
    public void sacar(double valor) {
        if(saldo>=valor)
            saldo-=valor;
    }
}
