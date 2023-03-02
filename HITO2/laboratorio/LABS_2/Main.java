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
            String nombre = ejr.getFullName();
            System.out.println("nombre: "+nombre);

            ejr.setFullname("pepito1 ");
        String nombreCambio = ejr.getFullName();
        System.out.println("nombre: "+nombreCambio);

        String apellido = ejr.getLastname();
        System.out.println("apellido: "+ apellido);

        ejr.setLastname("pupo1");
        String apellidoCambiado = ejr.getLastname();
        System.out.println("apellido: "+ apellidoCambiado);

        int anios = ejr.getAge();
        System.out.println("anios: "+anios);

        ejr.setAge(30);
        int aniosCambiado = ejr.getAge();
        System.out.println("anios: "+aniosCambiado);


        }

    }
