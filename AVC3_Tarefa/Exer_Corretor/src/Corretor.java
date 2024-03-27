import java.util.ArrayList;
import java.util.Date;
/**
 * Classe que representa um Corretor da firma de investimentos.
 */
public class Corretor {
    private int numero;
    private String nome;
    private Date dataAdmissao;
    private Date dataRescisao;
    private String telefone;
    private double salarioBase;
    private double comissao;

    // Construtor
    public Corretor(int numero, String nome, Date dataAdmissao, Date dataRescisao, String telefone, double salarioBase) {
        this.numero = numero;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.dataRescisao = dataRescisao;
        this.telefone = telefone;
        this.salarioBase = salarioBase;
        this.comissao = 0.01; // Comissão inicial de 1%
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

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Date getDataRescisao() {
        return dataRescisao;
    }

    public void setDataRescisao(Date dataRescisao) {
        this.dataRescisao = dataRescisao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}

