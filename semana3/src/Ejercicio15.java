import java.util.Scanner;

public class Ejercicio15 {


    public static void main(String[] args) {

        //15 Escribe un programa que calcule el costo total de una compra, teniendo en cuenta un descuento
        //porcentual ingresado por el usuario. Pide al usuario que ingrese el costo original de la compra
        //y el porcentaje de descuento, luego muestra el costo total con el descuento aplicado

        double compraTotal, comrpaDiscuento;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese compraTotal: ");
        compraTotal = lector.nextDouble();

        System.out.println("Ingrese comrpaDiscuento: ");
        comrpaDiscuento = lector.nextDouble();


        System.out.println("Total con el descuento: " + (compraTotal - compraTotal * comrpaDiscuento * 0.01));


    }
}
