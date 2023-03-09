import pilas.Edades;

public class Main {
    public static void main(String[] args) {

     Ejercicios ejr1 = new Ejercicios();
   //  ejr1.mostrarMensaje();
   //  ejr1.generarNaturalesFOR();
    // ejr1.generarNumerosParesFOR();
    // ejr1.generarNaturalesporWhile();

    Math_utils math = new Math_utils("GOOAPP","0.1V",2023);
//       math.printApp();
//       math.generarNumerosN(10);
//       math.generarNumerosPares(20);
//       math.getExtensionFromCI("1234567CB");

        Estudiante ejr = new Estudiante("pepito","pupo",25);
//            String nombre = ejr.getFullName();
//            System.out.println("nombre: "+nombre);
//
//            ejr.setFullname("pepito1 ");
//        String nombreCambio = ejr.getFullName();
//        System.out.println("nombre: "+nombreCambio);
//
//        String apellido = ejr.getLastname();
//        System.out.println("apellido: "+ apellido);
//
//        ejr.setLastname("pupo1");
//        String apellidoCambiado = ejr.getLastname();
//        System.out.println("apellido: "+ apellidoCambiado);
//
//        int anios = ejr.getAge();
//        System.out.println("anios: "+anios);
//
//        ejr.setAge(30);
//        int aniosCambiado = ejr.getAge();
//        System.out.println("anios: "+aniosCambiado);
            int [] edades = new int[5];
            edades[0] = 33;
            edades[1] = 20;
            edades[2] = 19;
            edades[3] = 42;
            edades[4] = 25;
        Edades obj1 = new Edades("Unifranz","Estructura de datos",edades);
            obj1.mostrar();
            //determinar la edad mayor
            determinarEdadMayor(obj1);
            //suma de las edades pares
            sumaEdadesPares5(obj1);
            obj1.mostrar();


        }
            public static void determinarEdadMayor(Edades obj1){
                int [] edades = obj1.getEdad();
                int edadMayor = edades[0];
                for (int i = 1; i < edades.length; i++) {
                    if (edades[i] > edadMayor) {
                        edadMayor = edades[i];
                    }
                }
                System.out.println("La edad mayor es: " + edadMayor);
            }
            //A TODAS LAS EDADES SUMAS +5
        public static void sumaEdadesPares5 (Edades obj1) {
            int[] edades = obj1.getEdad();
            for (int i = 0; i < edades.length; i++) {
                if (edades[i] % 2 ==0) {
                    edades[i] = edades[i] + 5;
                }
            }

        }
}




