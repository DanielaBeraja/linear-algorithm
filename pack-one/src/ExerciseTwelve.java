import java.util.Scanner;

public class ExerciseTwelve {
    public static void main(String[] args) {
     double precioArticulo, precioIva, precioConIva, precioDescuento, precioTotal;
     final int iva= 15;
     final int descuento= 20;

        Scanner keyboard= new Scanner(System.in);
        System.out.println("Ingrese el precio del artículo: ");
        precioArticulo= keyboard.nextDouble();
        precioIva= (precioArticulo*iva)/100;
        precioConIva= precioArticulo+precioIva;
        System.out.println("El precio del artículo con iva es: $"+ precioConIva);

        precioDescuento= (precioConIva*descuento)/100;
        precioTotal= precioArticulo-precioDescuento;
        System.out.println("Con el descuento el precio final del artículo es: $ "+precioTotal);
    }
}
