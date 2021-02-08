package back.pix;

import java.io.Serializable;

import back.conta.Conta;
import back.estruturas_de_dados.Chave;
import back.pessoa.Cliente;

public class Pix implements Serializable {
    private static final long serialVersionUID = 1L;
    protected Cliente cliente;
    protected Chave<Conta> chaveEmail;
    protected Chave<Conta> chaveTelefone;
    protected Chave<Conta> chaveCodigo;

    public Pix(Cliente cliente) {
        this.setChaveEmail(new Chave<Conta>(cliente.getEmail()));
        this.setChaveTelefone(new Chave<Conta>(cliente.getTelefone()));
        this.setChaveCodigo(new Chave<Conta>(BancoCentral.geraCodigo()));
    }

    public void vincularChaveEmail(Conta conta) {
        chaveEmail.setObjeto(conta);
    }

    public void vincularChaveTelefone(Conta conta) {
        chaveTelefone.setObjeto(conta);
    }

    public void vincularChaveCodigo(Conta conta) {
        chaveCodigo.setObjeto(conta);
    }

    protected void setChaveCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    protected void setChaveEmail(Chave<Conta> chaveEmail) {
        this.chaveEmail = chaveEmail;
    }

    protected void setChaveTelefone(Chave<Conta> chaveTelefone) {
        this.chaveTelefone = chaveTelefone;
    }

    protected void setChaveCodigo(Chave<Conta> chaveCodigo) {
        this.chaveCodigo = chaveCodigo;
    }

    public Chave<Conta> getChaveCodigo() {
        return chaveCodigo;
    }

    public Chave<Conta> getChaveEmail() {
        return chaveEmail;
    }

    public Chave<Conta> getChaveTelefone() {
        return chaveTelefone;
    }
}