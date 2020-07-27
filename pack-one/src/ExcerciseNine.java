import java.util.Scanner;

public class ExcerciseNine {
    public static void main(String[] args) {
        double costoMinuto, costoTotal, tiempo;

        Scanner keyboard= new Scanner(System.in);
        System.out.println("Ingrese el costo del minuto: ");
        costoMinuto= keyboard.nextDouble();
        System.out.println("Ingrese el tiempo de la llamada: ");
        tiempo= keyboard.nextDouble();
        costoTotal= costoMinuto*tiempo;
        System.out.println("El costo de la llamada es de $"+ costoTotal);

    }
}
