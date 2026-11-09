public class Exercicio17 {
    public static void main(String[] args) {
        int[] v = {5, -3, 8, -1, 10, -7, 2};
        int soma = 0;
        for (int n : v) {
            if (n < 0) continue;
            soma += n;
        }
        System.out.println("Soma dos positivos: " + soma);
    }
}
