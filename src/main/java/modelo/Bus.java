package modelo;

public class Bus extends Vehiculo {

    private int numeroAsientos;

    public Bus(String placa, String marca, int anio, Persona duenio, int numeroAsientos) {
        super(placa, marca, anio, duenio);
        this.numeroAsientos = numeroAsientos;
    }

    @Override
    public double calcularValorMatricula() {
        return 200 + (numeroAsientos * 2);
    }
}
