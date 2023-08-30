import java.util.Scanner;

public class Recorrido_nxn {


    public static void Desc_y_Asc(int Mat[][],int n){
        int i;
        int j;
        int m= 1;


        for(j = n-1 ; j >= 0 ; j--){
            for (i=0 ; i < n; i++){
                Mat[i][j]  = m;
                m = m +1;

            }
            System.out.println();
        }
    }

    public static void Asc_y_Desc(int Mat[][],int n){
        int i;
        int j;
        int m= 1;


        for(j=0;j<=n-1;j++){
            for (i=n-1;i>=0;i--){
                Mat[i][j]  = m;
                m = m +1;

            }
            System.out.println();
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
        int m;
        Scanner entrada = new Scanner(System.in);
        System.out.println("tamaño de la matriz: ");
        n = entrada.nextInt();
        Asc_y_Desc(Mat,n);
        muestra(Mat,n);
        System.out.println("\n");
        Desc_y_Asc(Mat,n);
        muestra(Mat,n);
    }
}
