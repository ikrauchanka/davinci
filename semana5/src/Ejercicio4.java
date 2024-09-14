import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
    /* 4. Actividad sobre conectivos lógicos:
        Dados 2 números, te pedimos calcular la división solo en el caso que el
        primero sea mayor que el segundo y el segundo distinto de 0.
        Objetivo: Practicar el uso de los conectivos lógicos en Java y afianzar
        los conocimientos sobre las operaciones lógicas básicas.
     */

        int num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número uno: ");
        num1 = input.nextInt();

        System.out.println("Ingrese un número dos: ");
        num2 = input.nextInt();

        if (num2 != 0 && (num1 > num2)) {
            System.out.println("la división num1/num2 es " + num1/num2);
        } else {
            System.out.println("num1 es no mayor O num2 es 0");
        }
    }
}
