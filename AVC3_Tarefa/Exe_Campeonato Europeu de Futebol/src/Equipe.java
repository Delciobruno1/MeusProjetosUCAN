/**
 * Classe abstrata que representa uma Equipe.
 */
public abstract class Equipe {
    private String nome;
    private int pontos;

    public Equipe(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}

