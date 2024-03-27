/**
 * Classe para os funcionários jardineiros da empresa de gestão de condomínios.
 */
public abstract class FuncionarioJardineiro implements Funcionario{
    private String nome;
    private String tipoJardim;

    // Métodos construtores, getters e setters

    public FuncionarioJardineiro(String nome, String tipoJardim) {
        this.nome = nome;
        this.tipoJardim = tipoJardim;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoJardim() {
        return tipoJardim;
    }

    public void setTipoJardim(String tipoJardim) {
        this.tipoJardim = tipoJardim;
    }

    @Override
    public void realizarTarefa() {
        // Implementação da tarefa de jardinagem
    }
}


