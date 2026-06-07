package modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoTest {
    @Test
    void testCalcularValorMatriculaMoto() {
        Persona p = new Persona("010203", "Juan", "Quito");
        Moto moto = new Moto("MOT-456", "Yamaha", 2021, p);

        assertEquals(80, moto.calcularValorMatricula());
    }

}
