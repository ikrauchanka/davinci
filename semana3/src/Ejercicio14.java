import java.util.Scanner;

public class Ejercicio14 {


    public static void main(String[] args) {

        //14 Escribe un programa que convierta una cantidad de segundos ingresada por el usuario
        //a su equivalente en horas, minutos y segundos. Por ejemplo, si el usuario ingresa 3665 segundos,
        //el programa debe mostrar: "3665 segundos equivalen a 1 horas, 1 minutos y 5 segundos"..

        int sgndsInicio, sgnds, horas, minutos;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese segundos: ");
        sgndsInicio = lector.nextInt();

        horas = sgndsInicio / 3600;
        sgnds = sgndsInicio % 3600;
        minutos = sgnds / 60;
        sgnds = sgnds % 60;

        System.out.println(sgndsInicio + " segundos equivalen a " + horas + " horas, " + minutos + " minutos y " + sgnds +" segundos.");


    }
}
