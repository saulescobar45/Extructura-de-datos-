package EV_PROS;

import java.util.Scanner;
import java.util.Stack;

public class EJERCICIO_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pila = new Stack<Integer>();

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
        Stack<Integer> pilaModificada = new Stack<Integer>();
        boolean primerElementoParEliminado = false;

        while (!pila.isEmpty()) {
            int elemento = pila.pop();
            if (!primerElementoParEliminado && elemento % 2 == 0) {
                primerElementoParEliminado = true;
            } else {
                pilaModificada.push(elemento);
            }
        }

        if (primerElementoParEliminado) {
            System.out.println("Pila modificada:");
            while (!pilaModificada.isEmpty()) {
                System.out.println(pilaModificada.pop());
            }
        } else {
            System.out.println("No se encontraron elementos pares en la pila.");
        }
    }
}
