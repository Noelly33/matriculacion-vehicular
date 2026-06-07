package modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusTest {
    @Test
    void testCalcularValorMatriculaBus() {
        Persona p = new Persona("010203", "Juan", "Quito");
        Bus bus = new Bus("BUS-789", "Volvo", 2019, p, 40);

        assertEquals(280, bus.calcularValorMatricula());
    }

}
