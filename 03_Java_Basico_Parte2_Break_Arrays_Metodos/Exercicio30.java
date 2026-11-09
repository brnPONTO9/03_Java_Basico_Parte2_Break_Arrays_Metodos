public class Exercicio30 {
    static void contar(int n) {
        if (n == 0) { System.out.println("Fim"); return; } // caso base
        System.out.println(n);
        contar(n - 1);
    }
    public static void main(String[] args) { contar(5); }
}
