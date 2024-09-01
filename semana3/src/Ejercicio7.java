import java.util.Scanner;

public class Ejercicio7 {


    public static void main(String[] args) {

        // 7 Realiza un programa que permita resolver el siguiente problema: Tres personas aportan diferente
        //capital a una sociedad y desean saber el valor total aportado y qué porcentaje aportó cada una
        //(indicando nombre y porcentaje). Solicitar la carga por teclado del nombre de cada socio, s
        //u capital aportado y a partir de esto calcular e informar lo requerido previamente.

        float aporte1, aporte2, aporte3, capitalTotal; // double es bueno también
        String socio1, socio2, socio3;

        Scanner lector = new Scanner(System.in);

        System.out.println("Nombre Persona uno:");
        socio1 = lector.nextLine();
        System.out.println("Suma Persona uno:");
        aporte1 = lector.nextFloat();

        lector.nextLine();

        System.out.println("Nombre Persona dos:");
        socio2 = lector.nextLine();
        System.out.println("Suma Persona dos:");
        aporte2 = lector.nextFloat();

        lector.nextLine();

        System.out.println("Nombre Persona tres:");
        socio3 = lector.nextLine();
        System.out.println("Suma Persona tres:");
        aporte3 = lector.nextFloat();

        capitalTotal = aporte1 + aporte2 + aporte3;

        System.out.println("capitalTotal: " + capitalTotal);
        System.out.println("Persona uno: " + socio1 + " cons suma " + aporte1 + " y % " + ((aporte1 * 100) / capitalTotal));
        System.out.println("Persona dos: " + socio2 + " cons suma " + aporte2 + " y % " + ((aporte2 * 100) / capitalTotal));
        System.out.println("Persona tres: " + socio3 + " cons suma " + aporte3 + " y % " + ((aporte3 * 100) / capitalTotal));

    }
}
