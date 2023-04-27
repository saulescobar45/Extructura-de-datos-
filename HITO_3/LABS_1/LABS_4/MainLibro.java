package pilaLibro;

public class MainLibro {
    public static void main(String[] args) {
        Libros lib1 = new Libros("Homero",500,30.00,"La Odisea","Historia");
        Libros lib2 = new Libros("Homero",300,20.00,"La Iliana","Historia");

        PilaDeLibros pila = new PilaDeLibros();
        pila.adicionar(lib1);
        pila.adicionar(lib2);

        Libros lib1B = new Libros("Juan Carlos",600,40.00,"La ostia plena","Religion");
        Libros lib2B = new Libros("Jose",200,25.00,"La criticas de Juan","Novela");

        PilaDeLibros pilaB = new PilaDeLibros();
        pila.adicionar(lib1B);
        pila.adicionar(lib2B);

//        pila.mostrar();
//        costoMayor(pila,25);

//        descuentodeLibro(pila,0.01,"Historia");
//        pila.mostrar();
        mostrarelLibroMayor(pila,500);
        pila.mostrar();
    }

    public static void costoMayor(PilaDeLibros pila,double precio) {
        PilaDeLibros aux = new PilaDeLibros();
        Libros item = null;
        int cont = 0;
        while (!pila.esVacio()) {
            item = pila.eliminar();
            if (item.getPrecio() > precio){
                cont = cont + 1 ;
            }
            aux.adicionar(item);
        }
        pila.vaciar(aux);
        System.out.println("Libro con precio a " + precio + " bs = " + cont);
    }
    public static void descuentodeLibro(PilaDeLibros pila,double precio,String categoria){
        PilaDeLibros aux = new PilaDeLibros();
        Libros item = null;
        double cont = 0;
        double descuento = 0 ;

        while (!pila.esVacio()){
            item = pila.eliminar();
            if(item.getCategoria() == categoria){
                cont = (item.getPrecio()* 0.1);
                descuento = (item.getPrecio()- cont);

            }
           System.out.println("Descuento es:" + descuento);
            aux.adicionar(item);
        }
       pila.vaciar(aux);
    }
    public static void mostrarelLibroMayor(PilaDeLibros pila,double precio){
        PilaDeLibros aux = new PilaDeLibros();
        Libros item = null;
        double max = Integer.MIN_VALUE;

        while (!pila.esVacio()){
            item = pila.eliminar();
            if(item.getPrecio() > max){
                max = item.getPrecio();
            }
            aux.adicionar(item);
        }
        pila.vaciar(aux);
        return max; ///////////////////// algo falla wachin
    }

    //////////////////////////////// intercambio de los precios en las pilasA y la pila B////////////////////////////////////////
}

