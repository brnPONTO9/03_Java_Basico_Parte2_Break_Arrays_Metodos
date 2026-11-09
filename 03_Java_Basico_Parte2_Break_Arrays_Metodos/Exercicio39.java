public class Exercicio39 {
    static int somarAte(int n) { return n <= 0 ? 0 : n + somarAte(n - 1); }
    public static void main(String[] args) {
        System.out.println(somarAte(5)); // 15
    }
}
