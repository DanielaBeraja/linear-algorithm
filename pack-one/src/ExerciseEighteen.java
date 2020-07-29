import java.util.Scanner;

public class ExerciseEighteen {
    public static void main(String[] args) {

        double costoTotal, costoMinuto, tiempoLlamada;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingrese el costo del minuto: $");
        costoMinuto = keyboard.nextDouble();

        System.out.print("Ingrese el tiempo que duró la llamada: ");
        tiempoLlamada = keyboard.nextDouble();

        costoTotal = costoMinuto * tiempoLlamada;

        System.out.print("El costo de la llamada es: $" + costoTotal);
    }
}
