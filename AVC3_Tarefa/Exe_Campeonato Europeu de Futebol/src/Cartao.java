import java.util.Date;

/**
 * Classe que representa um Cartão (amarelo ou vermelho) durante um jogo.
 */
public class Cartao {
    private Jogador jogador;
    private TipoCartao tipo;
    private Date momento;

    public Cartao(Jogador jogador, TipoCartao tipo, Date momento) {
        this.jogador = jogador;
        this.tipo = tipo;
        this.momento = momento;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public TipoCartao getTipo() {
        return tipo;
    }

    public void setTipo(TipoCartao tipo) {
        this.tipo = tipo;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }
}

