package Pilashito3;

public class MainPilaNumeros {
    public static void main(String[] args) {
        PilasNumeros pil1 = new PilasNumeros();
        pil1.adicionar(10);
        pil1.adicionar(2);
        pil1.adicionar(5);
        pil1.adicionar(23);
        pil1.adicionar(5);
        pil1.mostrar();


        muestraNumeroMaximo(pil1);
        pil1.mostrar();

        mostrarNumerosIguales(pil1, 5);
        pil1.mostrar();


    }

    public static void muestraNumeroMaximo(PilasNumeros pila) {
        PilasNumeros aux = new PilasNumeros();
        int num = 0;
        int max = 0;
        while (!pila.esVacio()) {
            num = pila.eliminar();
            if (num > max) {
                max = num;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);
        System.out.println("Mayor: " + max);

        // deterinar cuantos numeros 5 hay en la pila
        // crear un metodo estatico similar al anterior
        // recibe dos parametros  la pila el numero a buscar de la pila

    }

    public static void mostrarNumerosIguales(PilasNumeros pila,int numBuscar) {
            PilasNumeros aux = new PilasNumeros();
            int contador = 0;
            int numElim = 0;
            while(!pila.esVacio()){
                numElim = pila.eliminar();
                if(numElim == numBuscar){
                    contador = contador + 1;
                }
                aux.adicionar(numElim);
            }
            pila.vaciar(aux);
            System.out.print("El numero: " + numBuscar + "se repite" + contador + " veces");
    }

}

