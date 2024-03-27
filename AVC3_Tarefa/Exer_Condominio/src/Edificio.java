import java.util.ArrayList;

/**
 * Classe que representa um edifício.
 */
public class Edificio {
    private String nome;
    private ArrayList<Apartamento> apartamentos;
    private Balancete balanceteAnual;
    private RelatorioContas relatorioContasAnual;
    private Orcamento orcamentoAnual;
    private ArrayList<Condomino> condominos;

    // Métodos getters e setters para os outros atributos
    /**
     * Construtor para a classe Edificio.
     * @param nome O nome do edifício.
     */
    public Edificio(String nome) {
        this.nome = nome;
        this.apartamentos = new ArrayList<>();
        this.condominos = new ArrayList<>();
    }

    /**
     * Obtém o nome do edifício.
     * @return O nome do edifício.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do edifício.
     * @param nome O nome do edifício.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a lista de apartamentos do edifício.
     * @return A lista de apartamentos do edifício.
     */
    public ArrayList<Apartamento> getApartamentos() {
        return apartamentos;
    }

    /**
     * Adiciona um apartamento à lista de apartamentos do edifício.
     * @param apartamento O apartamento a ser adicionado.
     */
    public void adicionarApartamento(Apartamento apartamento) {
        this.apartamentos.add(apartamento);
    }

    /**
     * Remove um apartamento da lista de apartamentos do edifício.
     * @param apartamento O apartamento a ser removido.
     */
    public void removerApartamento(Apartamento apartamento) {
        this.apartamentos.remove(apartamento);
    }

    public ArrayList<Condomino> getCondominos() {
        return condominos;
    }

    public void setCondominos(ArrayList<Condomino> condominos) {
        this.condominos = condominos;
    }

    public void adicionarCondomino(Condomino condômino) {
    }
}
