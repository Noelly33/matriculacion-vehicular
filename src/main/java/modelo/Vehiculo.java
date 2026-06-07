package modelo;

public abstract class Vehiculo {

    protected String placa;
    protected String marca;
    protected int anio;
    protected Persona duenio;

    public Vehiculo(String placa, String marca, int anio, Persona duenio) {
        this.placa = placa;
        this.marca = marca;
        this.anio = anio;
        this.duenio = duenio;
    }

    public abstract double calcularValorMatricula();

    public Persona consultarDuenio() {
        return duenio;
    }

    public String getPlaca() {
        return placa;
    }
}
