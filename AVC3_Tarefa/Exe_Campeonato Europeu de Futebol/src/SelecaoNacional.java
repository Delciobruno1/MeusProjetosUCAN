import java.util.ArrayList;

/**
 * Classe que representa uma Seleção Nacional.
 */
public class SelecaoNacional extends Equipe {
    private Pais pais;
    private ArrayList<Jogador> jogadores;

    public SelecaoNacional(String nome, Pais pais) {
        super(nome);
        this.pais = pais;
        this.jogadores = new ArrayList<>();
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void adicionarJogador(Jogador jogador) {
        this.jogadores.add(jogador);
    }
}
