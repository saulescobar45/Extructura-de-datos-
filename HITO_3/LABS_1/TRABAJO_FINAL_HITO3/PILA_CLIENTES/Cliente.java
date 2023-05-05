package Clientes;

public class Cliente {
    private String nombres;
    private  String apellido;
    private  int edad;
    private String direccion;
    private String genero;

    public Cliente(String nombres, String apellido, int edad, String direccion, String genero) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.genero = genero;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion(String nuevaDireccion) {
        return direccion;
    }

    public String getGenero() {

        return genero;
    }

    public void setNombres(String nombres) {

        this.nombres = nombres;
    }

    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }

    public void setDireccion(String direccion) {

        this.direccion = direccion;
    }

    public void setGenero(String genero) {

        this.genero = genero;
    }

    public void mostrarCliente(){
        System.out.println("Mostrar cliente");
        System.out.println("Nombres: "+ nombres);
        System.out.println("Apellido: "+ apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Direccion: "+ direccion);
        System.out.println("Genero: "+genero);
    }
}

