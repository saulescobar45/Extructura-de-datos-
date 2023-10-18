package EV_PROS;

import java.util.Scanner;
import java.util.Stack;

public class EJERCICIO_1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Stack<Integer> pila = new Stack<>();
            int contador = 1;

            System.out.println("Ingrese elementos a la pila:");
            while (true) {
                System.out.print("Elemento " + contador + ": ");
                String entrada = scanner.nextLine().trim();
                if (entrada.equalsIgnoreCase("")) {
                    break;
                }
                try {
                    int elemento = Integer.parseInt(entrada);
                    pila.push(elemento);
                    contador++;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida.Introduzca un número entero.");
                }
            }
            if (pila.size() >= 3) {
                pila.pop();
                pila.pop();

                int tercerElemento = pila.peek();
                System.out.println("El tercer elemento de la pila es: " + tercerElemento);
            } else {
                System.out.println("La pila no tiene suficientes elementos para obtener el tercero.");
            }
        }
}
