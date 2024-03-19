import org.junit.Test;
import static org.junit.Assert.*;

public class FilmeTest {

    @Test
    public void testExibirDuracaoEmHoras() {
        // Criação do objeto filme
        Filme filme = new Filme("Os Vingadores", 142);
        // Verifica se a mensagem gerada pelo método exibirDuracaoEmHoras() está correta
        assertEquals("O filme Os Vingadores possui 2 horas e 22 minutos de duração.", filme.exibirDuracaoEmHoras());
    }
}
