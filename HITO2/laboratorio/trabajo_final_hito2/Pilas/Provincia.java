package Pilas;

public class Provincia {
    private String nombre;

    public Provincia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarProvincia() {

        System.out.println("NOMBRE: " + nombre);
        System.out.println();
    }
}

