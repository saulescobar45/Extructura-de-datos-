package Cliente_hito4;

public class Cola_de_Cliente {
    private int max;
    private int ini, fin;
    private Cliente clientes[];

    public Cola_de_Cliente() {
        ini = fin = 0;
        max = 100;
        clientes = new Cliente[max+1];
    }

    public boolean esVacia() {
        if (ini == 0 && fin == 0)
            return true;
        return false;
    }

    public boolean esLlena() {
        if (fin == max)
            return true;
        return false;
    }

    public int nroElementos()
    {
        return (fin - ini);
    }

    public int getIni() {

        return ini;
    }

    public int getFin() {

        return fin;
    }

    public void adicionar(Cliente nuevo_cliente) {
        if (!esLlena()) {
            fin++;
            clientes[fin] = nuevo_cliente;
        } else
            System.out.println("Cola CLientes llena");
    }

    public Cliente eliminar() {
        Cliente elem = null;
        if (!esVacia()) {
            ini++;
            elem = clientes[ini];
            if (ini == fin) {
                ini = fin = 0;
            }
        } else {
            System.out.println("Cola de cliente es vacia");
        }

        return (elem);
    }

    public void vaciar(Cola_de_Cliente cola) {
        while (!cola.esVacia()) {
            adicionar(cola.eliminar());
        }
    }

    public void mostrar() {
        Cliente elem;

        if (esVacia())
            System.out.println("No hay Clientes");
        else {
            System.out.println(" CLIENTES ");
            System.out.println(" ");

            Cola_de_Cliente aux = new Cola_de_Cliente();
            while (!esVacia()) {
                elem = eliminar();
                aux.adicionar(elem);
                elem.muestraCliente();
                System.out.println(" ");
            }

            vaciar(aux);
        }
    }


}
