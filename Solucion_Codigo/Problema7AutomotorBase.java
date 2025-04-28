public class Problema7AutomotorBase {
    private String cedulaDuenio;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Problema7AutomotorBase(String cedulaDuenio, String marcaVehiculo, int anioFabricacion, double valorVehiculo) {
        this.cedulaDuenio = cedulaDuenio;
        this.marcaVehiculo = marcaVehiculo;
        this.anioFabricacion = anioFabricacion;
        this.valorVehiculo = valorVehiculo;
    }

    public void calcularValorMatricula() {
        int aniosAntiguedad = 2025 - anioFabricacion; // suponiendo año actual 2025
        valorMatricula = valorVehiculo * 0.002 * aniosAntiguedad;
    }

    @Override
    public String toString() {
        return "Cédula Dueño: " + cedulaDuenio +
                "\nMarca Vehículo: " + marcaVehiculo +
                "\nAño de Fabricación: " + anioFabricacion +
                "\nValor Vehículo: " + valorVehiculo +
                "\nValor Matrícula: " + valorMatricula;
    }
}
