import java.util.Date;

/**
 * Classe que representa um Gol marcado durante um jogo.
 */
public class Gol {
    private Jogador jogador;
    private Date momento;

    public Gol(Jogador jogador, Date momento) {
        this.jogador = jogador;
        this.momento = momento;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }
}