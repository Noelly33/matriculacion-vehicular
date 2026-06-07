package servicio;

import java.util.Scanner;
import modelo.Auto;
import modelo.Bus;
import modelo.Camion;
import modelo.Moto;
import modelo.Persona;
import modelo.Vehiculo;

public class RegistroVehiculo {

    private Scanner scanner = new Scanner(System.in);

    public Vehiculo registrarVehiculo(Persona duenio) {

        System.out.println("=== REGISTRO DE VEHICULO ===");

        System.out.print("Placa: ");
        String placa = scanner.nextLine();

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Anioo: ");
        int anio = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Tipo de vehiculo:");
        System.out.println("1. Auto");
        System.out.println("2. Moto");
        System.out.println("3. Camion");
        System.out.println("4. Bus");
        System.out.print("Seleccione: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        switch (tipo) {
            case 1:
                return new Auto(placa, marca, anio, duenio);

            case 2:
                return new Moto(placa, marca, anio, duenio);

            case 3:
                System.out.print("Capacidad en toneladas: ");
                double toneladas = scanner.nextDouble();
                scanner.nextLine();
                return new Camion(placa, marca, anio, duenio, toneladas);

            case 4:
                System.out.print("Numero de asientos: ");
                int asientos = scanner.nextInt();
                scanner.nextLine();
                return new Bus(placa, marca, anio, duenio, asientos);

            default:
                System.out.println("Tipo invalido");
                return null;
        }
    }
}
