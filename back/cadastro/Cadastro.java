package back.cadastro;

import java.io.Serializable;
import java.util.ArrayList;

import back.banco.Banco;
import back.conta.*;
import back.pessoa.Cliente;
import back.pix.BancoCentral;
import back.pix.Pix;

public class Cadastro implements Serializable, CadastroInterface {

    private static final long serialVersionUID = 1L;
    private static ArrayList<Cadastro> cadastros = new ArrayList<Cadastro>();
    private Cliente cliente;
    private Pix pix;
    private ArrayList<ContaCorrente> minhaContasCorrentes;
    private ArrayList<ContaPoupanca> minhaContasPoupancas;
    private ArrayList<ContaSalario> minhaContasSalarios;

    public Cadastro(Cliente cliente) {
        setMinhaContasPoupancas(new ArrayList<ContaPoupanca>());
        setMinhaContasCorrentes(new ArrayList<ContaCorrente>());
        setMinhaContasSalarios(new ArrayList<ContaSalario>());
        this.cliente = cliente;
        cadastros.add(this);
    }

    public ArrayList<ContaSalario> getMinhaContasSalarios() {
        return minhaContasSalarios;
    }

    public void setMinhaContasSalarios(ArrayList<ContaSalario> minhaContasSalarios) {
        this.minhaContasSalarios = minhaContasSalarios;
    }

    public ArrayList<ContaPoupanca> getMinhaContasPoupancas() {
        return minhaContasPoupancas;
    }

    public void setMinhaContasPoupancas(ArrayList<ContaPoupanca> minhaContasPoupancas) {
        this.minhaContasPoupancas = minhaContasPoupancas;
    }

    public ArrayList<ContaCorrente> getMinhaContasCorrentes() {
        return minhaContasCorrentes;
    }

    public void setMinhaContasCorrentes(ArrayList<ContaCorrente> minhaContasCorrentes) {
        this.minhaContasCorrentes = minhaContasCorrentes;
    }

    public static boolean existeEmail(String email) {
        for (Cadastro cadastro : cadastros) {
            if (cadastro.getCliente().getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public static boolean existeTelefone(String email) {
        for (Cadastro cadastro : cadastros) {
            if (cadastro.getCliente().getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Cadastro> getCadastros() {
        return cadastros;
    }

    public static void setCadastros(ArrayList<Cadastro> cadastros) {
        Cadastro.cadastros = cadastros;
    }


    public Pix getPix() {
        return pix;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void cadastrarConta(Cliente cliente, ContaCorrente conta, Banco banco) {
        banco.getAgencia().addConta(conta);
        this.getMinhaContasCorrentes().add(conta);
    }

    public void cadastrarConta(Cliente cliente, ContaPoupanca conta, Banco banco) {
        banco.getAgencia().addConta(conta);
        this.getMinhaContasPoupancas().add(conta);
    }

    public void cadastrarConta(Cliente cliente, ContaSalario conta, Banco banco) {
        banco.getAgencia().addConta(conta);
        this.getMinhaContasSalarios().add(conta);
    }

    public static void cadastrarPix(Cliente cliente) {
        BancoCentral.newPix(cliente);
    }

    public String[] getMeusSaldos(){
        String[] aux = new String[this.getMinhaContasSalarios().size() + getMinhaContasPoupancas().size() + getMinhaContasPoupancas().size()- 2];
        int i = 0;
        for (; i < this.getMinhaContasSalarios().size(); i++) {
            aux[i] = String.format("Conta Salario: R$ %.2f", this.getMinhaContasSalarios().get(i).getSaldo());
        }

        for (int j = 0; j < getMinhaContasPoupancas().size(); i++, j++) {
            aux[i] = String.format("Conta Poupaça: R$ %.2f", this.getMinhaContasPoupancas().get(j).getSaldo());
        }

        for (int j = 0; i < getMinhaContasCorrentes().size(); i++, j++) {
            aux[i] = String.format("Conta Corrente: R$ %.2f", this.getMinhaContasCorrentes().get(j).getSaldo());
        }
        return aux;
    }
    
    public double getMeusSaldo(){
        double aux = 0;
        int i = 0;
        for (; i < this.getMinhaContasSalarios().size(); i++) {
            aux+= this.getMinhaContasSalarios().get(i).getSaldo();
        }

        for (int j = 0; j < getMinhaContasPoupancas().size(); i++, j++) {
            aux+=this.getMinhaContasPoupancas().get(j).getSaldo();
        }

        for (int j = 0; i < getMinhaContasCorrentes().size(); i++, j++) {
            aux+=this.getMinhaContasCorrentes().get(j).getSaldo();
        }
        return aux;
    }

    public static Cadastro login(String email, String senha) {
        for (Cadastro cadastro : cadastros) {
            if (cadastro.getCliente().getEmail().equals(email) && cadastro.getCliente().getSenha().equals(senha)) {
                return cadastro;
            }
        }
        return null;
    }
}