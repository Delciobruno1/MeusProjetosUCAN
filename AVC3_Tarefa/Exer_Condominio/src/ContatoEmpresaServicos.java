/**
 * Classe para os contactos com empresas de prestação de serviços.
 */
public class ContatoEmpresaServicos {
    private String nomeEmpresa;
    private String tipoServico;
    private String contato;

    // Métodos construtores, getters e setters

    public ContatoEmpresaServicos(String nomeEmpresa, String tipoServico, String contato) {
        this.nomeEmpresa = nomeEmpresa;
        this.tipoServico = tipoServico;
        this.contato = contato;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}