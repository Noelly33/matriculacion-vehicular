package servicio;

import modelo.Auto;
import modelo.Matricula;
import modelo.Persona;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ServicioMatriculacionTest {
    @Test
    void testRegistrarMatricula() {
        Persona p = new Persona("010203", "Juan", "Quito");
        Auto auto = new Auto("ABC-123", "Toyota", 2020, p);

        ServicioMatriculacion servicio = new ServicioMatriculacion();
        Matricula m = servicio.registrarMatricula(auto);

        assertNotNull(m);
    }

    @Test
    void testPagarMatriculaServicio() {
        Persona p = new Persona("010203", "Juan", "Quito");
        Auto auto = new Auto("ABC-123", "Toyota", 2020, p);

        ServicioMatriculacion servicio = new ServicioMatriculacion();
        Matricula m = servicio.registrarMatricula(auto);

        servicio.pagarMatricula(m);

        assertTrue(m.isPagada());
    }


}
