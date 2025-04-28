import java.util.Scanner;

public class Problema3InstitucionEducativaEjecutor {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Leer los datos de la institución desde la consola
        System.out.print("Ingrese el nombre de la institución: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el tipo de institución: ");
        String tipoInstitucion = scanner.nextLine();

        System.out.print("Ingrese el número de alumnos: ");
        int numeroAlumnos = scanner.nextInt();

        System.out.print("Ingrese el número de docentes: ");
        int numeroDocentes = scanner.nextInt();

        System.out.print("Ingrese el número de sedes: ");
        int numeroSedes = scanner.nextInt();

        System.out.print("Ingrese el gasto proyectado por estudiante: ");
        double gastoProyectado = scanner.nextDouble();

        // Crear la instancia del modelo (Problema3InstitucionEducativaBase)
        Problema3InstitucionEducativaBase educativa = new Problema3InstitucionEducativaBase(nombre, tipoInstitucion, numeroAlumnos, numeroDocentes, numeroSedes, gastoProyectado);

        // Calcular el presupuesto de la institución
        educativa.calcularPresupuesto();

        // Mostrar la información de la institución (Vista)
        System.out.println("\nInformación de la institución educativa:");
        System.out.println(educativa);

        // Cerrar el Scanner
        scanner.close();
    }
}
