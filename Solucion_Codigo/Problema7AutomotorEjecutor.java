import java.util.Scanner;

public class Problema7AutomotorEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cédula del dueño: ");
        String cedula = sc.nextLine();

        System.out.print("Ingrese la marca del vehículo: ");
        String marca = sc.nextLine();

        System.out.print("Ingrese el año de fabricación: ");
        int anio = sc.nextInt();

        System.out.print("Ingrese el valor del vehículo: ");
        double valor = sc.nextDouble();

        Problema7AutomotorBase auto = new Problema7AutomotorBase(cedula, marca, anio, valor);
        auto.calcularValorMatricula();

        System.out.println("\nInformación del Automotor:");
        System.out.println(auto.toString());

        sc.close();
    }
}
