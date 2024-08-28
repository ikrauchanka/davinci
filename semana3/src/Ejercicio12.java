import java.util.Scanner;

public class Ejercicio12 {


    public static void main(String[] args) {

        //12 Escribe un programa que calcule el perímetro de un rectángulo utilizando la fórmula:
        //perímetro = 2 * (longitud + anchura). Pide al usuario que ingrese la longitud y la anchura del rectángulo.

        double lngtd, anchura;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese un longitud: ");
        lngtd = lector.nextDouble();

        System.out.println("Ingrese una anchura: ");
        anchura = lector.nextDouble();

        System.out.println("El perimetro es: " + ((lngtd + anchura) * 2));

    }
}
