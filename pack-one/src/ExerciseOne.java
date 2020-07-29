import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        int height, base;
        int area;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese la altura del triángulo: ");
        height = keyboard.nextInt();
        System.out.println("Ingrese la base del triángulo: ");
        base = keyboard.nextInt();
        area = (base * height) / 2;
        System.out.println("El area del triángulo es: " + area);
    }
}
