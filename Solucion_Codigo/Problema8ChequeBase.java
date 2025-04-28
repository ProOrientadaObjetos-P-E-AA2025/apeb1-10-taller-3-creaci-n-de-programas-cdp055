public class Problema8ChequeBase {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    public Problema8ChequeBase(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
    }

    public void calcularComision() {
        comisionBanco = valorCheque * 0.003;
    }

    @Override
    public String toString() {
        return "Nombre Cliente: " + nombreCliente +
                "\nNombre Banco: " + nombreBanco +
                "\nValor Cheque: " + valorCheque +
                "\nComisión Banco: " + comisionBanco;
    }
}
