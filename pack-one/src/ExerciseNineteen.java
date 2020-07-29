import java.util.Scanner;

public class ExerciseNineteen {
    public static void main(String[] args) {

        double montoTotalCobrar, tarifaDiaria;
        int dias;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingrese la tarifa diaria de la habitación: $");
        tarifaDiaria = keyboard.nextDouble();

        System.out.print("Ingrese los días de la estadía: ");
        dias = keyboard.nextInt();

        montoTotalCobrar = tarifaDiaria * dias;
        System.out.print("HOTEL CAMA ARENA. El monto a cobrar es: $ " + montoTotalCobrar);
    }
}
