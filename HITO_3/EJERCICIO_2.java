package EV_PROS;

import java.util.Scanner;
import java.util.Stack;

public class EJERCICIO_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pila = new Stack<Integer>();
        int k;

        System.out.println("Ingrese elementos:");
        while (true) {
            System.out.print("Elemento: ");
            String entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("")) {
                break;
            }

            try {
                int elemento = Integer.parseInt(entrada);
                pila.push(elemento);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Introduzca un número entero.");
            }
        }

        if (pila.size() >= 2) {
            System.out.print("Ingrese el elemento K a insertar: ");
            k = scanner.nextInt();

            Stack<Integer> pilaAux = new Stack<Integer>();

            int penultimoElemento = 0;
            boolean insertado = false;

            while (!pila.isEmpty()) {
                int elemento = pila.pop();

                if (!insertado && pila.size() == 1) {
                    pilaAux.push(k);
                    pilaAux.push(elemento);
                    insertado = true;
                } else {
                    pilaAux.push(elemento);
                }

                if (pila.size() == 1) {
                    penultimoElemento = elemento;
                }
            }

            if (!insertado) {
                pilaAux.push(k);
                pilaAux.push(penultimoElemento);
            }

            System.out.println("Pila modificada:");
            while (!pilaAux.isEmpty()) {
                System.out.println(pilaAux.pop());
            }
        } else {
            System.out.println("La pila no tiene suficientes elementos para K.");
        }
    }
}
