import java.util.Random;

public class Problema8ChequeEjecutor {
    public static void main(String[] args) {
        Random random = new Random();

        String[] nombresClientes = {"Ana", "Luis", "Pedro", "María", "Javier"};
        String[] nombresBancos = {"Banco Pichincha", "Banco Guayaquil", "Banco CooMego"};

        String nombreCliente = nombresClientes[random.nextInt(nombresClientes.length)];
        String nombreBanco = nombresBancos[random.nextInt(nombresBancos.length)];
        double valorCheque = 100 + (10000 - 100) * random.nextDouble(); // Entre 100 y 10000 dólares

        Problema8ChequeBase cheque = new Problema8ChequeBase(nombreCliente, nombreBanco, valorCheque);
        cheque.calcularComision();

        System.out.println("Información del Cheque:");
        System.out.println(cheque.toString());
    }
}
