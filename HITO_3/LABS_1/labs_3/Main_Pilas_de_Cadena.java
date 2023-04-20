package Pilashito3;

public class Main_Pilas_de_Cadena {
    public static void main(String[] args) {
        Pila_de_Cadenas piCad = new Pila_de_Cadenas();
        piCad.adicionar("William");
        piCad.adicionar("Andres");
        piCad.adicionar("Josias");
        piCad.adicionar("Iris");
        piCad.adicionar("Jhonatan");
        piCad.adicionar("Ilia");

//          piCad.mostrar();
//          piCad.llenar(12);
//
//            cuentaAndres(piCad,"Saul");
//            piCad.mostrar();
//
//            agregarNombre(piCad,"Josias","Ana");
//            piCad.mostrar();
//              intercambiarPociciones(piCad);
//              piCad.mostrar();
            moverElmentos(piCad,2);
            piCad.mostrar();

    }

    public static void cuentaAndres(Pila_de_Cadenas pila, String nombre) {
        Pila_de_Cadenas aux = new Pila_de_Cadenas();
        int cont = 0;
        String itemEliminado = " ";
        while (!pila.esVacio()) {
            itemEliminado = pila.eliminar();
            if (itemEliminado.equals(nombre)) {
                cont = cont + 1;
            }
            aux.adicionar(itemEliminado);
        }
        pila.vaciar(aux);
        System.out.println("El nombre:" + nombre + " se repite: " + cont + " veces");

    }

    public static void agregarNombre(Pila_de_Cadenas pila, String nombre, String nuevoNombre) {
        Pila_de_Cadenas aux = new Pila_de_Cadenas();
        String itemEliminado = " ";
        while (!pila.esVacio()) {
            itemEliminado = pila.eliminar();
            if (itemEliminado.equals(nombre)) {
                aux.adicionar(nuevoNombre);
            }
        }
        aux.adicionar(itemEliminado);
    }

    public static void intercambiarPociciones(Pila_de_Cadenas pila) {
            Pila_de_Cadenas aux = new Pila_de_Cadenas();
            String item1 = pila.eliminar(); // ilia
            aux.vaciar(pila);
            String item2 = pila.eliminar();  // William
            pila.adicionar(item1);
            pila.vaciar(aux);
            pila.adicionar(item2);
    }
    public static void moverElmentos(Pila_de_Cadenas pila,int kaesimo){
        Pila_de_Cadenas aux = new Pila_de_Cadenas();
         String nombreKaesimo = "";
         String itemEliminado = "";

         while (!pila.esVacio()){
             itemEliminado = pila.eliminar();
             if(pila.nroElem()==kaesimo){
                nombreKaesimo = itemEliminado;
             }
             else {
                 aux.adicionar(itemEliminado);
             }
         }
         pila.vaciar(aux);
         pila.adicionar(nombreKaesimo);
    }

}



