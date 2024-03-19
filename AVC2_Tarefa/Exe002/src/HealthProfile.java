import java.time.LocalDate;
import java.time.Period;
public class HealthProfile {
    private String nome;
    private String sobrenome;
    private String genero;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;

    //Construtor
    public HealthProfile(String nome, String sobrenome, String genero, LocalDate dataNascimento, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    // Métodos getters e setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método para calcular e retornar a idade em anos
    public int calcularIdade(){
        LocalDate currentDate = LocalDate.now();
        return Period.between(dataNascimento, currentDate).getYears();
    }

    // Método para calcular e retornar o índice de massa corporal (IMC)
    public double  calcularIMC(){
        return peso / (altura * altura);
    }

    // Método para calcular e retornar a frequencia cardíaca máxima
    public int calcularFrequenciaCardiacaMaxima(){
        int idade = calcularIdade();
        return 220 - idade;
    }

    // Método para clacular e retornar a frequencia cardíaca alvo
    public String calcularFrequenciaCardiacaAlvo(){
        int maxHeartRate = calcularFrequenciaCardiacaMaxima();
        int lowerRange = (int) (maxHeartRate * 0.5);
        int upperRange = (int) (maxHeartRate * 0.85);
        return lowerRange + " - " + upperRange + "bpm";
    }
}
