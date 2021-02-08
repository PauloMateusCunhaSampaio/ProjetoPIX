package back.conta;

import java.io.Serializable;
import java.util.ArrayList;

import back.estruturas_de_dados.Data;
import back.estruturas_de_dados.Tripla;

public class Extrato implements Serializable {

    private static final long serialVersionUID = 1L;
    private ArrayList<Tripla<Conta,Data,Double>> extrato;

    public Extrato() {
        extrato = new ArrayList<Tripla<Conta,Data,Double>>();
    }

    private ArrayList<Tripla<Conta,Data,Double>> getExtrato() {
        return extrato;
    }

    public void addExtrato(Conta conta, double valor) {
        getExtrato().add(new Tripla<Conta,Data,Double>(conta, new Data(), valor));
    }

    public String toString(){
        String aux = "";
        for (Tripla<Conta,Data,Double> tripla : extrato) {
            aux += String.format("%s %d/%d/%d %d\n", tripla.getObjA().getDono().getNome(),
                                                tripla.getObjB().getDia(),
                                                tripla.getObjB().getMes(),
                                                tripla.getObjB().getAno(),
                                                tripla.getObjC());
        }
        return aux;
    }
}
