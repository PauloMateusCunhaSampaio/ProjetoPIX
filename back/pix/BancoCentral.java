package back.pix;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

import back.conta.Conta;
import back.pessoa.Cliente;

public class BancoCentral implements Serializable {
    private static final long serialVersionUID = 1L;
    private static ArrayList<Pix> arrayPix = new ArrayList<Pix>();

    public static void newPix(Cliente cliente) {
        arrayPix.add(new Pix(cliente));
    }

    public static String geraCodigo() {
        Calendar calendar = Calendar.getInstance();
        Random random = new Random();
        int ano = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH) + 1;
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        return String.format("%s%s%02d%02d%02d", Long.toHexString(System.nanoTime()), Integer.toHexString(ano) , mes, dia, random.nextInt(99));
    }

    public static Conta getContaPixEmail(String email) {
        for (Pix pix : arrayPix) {
            return pix.getChaveEmail().getObjeto();
        }
        return null;
    }

    public static Conta getContaPixTelefone(String telefone) {
        for (Pix pix : arrayPix) {
            return pix.getChaveTelefone().getObjeto();
        }
        return null;
    }

    public static Conta getContaPixCodigo(String codigo) {
        for (Pix pix : arrayPix) {
            return pix.getChaveCodigo().getObjeto();
        }
        return null;
    }
}
