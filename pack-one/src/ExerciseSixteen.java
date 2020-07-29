import java.util.Scanner;

public class ExerciseSixteen {
    public static void main(String[] args) {

        double areaCuadrado, ladoCuadrado;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        ladoCuadrado = keyboard.nextDouble();

        areaCuadrado = ladoCuadrado * ladoCuadrado;

        System.out.println("El Area del Cuadrado es: " + areaCuadrado);
    }
}
