public class Exercicio43 {
    static double calcularMedia(double[] notas) {
        double s = 0;
        for (double n : notas) s += n;
        return s / notas.length;
    }
    static double maiorNota(double[] notas) {
        double m = notas[0];
        for (double n : notas) if (n > m) m = n;
        return m;
    }
    static void exibirAprovados(String[] alunos, double[] notas) {
        System.out.println("Aprovados:");
        for (int i = 0; i < alunos.length; i++) if (notas[i] >= 7) System.out.println(" - " + alunos[i] + " (" + notas[i] + ")");
    }
    public static void main(String[] args) {
        String[] alunos = {"Ana", "Bruno", "Carla", "Diego"};
        double[] notas = {8.5, 6.0, 7.0, 4.5};
        System.out.printf("Média: %.2f%nMaior nota: %.1f%n", calcularMedia(notas), maiorNota(notas));
        exibirAprovados(alunos, notas);
    }
}
