/**
 * Classe abstrata que representa um Imóvel na imobiliária.
 */
public abstract class Imovel {
    private int id;
    private int anoConstrucao;
    private double area;
    private String localizacao;
    private double preco;

    // Construtor
    public Imovel(int id, int anoConstrucao, double area, String localizacao, double preco) {
        this.setId(id);
        this.setAnoConstrucao(anoConstrucao);
        this.setArea(area);
        this.setLocalizacao(localizacao);
        this.setPreco(preco);
    }

    /**
     * Método abstrato para exibir detalhes do imóvel.
     */
    public abstract void exibirDetalhes();

    // Métodos getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnoConstrucao() {
        return anoConstrucao;
    }

    public void setAnoConstrucao(int anoConstrucao) {
        this.anoConstrucao = anoConstrucao;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
