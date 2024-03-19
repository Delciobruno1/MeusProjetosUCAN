import java.text.DecimalFormat;

public class Livro {
    private String titulo;
    private Integer qtdPaginas;
    private Integer paginasLidas;

    // Construtor
    public Livro(String titulo, Integer qtdPaginas) {
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
        this.paginasLidas = 0; // Inicialmente, nenhuma página lida
    }

    // Métodos get e set para o título
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Métodos get e set para a quantidade de páginas
    public Integer getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(Integer qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    // Métodos get e set para a quantidade de páginas lidas
    public Integer getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(Integer paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    // Método para verificar o progresso de leitura
    public String verificarProgresso() {
        double porcentagem = (double) paginasLidas * 100 / qtdPaginas;
        DecimalFormat df = new DecimalFormat("0.00"); // Define o formato para duas casas decimais
        return "Você já leu " + df.format(porcentagem) + "% do livro";
    }

}
