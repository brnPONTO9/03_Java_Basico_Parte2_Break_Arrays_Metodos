public class Exercicio48 {
    static long potencia(int base, int expoente) {
        if (expoente == 0) return 1; // caso base
        return base * potencia(base, expoente - 1);
    }
    public static void main(String[] args) {
        System.out.println("2^10 = " + potencia(2, 10));
        System.out.println("5^0 = " + potencia(5, 0));
    }
}
