package pilaLibro;

public class Libros {
    private String autor;
    private int mroPag;
    private double precio;
    private String titulo;
    private String categoria;

    public Libros(String autor, int mroPag, double precio, String titulo, String categoria) {
        this.autor = autor;
        this.mroPag = mroPag;
        this.precio = precio;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public int getMroPag() {
        return mroPag;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setMroPag(int mroPag) {
        this.mroPag = mroPag;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void mostrarLibro(){
        System.out.println("Mostrar libro");
        System.out.println("Autor: "+ autor);
        System.out.println("mroPaginas: "+ mroPag);
        System.out.println("Precio: "+ precio);
        System.out.println("Titulo: "+ titulo);
        System.out.println("Categoria: "+ categoria);
        System.out.println();
    }

}
