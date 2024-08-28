import java.util.Scanner;

public class Ejercicio9 {


    public static void main(String[] args) {

//9 El precio para un vuelo de $8800 en clase turista y se aplica un incremento del 30% en primera clase.
//	Se ingresan la cantidad de pasajes vendidos de clase turista y de primera clase. Obtener la recaudación total del vuelo.
//

        int cantidadPasajesTurista, candidadPasajesPrimera;
        double recaudacionTotal;
        double vueloPrecioTurista = 8800.00;
        double vueloPrecioPrimera = vueloPrecioTurista + vueloPrecioTurista * 0.3;

        Scanner lector = new Scanner(System.in);

        System.out.println("Cantidad de pasajes en clase turista: ");
        cantidadPasajesTurista = lector.nextInt();

        System.out.println("Cantidad de pasajes en clase primera: ");
        candidadPasajesPrimera = lector.nextInt();

        recaudacionTotal = vueloPrecioTurista * cantidadPasajesTurista + vueloPrecioPrimera * candidadPasajesPrimera;

        System.out.println("Recaudación total: " + recaudacionTotal);

    }
}
