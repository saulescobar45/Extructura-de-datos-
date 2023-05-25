package Colas;
import Colas.Cola_de_numeros;
public class ColaMain {
    public static void main(String[] args) {
        Cola_de_numeros cola1 = new Cola_de_numeros();
        cola1.adicionar(7);
        cola1.adicionar(4);
        cola1.adicionar(7);
        cola1.adicionar(8);
        cola1.adicionar(6);
        cola1.adicionar(8);
        cola1.adicionar(100);

       // cola.mostrar();
      //  determinaMutiplosdeTres(cola1,3);
        eliminarElemtosRepitidos(cola1);
       // System.out.println(verificaSiExisteUnoMas(cola1,8));
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
    // eliminar datos repitidos

    public static void eliminarElemtosRepitidos(Cola_de_numeros cola){
        int numrElemntos = cola.nroElementos();
        int item ;

            for (int i = 1; i < numrElemntos; i++) {
                item = cola.Eliminar();
                if (verificaSiExisteUnoMas(cola, item)== false) {
                    cola.adicionar(item);
//               System.out.println("num: "+ item);
                }
            }

        cola.mostrar();
//        System.out.println("ini = "+cola.getIni());
//        System.out.println("fini = "+cola.getFin());
    }
    public static boolean verificaSiExisteUnoMas(Cola_de_numeros cola,int num){
        int cont = 0 ;
        int item = 0 ;
        int numElemento = cola.nroElementos();

        for (int i=1; i<=numElemento; i++){
            item = cola.Eliminar();
            if (item == num){
                cont = cont + 1;
            }else{
                cola.adicionar(item);
            }
        }
        if (cont>0){
            return true;
        }else{
            return false;
        }
    }

}

