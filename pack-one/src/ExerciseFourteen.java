import java.util.Scanner;

public class ExerciseFourteen {
    public static void main(String[] args) {
        double montoCheque, montoHotelTotal, montoHotelDiario, montoComidaTotal, montoComidaDiario;
        int dias, gastosExtrasTotal;
        final int GASTOS_EXTRAS_DIARIO = 100;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de días que duró el viaje: ");
        dias = keyboard.nextInt();

        System.out.println("Ingrese el monto diario del hotel: $ ");
        montoHotelDiario = keyboard.nextDouble();
        montoHotelTotal = montoHotelDiario * dias;

        System.out.println("Ingrese el monto diario de la comida: $ ");
        montoComidaDiario = keyboard.nextDouble();
        montoComidaTotal = montoComidaDiario * dias;

        gastosExtrasTotal = GASTOS_EXTRAS_DIARIO * dias;

        montoCheque = montoHotelTotal + montoComidaTotal + gastosExtrasTotal;

        System.out.println("Monto en concepto de Hotel: $" + montoHotelTotal);
        System.out.println("Monto en concepto de Comida: $" + montoComidaTotal);
        System.out.println("Monto en concepto de Extras: $" + gastosExtrasTotal);
        System.out.println("MONTO DEL CHEQUE: $" + montoCheque);

    }
}
