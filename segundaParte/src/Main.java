public class Main {
    public static void main(String[] args) {
        Coche miCoche;
        miCoche = new Coche(4);
        int numPuertas = miCoche.incrementarPuertas();
        System.out.println("El número de puertas es: " + numPuertas);
    }
}