import java.util.Date;
/**
 * Classe que representa um pagamento.
 */

public class Pagamento {
    private double valor;
    private Date data;

    // Métodos construtores, getters e setters

    public Pagamento(double valor, Date data) {
        this.valor = valor;
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
