package Clase_01.Ejercicio_02;

public class Auto {
    // Declaramos los atributos de la clase
    String marca;
    String modelo;
    Integer anio;

    // Creamos los constructores
    // 1. Constructor que inicialice marca, modelo y año
    public Auto(String marca, String modelo, Integer anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // 2. Constructor que inicialice marca y modelo
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // 3. Constructor que inicialice solamente la marca
    public Auto(String marca) {
        this.marca = marca;
    }

    // 4. Constructor sin parametros
    public Auto() {
    }

    // Metodo para imprimir datos
    public void imprimirDatos() {
        if (this.marca == null && this.modelo == null && this.anio == null) {
            System.out.println("Este OBJETO fue creado con constructor vacío.");
            System.out.println("No hay datos para mostrar");        
            System.out.println("------------------------------");
        } else {
            if (this.marca != null) {
                System.out.println("Marca: " + this.marca.toUpperCase());
            } else {
                System.out.println("Marca: No especificada");
            }
            if (this.modelo != null) {
                System.out.println("Modelo: " + this.modelo.toUpperCase());
            } else {
                System.out.println("Modelo: No especificado");
            }
            if (this.anio != null) {
                System.out.println("Año: " + this.anio);
            } else {
                System.out.println("Año: No especificado");
            }
            System.out.println("------------------------------");
        }
    }
}
