public class Ejercicio8 {


    public static void main(String[] args) {
//8 Se conoce el monto del salario de un empleado, el nombre del empleado y el área
// funcional al cual pertenece. Se pide calcular el nuevo salario del empleado sabiendo
// que obtuvo un incremento del 8% sobre su salario actual y un descuento del 2,5 %
// por servicios, informando los resultados con el formato que se especifica a continuación:

        final String nombre = "Sergio Gonzalez";
        final String area = "Programador";
        final double salarioActual =  600000.00;
        double salarioNuevo;


        salarioNuevo = salarioActual + salarioActual * 0.085;
        System.out.println("Nombre Empleado: " + nombre);
        System.out.println("Área Funcional: " + area);
        System.out.println("Salario Actual: " + salarioActual  );
        System.out.println("Nuevo Salario: " + (salarioNuevo + salarioNuevo * 0.025)  + " -> 8.5% salarioNuevo y un descuento del 2,5 % por servicios: " );

    }
}
