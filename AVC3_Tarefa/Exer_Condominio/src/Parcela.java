import java.util.Calendar;

public class Parcela {
    private double valor;
    private String descricao;

    // Métodos construtores, getters e setters

    public Parcela(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Calendar getData() {
        return null;
    }
}
