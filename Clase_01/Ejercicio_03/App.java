package Clase_01.Ejercicio_03;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Auto auto = null;

        while (true) {
            try {
                System.out.println("\nMenu:");
            System.out.println("1. Crear Auto con todos los atributos");
            System.out.println("2. Crear Auto con marca y modelo");
            System.out.println("3. Crear Auto con valores por defecto");
            System.out.println("4. Imprimir atributos del Auto");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la marca del Auto: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese el modelo del Auto: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ingrese el año del Auto: ");
                    Integer anio = scanner.nextInt();
                    scanner.nextLine();  // Consumir la nueva línea
                    auto = new Auto(marca, modelo, anio);
                    System.out.println("Auto creado con éxito.");
                    break;

                case 2:
                    System.out.print("Ingrese la marca del Auto: ");
                    marca = scanner.nextLine();
                    System.out.print("Ingrese el modelo del Auto: ");
                    modelo = scanner.nextLine();
                    auto = new Auto(marca, modelo);
                    System.out.println("Auto creado con marca y modelo.");
                    break;

                case 3:
                    auto = new Auto();
                    System.out.println("Auto creado con valores por defecto.");
                    break;

                case 4:
                    if (auto != null) {
                        auto.imprimirAtributos();
                    } else {
                        System.out.println("No se ha creado ningún Auto.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }    
        }
    }
}
