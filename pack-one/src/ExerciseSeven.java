import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        int totalKilometros;
        double costoPorKilometro, costoBoleto;
        //final se podria poner y el valor =
        //se borraria el System de "ingrese el valor del costo por kilometro"

        Scanner keyboard= new Scanner(System.in);
        System.out.println("Bus La Curva Loca. Ingrese el valor del costo por kilometro: ");
        costoPorKilometro= keyboard.nextDouble();
        System.out.println("Ingrese los kilometros recorridos: ");;
        totalKilometros= keyboard.nextInt();
        costoBoleto= costoPorKilometro* totalKilometros;
        System.out.println("El costo del Boleto es de: $"+ costoBoleto);
        
    }
}
