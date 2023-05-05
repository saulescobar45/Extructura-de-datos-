package Clientes;

import Clientes.Cliente;
import Clientes.PilaClientes;


public class MainClientes {
    public static void main(String[] args) {
        Cliente cln1 = new Cliente("Juan","Perez",25,"Av.union","Masculino");
        Cliente cln2 = new Cliente("Saul","Escobar",21,"Av.panoramica","Masculino");
        Cliente cln3 = new Cliente("Mayra","Chino",19,"Senkata","Femenino");
        Cliente cln4 = new Cliente("Gabriela","Ramirez",19,"Santiago","Femenino");
        Cliente cln5= new Cliente("Rodrigo","Flores",18,"Satelite","Masculino");
        // ejercicio 11 crear las clases de pila cliente
        PilaClientes pila = new PilaClientes();
        pila.adicionar(cln1);
        pila.adicionar(cln2);
        pila.adicionar(cln3);
        pila.adicionar(cln4);
        pila.adicionar(cln5);
        pila.mostrar();

       //  ejercicio 12 edad mayor a 20 años:
        mostrarmayorEdad(pila,20);

        // ejercicio 13 mover kaesimo al final de la pila
        kaesimoPosicion(pila,5);
        pila.mostrar();

         //ejercicio 14 cambiamos direccion de la pila "Femenino"
        asignaDireccion(pila,"Calle.Pedro domingo Murillo");
        pila.mostrar();

       //  ejercicio 15 reordenar la pila "femenino y masculino"
        reordenaPila(pila);
        pila.mostrar();

    }
   // ejercicio 12 mostrar mayores a una cierta edad "20"
    public static void mostrarmayorEdad(PilaClientes pila,int edadMayor){
        PilaClientes aux = new PilaClientes();
        Cliente item = null;
        int cont = 0;

        while (!pila.esVacio()){
            item = pila.eliminar();
            if(item.getEdad()>edadMayor){
                cont = cont + 1;
            }
            aux.adicionar(item);
        }
        pila.vaciar(aux);
        System.out.println("La edad mayor del cliente "+ edadMayor + " es de: " +cont);
    }
    //ejercicio 13 mover el kaesimo elemtos al final de la pila
    public static void kaesimoPosicion(PilaClientes pila,int kaesimo){
        PilaClientes aux = new PilaClientes();
        Cliente item = null;
        Cliente minimo = null;

        while (!pila.esVacio()){
            item = pila.eliminar();
            if(pila.nroElem() + 1 == kaesimo){
                minimo = item;
            }
            else {
                aux.adicionar(item);
            }
        }
        pila.vaciar(aux);
        pila.adicionar(minimo);
        System.out.println("\nMostramos nueva posicion de la pila ");
    }
    //ejercicio 14 cambiar direccion de algunos clientes de la pila
    // equals nos permite determina si el objeto especificado es igual que el objeto actual.
    public static void asignaDireccion(PilaClientes pila ,String nuevaDireccion){
        PilaClientes aux = new PilaClientes();
        Cliente item = null;

        while (!pila.esVacio()){
            item = pila.eliminar();
            if(item.getGenero().equals("Femenino")){
                item.setDireccion(nuevaDireccion);
            }
            aux.adicionar(item);
        }
        pila.vaciar(aux);
        System.out.println("\n Mostramos la direccion cambiada");
    }
    // ejercicio 15 over los items de la pila:
    public static void reordenaPila(PilaClientes pila){
        PilaClientes aux1 = new PilaClientes();
        PilaClientes aux2 = new PilaClientes();
        Cliente item = null;
        while (!pila.esVacio()){
            item = pila.eliminar();
            if(item.getGenero().equals("Masculino")){
                aux1.adicionar(item);
            }else {
                aux2.adicionar(item);
            }
        }
        pila.vaciar(aux1);
        pila.vaciar(aux2);
        System.out.println("\n Mostramos la nueva pila de clientes ");
    }

}

