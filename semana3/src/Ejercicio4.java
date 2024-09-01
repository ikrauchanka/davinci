import java.util.Scanner;

public class Ejercicio4 {


    public static void main(String[] args) {

        //4 Realiza un programa que permita ingresar el valor monetario de una hora de trabajo
        //y la cantidad de horas trabajadas por día por un trabajador. Debes mostrar
        //el valor del salario semanal, sabiendo que trabaja todos los días hábiles
        //y la mitad de las horas del día hábil los sábados. (Todas las horas valen lo mismo.)
        int horasPorDia;
        double valorPorHora, total;

        // float promedio

        Scanner input = new Scanner(System.in);

        System.out.println("Valor por hora : ");
        valorPorHora = input.nextDouble();

        System.out.println("Cuantos horas por dia: ");
        horasPorDia = input.nextInt();

        total = valorPorHora * horasPorDia * 5 + valorPorHora * (horasPorDia / 2);

        System.out.println("El valor del salario: " + total);

    }
}
