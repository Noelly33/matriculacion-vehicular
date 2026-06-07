package modelo;

public class Auto extends Vehiculo {

    public Auto(String placa, String marca, int anio, Persona duenio) {
        super(placa, marca, anio, duenio);
    }

    @Override
    public double calcularValorMatricula() {
        return 150;
    }
}
