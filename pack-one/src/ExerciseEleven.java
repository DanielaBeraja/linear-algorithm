import java.util.Scanner;

public class ExerciseEleven {
    public static void main(String[] args) {
        double priceKilowatt, priceTotal, kilowattsTotal;
        //si el costo Kilowatt es constante podemos: final double PRICE_KILOWATT=10;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Luz y sombras CLS. Ingrese el costo por kilowatt: ");
        priceKilowatt = keyboard.nextDouble();

        System.out.println("Ingrese los kilowatts utilizados: ");
        kilowattsTotal = keyboard.nextDouble();
        priceTotal = priceKilowatt * kilowattsTotal;

        System.out.println("El pago que debe realizar es de: $" + priceTotal);

    }
}
