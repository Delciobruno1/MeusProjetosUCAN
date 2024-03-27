import java.util.Date;

/**
 * Classe que representa um Cliente da imobiliária.
 */

public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String login;
    private String senha;

    // Construtor
    public Cliente(String nome, String email, String telefone, String endereco, String login, String senha) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.login = login;
        this.senha = senha;
    }

    // Métodos getters e setters
    //...

    /**
     * Método para pesquisar imóveis disponíveis na imobiliária.
     */
    public void pesquisarImoveis() {
        // Implementação
    }

    /**
     * Método para realizar reserva de um imóvel.
     *
     * @param idImovel   O ID do imóvel a ser reservado.
     * @param dataInicio A data de início da reserva.
     * @param dataFim    A data de término da reserva.
     */
    public void reservarImovel(int idImovel, Date dataInicio, Date dataFim) {
        // Implementação
    }

    // Outros métodos adicionais...
}

