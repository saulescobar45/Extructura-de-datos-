import java.util.Scanner;

public class Espiral {

   public static void Caracol(int Mat[][],int n){
       int i;
       int x=n-1,k=0,e=1;
       int j;

       for(k=0;k<n;k++){

           for(j=0;j<=x;j++){
               Mat[x][j] = e;
               e=e+1;

           }
           for(i=x-1;i>=0;i--){
               Mat[i][x]=e;
               e=e+1;
           }
           x=x-1;
       }


   }
    public static void muestra(int Mat[][], int n) {
        int i;
        int j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(Mat[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int[][] Mat = new int[20][20];
        int n;

        Scanner entrada = new Scanner(System.in);
        n= entrada.nextInt();
        //  System.out.println("tamaño de la matriz: ");
        //  System.out.println("tamaño de la matriz: ");
       // muestra(Mat,n);
        Caracol(Mat,n);
        muestra(Mat,n);
    }
}

  public void insertarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (primero == null) {
            primero = nuevoNodo;
        } else {
            Nodo temp = primero;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
            nuevoNodo.anterior = temp;
        }
    }
    public void eliminarUltimo (){
        if (primero == null) {
            return;
        }

        if (primero.siguiente == null) {
            primero = null;
            return;
        }

        Nodo temp = primero;
        while (temp.siguiente.siguiente != null) {
            temp = temp.siguiente;
        }
        temp.siguiente.anterior = null;
        temp.siguiente = null;
    }
public void elementoK(int dato){
        if (primero == null || primero.siguiente == null) {
            System.out.println("No hay suficientes nodos para insertar en el tercer lugar.");
            return;
        }

        Nodo nuevoNodo = new Nodo(dato);
        Nodo segundoNodo = primero.siguiente;

        primero.siguiente = nuevoNodo;
        nuevoNodo.anterior = primero;
        nuevoNodo.siguiente = segundoNodo;
        segundoNodo.anterior = nuevoNodo;
    }

    public void imprimirLista() {
        Nodo temp = primero;
        while (temp != null) {
            System.out.print(temp.dato + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }
}

   ListasDobles lista = new ListasDobles();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese elementos: ");
        int elemento;
        while ((elemento = scanner.nextInt()) != 0 ) {
            lista.insertarAlFinal(elemento);

        }

        System.out.println("Lista Doble:");
        lista.imprimirLista();

        lista.eliminarUltimo();

        int valorTercerNodo = scanner.nextInt();
        lista.elementoK(valorTercerNodo);

        System.out.println("Lista despues de ingresar k :");
        lista.imprimirLista();

        scanner.close();
    }
}
