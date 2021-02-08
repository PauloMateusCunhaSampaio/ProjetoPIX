package back.banco;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Banco implements Serializable {

    private static final long serialVersionUID = 1L;
    private static ArrayList<Banco> bancos = new ArrayList<Banco>();
    private static int geraId = 1;
    private String nome;
    private int ID;
    private ArrayList<Agencia> agencias;

    public double getSaldo() {
        double aux = 0;
        for (Agencia agencia : agencias) {
            for (int i = 0; i < agencia.getContasCorrente().size(); i++) {
                aux += agencia.getContasCorrente().get(i).getSaldo();
            }

            for (int i = 0; i < agencia.getContasPoupancas().size(); i++) {
                aux += agencia.getContasPoupancas().get(i).getSaldo();
            }

            for (int i = 0; i < agencia.getContasSalario().size(); i++) {
                aux += agencia.getContasSalario().get(i).getSaldo();
            }
        }
        return aux;
    }

    public static ArrayList<Banco> getBancos() {
        return bancos;
    }

    public static void addBancos(String nome) {
        bancos.add(new Banco(nome));
    }

    public Agencia getAgencia() {
        Random random = new Random();
        int agencia = random.nextInt(agencias.size() - 1);
        return agencias.get(agencia);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private Banco(String nome){
        setID(getGeraId());
        Banco.addGeraId();
        agencias.add(new Agencia());
        setNome(nome);
    }

    public int getID() {
        return ID;
    }

    protected static int getGeraId() {
        return geraId;
    }

    protected static void addGeraId() {
        Banco.geraId++;
    }

    protected void setID(int iD) {
        this.ID = iD;
    }
}
