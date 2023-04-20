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


//        muestraNumeroMaximo(pil1);
//        pil1.mostrar();
//
//        muestraNumeroMinimo(pil1);
//        pil1.mostrar();
//
//        mostrarNumerosIguales(pil1, 5);
//        pil1.mostrar();


//        intercambiar_mayor_por_menor(pil1);
//        pil1.mostrar();
//
//        mostrarPar_e_Impar(pil1);
//        pil1.mostrar();

        agregar_Un_nuevo_numero(pil1, 100 );
        pil1.mostrar();



    }

    public static int muestraNumeroMinimo(PilasNumeros pila) {
        PilasNumeros aux = new PilasNumeros();
        int num = 0;
        int menor = Integer.MAX_VALUE;
        while (!pila.esVacio()) {
            num = pila.eliminar();
            if (num < menor) {
                menor = num;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);
        System.out.println("Menor: " + menor);
        return menor;
    }

    public static int muestraNumeroMaximo(PilasNumeros pila) {
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
        return max;
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

    public static void intercambiar_mayor_por_menor(PilasNumeros pila) {
        int max = muestraNumeroMaximo(pila);
        int min = muestraNumeroMinimo(pila);
        int item = 0;
        PilasNumeros aux = new PilasNumeros();

        while (!pila.esVacio()) {
            item = pila.eliminar();

            if (item == max) {
                item = min;

            } else {
                if (item == min) {
                    item = max;
                }
            }
            aux.adicionar(item);

        }
        pila.vaciar(aux);
    }
        PilasNumeros aux = new PilasNumeros();

//        while (!pila.esVacio()) {
//            item = pila.eliminar();
//
//            if (item == max) {
//                item = min;
//
//            } else {
//                if (item == min) {
//                    item = max;
//                }
//            }
//            aux.adicionar(item);
//
//        }
//        pila.vaciar(aux);
//    }

    public static void mostrarPar_e_Impar(PilasNumeros pila) {
        int item = 0;
        int cimpar=0;
        int cpar=0;

        PilasNumeros aux = new PilasNumeros();
        while(!pila.esVacio())
        {
            item = pila.eliminar();

            if(item % 2 == 0)
            {
                cpar++;
            }
            else
            {
                if(item % 2 != 0)
                {
                    cimpar++;
                }
            }
            aux.adicionar(item);
        }
        pila.vaciar(aux);

        System.out.println("Cantidad de pares"+cimpar);
        System.out.println("Cantidad de impares"+cpar);
    }

    public static void agregar_Un_nuevo_numero(PilasNumeros pila,int item){

        PilasNumeros aux = new PilasNumeros();
        aux.vaciar(pila);
        aux.adicionar(item);
        pila.vaciar(aux);

    }
}




