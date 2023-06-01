package Colas.Objeto;

import Colas.Objetos.Cola_de_libros;

public class Cola_de_Libro {
    private int max;
    private int ini;
    private int fin;
    private Libro[] libros;


    public Cola_de_Libro(){
        this.max=100;
        this.ini=0;
        this.fin=0;
        this.libros = new Libro[this.max + 1];

    }

    public boolean esVacia(){
        if(ini == 0 && fin ==0){
            return true;
        }else{
            return false;
        }
    }

    public boolean esLlena(){
        if(fin == max){
            return true;
        }else{
            return false;
        }
    }

    public void adicionar(Libro nuevoLibro) {
        if (esLlena()) {
            System.out.println("LA COLA ESTA LLENA PAPU");
        } else {
            fin = fin + 1;
            libros[fin] = nuevoLibro;
        }
    }

    public Libro eliminar() {
        Libro elemento = null;

        if (esVacia()) {
            System.out.println("LA COLA ESTÁ VACÍA");
        } else {
            elemento = libros[ini];
            ini = ini + 1;
        }
        if(ini == fin){
            ini = fin = 0;

        }
        return elemento;
    }

    public int nroElemento(){
        return fin-ini;
    }

    public void vaciar(Cola_de_libros cola){
        while (!cola.esVacia()){
            adicionar(cola.eliminar());
        }
    }

    public void mostrar(){
        if (esVacia()){
            System.out.println("COLA VACIA, NO HAY ITEMS: ");
        }else{
            Libro elemEliminado;
            System.out.println("mostrando los datos de la cola");
            Cola_de_libros aux = new Cola_de_libros();
            while(!esVacia()){
                elemEliminado = eliminar();
                elemEliminado.mostrar();
                aux.adicionar(elemEliminado);
            }
            vaciar(aux);
        }
    }

}
