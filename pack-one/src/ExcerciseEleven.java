import java.util.Scanner;

public class ExcerciseEleven {
    public static void main(String[] args) {
        double costoKilowatt, costoTotal, kilowattsTotales;

        Scanner keyboard= new Scanner(System.in);
        System.out.println("Luz y sombras CLS. Ingrese el costo por kilowatt: ");
        costoKilowatt= keyboard.nextDouble();
        System.out.println("Ingrese los kilowatts utilizados: ");
        kilowattsTotales= keyboard.nextDouble();
        costoTotal= costoKilowatt* kilowattsTotales;
        System.out.println("El pago que debe realizar es de: $"+ costoTotal);

    }
}
