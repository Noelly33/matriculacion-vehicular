package modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolimorfismoTest {
    @Test
    void testPolimorfismoAutoVsMoto() {
        Persona p = new Persona("010203", "Juan", "Quito");

        Vehiculo auto = new Auto("ABC-123", "Toyota", 2020, p);
        Vehiculo moto = new Moto("MOT-456", "Yamaha", 2021, p);

        assertEquals(150, auto.calcularValorMatricula());
        assertEquals(80, moto.calcularValorMatricula());
    }

}
