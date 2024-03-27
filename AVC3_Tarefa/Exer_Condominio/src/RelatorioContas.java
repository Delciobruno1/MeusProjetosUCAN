import java.util.ArrayList;

/**
 * Classe que representa um relatório de contas.
 */
public class RelatorioContas {
    private int ano;
    private ArrayList<Conta> contas;

    // Métodos construtores, getters e setters

    public RelatorioContas(int ano) {
        this.ano = ano;
        this.contas = new ArrayList<>();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }
}
