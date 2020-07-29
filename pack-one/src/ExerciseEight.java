import java.util.Scanner;

public class ExerciseEight {

    public static void main(String[] args) {

        double tiempo, distanciaKilometro;
        final double velocidad = 50;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese la distancia de kilometros recorridos: ");
        distanciaKilometro = keyboard.nextDouble();
        tiempo = distanciaKilometro / velocidad;
        System.out.println("El tiempo que tardó fue de: " + tiempo);

    }
}
