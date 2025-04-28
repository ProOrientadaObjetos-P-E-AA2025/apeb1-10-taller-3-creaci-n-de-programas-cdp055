public class Problema1TerrenoBase {
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    private double costoTerreno;

    // Métodos set
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    // Método para calcular el área
    public void calcularArea() {
        area = ancho * largo;
    }

    // Método para calcular el costo del terreno
    public void calcularCostoTerreno() {
        costoTerreno = area * valorMetroCuadrado;
    }

    // Métodos get
    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getArea() {
        return area;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public double getCostoTerreno() {
        return costoTerreno;
    }

    // Método toString utilizando get()
    @Override
    public String toString() {
        return "Datos del Terreno:\n" +
                "Ancho: " + getAncho() + " metros\n" +
                "Largo: " + getLargo() + " metros\n" +
                "Área: " + getArea() + " metros cuadrados\n" +
                "Valor por metro cuadrado: $" + getValorMetroCuadrado() + "\n" +
                "Costo total del terreno: $" + getCostoTerreno();
    }
    }
