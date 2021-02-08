package back.save;

import java.io.*;

import back.banco.Banco;
import back.cadastro.Cadastro;
import back.estruturas_de_dados.Tripla;
import back.pix.BancoCentral;

public class Save {

    private String path;

    public Save(String path) {
        this.path = path;
    }

    public void salvar(Tripla<Cadastro, BancoCentral, Banco> save) {
        File arq = new File(path);

        try {
            arq.delete();
            arq.createNewFile();

            ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
            objOutput.writeObject(save);
            objOutput.close();

        }

        catch (IOException erro) {

        }
    }

    public Tripla<Cadastro, BancoCentral, Banco> ler() {
        Tripla<Cadastro, BancoCentral, Banco> save = new Tripla<Cadastro, BancoCentral, Banco>(null,null,null);
        try {
            File arq = new File(path);
            ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
            save = (Tripla<Cadastro, BancoCentral, Banco>) objInput.readObject();
            objInput.close();
        }

        catch (IOException erro1) {

        }

        catch (ClassNotFoundException erro2) {

        }

        return save;
    }
}