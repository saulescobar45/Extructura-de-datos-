import Pilas.Departamento;
import Pilas.Provincia;
import Pilas.Pais;

public class Main {
    public static void main(String[] args) {

//        Provincia pr = new Provincia("INQUISIVI");
//        pr.mostrarProvincia();
//
        String[] Departamento = new String[2];
        Departamento[0] = " Cochabamba";
        Departamento[1] = " La Paz";

        Departamento  dp = new Departamento("Dep",Departamento);
        //dp.mostrarDepartamento();
        dp.mostrarProvincia1();
        dp.agregarNuevaProvincia("Sud Yungas");
        dp.mostrarProvincia1();

        }
    public static void agregarNuevaProvincia (String Provincia){
        String[] provinciaOrig = dp.getProvincia();
        String[] nuevoNombre = new String[provinciaOrig.length + 1];

        for(int i = 0 ; i < provinciaOrig.length;i++){
            nuevoNombre[i] = provinciaOrig[i];
        }
        nuevoNombre[provinciaOrig.length] = NuevaProvincia;
        dp.setProvincia(nuevoNombre);
    }

    }




