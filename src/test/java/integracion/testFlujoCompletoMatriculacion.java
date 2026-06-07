package integracion;

import modelo.Auto;
import modelo.Matricula;
import modelo.Persona;
import modelo.Vehiculo;
import org.junit.jupiter.api.Test;
import servicio.ServicioMatriculacion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class testFlujoCompletoMatriculacion {
    @Test
    void testFlujoCompletoMatriculacion() {
        Persona p = new Persona("010203", "Juan", "Quito");
        Vehiculo auto = new Auto("ABC-123", "Toyota", 2020, p);

        ServicioMatriculacion servicio = new ServicioMatriculacion();
        Matricula m = servicio.registrarMatricula(auto);

        assertNotNull(m);
        assertEquals("ABC-123", m.getVehiculo().getPlaca());
    }

}
