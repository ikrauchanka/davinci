import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
    /*
        La primavera comprende parte del mes de marzo, los meses de abril y mayo en su totalidad, y parte de junio.
        El verano, por su parte, está formado por los últimos 9-10 días de junio, todo julio y agosto, y parte de septiembre.
        El otoño se compone de parte de septiembre, octubre y noviembre al completo, y parte de diciembre.
        Por último, la estación de invierno comprende desde el 21-22 de diciembre hasta el 19 o 20 de marzo.
     */

        String posicion;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese dia y mes en format DDMM: ");
        posicion = input.nextLine();

        String dia = "" + posicion.charAt(0) + posicion.charAt(1);
        String mes = "" + posicion.charAt(2) + posicion.charAt(3);
        System.out.println(dia + mes);


        switch (mes) {
            case "12", "01", "02":
                System.out.println("invierno");
                break;
            case "03", "04", "05":
                System.out.println("primavera");
                break;
            case "06", "07", "08":
                System.out.println("verano");
                break;
            case "09", "10", "11":
                System.out.println("otoño");
                break;
            default:
                System.out.println("FATAL ERROR");
                break;

        }
    }
}
