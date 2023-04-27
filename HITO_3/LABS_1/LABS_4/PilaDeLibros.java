package pilaLibro;

import Pilashito3.Pila_de_Cadenas;
import pilaLibro.PilaDeLibros;

import java.util.Scanner;

public class PilaDeLibros {
    private int max;
    private int tope;
    private Libros[] libros;

    public PilaDeLibros(){
        this.max = 10;
        this.tope = 0;
        this.libros = new Libros[max+1];

    }
    public boolean esVacio(){
        if (tope==0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean esllena(){
        if (tope==max){
            return true;
        }
        else{
            return false;
        }

    }
    public int nroElem(){
        return tope;
    }

    public void adicionar(Libros nuevoLibro){

        if(esllena() == true){
            System.out.println("Pila de libros Llena");

        }
        else{
            tope= tope+1;
            libros[tope] = nuevoLibro;
        }
    }
    public Libros eliminar(){
        Libros LibroEliminado = null ;

        if(esllena() == true){
            System.out.println("Pila Vacia");
        }
        else{
            LibroEliminado= libros[this.tope];
        }

        tope = tope-1;

        return LibroEliminado;
    }

    public void vaciar(PilaDeLibros pila){

        while (!pila.esVacio()){ // o podemos usar !pila.esVacio

            adicionar(pila.eliminar());
        }

    }

    public void mostrar(){

        Libros elem = null;
        if(this.esVacio()){
            System.out.println("No hay items a mostrar");
        }
        else {
            System.out.println("\n mostrando la Pila de elementos");
            PilaDeLibros aux = new PilaDeLibros();
            while(!esVacio()){
                elem = this.eliminar();
                elem.mostrarLibro();
                aux.adicionar(elem);
            }
            vaciar(aux);
        }
    }
//    public void llenar(int nroElem){
//        Scanner leer = new Scanner(System.in);
//        String nombre = " ";
//        System.out.println("Llenando la pila nombres (cadena)");
//
//        for(int i =0 ; i < nroElem ; i++){
//            System.out.println("ingrese el nombre: " + (i+1) + ":");
//            nombre = leer.nextLine();
//            adicionar(nombre);
//            System.out.println();
//
//        }
//
//
//    }
}
