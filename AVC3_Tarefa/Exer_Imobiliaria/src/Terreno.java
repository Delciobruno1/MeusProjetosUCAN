/**
 * Classe que representa um Terreno na imobiliária.
 */
public class Terreno extends Imovel {
    private boolean zonaUrbana;

    // Construtor
    public Terreno(int id, int anoConstrucao, double area, String localizacao, double preco, boolean zonaUrbana) {
        super(id, anoConstrucao, area, localizacao, preco);
        this.zonaUrbana = zonaUrbana;
    }

    // Getter e Setter específicos para zonaUrbana
    public boolean isZonaUrbana() {
        return zonaUrbana;
    }

    public void setZonaUrbana(boolean zonaUrbana) {
        this.zonaUrbana = zonaUrbana;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== Detalhes do Terreno ===");
        System.out.println("ID: " + getId());
        System.out.println("Ano de Construção: " + getAnoConstrucao());
        System.out.println("Área: " + getArea() + " m²");
        System.out.println("Localização: " + getLocalizacao());
        System.out.println("Preço: " + getPreco());
        System.out.println("Zona Urbana: " + (zonaUrbana ? "Sim" : "Não"));
    }
}
