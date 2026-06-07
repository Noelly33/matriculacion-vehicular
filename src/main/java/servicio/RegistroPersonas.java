package servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Persona;

public class RegistroPersonas {

    private List<Persona> personas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Persona registrarPersona() {
        System.out.println("=== REGISTRO DE DUENIO ===");

        System.out.print("Cedula: ");
        String cedula = scanner.nextLine();

        System.out.print("Nombre Completo: ");
        String nombre = scanner.nextLine();

        System.out.print("Direccion: ");
        String direccion = scanner.nextLine();

        Persona persona = new Persona(cedula, nombre, direccion);
        personas.add(persona);

        System.out.println("✔ Duenio registrado\n");
        return persona;
    }

    public Persona consultarPersona(String cedula) {
        for (Persona p : personas) {
            if (p.getCedula().equals(cedula)) {
                return p;
            }
        }
        return null;
    }
}
