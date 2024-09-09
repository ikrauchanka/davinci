import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
    /*
        Las posiciones en un tablero de ajedrez se identifican comuna letra y un número.
        La letra identifica la columna, mientras que el número identifica la fila, como se muestra continuación:
        Dada la posición del tablero, determinar de qué color es esa casilla.
        Por ejemplo, si la posición es a1, el cuadrado es negro. Si la posición es d5, el cuadrado es blanco.
        En caso de que la posición no sea válida, indicarlo.
     */

        String posicion;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese posicion: ");
        posicion = input.nextLine();

        char letra  = posicion.charAt(0);
        int numero  = posicion.charAt(1) - '0';


        if (numero > 0 && numero <=8) {
            switch (letra) {
                case 'a', 'c', 'e', 'g':
                    System.out.println(numero % 2 == 0? "blanco" : "negro");
                    break;
                case 'b', 'd', 'f', 'h':
                    System.out.println(numero % 2 == 0? "negro" : "blanco");
                    break;
                default:
                    System.out.println("FATAL ERROR");
                    break;
            }
        }
    }
}
