package Pilashito3;

public class PilasNumeros {
    private int max;  // es el maximo numero que soportara

    private int[] numeros;

    private int tope; // es la cantidad de las pilas

    public PilasNumeros() {
        this.max = 10;
        this.tope = 0;
        this.numeros = new int[this.max + 1];

    }

    // para verificar si esta vacio////
    public boolean esVacio() {
        if (this.tope == 0) {
            return true;

        } else {
            return false;
        }
    }

    // para verificar si esta llena
    public boolean esLlena() {
        if (this.tope == max) {
            return true;
        } else {
            return false;
        }
    }

    // retorna el numero de elemtento
    public int nroElemtentos() {
        return tope;
    }
    ///// adicionar una valor a la pila////////////
    public void adicionar(int nuevoNumero) {
        if (esLlena()) {
            System.out.println("pila Llema");
        } else {
            tope = tope + 1;
            numeros[tope] = nuevoNumero;
        }
    }

    // eliminacion de un dato de una pila /////////////////////////
    public int eliminar() {
        int itemEliminado = 0;
        if (esVacio()) {
            System.out.println("pila Vacia");
        } else {
            itemEliminado = numeros[tope];
            tope = tope - 1;
        }
        return itemEliminado;
    }
    /////////////////////// vacir el dato de la pila/////////////////////
    public void vaciar(PilasNumeros pila) {
        while (!pila.esVacio()) {
            adicionar(pila.eliminar());
        }


    }

    public void mostrar() {
        int item = 0;
        if (esVacio() == true) {
            System.out.println("No tiene items que mostrar");
        } else {
            System.out.println("Mostrar la pila Numeros");
            PilasNumeros aux = new PilasNumeros();
            while (esVacio() == false) {
                item = eliminar();
                System.out.print( item + " , ");
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }


}

