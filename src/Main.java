import net.salesianos.lacuesta.diccionario.Diccionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Diccionario diccionario = new Diccionario();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        String palabra;
        String letra;
        while (!salir) {
            System.out.println("Menú:");
            System.out.println("1.Añadir palabra");
            System.out.println("2.Eliminar palabra");
            System.out.println("3.Existe palabra.");
            System.out.println("4.Mostrar iniciales disponibles");
            System.out.println("5.Ver palabras por inicial");
            System.out.println("6.Cerrar programa");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Dime la palabra que quieres añadir");
                    palabra = scanner.nextLine();
                    diccionario.aniadirPalabra(palabra);
                    break;

                case 2:
                    System.out.println("Dime la palabra que quieres borrar");
                    palabra = scanner.nextLine();
                    diccionario.eliminarPalabra(palabra);
                    break;

                case 3:
                    System.out.println("Dime la palabra que quieres encontrar");
                    palabra = scanner.nextLine();
                    if (diccionario.existePalabra(palabra)) {
                        System.out.println("Palabra encontrada");
                    } else {
                        System.out.println("Palabra no encontrada");
                    }
                    break;

                case 4:
                    diccionario.mostrarInicialesDisponibles();
                    break;

                case 5:
                    System.out.println("Dime la inicial");
                    letra = scanner.nextLine();
                    diccionario.mostrarPalabrasPorInicial(letra.charAt(0));
                    break;

                case 6:
                    System.out.println("Adiós...");
                    salir = true;
                    break;
            }

        }
    }
}