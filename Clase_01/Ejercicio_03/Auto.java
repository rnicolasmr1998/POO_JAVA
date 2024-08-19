package Clase_01.Ejercicio_03;

public class Auto {
    // Declaramos los atributos de la clase
    String marca;
    String modelo;
    int anio;

    // Creamos los constructores
    // 1. Constructor que inicialice marca, modelo y anio
    public Auto(String marca, String modelo, int anio) {
        this.marca = (marca != null && !marca.isEmpty()) ? marca.toUpperCase() : "Desconocida";
        this.modelo = (modelo != null && !modelo.isEmpty()) ? modelo.toUpperCase() : "Desconocido";
        this.anio = (anio > 0) ? anio : 2000;
    }

    // 2. Constructor que inicialice marca y modelo, anio por defecto
    public Auto(String marca, String modelo) {
        this(marca, modelo, 2000);
    }

    // 3. Constructor que inicialice solamente la marca, anio y modelo por defecto
    public Auto(String marca) {
        this(marca, "Desconocido", 2000);
    }

    // 4. Constructor vacío
    public Auto() {
        this("Desconocida", "Desconocido", 2000);
    }

    // Metodo para imprimir datos
    public void imprimirAtributos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Anio: " + anio);
    }
}
