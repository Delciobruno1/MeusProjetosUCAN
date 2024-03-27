import java.util.Date;

/**
 * Classe que representa uma Venda de imóvel.
 */
public class Venda {
    private int idImovel;
    private Date data;
    private Funcionario vendedor;
    private Cliente clienteComprador;
    private Proprietario proprietario;

    // Construtor
    public Venda(int idImovel, Date data, Funcionario vendedor, Cliente clienteComprador, Proprietario proprietario) {
        this.setIdImovel(idImovel);
        this.setData(data);
        this.setVendedor(vendedor);
        this.setClienteComprador(clienteComprador);
        this.setProprietario(proprietario);
    }

    // Métodos getters e setters
    public int getIdImovel() {
        return idImovel;
    }

    public void setIdImovel(int idImovel) {
        this.idImovel = idImovel;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getClienteComprador() {
        return clienteComprador;
    }

    public void setClienteComprador(Cliente clienteComprador) {
        this.clienteComprador = clienteComprador;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

}
