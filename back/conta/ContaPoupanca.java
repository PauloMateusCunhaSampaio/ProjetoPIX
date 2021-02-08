package back.conta;

import back.pessoa.Cliente;

public class ContaPoupanca extends Conta {

    private static final long serialVersionUID = 1L;

    public ContaPoupanca(Cliente dono, double valorInicial) {
        super(dono, valorInicial);
    }

    protected boolean ehDepositavel(double valor) {
        if (valor > 0){
            return true;
        }
        return false;
    }

    protected boolean ehSacavel(double valor) {
        if(getSaldo() >= valor && valor > 0) {
            return true;
        }
        return false;
    }

    public boolean transferir(Conta emissor, double valor) {
        if (emissor.ehSacavel(valor) && this.ehDepositavel(valor)){
            emissor.sacar(this, valor);
            this.depositar(emissor, valor);
            return true;
        }
        return false;
    }

    public void render(double taxa)/* EX: 1.01*/{
        this.depositar(null, taxa);
    }
}
