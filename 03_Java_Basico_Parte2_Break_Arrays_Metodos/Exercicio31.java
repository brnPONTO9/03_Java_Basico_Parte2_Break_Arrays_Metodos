public class Exercicio31 {
    public static void main(String[] args) {
        double[] vendas = {450, 980, 1200, 3000, 700};
        for (double v : vendas) {
            if (v > 1000) {
                System.out.println("Primeira venda acima de R$ 1.000: R$ " + v);
                break;
            }
        }
    }
}
