package EV_PROS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EJERCICIO_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> cola = new LinkedList<>();

        System.out.println("Ingrese elementos:");
        while (true) {
            System.out.print("Elemento: ");
            String entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("")) {
                break;
            }

            try {
                int elemento = Integer.parseInt(entrada);
                cola.add(elemento);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Introduzca un número entero.");
            }
        }

        int suma = 0;

        while (!cola.isEmpty()) {
            int elemento = cola.poll();

            if (elemento % 2 != 0 && elemento % 3 == 0) {
                suma += elemento;
            }
        }
        System.out.println("Suma de elementos impares divisibles entre 3: " + suma);
    }
}
