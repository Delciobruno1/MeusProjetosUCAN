import java.util.ArrayList;

/**
 * Classe que representa uma Firma de Investimentos.
 */
public class FirmaInvestimentos {
    private ArrayList<Corretor> corretores;
    private ArrayList<Cliente> clientes;
    private ArrayList<Titulo> titulos;
    private ArrayList<Movimento> movimentos;

    // Construtor
    public FirmaInvestimentos() {
        this.corretores = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.titulos = new ArrayList<>();
        this.movimentos = new ArrayList<>();
    }

    // Métodos para adicionar corretores, clientes, títulos e movimentos
    public void adicionarCorretor(Corretor corretor) {
        this.corretores.add(corretor);
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void adicionarTitulo(Titulo titulo) {
        this.titulos.add(titulo);
    }

    public void adicionarMovimento(Movimento movimento) {
        this.movimentos.add(movimento);
    }

    // Outros métodos necessários para a gestão da firma de investimentos
}
