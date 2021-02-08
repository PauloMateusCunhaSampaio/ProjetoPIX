package back.pix;

import back.conta.Conta;

public interface PixInterface {
    public void vincularChaveEmail(Conta conta);
    
    public void vincularChaveTelefone(Conta conta);

    public void vincularChaveCodigo(Conta conta);
}
