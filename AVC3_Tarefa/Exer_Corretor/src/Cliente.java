import java.util.ArrayList;

/**
 * Classe que representa um Cliente da firma de investimentos.
 */
public class Cliente {
    private int numero;
    private String nome;
    private String telefone;
    private ArrayList<Titulo> carteira;

    // Costrutor
    public Cliente (int numero, String nome, String telefone){
        this.numero = numero;
        this.nome = nome;
        this.telefone = telefone;
        this.carteira = new ArrayList<>();
    }

    // Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Titulo> getCarteira() {
        return carteira;
    }

    public void setCarteira(ArrayList<Titulo> carteira) {
        this.carteira = carteira;
    }

    public void adicionarTitulo(Titulo titulo) {
        this.carteira.add(titulo);
    }
}
