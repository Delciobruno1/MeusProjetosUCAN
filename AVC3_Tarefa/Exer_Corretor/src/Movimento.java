import java.util.Date;

/**
 * Classe que representa um Movimento na carteira de um Cliente.
 */
public class Movimento {
    private Titulo titulo;
    private int quantidade;
    private double valorTransaccionado;
    private Date dataHoraTransacao;

    // Construtor
    public Movimento(Titulo titulo, int quantidade, double valorTransaccionado, Date dataHoraTransacao) {
        this.titulo = titulo;
        this.quantidade = quantidade;
        this.valorTransaccionado = valorTransaccionado;
        this.dataHoraTransacao = dataHoraTransacao;
    }

    // Getters e Setters
    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTransaccionado() {
        return valorTransaccionado;
    }

    public void setValorTransaccionado(double valorTransaccionado) {
        this.valorTransaccionado = valorTransaccionado;
    }

    public Date getDataHoraTransacao() {
        return dataHoraTransacao;
    }

    public void setDataHoraTransacao(Date dataHoraTransacao) {
        this.dataHoraTransacao = dataHoraTransacao;
    }

}

