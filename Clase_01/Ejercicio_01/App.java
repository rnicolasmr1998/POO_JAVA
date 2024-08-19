package Clase_01.Ejercicio_01;

public class App {
    public static void main(String[] args) {
        // Creamos una variable del tipo persona, instanciando un objeto
        Persona personFirst = new Persona();

        // Colocamos los atributos del objeto previamente instanciado
        personFirst.edad = 26;
        personFirst.nombre = "Nicolas";

        // Ejecutamos el metodo
        personFirst.imprimirDatos();

        // Creamos un nuevo objeto
        Persona personSecond = new Persona();
        
        // Colocamos los atributos del nuevo objeto instanciado
        personSecond.edad = 27;
        personSecond.nombre = "Piero";

        // Ejecutamos el metodo
        personSecond.imprimirDatos();
    }
}
