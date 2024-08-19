package Clase_01.Ejercicio_04;
import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Rectangulo[] rectangulosArray = new Rectangulo[5];
        int numeroRectangulos = 0;
        while (true) {
            try {
                System.out.println("\nMenu:");
                System.out.println("1. Crear rectangulo");
                if (numeroRectangulos != 0) {
                    System.out.println("2. Calcular area y perimetro del rectangulo");
                    System.out.println("3. Numero total de rectangulos creados");
                }
                System.out.println("4. Salir");
                System.out.print("Ingrese una opcion: ");
                
                int optionUser = myScanner.nextInt();
                if ((optionUser == 2 || optionUser == 3) && numeroRectangulos == 0) {
                    System.out.println("Opcion invalida");
                    myScanner.nextLine();
                    continue;
                }
                myScanner.nextLine();
                switch (optionUser) {
                    case 1:
                        if (numeroRectangulos < rectangulosArray.length) {
                            System.out.print("Ingrese el ancho del rectángulo: ");
                            double ancho = myScanner.nextDouble();
                            System.out.print("Ingrese el alto del rectángulo: ");
                            double alto = myScanner.nextDouble();
                            rectangulosArray[numeroRectangulos] = new Rectangulo(ancho, alto);
                            numeroRectangulos++;
                            System.out.println("Rectangulo creado con exito ...");
                        } else {
                            System.out.println("No se pueden crear más rectángulos.");
                        }   
                        break;
                    case 2:
                        if (numeroRectangulos == 1) {
                            rectangulosArray[numeroRectangulos - 1].imprimirArea();
                            rectangulosArray[numeroRectangulos - 1].imprimirPerimetro();
                        } else {
                            System.out.println("Ingrese el indice de la ubicacion del rectangulo del 0 al " + 
                                               (numeroRectangulos - 1) + ": ");
                            int indexRectangulo = myScanner.nextInt();
                            if (indexRectangulo >= 0 && indexRectangulo < Rectangulo.getContadorRectangulos()) {
                                rectangulosArray[indexRectangulo].imprimirArea();
                                rectangulosArray[indexRectangulo].imprimirPerimetro();
                            } else {
                                System.out.println("Índice inválido.");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("El total de rectangulos creados es: " + Rectangulo.getContadorRectangulos());
                        break;
                    case 4:
                        System.out.println("Saliendo del programa ...");
                        myScanner.close();
                        return;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: El valor colocado debe ser un numero.");
                myScanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                myScanner.nextLine();  // Limpiar el buffer del scanner
            }
        }
    }
}
