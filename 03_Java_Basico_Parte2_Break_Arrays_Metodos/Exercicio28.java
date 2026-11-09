public class Exercicio28 {
    static int maiorValor(int[] valores) {
        int maior = valores[0];
        for (int v : valores) if (v > maior) maior = v;
        return maior;
    }
    public static void main(String[] args) {
        System.out.println(maiorValor(new int[]{4, 88, 15, 16, 23, 42}));
    }
}
