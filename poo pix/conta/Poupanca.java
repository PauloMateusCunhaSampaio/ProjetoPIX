package Projeto;

public class Poupanca extends conta {
    @Override
    public void depositar(double valor) {
        saldo+=valor;
    }
    
    protected int tempo;
    public int getTempo() {
        return tempo;
    }
    protected void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    public boolean Limite(int tempo){
        if(tempo>12)
        {return true;}
        else{return false;}
    }
    
    @Override
    public void sacar(double valor) {
        int meses=0;
        if(Limite(meses))
        {saldo-=valor;}
    }
}
