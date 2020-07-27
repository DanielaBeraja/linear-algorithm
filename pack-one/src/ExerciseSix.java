import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        double altura, base, hipotenusa;

        Scanner keyboard= new Scanner(System.in);
        System.out.println("Ingrese la medida de la altura: ");
        altura= keyboard.nextDouble();
        System.out.println("Ingrese la medida de la base: ");
        base= keyboard.nextDouble();
        hipotenusa= Math.sqrt((altura*altura)+ (base*base));
        System.out.println("La hipotenusa del triángulo es: "+ hipotenusa);

    }
}
