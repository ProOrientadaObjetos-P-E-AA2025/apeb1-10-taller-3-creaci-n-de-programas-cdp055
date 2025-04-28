import java.util.Random;

public class Problema1TerrenoEjecutor {
        public static void main(String[] args) {
                Random random = new Random();
                Problema1TerrenoBase terreno = new Problema1TerrenoBase();

                // Asignando valores aleatorios usando set()
                terreno.setAncho(10 + (50 - 10) * random.nextDouble()); // ancho entre 10 y 50 metros
                terreno.setLargo(20 + (100 - 20) * random.nextDouble()); // largo entre 20 y 100 metros
                terreno.setValorMetroCuadrado(100 + (500 - 100) * random.nextDouble()); // valor entre $100 y $500

                // Procesos
                terreno.calcularArea();
                terreno.calcularCostoTerreno();

                // Mostrar resultados utilizando printf para limitar los decimales
                System.out.printf("Ancho: %.2f metros\n", terreno.getAncho());
                System.out.printf("Largo: %.2f metros\n", terreno.getLargo());
                System.out.printf("Área: %.2f metros cuadrados\n", terreno.getArea());
                System.out.printf("Valor por metro cuadrado: $%.2f\n", terreno.getValorMetroCuadrado());
                System.out.printf("Costo total del terreno: $%.2f\n", terreno.getCostoTerreno());
        }
}
