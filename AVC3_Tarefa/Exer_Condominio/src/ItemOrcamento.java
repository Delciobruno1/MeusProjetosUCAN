/**
 * Classe que representa um item do orçamento.
 */
public class ItemOrcamento {
    private String descricao;
    private double valor;

    // Métodos construtores, getters e setters

    public ItemOrcamento(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
