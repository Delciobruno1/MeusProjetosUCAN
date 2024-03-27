import java.util.Date;

/**
 * Classe que representa uma Substituição durante um jogo.
 */
public class Substituicao {
    private Jogador jogadorSai;
    private Jogador jogadorEntra;
    private Date momento;

    public Substituicao(Jogador jogadorSai, Jogador jogadorEntra, Date momento) {
        this.jogadorSai = jogadorSai;
        this.jogadorEntra = jogadorEntra;
        this.momento = momento;
    }

    public Jogador getJogadorSai() {
        return jogadorSai;
    }

    public void setJogadorSai(Jogador jogadorSai) {
        this.jogadorSai = jogadorSai;
    }

    public Jogador getJogadorEntra() {
        return jogadorEntra;
    }

    public void setJogadorEntra(Jogador jogadorEntra) {
        this.jogadorEntra = jogadorEntra;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }
}