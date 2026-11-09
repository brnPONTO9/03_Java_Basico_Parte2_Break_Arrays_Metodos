public class Exercicio38 {
    static long fatorial(int n) { return n <= 1 ? 1 : n * fatorial(n - 1); }
    public static void main(String[] args) {
        System.out.println("0! = " + fatorial(0));
        System.out.println("1! = " + fatorial(1));
        System.out.println("5! = " + fatorial(5));
    }
}
