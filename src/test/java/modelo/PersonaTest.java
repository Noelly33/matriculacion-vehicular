
package modelo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    void testConstructorPersona() {
        Persona p = new Persona("010203", "Juan", "Quito");

        assertEquals("Juan", p.getNombre());
        assertEquals("010203", p.getCedula());
    }
}
