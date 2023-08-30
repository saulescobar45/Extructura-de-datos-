import java.util.Scanner;

public class Matriz_R {

    public static void Generar_R(int Mat[][],int n){
        int i;
        int j;
        int m=(n-1)/2;

        for (i = 0; i<n ; i++){
            for(j = 0; j<n ; j++){

                if(j == 0 || i == 0 ||(j == n-1 && i <= m)|| i== m ||(i== j && i >= m))
                    Mat [i][j] = 1;
                else
                    Mat[i][j] = 0;
            }
        }

    }

    public static void Generar_S(int Mat[][],int n){
        int i;
        int j;
        int m=(n-1)/2;

        for (i = 0; i<n ; i++){
            for(j = 0; j<n ; j++){

                if(i == n-1 || i == 0 ||(j == 0 && i <= m)|| i== m ||(j==n-1 && i >=m))
                    Mat [i][j] = 1;
                else
                    Mat[i][j] = 0;
            }
        }

    }

    public static void Generar_A(int Mat[][],int n){
        int i;
        int j;
        int m=(n-1)/2;

        for (i = 0; i<n ; i++){
            for(j = 0; j<n ; j++){

                if(j == 0 || i == 0 || j == n-1 || i==m)
                    Mat [i][j] = 1;
                else
                    Mat[i][j] = 0;
            }
        }

    }

    public static void Generar_U(int Mat[][],int n){
        int i;
        int j;
        int m=(n-1)/2;

        for (i = 0; i<n ; i++){
            for(j = 0; j<n ; j++){

                if(j == 0 || i == n-1 || j == n-1)
                    Mat [i][j] = 1;
                else
                    Mat[i][j] = 0;
            }
        }

    }

    public static void Generar_L(int Mat[][],int n){
        int i;
        int j;
        int m=(n-1)/2;

        for (i = 0; i<n ; i++){
            for(j = 0; j<n ; j++){

                if(j== 0 || i== n-1)
                    Mat [i][j] = 1;
                else
                    Mat[i][j] = 0;
            }
        }

    }


    public static void muestra (int Mat[][],int n){
        int i;
        int j;
        for(i =0;i<n;i++){
            for(j = 0 ;j<n;j++){
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
        Generar_R(Mat,n);
        muestra(Mat,n);
        System.out.println("\n");
        Generar_S(Mat,n);
        muestra(Mat,n);
        System.out.println("\n");
        Generar_A(Mat,n);
        muestra(Mat,n);
        System.out.println("\n");
        Generar_U(Mat,n);
        muestra(Mat,n);
        System.out.println("\n");
        Generar_L(Mat,n);
        muestra(Mat,n);

    }
}
