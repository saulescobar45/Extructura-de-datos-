package Colas;
import Colas.Cola_de_numeros;
public class ColaMain {
    public static void main(String[] args) {
        Cola_de_numeros cola1 = new Cola_de_numeros();
        cola1.adicionar(4);
        cola1.adicionar(6);
        cola1.adicionar(8);
        cola1.adicionar(3);
        cola1.adicionar(8);
        cola1.adicionar(100);

       // cola.mostrar();
        determinaMutiplosdeTres(cola1,3);
    }
    public static void determinaMutiplosdeTres(Cola_de_numeros cola,int multiplo3){
        Cola_de_numeros aux = new Cola_de_numeros();
        int  cont = 0 ;
        int item = 0;

        while (!cola.esVacia()){
            item = cola.Eliminar();
            if(item % multiplo3 == 0){
                cont = cont + 1;
            }
            aux.adicionar(item);
        }
        cola.vaciar(aux);
        System.out.println("multiplo3= " + cont);
    }
}
