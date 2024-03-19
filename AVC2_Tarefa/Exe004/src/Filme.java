/**
 * A classe Filme representa um filme com um título e uma duração em minutos.
 * Ela fornece métodos para acessar e modificar o título e a duração do filme,
 * bem como um método para exibir a duração do filme em horas.
 */
public class Filme {
    private String titulo;
    private int duracaoEmMinutos;

    // Construtor
    public Filme(String titulo, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // Métodos get e set para o título
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Métodos get e set para a duração em minutos
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // Método para exibir a duração do filme em horas e minutos
    public String exibirDuracaoEmHoras() {
        int horas = duracaoEmMinutos / 60;
        int minutos = duracaoEmMinutos % 60;
        return "O filme " + titulo + " possui " + horas + " horas e " + minutos + " minutos de duração.";
    }
}

