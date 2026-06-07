package modelo;

public class Moto extends Vehiculo {

    public Moto(String placa, String marca, int anio, Persona duenio) {
        super(placa, marca, anio, duenio);
    }

    @Override
    public double calcularValorMatricula() {
        return 80;
    }
}
