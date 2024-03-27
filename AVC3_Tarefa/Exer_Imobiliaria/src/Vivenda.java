/**
 * Classe que representa uma Vivenda na imobiliária.
 */
public class Vivenda extends Imovel {
    private int numQuartos;

    // Construtor
    public Vivenda(int id, int anoConstrucao, double area, String localizacao, double preco, int numQuartos) {
        super(id, anoConstrucao, area, localizacao, preco);
        this.numQuartos = numQuartos;
    }

    // Getter e Setter específicos para numQuartos
    public int getNumQuartos() {
        return numQuartos;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== Detalhes da Vivenda ===");
        System.out.println("ID: " + getId());
        System.out.println("Ano de Construção: " + getAnoConstrucao());
        System.out.println("Área: " + getArea() + " m²");
        System.out.println("Localização: " + getLocalizacao());
        System.out.println("Preço: " + getPreco());
        System.out.println("Número de Quartos: " + numQuartos);
    }
}
