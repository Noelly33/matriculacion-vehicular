package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatriculaTest {

    @Test
    void testConstructorMatricula() {
        Persona p = new Persona("010203", "Juan", "Quito");
        Auto auto = new Auto("ABC-123", "Toyota", 2020, p);
        Matricula m = new Matricula(auto);

        assertFalse(m.isPagada());
        assertEquals("ABC-123", m.getVehiculo().getPlaca());
    }
    @Test
    void testPagarMatricula() {
        Persona p = new Persona("010203", "Juan", "Quito");
        Auto auto = new Auto("ABC-123", "Toyota", 2020, p);
        Matricula m = new Matricula(auto);

        m.pagar();

        assertTrue(m.isPagada());
    }

}
