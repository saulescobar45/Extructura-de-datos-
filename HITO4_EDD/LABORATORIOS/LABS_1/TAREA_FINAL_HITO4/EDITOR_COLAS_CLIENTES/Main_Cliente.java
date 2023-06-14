package Cliente_hito4;

public class Main_Cliente {
    public static void main(String[] args) {
        // clientes A
        Cliente cliente1 = new Cliente("Mauro", "Conde", 20, "Argentina", "masculino", "Gold");
        Cliente cliente2 = new Cliente("Saul", "Escobar", 20, "Bolivia", "masculino", "Gold");
        Cliente cliente3 = new Cliente("Mayra", "Chino", 21, "Colombia", "femenino", "Platinium");
        Cliente cliente4 = new Cliente("Samuel", "Choque", 43, "Bolivia", "masculino", "Gold");
        Cliente cliente5 = new Cliente("Graciela", "Serrano", 38, "Peru", "femenino", "Silver");

        // clientes B
        Cliente cliente6 = new Cliente("Franz", "Zeballos", 25, "Bolivia", "masculino", "Gold");
        Cliente cliente7 = new Cliente("Cecilia", "Llave", 75, "Bolivia", "femenino", "Gold");
        Cliente cliente8 = new Cliente("Juan", "Escobar", 84, "Bolivia", "masculino", "Gold");
        Cliente cliente9 = new Cliente("Dionicio", "Serrano", 55, "Peru", "masculino", "Platinium");
        Cliente cliente10 = new Cliente("Senovia", "Baltazar", 50,"Ecuador","femenino","Silver");


        Cola_de_Cliente colA = new Cola_de_Cliente();
        colA.adicionar(cliente1);
        colA.adicionar(cliente2);
        colA.adicionar(cliente3);
        colA.adicionar(cliente4);
        colA.adicionar(cliente5);

        Cola_de_Cliente colB = new Cola_de_Cliente();
        colB.adicionar(cliente6);
        colB.adicionar(cliente7);
        colB.adicionar(cliente8);
        colB.adicionar(cliente9);
        colB.adicionar(cliente10);

         //mostrando datos de clientes A
//        colA.mostrar();
//        // mostrando datos de clientes B
//        colB.mostrar();

//        convirtidendo_de_Golden_a_Vip(colB,"Gold","Bolivia");
//        colB.mostrar();
//        ordenarmos_Por_Edad_Mayores(colB,60);
//        colB.mostrar();
          moviendo_Cliente_sentrados_de_la_Colas(colA,"Saul",colB);
          colA.mostrar();
          colB.mostrar();

    }
    // Promoción para usuarios de Bolivia
    public static void convirtidendo_de_Golden_a_Vip(Cola_de_Cliente cola, String tipoCLiente, String nacionalidad){

        Cola_de_Cliente aux = new Cola_de_Cliente();
        Cliente item = null;
        while(!cola.esVacia()){

            item = cola.eliminar();
            if(item.getTipo().equals(tipoCLiente) && item.getPais().equals(nacionalidad)){
                item.setTipo("VIP");
            }

            aux.adicionar(item);
        }

        cola.vaciar(aux);
    }
    // Moviendo clientes en la cola.
    public static void ordenarmos_Por_Edad_Mayores(Cola_de_Cliente cola,int edad){
        Cola_de_Cliente aux1 = new Cola_de_Cliente();
        Cola_de_Cliente aux2 = new Cola_de_Cliente();
        Cliente item = null;
        while(!cola.esVacia()) {

            item = cola.eliminar();

            if (item.getEdad() > edad) {
                aux1.adicionar(item);
            }
            else{
                aux2.adicionar(item);

            }
        }
        cola.vaciar(aux1);
        cola.vaciar(aux2);
    }
    // .Moviendo clientes entre 2 colas.
    public static void moviendo_Cliente_sentrados_de_la_Colas(Cola_de_Cliente colaA, String nombre, Cola_de_Cliente colaB){

        Cola_de_Cliente aux = new Cola_de_Cliente();
        Cola_de_Cliente aux1 = new Cola_de_Cliente();
        Cliente item = null;
        while(!colaA.esVacia()) {

            item = colaA.eliminar();

            if (item.getNombre().equals(nombre)) {
                aux1.adicionar(item);
            }
            else{
                aux.adicionar(item);

            }
        }
        colaA.vaciar(aux);
        aux.vaciar(colaB);

        colaB.vaciar(aux1);// los nombres con Saul que estan aLmanacenados se bayan a vaciar  en la cola B

        colaB.vaciar(aux);//Que todos registros anteriroes se registrarn en un orden especifico

    }


}


