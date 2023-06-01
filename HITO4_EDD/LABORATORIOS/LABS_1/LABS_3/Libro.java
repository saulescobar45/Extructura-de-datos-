package Colas.Objeto;

public class Libro {
    private int codigoLibro;
    private String autor;
    private String genero;
    private String categoria;
    private int paginas;

    public Libro(int codigoLibro, String autor, String genero, String categoria, int paginas) {
        this.codigoLibro = codigoLibro;
        this.autor = autor;
        this.genero = genero;
        this.categoria = categoria;
        this.paginas = paginas;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public void mostrar(){
        System.out.println("mostrar datos del libro");
        System.out.println("Codigo: " + getCodigoLibro());
        System.out.println("Autor: " + getAutor());
        System.out.println("Genero: " + getGenero());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Paginas: " + getPaginas());
        System.out.println();
    }
}


