public class Exercicio29 {
    static double taxa = 0.10;
    static double calcularAcrescimo(double valor) { return valor * taxa; }
    public static void main(String[] args) {
        System.out.println("Acréscimo sobre 200: " + calcularAcrescimo(200));
    }
}
