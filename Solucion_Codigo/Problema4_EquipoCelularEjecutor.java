import java.util.Random;

public class Problema4_EquipoCelularEjecutor {
    public static void main(String[] args) {
        Random rand = new Random();

        // Generar datos aleatorios o fijos
        String sistemaOperativo = "Android";
        double tamanoPantalla = 5.0 + rand.nextDouble() * 2.5; // Entre 5.0 y 7.5 pulgadas
        double costoInicial = 200 + rand.nextDouble() * 800; // Entre $200 y $1000
        double ivaPorcentaje = 12; // IVA fijo en Ecuador
        String direccionMac = "A1:B2:C3:D4:E5:F6";
        String informacionImei = "357845091234567";

        // Crear objeto
        Problema4_EquipoCelularBase celular = new Problema4_EquipoCelularBase(
                sistemaOperativo, tamanoPantalla, costoInicial, ivaPorcentaje, direccionMac, informacionImei
        );

        // Procesos
        celular.calcularIvaCostoInicial();
        celular.calcularCostoFinal();

        // Mostrar resultados
        System.out.println(celular);
    }
}
