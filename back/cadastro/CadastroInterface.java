package back.cadastro;

import back.banco.Banco;
import back.conta.*;
import back.pessoa.Cliente;

public interface CadastroInterface {
    public abstract void cadastrarConta(Cliente cliente, ContaCorrente conta, Banco banco);

    public void cadastrarConta(Cliente cliente, ContaPoupanca conta, Banco banco);

    public void cadastrarConta(Cliente cliente, ContaSalario conta, Banco banco);

}
