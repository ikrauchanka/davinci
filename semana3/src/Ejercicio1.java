import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        // 1 Realiza un programa que permita que el usuario ingrese su nombre. El programa debe emitir
        //una salida con un mensaje de bienvenida que incluya el nombre ingresado.

        String nombre;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = lector.nextLine();
        System.out.println("Bienvenidos : " + nombre + "!");




    }
}
