package Listas;

import java.util.Scanner;

public class ListasNOdos {
    Nodo lista;

    public ListasNOdos(){
        this.lista=null;
    }
    public void llenarLista(){
        Nodo nuevo = null;
        Nodo aux = null;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite Dato: ");
        int dato = entrada.nextInt();
        while(dato !=0){
            nuevo = new Nodo(dato);
            if(lista == null){
                lista = nuevo;
            }
            else{
                aux.siguiente= nuevo;
            }
            aux=nuevo;
            System.out.print("Digite dato: ");
            dato=entrada.nextInt();
        }
    }

        public void insertaraelSegundo(){
        Nodo nuevo = null;
        Nodo aux = lista;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n DIgite dato a insertar: ");
        int dato = scanner.nextInt();
        nuevo = new Nodo(dato);
        aux = aux.siguiente;
        lista.siguiente= nuevo;
        nuevo.siguiente= aux;

    }
public void insertae_elTercero(){
    Nodo nuevo = null;
    Nodo aux = lista;
    Nodo aux1 = lista;
    Scanner scanner = new Scanner(System.in);
    System.out.println("\n DIgite dato a insertar: ");
    int dato = scanner.nextInt();
    nuevo = new Nodo(dato);
    aux = aux.siguiente;
    aux1 = aux1.siguiente;
    lista.siguiente= nuevo;
    nuevo.siguiente= aux;


}
    public void imprimirListas(){
        Nodo actual = lista;
        while(actual!=null){
            System.out.print(actual.dato + " => ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
    public static void main(String[] args){
        ListasNOdos L = new ListasNOdos();
        L.llenarLista();
        System.out.println("Listas: ");
        L.imprimirListas();
    }
}
