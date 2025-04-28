import java.util.Random;

public class Problema5EstudianteEjecutor {
    public static void main(String[] args) {
        Random rand = new Random();

        // Generar datos aleatorios
        String nombre = "Juan Pérez";
        double calificacion1 = 5 + rand.nextDouble() * 5; // entre 5.0 y 10.0
        double calificacion2 = 5 + rand.nextDouble() * 5;
        double calificacion3 = 5 + rand.nextDouble() * 5;

        // Crear objeto
        Problema5EstudianteBase estudiante = new Problema5EstudianteBase(
                nombre, calificacion1, calificacion2, calificacion3
        );

        // Procesos
        estudiante.calcularPromedio();
        estudiante.calcularEstado();

        // Mostrar resultados
        System.out.println(estudiante);
    }
}
