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
