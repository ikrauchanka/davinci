import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
    /* Realiza un programa que permita ingresar dos números enteros y
    la operación a realizar ('+', '-', '*', '/'). Debe mostrarse
    el resultado para la operación ingresada. Considerar que
    no se puede dividir por cero (en ese caso mostrar el texto 'ERROR').
     */

        int numero1, numero2;
        char operacion;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese una operacion: ");
        operacion = input.next().charAt(0);

        System.out.println("Ingrese un número uno: ");
        numero1 = input.nextInt();

        System.out.println("Ingrese un número dos: ");
        numero2 = input.nextInt();

        if ((numero1 == 0) || (numero2 == 0)) {
            System.out.println("numero1 or numero2 es 0, ERROR");
            System.exit(-1);
        }
        switch (operacion) {
            case '+':
                System.out.println("Operacion '+' : " + (numero1 + numero2));
                break;
            case '-':
                System.out.println("Operacion '-' : " + (numero1 - numero2));
                break;
            case '*':
                System.out.println("Operacion '*' : " + (numero1 * numero2));
                break;
            case '/':
                System.out.println("Operacion '/' : " + (numero1 / numero2));
                break;
        }

    }
}
