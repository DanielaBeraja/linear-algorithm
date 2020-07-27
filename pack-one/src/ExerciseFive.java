import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        double precioMetroCuadrado, costoTotal;
        int metrosCuadradosTotales;

        Scanner keyboard= new Scanner(System.in);
        System.out.println("Pinturas La Brocha Gorda. Ingrese el precio del m2: ");
        precioMetroCuadrado= keyboard.nextDouble();
        System.out.println("Ingrese los m2 pintados: ");
        metrosCuadradosTotales= keyboard.nextInt();
        costoTotal= precioMetroCuadrado*metrosCuadradosTotales;
        System.out.println("El costo total del trabajo es: $"+ costoTotal);

    }
}
