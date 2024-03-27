import java.util.ArrayList;
import java.util.Calendar;

/**
 * Classe que representa um condomínio.
 */
public class Condominio {
    private String nome;
    private String endereco;
    private ArrayList<Edificio> edificios;
    private Parcela[] parcelasDespesas;
    private Parcela[] parcelasReceitas;
    private Funcionario[] funcionarios;

    /**
     * Construtor para a classe Condominio.
     * @param nome O nome do condomínio.
     * @param endereco O endereço do condomínio.
     */
    public Condominio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.edificios = new ArrayList<>();
    }

    // Métodos construtores, getters e setters

    /**
     * Obtém o nome do condomínio.
     * @return O nome do condomínio.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do condomínio.
     * @param nome O nome do condomínio.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o endereço do condomínio.
     * @return O endereço do condomínio.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do condomínio.
     * @param endereco O endereço do condomínio.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém a lista de edifícios do condomínio.
     * @return A lista de edifícios do condomínio.
     */
    public ArrayList<Edificio> getEdificios() {
        return edificios;
    }

    /**
     * Define a lista de edifícios do condomínio.
     * @param edificios A lista de edifícios do condomínio.
     */
    public void setEdificios(ArrayList<Edificio> edificios) {
        this.edificios = edificios;
    }

    /**
     * Adiciona um edifício ao condomínio.
     * @param edificio O edifício a ser adicionado.
     */
    public void adicionarEdificio(Edificio edificio) {
        edificios.add(edificio);
    }


    /**
     * Adiciona um condômino a um edifício no condomínio.
     * @param nomeEdificio O nome do edifício onde o condômino será adicionado.
     * @param condomino O condômino a ser adicionado.
     */
    public void adicionarCondomino(String nomeEdificio, Condomino condomino) {
        for (Edificio edificio : edificios) {
            if (edificio.getNome().equalsIgnoreCase(nomeEdificio)) {
                System.out.println("Condômino adicionado com sucesso ao condomínio: " + getNome());
                edificio.adicionarCondomino(condomino);
                return;
            }

        }
        System.out.println("Edifício não encontrado: " + nomeEdificio);
    }

    // Método para calcular as despesas para um determinado ano e período
    public double calcularDespesas(int ano, int periodo) {
        double totalDespesas = 0.0;
        Iterable<? extends Parcela> despesas = null;
        for (Parcela parcela : despesas) {
            Calendar dataParcela = parcela.getData();
            int anoParcela = dataParcela.get(Calendar.YEAR);
            int mesParcela = dataParcela.get(Calendar.MONTH) + 1; // Adiciona 1 porque Janeiro é 0

            if (anoParcela == ano && periodo == calcularPeriodo(mesParcela)) {
                totalDespesas += parcela.getValor();
            }
        }
        return totalDespesas;
    }

    // Método para calcular as receitas para um determinado ano e período
    public double calcularReceitas(int ano, int periodo) {
        double totalReceitas = 0.0;
        Parcela[] receitas = new Parcela[0];
        for (Parcela parcela : receitas) {
            Calendar dataParcela = parcela.getData();
            int anoParcela = dataParcela.get(Calendar.YEAR);
            int mesParcela = dataParcela.get(Calendar.MONTH) + 1; // Adiciona 1 porque Janeiro é 0

            if (anoParcela == ano && periodo == calcularPeriodo(mesParcela)) {
                totalReceitas += parcela.getValor();
            }
        }
        return totalReceitas;
    }

    // Método auxiliar para calcular o período (mensal ou trimestral) com base no mês
    private int calcularPeriodo(int mes) {
        // Se o mês estiver entre 1 e 3, retorna 1 para o primeiro trimestre
        // Se o mês estiver entre 4 e 6, retorna 2 para o segundo trimestre
        // E assim por diante...
        return (mes - 1) / 3 + 1;
    }


    // Método para calcular as despesas totais para um determinado ano
    public double calcularDespesasAno(int ano) {
        double totalDespesas = 0.0;
        for (Parcela parcela : parcelasDespesas) {
            Calendar dataParcela = parcela.getData();
            int anoParcela = dataParcela.get(Calendar.YEAR);
            if (anoParcela == ano) {
                totalDespesas += parcela.getValor();
            }
        }
        return totalDespesas;
    }

    // Método para calcular as receitas totais para um determinado ano
    public double calcularReceitasAno(int ano) {
        double totalReceitas = 0.0;
        for (Parcela parcela : parcelasReceitas) {
            Calendar dataParcela = parcela.getData();
            int anoParcela = dataParcela.get(Calendar.YEAR);
            if (anoParcela == ano) {
                totalReceitas += parcela.getValor();
            }
        }
        return totalReceitas;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
}

