public class Exercicio40 {
    static double total(double[] vendas) {
        double t = 0;
        for (double v : vendas) t += v;
        return t;
    }
    static double media(double[] vendas) { return total(vendas) / vendas.length; }
    static void exibirAcimaDaMedia(String[] nomes, double[] vendas) {
        double m = media(vendas);
        for (int i = 0; i < nomes.length; i++) if (vendas[i] > m) System.out.println(nomes[i] + " (" + vendas[i] + ")");
    }
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carla", "Diego"};
        double[] vendas = {1200, 800, 1500, 500};
        System.out.println("Total: " + total(vendas));
        System.out.println("Média: " + media(vendas));
        System.out.println("Acima da média:");
        exibirAcimaDaMedia(nomes, vendas);
    }
}
