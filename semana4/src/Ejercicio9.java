import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        /* Existen dos reglas que identifican dos conjuntos de valores:
            El número es de un solo dígito.
            El número es impar.
            A partir de estas reglas, realiza un programa que permita
            ingresar un número entero. Debe asignar el valor que
            corresponda a las variables
            booleanas esDeUnSoloDigito, esImpar, estaEnAmbos y noEstaEnNinguno
            el valor Verdadero o Falso, según corresponda,
            para indicar si el valor número ingresado pertenece o no a cada conjunto.
         */

        int numero;
        boolean esDeUnSoloDigito, esImpar, estaEnAmbos, noEstaEnNinguno;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        numero = input.nextInt();

        if (numero >= -9 && numero < 10) {
            esDeUnSoloDigito = true;
        }

        if (!(numero %2 == 0)) {
            esImpar = true;
        }
     /* ???????

      */

    }
}
