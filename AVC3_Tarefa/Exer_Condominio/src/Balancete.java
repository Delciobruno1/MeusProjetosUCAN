import java.util.ArrayList;

/**
 * Classe que representa um balancete.
 */
public class Balancete {
    private int mes;
    private int ano;
    private ArrayList<Parcela> parcelas;

    // Métodos construtores, getters e setters

    public Balancete(int mes, int ano) {
        this.mes = mes;
        this.ano = ano;
        this.parcelas = new ArrayList<>();
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ArrayList<Parcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(ArrayList<Parcela> parcelas) {
        this.parcelas = parcelas;
    }
}
