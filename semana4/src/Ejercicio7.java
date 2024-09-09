import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
    /* Realiza un programa que permita ingresar
       un número entero e indique si se trata de un número par o impar.
     */

        final int jubiMujeres = 60;
        final int jubiHombres = 65;
        final int minEdad = 1;
        final int maxEdad = 120;
        int edad;

        String genero;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese una edad: ");

        edad = input.nextInt();

        if (edad >= maxEdad || edad < minEdad){
            System.out.println("permita ingresar una edad (entre 1 y 120 años)");
            System.exit(-1);
        }
        input.nextLine();

        System.out.println("Mujer or Hombre (F o M):  ");
        genero = input.nextLine();

        if (genero.equals("F") &&  edad >= jubiMujeres){
//            System.out.println("El genero es F ");
            System.out.println("la persona está en edad de jubilarse.");

        } else if (genero.equals("M") && edad >= jubiHombres) {
//            System.out.println("El genero es M");
            System.out.println("la persona está en edad de jubilarse.");

        } else {
            System.out.println("la persona NO está en edad de jubilarse' ");
        }

    }
}
