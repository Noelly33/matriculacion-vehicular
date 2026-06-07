package modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CamionTest {
    @Test
    void testCalcularValorMatriculaCamion() {
        Persona p = new Persona("010203", "Juan", "Quito");
        Camion camion = new Camion("CAM-321", "Hino", 2018, p, 5);

        assertEquals(350, camion.calcularValorMatricula());
    }

}
