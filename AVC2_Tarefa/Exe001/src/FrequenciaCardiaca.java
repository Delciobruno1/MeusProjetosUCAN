import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

/**
 * A classe FrequenciaCardiaca representa a frequência cardíaca de uma pessoa e fornece métodos para calcular a idade,
 * a frequência cardíaca máxima e a frequência cardíaca alvo com base na data de nascimento da pessoa.
 */
public class FrequenciaCardiaca {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    /**
     * Construtor para criar um objeto FrequenciaCardiaca com o nome, sobrenome e data de nascimento fornecidos.
     * @param nome O primeiro nome da pessoa.
     * @param sobrenome O sobrenome da pessoa.
     * @param dataNascimento A data de nascimento da pessoa.
     */
    public FrequenciaCardiaca(String nome, String sobrenome, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    // Métodos get e set

    /**
     * Obtém o primeiro nome da pessoa.
     * @return O primeiro nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o primeiro nome da pessoa.
     * @param nome O primeiro nome da pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o sobrenome da pessoa.
     * @return O sobrenome da pessoa.
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * Define o sobrenome da pessoa.
     * @param sobrenome O sobrenome da pessoa.
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * Obtém a data de nascimento da pessoa.
     * @return A data de nascimento da pessoa.
     */
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Define a data de nascimento da pessoa.
     * @param dataNascimento A data de nascimento da pessoa.
     */
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Métodos para cálculos de frequência cardíaca

    /**
     * Calcula e retorna a idade da pessoa em anos.
     * @return A idade da pessoa em anos.
     */
    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataNascimento, dataAtual).getYears();
    }

    /**
     * Calcula e retorna a frequência cardíaca máxima da pessoa.
     * @return A frequência cardíaca máxima da pessoa.
     */
    public int calcularFrequenciaCardiacaMaxima() {
        int idade = calcularIdade();
        return 220 - idade;
    }

    /**
     * Calcula e retorna a faixa de frequência cardíaca alvo da pessoa.
     * @return A faixa de frequência cardíaca alvo da pessoa.
     */
    public String calcularFrequenciaCardiacaAlvo() {
        int frequenciaMaxima = calcularFrequenciaCardiacaMaxima();
        int limiteInferior = (int) (frequenciaMaxima * 0.5);
        int limiteSuperior = (int) (frequenciaMaxima * 0.85);
        return limiteInferior + " - " + limiteSuperior + " bpm";
    }
}


