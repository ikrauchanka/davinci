import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
    /*
        Realizar un algoritmo que calcule el total a pagar de un teléfono celular de la empresa Get Smart.
        Los planes de la empresa Get Smart son muy interesantes y
        ofrecen precios diferenciados de acuerdo con la cantidad de minutos usados por mes.
        Debajo de 200 minutos la empresa cobra $ 0,20 por minuto,
        Entre 200 y 400 minutos el precio es de $0,18. Más de 400 minutos, el precio por minuto es de $0,15.
     */

        double total = 0;
        int minutosTotal;
        double precioBajo200 = 0.2;
        double precioBajo400 = 0.18;
        double precioMas400 = 0.15;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese minutos: ");
        minutosTotal = input.nextInt();
        if (minutosTotal >0) {
            if (minutosTotal > 400) {
                total = minutosTotal * 0.15;
            }
             else if (minutosTotal >= 200) {
                total = minutosTotal * 0.18;
            } else {
                total = minutosTotal * 0.2;
            }

            System.out.println("Precio total es : " + total + " por " + minutosTotal + " minutos");
        }


    }
}
