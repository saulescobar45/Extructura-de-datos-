package Colas;

import Defensa_pilas_hito3.Estudiante;
import Defensa_pilas_hito3.Pila_Estudiante;

public class Cola_de_numeros {
    private int ini;
    private int fin;
    private int max;
    private int [] numeros;

    public Cola_de_numeros(){
        this.max = 10;
        this.ini = 0;
        this.fin = 0;
        this.numeros = new int[this.max + 1];
    }
    public boolean esVacia(){
        if(ini == 0 && fin == 0 ){
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
    public void adicionar(int nuevoNumero) {
        if (esLlena()) {
            System.out.println("La pila de numeros esta llena");
        } else {
            fin = fin + 1;
            numeros[fin + 1] = nuevoNumero;
        }
    }
    public int Eliminar(){
        int numeroEliminado = 0;

        if(esVacia()){
            System.out.println("Cola vacia");
        } else{
            ini = ini + 1;
            numeroEliminado= numeros[this.ini];
            if(ini == fin){
                ini = 0;
                fin = 0;
            }
        }
        return numeroEliminado;
    }
    public int nroElementos(){
        return fin - ini;
    }
    public void vaciar(Cola_de_numeros cola){

        while (!cola.esVacia()){
            adicionar(cola.Eliminar());
        }
    }
    public void mostrar(){

        if(this.esVacia()){
            System.out.println("Cola vacia no hay items que mostrar");
        }
        else {
            int numeroEliminado;
            System.out.println("\n mostrando los datos de la cola");
            Cola_de_numeros aux = new Cola_de_numeros();

            while(!esVacia()){
             numeroEliminado = Eliminar();
                System.out.println("Valor" + numeroEliminado);
                aux.adicionar(numeroEliminado);
            }
            vaciar(aux);
        }
    }
}

