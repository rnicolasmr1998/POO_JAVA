package Clase_01.Ejercicio_04;

    public class Rectangulo {
        // Definimos los atributos para la clase: ancho, alto y contadorRectangulos
        // El atributo contadorRectangulos es entero y estatico
        double ancho;
        double alto;
        static int contadorRectangulos = 0;

        // Diseñamos el constructor
        public Rectangulo(double ancho, double alto) {
            if (ancho <= 0 || alto <= 0) {
                throw new IllegalArgumentException("Ancho y alto deben ser mayores que 0.");
            }
            this.ancho = ancho;
            this.alto = alto;
            contadorRectangulos++;
        }

        // Creamos el metodo area
        public double area(){
            return ancho * alto;
        }

        // Creamos el metodo perimetro
        public double perimetro(){
            return (ancho + alto) * 2;
        }

        // Creamos el metodo de imprimir area
        public void imprimirArea(){
            System.out.println("El area del rectangulo es: " + this.area());
        }

        // Creamos el metodo de imprimir perimetro
        public void imprimirPerimetro(){
            System.out.println("El perimetro del rectangulo es: " + this.perimetro());
        }

        // Creamos el metodo contador de rectangulos
        public static int getContadorRectangulos(){
            return contadorRectangulos;
        }
    }
