package Pilas;

public class MainNombres {

    public static void main(String[] args) {
        String[] nombresEDD = new String[5];
        nombresEDD[0] = "Ana";
        nombresEDD[1] = "Juan";
        nombresEDD[2] = "Pepito";
        nombresEDD[3] = "Carla";
        nombresEDD[4] = "Freddy";

        Nombres edd = new Nombres("Edd", nombresEDD);

        //Crear un metodo estatico que determine cuantas personas
        //del paralelo EDD tienen el nombre Pepito
        //int c = cuentaNombres(edd, "Pepito");
        //System.out.println("Pepito se repite: " + c);
       // edd.mostrarnombres();
        //agregaNombrePrincipio(edd, "Delia");
        //edd.mostrarnombres();
        edd.mostrarnombres();
        agregarNombreFinal(edd,"Carlitos");
        edd.mostrarnombres();
    }
    public static void agregarNombreFinal(Nombres edd,String nombreAgregar){
        String[] nombresOrig = edd.getNombres();
        String[] nuevoNombre = new String[nombresOrig.length + 1];

        for(int i = 0 ; i < nombresOrig.length;i++){
            nuevoNombre[i] = nombresOrig[i];
        }
        nuevoNombre[nombresOrig.length] = nombreAgregar;
        edd.setNombres(nuevoNombre);
    }
    public static void agregaNombrePrincipio(Nombres edd, String nombreAgregar) {
        String[] nombreOri = edd.getNombres();
        String[] nuevosNombres = new String[nombreOri.length + 1];
        nuevosNombres[0] = nombreAgregar;
        for (int i = 0; i < nombreOri.length; i++) {
            nuevosNombres[i + 1] = nombreOri[i];
        }
        edd.setNombres(nuevosNombres);
    }
        public static int cuentaNombres (Nombres edd, String nombreBuscar)
        {
            String[] nombres = edd.getNombres();
            int i = 0;
            int contador = 0;

            for (i = 0; i < nombres.length; i++) {
                if (nombres[i] == nombreBuscar) {
                    contador = contador + 1;
                }
            }

            return contador;
        }
    }








