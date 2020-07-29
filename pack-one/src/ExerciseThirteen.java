//import java.util.Scanner;

public class ExerciseThirteen {
    public static void main(String[] args) {
        double dineroAhorradoAnual, dineroAhorradoSemanal;
        final int SUELDO_MENSUAL = 40000;
        final int PORCENTAJE = 15;
        final int SEMANAS_ANUAL = 48; //Se calculó 4 semanas por mes.

        //Scanner keyboard= new Scanner(System.in);
        //En el caso que se elimine final, se define como double y se escribe keyboard.nextDouble()

        dineroAhorradoSemanal = (SUELDO_MENSUAL * PORCENTAJE) / 100;
        dineroAhorradoAnual = dineroAhorradoSemanal * SEMANAS_ANUAL;

        System.out.println("El dinero ahorrado en un año es: $" + dineroAhorradoAnual);

    }
}
