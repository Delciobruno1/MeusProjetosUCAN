
/**
 * Classe que representa um Funcionário da imobiliária.
 */
public class Funcionario {
    private int codigo;
    private String nome;
    private String agencia;
    private double salario;

    // Construtor
    public Funcionario(int codigo, String nome, String agencia, double salario) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setAgencia(agencia);
        this.setSalario(salario);
    }

    /**
     * Método para realizar uma venda de imóvel.
     * @param venda A venda a ser realizada.
     */
    public void realizarVenda(Venda venda) {
        // Implementação
    }

    // Métodos getters e setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Outros métodos...
}
