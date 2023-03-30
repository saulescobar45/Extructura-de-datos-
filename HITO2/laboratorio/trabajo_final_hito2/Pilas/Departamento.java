package Pilas;

public class Departamento {
    private String nombre;
    private String [] Provincia;

    public Departamento(String nombre,String[] Provincia) {
        this.nombre = nombre;
        this.Provincia = Provincia;
    }

    public String getNombre(String nombre) {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getProvincias(String[] Provincias) {
        return Provincias;
    }

    public void setProvincias(String[] Provincias) {
        this.Provincias = Provincias;
    }

    public void mostrarDatos() {
        System.out.println("Departamento: " + nombre);
        System.out.print("Provincias: ");
        for (String provincia : Provincias) {
            System.out.print(provincia + " ");
        }
        System.out.println();
    }
}