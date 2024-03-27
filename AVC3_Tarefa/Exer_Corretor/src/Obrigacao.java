import java.util.Date;

/**
 * Classe que representa uma Obrigação.
 */
public class Obrigacao extends Titulo {
    // Construtor
    public Obrigacao(String designacao, Date dataEmissao, double valorFacial) {
        super(designacao, dataEmissao, valorFacial);
    }
}