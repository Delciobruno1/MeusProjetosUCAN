import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;

public class FrequenciaCardiacaTest {

    @Test
    public void calcularIdade() {
        FrequenciaCardiaca pessoa = new FrequenciaCardiaca("Joao", "Silva", LocalDate.of(1990, 6, 15));
        assertEquals(33, pessoa.calcularIdade());
    }

    @Test
    public void calcularFrequenciaCardiacaMaxima() {
        FrequenciaCardiaca pessoa = new FrequenciaCardiaca("Joao", "Silva", LocalDate.of(1990, 6, 15));
        assertEquals(187, pessoa.calcularFrequenciaCardiacaMaxima());
    }

    @Test
    public void calcularFrequenciaCardiacaAlvo() {
        FrequenciaCardiaca pessoa = new FrequenciaCardiaca("Joao", "Silva", LocalDate.of(1990, 6, 15));
        assertEquals("93 - 158 bpm", pessoa.calcularFrequenciaCardiacaAlvo());
    }
}

