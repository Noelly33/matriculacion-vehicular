package servicio;

import modelo.Auto;
import modelo.Persona;
import modelo.Vehiculo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RegistroVehiculoTest {
    @Test
    void testRegistroVehiculoAuto() {
        Persona p = new Persona("010203", "Juan", "Quito");

        Vehiculo auto = new Auto("ABC-123", "Toyota", 2020, p);

        assertNotNull(auto);
        assertEquals("ABC-123", auto.getPlaca());
    }

}
