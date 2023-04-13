package Pilashito3;

public class Pila_de_Cadenas {
    private int max;
    private int tope;
    private String[] cadenas;

    public Pila_de_Cadenas(int max){
        this.max = max;
        this.tope = 0;
        this.cadenas = new String[max+1];

    }
    public boolean esVacio(){
        if (tope==0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean esllena(){
        if (tope==max){
            return true;
        }
        else{
            return false;
        }

    }
    public int nroElem(){
        return tope;
    }

    public void adicionar(String nuevoNombre){

        if(esllena() == true){
            System.out.println("Pila llena");

        }
        else{
            tope= tope+1;
            cadenas[tope] = nuevoNombre;
        }
    }
    public String eliminar(){
        String itemEliminado = " ";

        if(!esVacio() == true){
            System.out.println("Pila Vacia");
        }
        else{
            itemEliminado = cadenas[tope];
        }

        tope = tope-1;

        return itemEliminado;
    }

    public void llenar(){




    }
    public void vaciar(Pila_de_Cadenas pila){

        while (pila.esVacio()==false){ // o podemos usar !pila.esVacio

            adicionar(pila.eliminar());
        }

    }
    public void mostrar(){

        String item="";
        if(esVacio()==true){
            System.out.println("No hay items a mostrar");
        }
        else {
            System.out.println("mostrando la Pila de elementos");
            Pila_de_Cadenas aux = new Pila_de_Cadenas(max);
            while(esVacio()==false){
                item = eliminar();
                System.out.println("NOMBRE = "+ item);
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }
}

