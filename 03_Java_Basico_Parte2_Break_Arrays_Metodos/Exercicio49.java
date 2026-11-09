public class Exercicio49 {
    static int buscaBinaria(int[] valores, int alvo, int inicio, int fim) {
        if (inicio > fim) return -1; // caso base: não encontrado
        int meio = (inicio + fim) / 2;
        if (valores[meio] == alvo) return meio;
        if (alvo < valores[meio]) return buscaBinaria(valores, alvo, inicio, meio - 1);
        return buscaBinaria(valores, alvo, meio + 1, fim);
    }
    public static void main(String[] args) {
        int[] v = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        System.out.println(buscaBinaria(v, 23, 0, v.length - 1)); // 5
        System.out.println(buscaBinaria(v, 7, 0, v.length - 1));  // -1
    }
}
