public class Ejercicios {
   private  int i;
   private  int limite;
   public Ejercicios() {
       this.i = 1;
       this.limite = 10;
   }
       public void mostrarMensaje(){
           System.out.println("hola mundo desde java");

   }
   public void generarNaturalesFOR(){
       for (int i = 1; i <= 10; i++) {
           System.out.println(i);
       }

   }
    public void generarNumerosParesFOR(){
        for (int i = 1; i <= 10; i++) {
          if(i%2 ==0){
              System.out.println(i);
          }
        }

    }
    public void generarNaturalesporWhile(){
        int i = 1;
        int n = 5; // cantidad de numeros a imprimir
        while (n > 0) {
            System.out.println(i);
            i++;
            n--;
        }

    }

}
