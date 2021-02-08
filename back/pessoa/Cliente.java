package back.pessoa;

import java.util.Random;

public class Cliente extends Pessoa {

    private static final long serialVersionUID = 1L;
    private static Long geraId = 1000L;
    private Long ID;
    private String telefone;
    private String email;
    private String senha;

    public Cliente(String nome, String email, String telefone, String senha) {
        super(nome);
        this.telefone = telefone;
        this.senha = senha;
        Random random = new Random();
        Long numero = (long) random.nextInt(100);
        this.setID(numero + Cliente.getGeraId());
    }

    public Long getID() {
        return ID;
    }

    protected void setID(Long iD) {
        this.ID = iD;
    }

    protected static Long getGeraId() {
        return geraId;
    }

    public static void setGeraId(Long geraId) {
        Cliente.geraId = geraId;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
