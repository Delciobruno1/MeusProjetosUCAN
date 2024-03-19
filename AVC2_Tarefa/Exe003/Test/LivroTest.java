import org.junit.Test;
import java.text.DecimalFormat;
import static org.junit.Assert.*;

public class LivroTest {

    @Test
    public void testVerificarProgresso() {
        Livro livro = new Livro("O Pequeno Príncipe", 98);
        livro.setPaginasLidas(20);
        DecimalFormat df = new DecimalFormat("0.00");
        String expected = "Você já leu " + df.format(20.41) + "% do livro";
        assertEquals(expected, livro.verificarProgresso());
    }
}