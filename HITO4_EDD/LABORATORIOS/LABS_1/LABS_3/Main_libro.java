package Colas.Objeto;

import Colas.Objetos.Cola_de_libros;

public class Main_libro {
    public static void main(String[] args) {
        Cola_de_libros colalib = new Cola_de_libros();

        Libro libro1 = new Libro(1,"Juan","Masculino","Manga",80);
        Libro libro2 = new Libro(2,"Saul","Masculino","Manga",100);
        Libro libro3 = new Libro(3,"Ana","Femenino","Historia",40);
        Libro libro4 = new Libro(4,"Micaela","Femenino","Historia",30);
        Libro libro5 = new Libro(5,"Pepito","Masculino","Novela",20);
        Libro libro6 = new Libro(6,"Carlos","Masculino","Novela",20);
        Libro libro7 = new Libro(7,"Tito","Masculino","Arte",200);

        colalib.adicionar(libro1);
        colalib.adicionar(libro2);
        colalib.adicionar(libro3);
        colalib.adicionar(libro4);
        colalib.adicionar(libro5);
        colalib.adicionar(libro6);
        colalib.adicionar(libro7);

        colalib.mostrar();
        // mostrar el libro menor de la cola
        muestraLibromenor(colalib);

        // oredar el libro por genero
        ordenarColadelibroPorGenero(colalib);

        // oredenar de manera acendente los libros
        ordenarporPagina(colalib);
    }
    public static Libro muestraLibromenor(Cola_de_libros colalib){
        Cola_de_libros aux = new Cola_de_libros();
        int pagmenor = Integer.MAX_VALUE;
        Libro libroMenor = null;

        while(!colalib.esVacia()){
            Libro item = colalib.eliminar();
            if(item.getPaginas()< pagmenor){
                pagmenor = item.getPaginas();
                libroMenor = item;
            }
            aux.adicionar(item);
        }
        colalib.vaciar(aux);
        return libroMenor;

    }
    public static void ordenarColadelibroPorGenero(Cola_de_libros colalib){
        Cola_de_libros masculino = new Cola_de_libros();
        Cola_de_libros femenino = new Cola_de_libros();
        Cola_de_libros otro = new Cola_de_libros();

        while (!colalib.esVacia()){
            Libro libro = colalib.eliminar();
            if(libro.getGenero().equals("femenino")){
                femenino.adicionar(libro);
            } else if (libro.getGenero().equals("masculino")) {
                masculino.adicionar(libro);
            }else {
                otro.adicionar(libro);
            }
        }
        colalib.vaciar(femenino);
        colalib.vaciar(masculino);
        colalib.vaciar(otro);
    }

    public static void ordenarporPagina(Cola_de_libros colalib){
        Cola_de_libros ordenado = new Cola_de_libros();
        Cola_de_libros aux = new Cola_de_libros();
        int nroElm = Cola_de_libros.nroElm;

        for(int i =1; i<=nroElm;i++){
            Libro libro = muestraLibromenor(Cola_de_libros);

            while(colalib.esVacia()){
                Libro item = colalib.eliminar();
                if(item.getCodigoLibro()== libro.getCodigoLibro()){
                    ordenado.adicionar(item);
                }else{
                    aux.adicionar(item);
                }
            }
            colalib.vaciar(aux);
        }
        colalib.vaciar(ordenado);
        colalib.mostrar();
    }
}


