package app;

import java.util.Scanner;
import modelo.Matricula;
import modelo.Persona;
import modelo.Vehiculo;
import servicio.RegistroPersonas;
import servicio.RegistroVehiculo;
import servicio.ServicioMatriculacion;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RegistroPersonas registro = new RegistroPersonas();
        RegistroVehiculo registroVehiculos = new RegistroVehiculo();
        ServicioMatriculacion servicio = new ServicioMatriculacion();

        Persona duenio = null;
        Vehiculo vehiculo = null;
        Matricula matricula = null;

        int opcion;

        do {
            System.out.println("\n===== MENU MATRICULACION VEHICULAR =====");
            System.out.println("1. Registrar duenio");
            System.out.println("2. Consultar duenio");
            System.out.println("3. Regitrar vehiculo");
            System.out.println("4. Registrar matricula");
            System.out.println("5. Consultar matricula");
            System.out.println("6. Pagar matricula");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    duenio = registro.registrarPersona();
                    break;

                case 2:
                    if (duenio != null) {
                        System.out.println(duenio);
                    } else {
                        System.out.println("No existe duenio registrado");
                    }
                    break;

                case 3:
                    if (duenio == null) {
                        System.out.println("Debe registrar un duenio primero");
                        break;
                    }
                    vehiculo = registroVehiculos.registrarVehiculo(duenio);
                    if (vehiculo != null) {
                        System.out.println("✔ Vehiculo registrado");
                    }
                    break;

                case 4:
                    if (vehiculo == null) {
                        System.out.println("Debe registrar un vehículo primero");
                        break;
                    }
                    matricula = servicio.registrarMatricula(vehiculo);
                    System.out.println("✔ Matricula registrada");
                    break;

                case 5:
                    if (matricula != null) {
                        System.out.println(matricula);
                    } else {
                        System.out.println("No existe matricula");
                    }
                    break;

                case 6:
                    if (matricula != null) {
                        servicio.pagarMatricula(matricula);
                        System.out.println("✔ Matricula pagada");
                    } else {
                        System.out.println("No existe matricula");
                    }
                    break;
            }

        } while (opcion != 0);

        System.out.println("Programa finalizado");
    }
}
