public class Exercicio35 {
    static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double n : notas) soma += n;
        return soma / notas.length;
    }
    static boolean aprovado(double media) { return media >= 7; }
    public static void main(String[] args) {
        double media = calcularMedia(new double[]{7, 8, 6.5});
        System.out.printf("Média %.2f - %s%n", media, aprovado(media) ? "Aprovado" : "Reprovado");
    }
}
