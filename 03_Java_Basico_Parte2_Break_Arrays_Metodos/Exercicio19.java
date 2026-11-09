public class Exercicio19 {
    public static void main(String[] args) {
        double[] notas = {7.0, 8.5, 6.0, 9.0, 5.5};
        double soma = 0;
        for (double n : notas) soma += n;
        System.out.printf("Média: %.2f%n", soma / notas.length);
    }
}
