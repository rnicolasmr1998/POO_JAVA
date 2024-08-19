package Clase_01.Ejercicio_02;

public class App {
    public static void main(String[] args) {
        // Crear objetos para probar los constructores
        Auto carOne = new Auto();
        Auto carTwo = new Auto("Toyota", "corolla cross hybrid", 2023);
        Auto carThree = new Auto("Mazda", "MX-5");
        Auto carFour = new Auto("Hyundai");

        // Mostrar los atributos de los autos creados
        System.out.println("**** DATOS DEL PRIMER AUTO ****");
        carOne.imprimirDatos();
        System.out.println("**** DATOS DEL SEGUNDO AUTO ****");
        carTwo.imprimirDatos();
        System.out.println("**** DATOS DEL TERCER AUTO ****");
        carThree.imprimirDatos();
        System.out.println("**** DATOS DEL CUARTO AUTO ****");
        carFour.imprimirDatos();
    }
}
