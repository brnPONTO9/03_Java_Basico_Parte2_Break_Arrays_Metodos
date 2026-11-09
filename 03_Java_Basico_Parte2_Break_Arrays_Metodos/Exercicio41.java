public class Exercicio41 {
    static double primeiraVendaAlta(double[] vendas) {
        for (double v : vendas) {
            if (v < 0) continue;
            if (v >= 5000) return v;
        }
        return -1;
    }
    static double totalValido(double[] vendas) {
        double t = 0;
        for (double v : vendas) { if (v < 0) continue; t += v; }
        return t;
    }
    static double mediaValida(double[] vendas) {
        int n = 0;
        for (double v : vendas) if (v >= 0) n++;
        return n == 0 ? 0 : totalValido(vendas) / n;
    }
    public static void main(String[] args) {
        double[] vendas = {1200, -50, 3000, 5200, 800, -1, 4100, 6500, 900, 2500, 3300, 1700};
        System.out.println("Primeira venda >= 5000: " + primeiraVendaAlta(vendas));
        System.out.printf("Total válido: %.2f%nMédia válida: %.2f%n", totalValido(vendas), mediaValida(vendas));
    }
}
