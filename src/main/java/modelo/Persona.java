package modelo;

public class Persona {

    private String cedula;
    private String nombre;
    private String direccion;

    public Persona(String cedula, String nombre, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Cedula: " + cedula
                + ", Nombre: " + nombre
                + ", Direccion: " + direccion;
    }
}
