package servicio;

import modelo.Matricula;
import modelo.Vehiculo;

public class ServicioMatriculacion {

    public Matricula registrarMatricula(Vehiculo vehiculo) {
        return new Matricula(vehiculo);
    }

    public void pagarMatricula(Matricula matricula) {
        matricula.pagar();
    }
}
