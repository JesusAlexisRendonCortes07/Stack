package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la capacidad de la pila: ");
        int capacidad = scanner.nextInt();
        Stack<Libro> pila = new Stack<>();

        int opcion;
        do {
            System.out.println("\nOperaciones:");
            System.out.println("1. Apilar (push)");
            System.out.println("2. Desapilar (pop)");
            System.out.println("3. Ver cima (peek)");
            System.out.println("4. Mostrar pila");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if (pila.size() < capacidad) {
                        scanner.nextLine();
                        System.out.print("Ingrese el título del libro: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Ingrese el autor del libro: ");
                        String autor = scanner.nextLine();
                        System.out.print("Ingrese el ISBN del libro: ");
                        String isbn = scanner.nextLine();
                        Libro libro = new Libro(titulo, autor, isbn);
                        pila.push(libro);
                        System.out.println("Libro \"" + titulo + "\" apilado.");
                    } else {
                        System.out.println("Error: La pila está llena.");
                    }
                    break;
                case 2:
                    if (!pila.isEmpty()) {
                        Libro libro = pila.pop();
                        System.out.println("Libro \"" + libro.getTitulo() + "\" desapilado.");
                    } else {
                        System.out.println("Error: La pila está vacía.");
                    }
                    break;
                case 3:
                    if (!pila.isEmpty()) {
                        Libro libro = pila.peek();
                        System.out.println("Libro en la cima: \"" + libro.getTitulo() + "\"");
                    } else {
                        System.out.println("Error: La pila está vacía.");
                    }
                    break;
                case 4:
                    if (!pila.isEmpty()) {
                        System.out.println("Contenido de la pila:");
                        for (Libro libro : pila) {
                            System.out.println(libro);
                        }
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}

