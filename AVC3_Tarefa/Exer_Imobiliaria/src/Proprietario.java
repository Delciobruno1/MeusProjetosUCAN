/**
 * Classe que representa um Proprietário de imóvel.
 */
public class Proprietario {
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String login;
    private String senha;
    private boolean aprovado;

    // Construtor
    public Proprietario(String nome, String email, String telefone, String endereco, String login, String senha) {
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setEndereco(endereco);
        this.setLogin(login);
        this.setSenha(senha);
        this.setAprovado(false);
    }

    /**
     * Método para solicitar registro como proprietário na imobiliária.
     */
    public void solicitarRegistro() {
        // Implementação
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    // Outros métodos...
}
