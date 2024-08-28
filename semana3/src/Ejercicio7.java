import java.util.Scanner;

public class Ejercicio7 {


    public static void main(String[] args) {

        // 7 Realiza un programa que permita resolver el siguiente problema: Tres personas aportan diferente
        //capital a una sociedad y desean saber el valor total aportado y qué porcentaje aportó cada una
        //(indicando nombre y porcentaje). Solicitar la carga por teclado del nombre de cada socio, s
        //u capital aportado y a partir de esto calcular e informar lo requerido previamente.

        float sumaPersonaUno, sumaPersonaDos, sumaPersonaTres, suma;
        String nombrePersonaUno, nombrePersonaDos, nombrePersonaTres;

        Scanner lector = new Scanner(System.in);

        System.out.println("Nombre Persona uno:");
        nombrePersonaUno = lector.nextLine();
        System.out.println("Suma Persona uno:");
        sumaPersonaUno = lector.nextFloat();

        lector.nextLine();

        System.out.println("Nombre Persona dos:");
        nombrePersonaDos = lector.nextLine();
        System.out.println("Suma Persona dos:");
        sumaPersonaDos = lector.nextFloat();

        lector.nextLine();

        System.out.println("Nombre Persona tres:");
        nombrePersonaTres = lector.nextLine();
        System.out.println("Suma Persona tres:");
        sumaPersonaTres = lector.nextFloat();

        suma = sumaPersonaUno + sumaPersonaDos + sumaPersonaTres;

        System.out.println("Suma: " + suma);
        System.out.println("Persona uno: " + nombrePersonaUno + " cons suma " + sumaPersonaUno + " y % " + (sumaPersonaUno * 100 / suma));
        System.out.println("Persona dos: " + nombrePersonaDos + " cons suma " + sumaPersonaDos + " y % " + (sumaPersonaDos * 100 / suma));
        System.out.println("Persona tres: " + nombrePersonaTres + " cons suma " + sumaPersonaTres + " y % " + (sumaPersonaTres * 100 / suma));

    }
}
