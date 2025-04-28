public class Problema2EquivalenteHoraBase {
// Atributos
    private int horas;
    private int minutos;
    private int segundos;
    private int dias;

    // constructor vacio
    public Problema2EquivalenteHoraBase() {

    }

    // Constructor que recibe horas e inmediatamente calcula
    public Problema2EquivalenteHoraBase(int horas) {
        this.horas = horas;
        calcularEquivalencias();
    }

    // Método para calcular minutos, segundos y días
    private void calcularEquivalencias() {
        minutos = horas * 60;
        segundos = horas * 3600;
        dias = horas / 24; // División entera
    }

    // Método toString para mostrar todo
    @Override
    public String toString() {
        return "Horas: " + horas +
                "\nMinutos: " + minutos +
                "\nSegundos: " + segundos +
                "\nDías: " + dias;
    }


}
