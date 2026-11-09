public class Exercicio44 {
    public static void main(String[] args) {
        int[] chamados = {101, 102, 103, 104, 105};
        int[] minutos = {120, -5, 300, 260, 90};
        final int SLA = 240;
        for (int i = 0; i < chamados.length; i++) {
            if (minutos[i] < 0) continue; // tempo inválido
            if (minutos[i] > SLA) {
                System.out.println("Primeiro chamado acima do SLA: " + chamados[i] + " (" + minutos[i] + " min)");
                break;
            }
        }
    }
}
