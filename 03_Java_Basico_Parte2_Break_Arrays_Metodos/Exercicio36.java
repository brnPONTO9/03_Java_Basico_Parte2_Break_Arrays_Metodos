public class Exercicio36 {
    static double calcularFrete(double km) { return 10 + km * 0.5; }
    static double calcularFrete(double km, boolean expresso) {
        double frete = calcularFrete(km);
        return expresso ? frete + 20 : frete; // taxa fixa do expresso
    }
    public static void main(String[] args) {
        System.out.println("Normal: " + calcularFrete(40));
        System.out.println("Expresso: " + calcularFrete(40, true));
    }
}
