import java.util.Date;

/**
 * Classe abstrata que representa um Título de participação.
 */
public abstract class Titulo {
    private String designacao;
    private Date dataEmissao;
    private double valorFacial;

    // Construtor
    public Titulo(String designacao, Date dataEmissao, double valorFacial) {
        this.designacao = designacao;
        this.dataEmissao = dataEmissao;
        this.valorFacial = valorFacial;
    }

    // Getters e Setters
    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public double getValorFacial() {
        return valorFacial;
    }

    public void setValorFacial(double valorFacial) {
        this.valorFacial = valorFacial;
    }
}
