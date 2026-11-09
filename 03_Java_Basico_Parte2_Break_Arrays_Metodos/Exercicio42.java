public class Exercicio42 {
    static int buscarProduto(String[] produtos, String nome) {
        int idx = -1;
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].equalsIgnoreCase(nome)) { idx = i; break; }
        }
        return idx;
    }
    static boolean precisaRepor(int estoque) { return estoque < 5; }
    static void exibirRelatorio(String[] produtos, int[] estoques) {
        for (int i = 0; i < produtos.length; i++)
            System.out.println(produtos[i] + ": " + estoques[i] + (precisaRepor(estoques[i]) ? " -> REPOR" : " -> OK"));
    }
    public static void main(String[] args) {
        String[] produtos = {"Parafuso", "Porca", "Arruela", "Prego"};
        int[] estoques = {50, 3, 12, 4};
        exibirRelatorio(produtos, estoques);
        int i = buscarProduto(produtos, "arruela");
        System.out.println(i >= 0 ? "Arruela encontrada na posição " + i + " com " + estoques[i] + " un." : "Não encontrado");
    }
}
