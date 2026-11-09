public class Exercicio33 {
    public static void main(String[] args) {
        String[] produtos = {"Caneta", "Caderno", "Régua", "Tesoura"};
        int[] estoques = {10, 3, 5, 1};
        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i] + ": " + estoques[i] + (estoques[i] < 5 ? " - REPOSIÇÃO" : ""));
        }
    }
}
