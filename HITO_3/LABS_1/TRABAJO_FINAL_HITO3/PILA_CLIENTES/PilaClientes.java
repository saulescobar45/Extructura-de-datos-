package Clientes;

public class PilaClientes {
    private int max;
    private int tope;
    private Cliente[] cliente;

    public PilaClientes() {
        this.max = 10;
        this.tope = 0;
        this.cliente = new Cliente[max + 1];
    }
    public boolean esVacio(){
        if (tope == 0){
            return  true;
        }
        else {
            return  false;
        }
    }

    public boolean esLlena(){
        if (tope == max){
            return true;
        }
        else {
            return false;
        }
    }
    public int nroElem(){
        return tope;
    }

    public void adicionar(Cliente nuevoCliente){
        if(esLlena()== true){
            System.out.println("Pila de clientes esta llena ");
        }
        else{
            tope = tope + 1;
            cliente[tope] = nuevoCliente;
        }
    }
    public Cliente eliminar(){
        Cliente ClienteEliminado = null;
        if (esLlena()== true){
            System.out.println("Pila vacia");
        }
        else{
            ClienteEliminado = cliente[this.tope];
        }
        tope = tope - 1;
        return ClienteEliminado;
    }

    public void vaciar (PilaClientes pila){
        while (!pila.esVacio()){
            adicionar(pila.eliminar());
        }
    }

    public void mostrar(){

        Cliente elem = null;
        if(this.esVacio()){
            System.out.println("No hay elemtos que mostrar");
        }
        else{
            System.out.println("\n mostrando la pila de elemntos");
            PilaClientes aux = new PilaClientes();
            while (!esVacio()){
                elem = this.eliminar();
                elem.mostrarCliente();
                aux.adicionar(elem);
            }
            vaciar(aux);
        }
    }
}
