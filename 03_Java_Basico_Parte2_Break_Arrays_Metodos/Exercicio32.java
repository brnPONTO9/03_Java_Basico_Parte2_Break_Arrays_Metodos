public class Exercicio32 {
    public static void main(String[] args) {
        double[] transacoes = {120.5, -30, 0, 80, -5, 200};
        double total = 0;
        int validas = 0;
        for (double t : transacoes) {
            if (t <= 0) continue;
            total += t;
            validas++;
        }
        System.out.println("Total: " + total + " | Válidas: " + validas);
    }
}
