import java.util.ArrayList;

/**
 * Classe que representa uma Cidade.
 */
public class Cidade {
    private String nome;
    private String pais;
    private ArrayList<Estadio> estadios;

    public Cidade(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
        this.estadios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Estadio> getEstadios() {
        return estadios;
    }

    public void setEstadios(ArrayList<Estadio> estadios) {
        this.estadios = estadios;
    }

    public void adicionarEstadio(Estadio estadio) {
        this.estadios.add(estadio);
    }
}

