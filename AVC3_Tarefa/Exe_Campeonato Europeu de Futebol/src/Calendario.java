import java.util.ArrayList;

/**
 * Classe que representa o Calendário do campeonato.
 */
public class Calendario {
    private ArrayList<Resultado> resultados;

    public Calendario() {
        this.resultados = new ArrayList<>();
    }

    public ArrayList<Resultado> getResultados() {
        return resultados;
    }

    public void setResultados(ArrayList<Resultado> resultados) {
        this.resultados = resultados;
    }

    public void adicionarResultado(Resultado resultado) {
        this.resultados.add(resultado);
    }
}
