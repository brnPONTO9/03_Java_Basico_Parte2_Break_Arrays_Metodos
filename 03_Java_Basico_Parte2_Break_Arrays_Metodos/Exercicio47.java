public class Exercicio47 {
    static double calcularFrete(double km) { return 8 + km * 1.2; }
    public static void main(String[] args) {
        String[] bairros = {"Centro", "Norte", "Sul", "Leste", "Oeste"};
        double[] km = {5, -1, 12, 0, 30};
        int maisLonge = -1;
        for (int i = 0; i < bairros.length; i++) {
            if (km[i] <= 0) continue; // rota inválida
            System.out.printf("%s: %.1f km - frete R$ %.2f%n", bairros[i], km[i], calcularFrete(km[i]));
            if (maisLonge < 0 || km[i] > km[maisLonge]) maisLonge = i;
        }
        System.out.println("Rota mais distante: " + bairros[maisLonge] + " (" + km[maisLonge] + " km)");
    }
}
