package modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehiculoTest {
    @Test
    void testConsultarDuenioVehiculo() {
        Persona p = new Persona("010203", "Juan", "Quito");
        Auto auto = new Auto("ABC-123", "Toyota", 2020, p);

        assertEquals("Juan", auto.consultarDuenio().getNombre());
    }

}
