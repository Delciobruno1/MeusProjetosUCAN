/**
 * Classe que representa um Apartamento na imobiliária.
 */
public class Apartamento extends Imovel {
    private String tipologia;

    // Construtor
    public Apartamento(int id, int anoConstrucao, double area, String localizacao, double preco, String tipologia) {
        super(id, anoConstrucao, area, localizacao, preco);
        this.tipologia = tipologia;
    }

    // Getter e Setter específicos para tipologia
    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== Detalhes do Apartamento ===");
        System.out.println("ID: " + getId());
        System.out.println("Ano de Construção: " + getAnoConstrucao());
        System.out.println("Área: " + getArea() + " m²");
        System.out.println("Localização: " + getLocalizacao());
        System.out.println("Preço: " + getPreco());
        System.out.println("Tipologia: " + tipologia);
    }
}

