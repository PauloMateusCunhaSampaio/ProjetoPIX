package back.estruturas_de_dados;

import java.io.Serializable;
import java.util.Calendar;

public class Data implements Serializable {

    private static final long serialVersionUID = 1L;
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        Calendar calendar = Calendar.getInstance();
        setDia(calendar.get(Calendar.DATE));
        setMes(calendar.get(Calendar.MONTH) + 1);
        setAno(calendar.get(Calendar.YEAR));
    }

    public int getAno() {
        return ano;
    }

    private void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    private void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    private void setMes(int mes) {
        this.mes = mes;
    }

}
