import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {

        int anioNacimiento;
        int edad;
        int anioActual= 2020;
        //no es 100% efectivo ya que puede variar la edad segun el mes.

        Scanner keyboard= new Scanner(System.in);
        System.out.println("Ingrese el año en el que nacio: ");
        anioNacimiento= keyboard.nextInt();
        edad= anioActual- anioNacimiento;
        System.out.println("La edad de la persona que solicita el empleo es: "+ edad+ " años");

    }
}
