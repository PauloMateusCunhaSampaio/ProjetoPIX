package back.conta;

import back.pessoa.Cliente;

public class ContaCorrente extends Conta {

    private static final long serialVersionUID = 1L;

    public ContaCorrente(Cliente dono, double valorInicial) {
        super(dono, valorInicial);
    }

    public boolean ehDepositavel(double valor) {
        if (valor > 0){
            return true;
        }
        return false;
    }

    public boolean ehSacavel(double valor) {
        if(this.getSaldo() >= valor && valor > 0) {
            return true;
        }
        return false;
    }

    public boolean transferir(Conta conta, double valor) {
        if (this.ehDepositavel(valor) && conta.ehSacavel(valor)){
            this.depositar(conta, valor);
            conta.sacar(this, valor);
            return true;
        }
        return false;
    }
}
