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
