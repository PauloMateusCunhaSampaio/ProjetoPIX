package back.banco;

import java.io.Serializable;
import java.util.ArrayList;

import back.conta.*;

public class Agencia implements Serializable {

    private static final long serialVersionUID = 1L;
    private static int geraId = 1;
    private int ID;
    private Banco banco;
    private ArrayList<ContaCorrente> contasCorrente;
    private ArrayList<ContaPoupanca> contasPoupancas;
    private ArrayList<ContaSalario> contasSalario;

    public Agencia() {
        this.setID(getGeraId());
        Agencia.addGeraId();
        contasCorrente = new ArrayList<ContaCorrente>();
        contasPoupancas = new ArrayList<ContaPoupanca>();
        contasSalario = new ArrayList<ContaSalario>();
    }

    public ArrayList<ContaCorrente> getContasCorrente() {
        return contasCorrente;
    }

    public ArrayList<ContaPoupanca> getContasPoupancas() {
        return contasPoupancas;
    }
    
    public ArrayList<ContaSalario> getContasSalario() {
        return contasSalario;
    }

    public void setContasCorrente(ArrayList<ContaCorrente> contasCorrente) {
        this.contasCorrente = contasCorrente;
    }

    public void setContasPoupancas(ArrayList<ContaPoupanca> contasPoupancas) {
        this.contasPoupancas = contasPoupancas;
    }

    public void setContasSalario(ArrayList<ContaSalario> contasSalario) {
        this.contasSalario = contasSalario;
    }

    public Banco getBanco() {
        return banco;
    }

    public void addConta(ContaCorrente conta) {
        contasCorrente.add(conta);
    }

    public void addConta(ContaPoupanca conta) {
        contasPoupancas.add(conta);
    }

    public void addConta(ContaSalario conta) {
        contasSalario.add(conta);
    }

    public int getID() {
        return ID;
    }

    private static int getGeraId() {
        return geraId;
    }

    private static void addGeraId() {
        Agencia.geraId++;
    }

    private void setID(int iD) {
        this.ID = iD;
    }
}