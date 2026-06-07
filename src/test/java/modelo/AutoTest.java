package modelo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutoTest {

    @Test
    void testConstructorAuto() {
        Persona duenio = new Persona("010203", "Juan", "Quito");
        Auto auto = new Auto("ABC-123", "Toyota", 2020, duenio);

        assertEquals("ABC-123", auto.getPlaca());
        assertEquals("Juan", auto.consultarDuenio().getNombre());
    }
    @Test
    void testCalcularValorMatriculaAuto() {
        Persona p = new Persona("010203", "Juan", "Quito");
        Auto auto = new Auto("ABC-123", "Toyota", 2020, p);

        assertEquals(150, auto.calcularValorMatricula());
    }

}
