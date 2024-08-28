import java.util.Scanner;

public class Ejercicio6 {


    public static void main(String[] args) {

    // 6 Realiza un programa que permita ingresar el monto total de las ventas realizadas por
    //un vendedor durante el mes, de quien se sabe que gana un sueldo fijo de 44000 pesos más
    //el 16 por ciento del monto total vendido. Con tales datos debes calcular y mostrar
    //el importe a cobrar por el vendedor.

        float totalVentas;

        Scanner lector = new Scanner(System.in);

        System.out.println("Total ventas por mes ?: ");
        totalVentas = lector.nextFloat();

        System.out.println("Suma por el vendor: " + (totalVentas * 0.16 + 44000));

    }
}
