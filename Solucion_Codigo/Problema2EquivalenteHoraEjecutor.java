public class Problema2EquivalenteHoraEjecutor {
    public static void main(String[] args) {
        // horas aleatoria
        //int horasAleatorias = (int)(Math.random() * 100); // entre 0 y 99

        // objeto creado usando el constructor con parámetro
        Problema2EquivalenteHoraBase equivalente = new Problema2EquivalenteHoraBase(48);

        // Mostrar resultados
        System.out.println(equivalente);
    }
}
