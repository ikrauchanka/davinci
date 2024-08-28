import java.util.Scanner;

public class Ejercicio10 {


    public static void main(String[] args) {

//10 Escribe un programa que calcule el área de un triángulo utilizando la fórmula: área = (base * altura) / 2.
//	Pide al usuario que ingrese la base y la altura del triángulo.

        double base, altura;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese un base:: ");
        base = lector.nextDouble();

        System.out.println("Ingrese una altura: ");
        altura = lector.nextDouble();

        System.out.println("Recaudación total: " + (base * altura ) / 2);

    }
}
