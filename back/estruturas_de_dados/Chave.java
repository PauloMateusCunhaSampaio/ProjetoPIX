package back.estruturas_de_dados;

import java.io.Serializable;

public class Chave<classe> implements Serializable {
    private static final long serialVersionUID = 1L;
    private String chave;
    private classe objeto;

    Chave(String chave, classe objeto){
        this.chave = chave;
        this.objeto = objeto;
    }

    public Chave(String chave){
        this.chave = chave;
    }

    public String getChave() {
        return chave;
    }

    public void setObjeto(classe objeto) {
        this.objeto = objeto;
    }

    public classe getObjeto(){
        return objeto;
    }
}
