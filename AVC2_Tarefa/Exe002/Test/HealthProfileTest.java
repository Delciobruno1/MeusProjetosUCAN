import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class HealthProfileTest {
    @Test
    public void calcularIdade() {
        HealthProfile pessoa = new HealthProfile("João", "Silva", "Masculino", LocalDate.of(1990, 6, 15), 1.75, 70);
        assertEquals(33, pessoa.calcularIdade());
    }

    @Test
    public void calcularIMC() {
        HealthProfile pessoa = new HealthProfile("João", "Silva", "Masculino", LocalDate.of(1990, 6, 15), 1.75, 70);
        assertEquals(22.86, pessoa.calcularIMC(), 0.01);
    }

    @Test
    public void calcularFrequenciaCardiacaMaxima() {
        HealthProfile pessoa = new HealthProfile("João", "Silva", "Masculino", LocalDate.of(1990, 6, 15), 1.75, 70);
        assertEquals(187, pessoa.calcularFrequenciaCardiacaMaxima());
    }

    @Test
    public void calcularFrequenciaCardiacaAlvo() {
        HealthProfile pessoa = new HealthProfile("João", "Silva", "Masculino", LocalDate.of(1990, 6, 15), 1.75, 70);
        assertEquals("93 - 158bpm", pessoa.calcularFrequenciaCardiacaAlvo());
    }
}

