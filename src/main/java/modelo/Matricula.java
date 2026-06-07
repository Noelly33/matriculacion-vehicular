package modelo;

public class Matricula {

    private Vehiculo vehiculo;
    private boolean pagada;

    public Matricula(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.pagada = false;
    }

    public void pagar() {
        pagada = true;
    }

    public boolean isPagada() {
        return pagada;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    @Override
    public String toString() {
        return "Placa: " + vehiculo.getPlaca()
                + ", Duenio: " + vehiculo.consultarDuenio().getNombre()
                + ", Valor: $" + vehiculo.calcularValorMatricula()
                + ", Pagada: " + pagada;
    }
}
