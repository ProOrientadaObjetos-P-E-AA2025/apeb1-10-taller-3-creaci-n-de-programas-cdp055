public class Problema4_EquipoCelularBase {
    // Atributos
    private String sistemaOperativo;
    private double tamanoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String informacionImei;

    // Constructor
    public Problema4_EquipoCelularBase(String sistemaOperativo, double tamanoPantalla,
                                       double costoInicial, double ivaPorcentaje,
                                       String direccionMac, String informacionImei) {
        this.sistemaOperativo = sistemaOperativo;
        this.tamanoPantalla = tamanoPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.direccionMac = direccionMac;
        this.informacionImei = informacionImei;
    }

    public void calcularIvaCostoInicial() {
        ivaCostoInicial = costoInicial * (ivaPorcentaje / 100);
    }

    public void calcularCostoFinal() {
        costoFinal = costoInicial + ivaCostoInicial;
    }

    @Override
    public String toString() {
        return String.format("Equipo Celular:\nSistema Operativo: %s\nTamaño de Pantalla: %.2f pulgadas\nCosto Inicial: %.2f $\nIVA (%.2f%%): %.2f $\nCosto Final: %.2f $\nDirección MAC: %s\nInformación IMEI: %s",
                sistemaOperativo, tamanoPantalla, costoInicial, ivaPorcentaje, ivaCostoInicial, costoFinal, direccionMac, informacionImei);
    }
}