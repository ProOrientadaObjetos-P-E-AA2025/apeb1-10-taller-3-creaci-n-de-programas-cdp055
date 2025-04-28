public class Problema5EstudianteBase {
    // Atributos
    private String nombre;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    private String estado;

    // Constructor
    public Problema5EstudianteBase(String nombre, double calificacion1, double calificacion2, double calificacion3) {
        this.nombre = nombre;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
    }

    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public void calcularEstado() {
        if (promedio >= 6.5) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
    }

    @Override
    public String toString() {
        return String.format("Estudiante:\nNombre: %s\nCalificación 1: %.2f\nCalificación 2: %.2f\nCalificación 3: %.2f\nPromedio: %.2f\nEstado: %s",
                nombre, calificacion1, calificacion2, calificacion3, promedio, estado);
    }
}
