/**
 * Classe abstrata para os funcionários do escritório da empresa de gestão de condomínios.
 */
public abstract class FuncionarioEscritorio implements Funcionario {
    private String nome;
    private String cargo;

    // Métodos construtores, getters e setters

    public FuncionarioEscritorio(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

