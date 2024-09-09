import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
    /*
        El dueño de una librería desea hacer una promoción,
        otorgando un descuento del 15% en las compras efectuadas
        por docentes o alumnos universitarios.
        Se conoce el tipo de cliente: ‘Á’: Alumno, ‘D’: Docente, ‘O’:
        Otro cliente y el importe total de la compra.
        Mostrar el tipo de cliente y el importe a abonar por la compra
     */

        float precio, precioFinal;
        char tipoDeCliente;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el precio: ");
        precio = input.nextFloat();
        precioFinal = precio;

        input.nextLine();

        System.out.println("Ingrese el tipo de cliente (A,D,O): ");
        tipoDeCliente = input.nextLine().charAt(0);

        if (tipoDeCliente == 'A' || tipoDeCliente == 'D') {
            precioFinal = precio - (precio * 15 / 100);
            System.out.println("Tipo de cliente es A or D, el precio sea " + precioFinal);
        } else {
            System.out.println("Tipo de cliente es Otro, el precio sea " + precioFinal);
        }
    }
}
