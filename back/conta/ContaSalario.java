package back.conta;

import back.pessoa.Cliente;

public class ContaSalario extends Conta {

    private static final long serialVersionUID = 1L;
    private Conta empregador;

    public ContaSalario(Cliente dono, Conta empregado, double valorInicial) {
        super(dono, valorInicial);
    }

    public Conta getEmpregador() {
        return empregador;
    }

    public void setEmpregador(Conta empregador) {
        this.empregador = empregador;
    }

    protected boolean ehDepositavel(Conta conta, double valor) {
        if (valor > 0 && conta.equals(getEmpregador())){
            return true;
        }
        return false;

    }

    protected boolean ehSacavel(double valor) {
        if (this.getSaldo() >= valor && valor > 0) {
            return true;
        }
        return false;
    }

    public boolean transferir(Conta emissor, double valor) {
        if (emissor instanceof ContaSalario) {
            return false;
        }
        else if (this.ehDepositavel(emissor, valor) && emissor.ehSacavel(valor)) {
            emissor.sacar(this, valor);
            this.depositar(emissor, valor);
            return true;
        }
        return false;
    }
    
}
