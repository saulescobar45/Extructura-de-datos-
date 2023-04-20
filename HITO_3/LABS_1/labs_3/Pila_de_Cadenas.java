package Pilashito3;

import java.util.Scanner;

public class Pila_de_Cadenas {
    private int max;
    private int tope;
    private String[] cadenas;

    public Pila_de_Cadenas(){
        this.max = 10;
        this.tope = 0;
        this.cadenas = new String[max+1];

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

    public void adicionar(String nuevoNombre){

        if(esllena() == true){
            System.out.println("Pila llena");

        }
        else{
            tope= tope+1;
            cadenas[tope] = nuevoNombre;
        }
    }
    public String eliminar(){
        String itemEliminado = " ";

        if(esllena() == true){
            System.out.println("Pila Vacia");
        }
        else{
            itemEliminado = cadenas[this.tope];
        }

        tope = tope-1;

        return itemEliminado;
    }

    public void llenar(int nroElem){
        Scanner leer = new Scanner(System.in);
        String nombre = " ";
        System.out.println("Llenando la pila nombres (cadena)");

        for(int i =0 ; i < nroElem ; i++){
            System.out.println("ingrese el nombre: " + (i+1) + ":");
            nombre = leer.nextLine();
            adicionar(nombre);
            System.out.println();

        }


    }
    public void vaciar(Pila_de_Cadenas pila){

        while (!pila.esVacio()){ // o podemos usar !pila.esVacio

            adicionar(pila.eliminar());
        }

    }
    public void mostrar(){

        String item=" ";
        if(this.esVacio()){
            System.out.println("No hay items a mostrar");
        }
        else {
            System.out.println("\n mostrando la Pila de elementos");
            Pila_de_Cadenas aux = new Pila_de_Cadenas();
            while(!esVacio()){
                item = this.eliminar();
                System.out.println("NOMBRE = "+ item);
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }
}

