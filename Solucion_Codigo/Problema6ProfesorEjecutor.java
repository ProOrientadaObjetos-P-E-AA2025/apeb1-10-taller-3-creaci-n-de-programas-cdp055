import java.util.Scanner;

public class Problema6ProfesorEjecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.println("Ingrese el nombre del profesor:");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese el apellido del profesor:");
        String apellido = entrada.nextLine();

        System.out.println("Ingrese el sueldo básico del profesor:");
        double sueldoBasico = entrada.nextDouble();
        entrada.nextLine(); // Limpiar buffer

        System.out.println("Ingrese la cédula del profesor:");
        String cedula = entrada.nextLine();

        // objeto
        Problema6ProfesorBase profesor = new Problema6ProfesorBase(nombre, apellido, sueldoBasico, cedula);

        // resultados
        System.out.println("\nDatos del Profesor:");
        System.out.println(profesor.toString());

        entrada.close();
    }
}

