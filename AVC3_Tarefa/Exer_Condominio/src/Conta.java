/**
 * Classe que representa uma conta no relatório de contas.
 */
public class Conta {
    private String descricao;
    private double valor;

    // Métodos construtores, getters e setters

    public Conta(String descricao, double valor) {
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
