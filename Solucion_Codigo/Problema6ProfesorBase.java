public class Problema6ProfesorBase {
private String nombre;
private String apellido;
private double sueldoBasico;
private double sueldoTotal;
private String cedula;

public Problema6ProfesorBase(String nombre, String apellido, double sueldoBasico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
        calcularSueldoTotal(); // Se calcula automáticamente al crear
        }

// Método para calcular el sueldo total
public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.20);
        }

// Método toString
@Override
public String toString() {
        return "Profesor\n" +
        "Nombre: " + nombre + " " + apellido + "\n" +
        "Cédula: " + cedula + "\n" +
        "Sueldo Básico: $" + String.format("%.2f", sueldoBasico) + "\n" +
        "Sueldo Total: $" + String.format("%.2f", sueldoTotal);
        }
        }
