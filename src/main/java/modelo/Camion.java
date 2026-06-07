package modelo;

public class Camion extends Vehiculo {
    private double capacidadToneladas;

    public Camion(String placa, String marca, int anio, Persona duenio, double capacidadToneladas) {
        super(placa, marca, anio, duenio);
        this.capacidadToneladas = capacidadToneladas;
    }

    public double calcularValorMatricula() {
        return 250 + (capacidadToneladas * 20);
    }
}
