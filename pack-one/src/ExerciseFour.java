import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        int horasTotales;
        double precioPorHora, cobroTotal;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("ESTACIONAMIENTO VLADI CAR: Ingrese el valor del precio por hora: ");
        precioPorHora = keyboard.nextDouble();
        System.out.println("Ingrese la cantidad de horas totales: ");
        horasTotales = keyboard.nextInt();
        cobroTotal = precioPorHora * horasTotales;
        System.out.println("El cobro que debe aplicarse al cliente es: $" + cobroTotal);

    }
}
