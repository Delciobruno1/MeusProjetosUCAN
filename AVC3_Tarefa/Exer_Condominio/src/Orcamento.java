import java.util.ArrayList;

/**
 * Classe que representa um orçamento.
 */
public class Orcamento {
    private int ano;
    private ArrayList<ItemOrcamento> itensOrcamento;

    // Métodos construtores, getters e setters

    public Orcamento(int ano) {
        this.ano = ano;
        this.itensOrcamento = new ArrayList<>();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ArrayList<ItemOrcamento> getItensOrcamento() {
        return itensOrcamento;
    }

    public void setItensOrcamento(ArrayList<ItemOrcamento> itensOrcamento) {
        this.itensOrcamento = itensOrcamento;
    }
}




