public class Exercicio21 {
    public static void main(String[] args) {
        int[] v = {50, 120, 100, 99, 300, 101};
        int cont = 0;
        for (int n : v) if (n >= 100) cont++;
        System.out.println("Valores >= 100: " + cont);
    }
}
