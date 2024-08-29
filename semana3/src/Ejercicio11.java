import java.util.Scanner;

public class Ejercicio11 {


    public static void main(String[] args) {

        //11 Escribe un programa que convierta una temperatura de grados Celsius a grados Fahrenheit.
        // La fórmula de conversión es:
        //Fahrenheit = (Celsius * 9/5) + 32. Pide al usuario que ingrese la temperatura en grados Celsius.

        float celcius;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese celcius: ");
        celcius = lector.nextFloat();

        System.out.println("En  Fahrenheit: " + ((celcius * 9/5) + 32));

    }
}
