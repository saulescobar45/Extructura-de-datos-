package EV_PROS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EJERCICIO_COLAS_5 {
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

        System.out.print("Ingrese el elemento K a duplicar: ");
        int k = scanner.nextInt();

        Queue<Integer> colaModificada = new LinkedList<>();

        boolean encontrado = false; // Variable para verificar si se encontró el elemento K

        for (int elemento : cola) {
            if (elemento == k) {
                colaModificada.add(elemento * 2);
                encontrado = true; // Se encontró el elemento K
            } else {
                colaModificada.add(elemento);
            }
        }
        if (encontrado) {
            System.out.println("Cola modificada:");
            for (int elemento : colaModificada) {
                System.out.println(elemento);
            }
        } else {
            System.out.println("No se encontró el elemento K en la cola.");
        }
    }
}
