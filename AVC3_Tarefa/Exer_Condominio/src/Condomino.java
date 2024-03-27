import java.util.ArrayList;

public class Condomino implements PesquisaEdificio{
    private String nome;
    private ArrayList<Edificio> edificiosMorados;

    // Métodos construtores, getters e setters

    public Condomino(String nome) {
        this.nome = nome;
        this.edificiosMorados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Edificio> getEdificiosMorados() {
        return edificiosMorados;
    }

    public void setEdificiosMorados(ArrayList<Edificio> edificiosMorados) {
        this.edificiosMorados = edificiosMorados;
    }

    @Override
    public void consultarBalancetes(Condomino condomino) {
        // Implementação da consulta de balancetes
    }

    @Override
    public void consultarRelatorioContas(Condomino condomino) {
        // Implementação da consulta de relatório de contas
    }

    @Override
    public void consultarOrcamento(Condomino condomino) {
        // Implementação da consulta de orçamento
    }
}
