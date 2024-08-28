import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

// 2 Realiza un programa que permita ingresar 3 notas pertenecientes a tres trimestres
// distintos para cierto alumno de nivel secundario. Debe calcularse y mostrarse la nota promedio.

        int nota1, nota2, nota3;

        Scanner lector = new Scanner(System.in);

        System.out.println("Que es nota 1: ");
        nota1 = lector.nextInt();

        System.out.println("Que es nota 2: ");
        nota2 = lector.nextInt();

        System.out.println("Que es nota 3: ");
        nota3 = lector.nextInt();

        System.out.println("El promedio es: " + ((float) (nota1 + nota2 + nota3) / 3));

    }
}
