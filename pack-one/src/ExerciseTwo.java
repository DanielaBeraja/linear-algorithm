import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {

        double pesoMexicano;
        double dolarFinal;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de pesos Mexicanos a convertir: ");
        pesoMexicano = keyboard.nextDouble();
        dolarFinal = pesoMexicano / 22.37;
        System.out.println("La conversion a dolares es: USD" + dolarFinal);

    }
}
