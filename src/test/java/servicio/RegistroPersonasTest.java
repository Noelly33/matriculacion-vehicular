package servicio;

import org.junit.jupiter.api.Test;

import modelo.Persona;
import servicio.RegistroPersonas;

import java.lang.reflect.Field;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RegistroPersonasTest {

    @Test
    void testConsultarPersonaExistente() throws Exception {
        RegistroPersonas registro = new RegistroPersonas();

        Persona persona = new Persona("010203", "Juan", "Quito");

        // Acceder a la lista privada "personas"
        Field field = RegistroPersonas.class.getDeclaredField("personas");
        field.setAccessible(true);

        List<Persona> lista = (List<Persona>) field.get(registro);
        lista.add(persona);

        Persona resultado = registro.consultarPersona("010203");

        assertNotNull(resultado);
        assertEquals("Juan", resultado.getNombre());
    }
}
