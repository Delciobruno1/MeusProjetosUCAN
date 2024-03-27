import java.util.Date;
import java.util.ArrayList;

/**
 * Classe que representa um País...
 */
public class Pais {
    private String nome;
    private String codigo;

    public Pais(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}

