public class Exercicio45 {
    static double calcularTaxa(double valor) { return valor * 0.03; }
    static double calcularTaxa(double valor, boolean internacional) {
        double taxa = calcularTaxa(valor);
        return internacional ? taxa + 25.00 : taxa; // taxa fixa internacional
    }
    public static void main(String[] args) {
        System.out.println("Nacional: " + calcularTaxa(1000));
        System.out.println("Internacional: " + calcularTaxa(1000, true));
    }
}
