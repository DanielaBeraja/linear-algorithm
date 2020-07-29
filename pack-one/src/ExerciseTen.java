import java.util.Scanner;

public class ExerciseTen {
    public static void main(String[] args) {
        double costoMetroCubico, costoTotal, cantidadAguaUtilizada;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("La Conagua. Ingrese el costo del m3: ");
        costoMetroCubico = keyboard.nextDouble();
        System.out.println("Ingrese la cantidad de agua utilizada: ");
        cantidadAguaUtilizada = keyboard.nextDouble();
        costoTotal = costoMetroCubico * cantidadAguaUtilizada;
        System.out.println("El pago que debe realizar es de: $" + costoTotal);

    }
}
